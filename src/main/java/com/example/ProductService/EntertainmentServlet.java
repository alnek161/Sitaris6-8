package com.example.ProductService;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet(name = "EntertainmentServlet", urlPatterns = "/EntertainmentServlet")
public class EntertainmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        double totalCost=0;

        int totalQuantity=0;

        String filePath = "D:\\Str_web\\entertainments.xml";

        EntertainmentService entertainmentService = new EntertainmentService(filePath);


        request.setAttribute("entertainmentService", entertainmentService);
        request.getRequestDispatcher("entertainments.jsp").forward(request, resp);
    }
}