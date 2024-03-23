package models.validators;

import java.util.ArrayList;
import java.util.List;

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
}