package com.example.demo.servlet;

import com.example.demo.model.Produto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TesteServlet", value = "/Teste")
public class TesteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        Produto p = new Produto();
        session.setAttribute("p1", p);

        String nomeProduto= p.getNome();
        System.out.println(nomeProduto);

    }
}
