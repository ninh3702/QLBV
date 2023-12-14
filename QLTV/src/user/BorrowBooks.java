/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package user;

import book.Controller.DataFuctionImplement;
import book.Model.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import registerbook.model.RegisterBook;

/**
 *
 * @author DELL
 */
public class BorrowBooks extends javax.swing.JDialog {

    private Book book;
    private InForStudentRegister inforst;

    /**
     * Creates new form BorrowBooks
     */
    public BorrowBooks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        inforst = (InForStudentRegister) parent;
    }

    public BorrowBooks(java.awt.Frame parent, boolean modal, Book book) {
        this(parent, modal);
        this.book = book;
        txtBookID.setText(book.getBookId());
        txtNameBook.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtProducter.setText(book.getProducer());
        txtPrice.setText(book.getPrice() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNameBook = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProducter = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinnerAmount = new javax.swing.JSpinner();
        btnBorrow = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAppointDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Mã Sách: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        txtBookID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtBookID.setText("*Mã Sách");
        getContentPane().add(txtBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 320, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Tên Sách :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txtNameBook.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNameBook.setText("*Tên Sách");
        getContentPane().add(txtNameBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 310, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Tác giả: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        txtAuthor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAuthor.setText("*Tác giả");
        getContentPane().add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 310, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Nhà Sản Xuất:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        txtProducter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtProducter.setText("*NSX");
        getContentPane().add(txtProducter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 320, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("giá Sách:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPrice.setText("*gs");
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 320, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Số Lượng Mượn: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        spinnerAmount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        spinnerAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 270, -1));

        btnBorrow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btnBorrow.setText("Mượn");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 160, -1));

        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnClose.setText("Hủy");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Ngày Hẹn Trả:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        txtAppointDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtAppointDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int amount = (int) spinnerAmount.getValue();
        var appointDatetxt = txtAppointDate.getText();
        if (amount != 0 && !appointDatetxt.isEmpty()) {
            if (amount <= 3) {
                if (book.getAmount() != 0) {
                    if (amount < book.getAmount()) {
                        try {
                            DataFuctionImplement dBook = new DataFuctionImplement();
                            Date appointdate = df.parse(appointDatetxt);
                            Date dateNow = new Date();
                             if(appointdate.getTime() > dateNow.getTime()){
                            book.setAmount(book.getAmount() - amount);
                            dBook.updateBookSQL(book);
                            this.inforst.editAmountBook(book);
                            this.inforst.addRegisterBook(appointdate, book, amount);
                            JOptionPane.showMessageDialog(rootPane, "mượn Thành Công");
                            this.dispose();
                             }else{
                             JOptionPane.showMessageDialog(rootPane, "ngày Hẹn "
                                     + "Trả Phải Lớn Hơn Ngày Hiện Thời!");
                             }
                        } catch (ParseException ex) {
                            JOptionPane.showMessageDialog(rootPane, "vui lòng nhập "
                                    + "đúng định dạng vd: 22/12/2002");
                        }

                    } else {

                        JOptionPane.showMessageDialog(rootPane, "số lượng sách trong "
                                + "thư viện không đủ cho bạn mượn "
                                + "vui lòng nhập số lượng nhỏ hơn " + book.getAmount());
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "sách: "
                            + book.getName() + " trong thư viện đã Hết!");

                }

            } else {

                JOptionPane.showMessageDialog(rootPane, "chỉ được phép mượn "
                        + "tối đa 3 quyển");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "vui lòng không để trống "
                    + "các ô hoặc số lượng > 0!");

        }

    }//GEN-LAST:event_btnBorrowActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BorrowBooks dialog = new BorrowBooks(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinnerAmount;
    private javax.swing.JTextField txtAppointDate;
    private javax.swing.JLabel txtAuthor;
    private javax.swing.JLabel txtBookID;
    private javax.swing.JLabel txtNameBook;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtProducter;
    // End of variables declaration//GEN-END:variables
}
