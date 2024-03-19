package controllsres;

import java.io.IOException;
import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Report;
import utils.DBUtil;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/new")
public class NewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();
        em.getTransaction().begin();

        // Reportのインスタンスを生成
        Report r = new Report();

        // rの各フィールドにデータを代入
        String product_name = "キャップ";
        r.setProduct_name(product_name);

        Integer product_number= 10000;
        r.setProduct_number(product_number);

        Timestamp currentTime = new Timestamp(System.currentTimeMillis());     // 現在の日時を取得
        r.setCreated_at(currentTime);
        r.setUpdated_at(currentTime);

        // データベースに保存
        em.persist(r);
        em.getTransaction().commit();

        // 自動採番されたIDの値を表示
        response.getWriter().append(Integer.valueOf(r.getId()).toString());

        em.close();
     }

}
