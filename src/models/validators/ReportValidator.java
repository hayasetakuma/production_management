package models.validators;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.Report;

public class ReportValidator {
    // バリデーションを実行する
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String product_name_error = validateProduct_name(r.getProduct_name());
        if(!product_name_error.equals("")) {
            errors.add(product_name_error);
        }

        String product_number_error = validateProduct_number(r.getProduct_number());
        if(!product_number_error.equals("")) {
            errors.add(product_number_error);
        }

        String defective_product_error = validateDefective_product(r.getDefective_product());
        if(!defective_product_error.equals("")) {
            errors.add(defective_product_error);
        }

        String alphanum_good_error = isAlphanumGood(r.getProduct_number());
        if(!alphanum_good_error.equals("")) {
            errors.add(alphanum_good_error);
        }

        String alphanum_defective_error = isAlphanumDefective(r.getDefective_product());
        if(!alphanum_defective_error.equals("")) {
            errors.add(alphanum_defective_error);
        }

        return errors;
    }

    // タイトルの必須入力チェック
    private static String validateProduct_name(String product_name) {
        if(product_name == null || product_name.equals("")) {
            return "製品名を入力してください。";
        }

        return "";
    }

    // メッセージの必須入力チェック
    private static String validateProduct_number(String product_number) {
        if(product_number == null || product_number.equals("")) {
            return "良品生産数を入力してください。";
        }

        return "";
    }

    private static String validateDefective_product(String defective_product) {
        if(defective_product == null || defective_product.equals("")) {
            return "不良品生産数を入力してください。";
        }

        return "";
    }

    private static String isAlphanumGood(String product_number) {
        String alphanum = "^[0-9]*$";
        Pattern p1 = Pattern.compile(alphanum);
        Matcher m1 = p1.matcher(product_number);
        boolean result1 = m1.matches();
        if(result1 == false) {
            return "良品生産数を半角数字で入力してください。";
        }
        return"";
    }

    private static String isAlphanumDefective(String defective_product) {
        String alphanum = "^[0-9]*$";
        Pattern p1 = Pattern.compile(alphanum);
        Matcher m1 = p1.matcher(defective_product);
        boolean result1 = m1.matches();
        if(result1 == false) {
            return "不良品生産数を半角数字で入力してください。";
        }
        return"";
    }
}