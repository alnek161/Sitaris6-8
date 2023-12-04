package com.example.ProductService;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntertainmentsController {
    private EntertainmentService entertainmentService;

    public EntertainmentsController(EntertainmentService entertainmentService) {
        this.entertainmentService = entertainmentService;
    }

    @GetMapping("/entertainments.jsp")
    public String showEntertainments(HttpServletRequest request) {
        List<Entertainment> entertainments = entertainmentService.getAllEntertainments();
        double totalCost = calculateTotalCost(entertainments);

        request.setAttribute("entertainments", entertainments);
        request.setAttribute("totalCost", totalCost);

        return "entertainments";
    }

    private double calculateTotalCost(List<Entertainment> entertainments) {
        double totalCost = 0;
        for (Entertainment entertainment : entertainments) {
            totalCost += entertainment.getPrice();
        }
        return totalCost;
    }

}