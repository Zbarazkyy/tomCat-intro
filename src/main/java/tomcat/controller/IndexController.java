package tomcat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Servlet class или Controller  это таки классы которые нам помогают принимать Http запросы и отправлять Http ответы */
public class IndexController extends HttpServlet {
    /* наследуйтесь от калла HttpServlet и переопределяем методы */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);  /* указываем какую именно страничку возвращаем */
       /* RequestDispatcher Интерфейс объект которого перенаправляет наш запрос на другой ресурс (Servlet, jsp page, html file) указав путь*/
       /*.forward перенаправляет запрос на ресурс */
    }
}
