package com.Udemy;

public class Main {

    public static void main(String[] args) {

        // Call the constructor when creating the object
        VipCustomer firstCon = new VipCustomer();//"Larry Strongman", "750","Strongman@email.com");
        System.out.println(firstCon.getName());


        VipCustomer secondVip = new VipCustomer("Larry Strongman", 10000);
        System.out.println(secondVip.getName());


        VipCustomer thirdVip = new VipCustomer("Grey", 100.00, "Grey@email.com");
        System.out.println(thirdVip.getName());
    }

    public static class VipCustomer{

       private String name;
       private double creditLmt;
       private String emailAdd;


        // Create the  1st.Constructor and setting the fields in the constructors

        public VipCustomer(){
            this("Default Name", 10000.00, "Default@email.com");

        }


        // 2nd.Constructor, calling first constructor
        
        public VipCustomer(String name, double creditLmt) {
            // Constructor has to be the first line that is called, "Constructor first"
           this(name,creditLmt, "unkown@email.com");

        }

        // ------3. Constructor ---------//
        public VipCustomer(String name,double creditLmt,String emailAdd){

            this.name = name;
            this.creditLmt = creditLmt;
            this.emailAdd = emailAdd;

            //System.out.println("3rd Constructor called with all parameters");
        }

        public String getName() {
            return name = name;
        }

        public double getCreditLmt() {
            return creditLmt;
        }

        public String getEmailAdd() {
            return emailAdd;
        }
    }
}
