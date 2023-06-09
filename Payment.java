package Enhance;

import java.util.Scanner;

public class Payment {

      public int paymentId;
      public int Amount;
      public String paymentMode;
      public String username;
      public String password;
      public String CourseName;

      public void setpaymentId(int paymentId) {
            this.paymentId = paymentId;
      }

      public int getpaymentId() {
            return paymentId;
      }

      public void setAmount(int Amount) {
            this.Amount = Amount;
      }

      public int getAmount() {
            return Amount;
      }

      public void setpaymentMode(String paymentMode) {
            this.paymentMode = paymentMode;
      }

      public String getpaymentMode() {
            return paymentMode;
      }

      public void setusername(String username) {
            this.username = username;
      }

      public String getusername() {
            return username;
      }

      public void setpassword(String password) {
            this.password = password;
      }

      public String getpassword() {
            return password;
      }

      public void setCourseName(String CourseName) {
            this.CourseName = CourseName;
      }

      public String getCourseName() {
            return CourseName;
      }

      public void display() {
            System.out.println("Payment ID:" + paymentId);
            System.out.println("Amount:" + Amount);
            System.out.println("Payment Mode:" + paymentMode);
            System.out.println("username:" + username);
            System.out.println("Password:" + password);
            System.out.println("Course Name:" + CourseName);
      }

}
