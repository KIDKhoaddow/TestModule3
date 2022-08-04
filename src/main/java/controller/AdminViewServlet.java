package controller;


import model.Product;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "AdminViewServlet", value = "/AdminViewServlet")
public class AdminViewServlet extends HttpServlet {

    private final UserService userService = UserService.Instance() ;

    private String page="/product.jsp";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try{
            switch (action){
                case "product":
                    List<Product> list =userService.findAllProduct();
                    request.setAttribute("productList",list);
                    page ="/product.jsp";
                    break;
                case "comfirmDelete":



            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        doPost(request,response);
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

//    private void displayAllUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product.jsp");
//        ArrayList<User> users = userService.findAllUser(request,response);
//        request.setAttribute("users" , users);
//        requestDispatcher.forward(request , response);
//
//
//    }
}
