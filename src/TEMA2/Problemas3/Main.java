package TEMA2.Problemas3;

public class Main {
    public static void main (String[] args){
    Adress adress = new Adress("Octavian Goga" , "Agigea" , 21);
    PaymentMethod paymentMethod = new PaymentMethod("Paypal");
    Customer customer = new Customer(adress, paymentMethod , "Cristian" , "Gheorghe" , 21);

    System.out.println(customer.getCompleteName());
    System.out.println(customer.getAdress().showFullAdress());
    System.out.println(customer.getPaymentMethod().getType());
    System.out.println(customer.getFirstname() + " are " + customer.getAge()+" ani impliniti.");
}
}
