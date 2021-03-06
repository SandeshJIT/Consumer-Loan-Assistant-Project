/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxswingapplication1;


import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author sandesh
 */
public class Main extends javax.swing.JFrame {
    
 
    /**
     * Creates new form Main
     */
    public Main() {
        
        initComponents();
        newLoan.setEnabled(false);
        x1.setEnabled(false);
        x1.setVisible(false);
        noOfPayments.setBackground(Color.WHITE);
        loanPrint.setFocusable(false);
        if(x.isEnabled()){
           monthlyPayment.setFocusable(false);
           noOfPayments.setFocusable(true);
       } if(x1.isEnabled()){
           monthlyPayment.setFocusable(true);
           noOfPayments.setFocusable(false);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanPrint = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loanBalance = new javax.swing.JTextField();
        interestRate = new javax.swing.JTextField();
        noOfPayments = new javax.swing.JTextField();
        monthlyPayment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        x = new javax.swing.JButton();
        getMonthlyPayment = new javax.swing.JButton();
        newLoan = new javax.swing.JButton();
        exitApp = new javax.swing.JButton();
        x1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Application");
        setBackground(new java.awt.Color(0, 0, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        loanPrint.setColumns(20);
        loanPrint.setRows(5);
        jScrollPane1.setViewportView(loanPrint);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel1.setText("Interest Rate");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setText("Loan Balance");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setText("Monthly Payments");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setText("Number of payments");

        loanBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanBalanceActionPerformed(evt);
            }
        });

        interestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestRateActionPerformed(evt);
            }
        });

        noOfPayments.setBackground(new java.awt.Color(255, 255, 51));
        noOfPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfPaymentsActionPerformed(evt);
            }
        });

        monthlyPayment.setBackground(new java.awt.Color(255, 255, 51));
        monthlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyPaymentActionPerformed(evt);
            }
        });

        jLabel5.setText("Loan Analysis:");

        x.setText("X");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        getMonthlyPayment.setText(" Compute Monthly Payment");
        getMonthlyPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getMonthlyPaymentMouseClicked(evt);
            }
        });
        getMonthlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMonthlyPaymentActionPerformed(evt);
            }
        });

        newLoan.setText("New Loan analysis");
        newLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLoanActionPerformed(evt);
            }
        });

        exitApp.setText("Exit");
        exitApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAppActionPerformed(evt);
            }
        });

        x1.setText("X");
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(getMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(newLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(interestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loanBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitApp)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loanBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(interestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1))
                        .addGap(29, 29, 29)
                        .addComponent(getMonthlyPayment)
                        .addGap(18, 18, 18)
                        .addComponent(newLoan))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitApp)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void interestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interestRateActionPerformed

    private void noOfPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfPaymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfPaymentsActionPerformed

    private void monthlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyPaymentActionPerformed

    private void loanBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loanBalanceActionPerformed

    private void getMonthlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMonthlyPaymentActionPerformed
        // TODO add your handling code here:
       
                                
        
            
    }//GEN-LAST:event_getMonthlyPaymentActionPerformed

    private void getMonthlyPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getMonthlyPaymentMouseClicked

        // TODO add your handling code here:
       double balance, interest, payment=0.0;
       int months;
       double monthlyInterest, multiplier;
       double lBalance, finalPayment=0.0;
       
       if(("".equals(loanBalance.getText()))){
           JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
           loanBalance.transferFocus(); 
           return;
            


       }
       else if("".equals(interestRate.getText())) {
           JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Interest entry.\nPlease correct.", "Number of Interest Input Error",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
           interestRate.transferFocus(); 
           return;

       }
       else if("".equals(noOfPayments.getText()) && x.isEnabled()) {
           JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Month entry.\nPlease correct.", "Number of Months Input Error",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
           noOfPayments.transferFocus(); 
           return;
       }
       else if("".equals(monthlyPayment.getText()) && x1.isEnabled()) {
           JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Monthly payment entry.\nPlease correct.", "Number of Monthly payment Input Error",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
           monthlyPayment.transferFocus(); 
           return;
       }
       try{
        balance = Double.parseDouble(loanBalance.getText());
        interest =  Double.parseDouble(interestRate.getText());
        
        monthlyInterest = interest/1200;
        if(x.isEnabled()) {
        months = Integer.parseInt(noOfPayments.getText());
        if(interest==0) {
            payment=balance/months;
        }
        else {
        multiplier = Math.pow(1 + monthlyInterest, months);
        payment = balance * monthlyInterest * multiplier / (multiplier - 1);    
        }
        monthlyPayment.setText(new DecimalFormat("0.00").format(payment));
        lBalance = balance + monthlyInterest*balance;
        
        lBalance=balance;
        for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++)
        {
            lBalance += lBalance * monthlyInterest - payment;
        }// find final payment
        finalPayment = lBalance;
        if (finalPayment > payment){// apply one more payment
            lBalance += lBalance * monthlyInterest - payment;
            finalPayment = lBalance;months++;
            monthlyPayment.setText(String.valueOf(months));
        }
    
        getMonthlyPayment.setEnabled(false);
        newLoan.setEnabled(true);
       // newLoanButton.requestFocus();
        }
        else{
            payment =Double.valueOf(monthlyPayment.getText()).doubleValue();
           if (payment <= (balance * monthlyInterest + 1.0))
{
if (JOptionPane.showConfirmDialog(null, "Minimum payment must be $" +
new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) + "\n" + "Do youwant to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
{
monthlyPayment.setText(new DecimalFormat("0.00").format((int)
(balance * monthlyInterest + 1.0)));
payment =
Double.valueOf(monthlyPayment.getText()).doubleValue();
}
else
{
monthlyPayment.requestFocus();
return;
}
}
            if(interest==0) {
                months = (int)(balance / payment);

            }
            else {
            months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest))/ Math.log(1 + monthlyInterest));
            }
// process all but last payment
        lBalance = balance;
        for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++)
        {
            lBalance += lBalance * monthlyInterest - payment;
        }
// find final payment
        finalPayment = lBalance;
        if (finalPayment > payment)
{
// apply one more payment
        lBalance += lBalance * monthlyInterest - payment;
        finalPayment = lBalance;
        months++;
}
            noOfPayments.setText(String.valueOf(months));
            getMonthlyPayment.setEnabled(false);
            newLoan.setEnabled(true);
        }
        loanPrint.setText("Loan Balance : $"+balance+"\nInterest Rate: "+interest+"%");
            loanPrint.append("\n\n" + String.valueOf(months - 1) + " Payments of $" + new DecimalFormat("0.00").format(payment));
        loanPrint.append("\n" + "Final Payment of: $" + new DecimalFormat("0.00").format(finalPayment));
        loanPrint.append("\n" + "Total Payments: $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
        loanPrint.append("\n" + "Interest Paid $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
       }
       catch(NumberFormatException e){
           JOptionPane.showConfirmDialog(null, "Inalid inputs","Invalid Inputs",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
       }
       
        
        
    }//GEN-LAST:event_getMonthlyPaymentMouseClicked
   
    private void exitAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAppActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitAppActionPerformed

    private void newLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLoanActionPerformed
        // TODO add your handling code here:
        if(x.isEnabled()){
            monthlyPayment.setText("");
            loanPrint.setText("");
            getMonthlyPayment.setEnabled(true);
            newLoan.setEnabled(false);
        }
        else {
              noOfPayments.setText("");
            loanPrint.setText("");
            getMonthlyPayment.setEnabled(true);
            newLoan.setEnabled(false);
        }

    }//GEN-LAST:event_newLoanActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        // TODO add your handling code here:
       
        getMonthlyPayment.setEnabled(true);
         monthlyPayment.setText("");
        noOfPayments.setText("");
        x.setVisible(false);
        x1.setVisible(true);
        noOfPayments.setBackground(Color.yellow);
        monthlyPayment.setBackground(Color.WHITE);
        x1.setEnabled(true);
        x.setEnabled(false);
          if(x.isEnabled()){
           monthlyPayment.setFocusable(false);
           noOfPayments.setFocusable(true);
       } if(x1.isEnabled()){
           monthlyPayment.setFocusable(true);
           noOfPayments.setFocusable(false);
       }
    }//GEN-LAST:event_xActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
     
        loanPrint.setText("");
        getMonthlyPayment.setEnabled(true);
        monthlyPayment.setText("");
        noOfPayments.setText("");
        x.setVisible(true);
        x1.setVisible(false);
        noOfPayments.setBackground(Color.white);
        monthlyPayment.setBackground(Color.yellow);
        x1.setEnabled(false);
        x.setEnabled(true);
            if(x.isEnabled()){
           monthlyPayment.setFocusable(false);
           noOfPayments.setFocusable(true);
       } if(x1.isEnabled()){
           monthlyPayment.setFocusable(true);
           noOfPayments.setFocusable(false);
       }
    }//GEN-LAST:event_x1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitApp;
    private javax.swing.JButton getMonthlyPayment;
    private javax.swing.JTextField interestRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loanBalance;
    private javax.swing.JTextArea loanPrint;
    private javax.swing.JTextField monthlyPayment;
    private javax.swing.JButton newLoan;
    private javax.swing.JTextField noOfPayments;
    private javax.swing.JButton x;
    private javax.swing.JButton x1;
    // End of variables declaration//GEN-END:variables

    private boolean valid(String text) {
         //To change body of generated methods, choose Tools | Templates.
         for(int i=0;i<text.length();i++) {
             char c=text.charAt(i);
             if(c>='0' && c<='9') {
                 continue;
             }
             else {
                 return false;
             }
             
         }
        return true;
        
    }
}
