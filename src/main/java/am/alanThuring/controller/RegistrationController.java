package am.alanThuring.controller;

import am.alanThuring.dao.RegistrationDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationController extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) {
        RegistrationDao resgistrationDao = new RegistrationDao();

        resgistrationDao.setName(req.getParameter("name"));
        resgistrationDao.setName(req.getParameter("lastname"));
        resgistrationDao.setName(req.getParameter("email"));
        resgistrationDao.setName(req.getParameter("password"));
        resgistrationDao.setName(req.getParameter("Hello"));

    }
}
