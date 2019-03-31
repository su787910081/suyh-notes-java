package com.tedu.jt.web.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tedu.jt.utils.JDBCUtils;

/**
 * ������Ʒ��������
 * 
 * @author suyh
 *
 */
public class ProdAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 0. ��������
        // >> �����������(POST)
        request.setCharacterEncoding("UTF-8");
        
        response.setContentType("text/html; charset=utf-8");

        // 1. ��ȡ��Ʒ��Ϣ
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        double price = Double.parseDouble(request.getParameter("price"));
        int pnum = Integer.parseInt(request.getParameter("pnum"));
        String description = request.getParameter("description");

        // 2. ����Ʒ��Ϣ���浽���ݿ���
        addProd(name, category, price, pnum, description);

        // 3. ��ʾ�û���Ʒ���ӳɹ�
        response.getWriter().write("<h1 style='color:red;text-align:center;'>");
        response.getWriter().write("��Ʒ���ӳɹ���3��֮�󽫻���ת����Ʒ�б�ҳ��");
        response.getWriter().write("</h1>");

        // 4. ��ʱˢ�µ���Ʒ�б�ҳ��
        response.setHeader("Refresh",
                "3;url=" + request.getContextPath() + "/ProdListServlet");
    }

    /**
     * ����Ʒ��Ϣ���浽���ݿ���
     * 
     * @param name
     * @param category
     * @param price
     * @param pnum
     * @param description
     */
    private void addProd(String name, String category, double price, int pnum, String description) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            // 1. ��ȡ����
            conn = JDBCUtils.getConn();
            
            // 2. ���� SQL ���
            String sql = "insert into product values(null, ?,?,?,?,?)";
            
            // 3. ��ȡ������
            ps = conn.prepareStatement(sql);
            
            // 4. ����SQL ����
            ps.setString(1, name);
            ps.setString(2, category);
            ps.setDouble(3, price);
            ps.setInt(4, pnum);
            ps.setString(5, description);
            
            // 5. ִ��SQL
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("��Ʒ����ʧ�ܣ���");
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, ps, rs);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}