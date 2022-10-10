/*
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
An Invoice should include four attributes—a part number (type string), a part description (type string),
a quantity of the item being purchased (type int) and a price per item (type int).
Your class should have a constructor that initializes the four attributes.
Provide a set and a get method for each attribute.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
then returns the amount as an int value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.
Write a test program that demonstrates class Invoice’s capabilities.
*/
public class Main {
    public static void main(String[] args) {
        Invoice invoice0 = new Invoice("PNR00", "Part Number 0", 3, 3);
        //if quantity and price is positive
        //this should get 3*3 = 9 in total
        printInvoice(invoice0);

        Invoice invoice1 = new Invoice("PNR01", "Part Number 1", 3, 0);
        //if price is 0
        //this should give a total 0
        printInvoice(invoice1);

        Invoice invoice2 = new Invoice("PNR02", "Part Number 2", 0, 3);
        //if quantity is 0
        //this should show total amount 0
        printInvoice(invoice2);

        Invoice invoice3 = new Invoice("PNR03", "Part Number 3", -2, 3);
        //if quantity is negative
        // this should change quantity as 0 and total amount as 0
        printInvoice(invoice3);

        Invoice invoice4 = new Invoice("PNR04", "Part Number 4", 5, -3);
        //if price is negative
        //this should set price to 0 and total amount would be 0*5 = 0
        printInvoice(invoice4);

        Invoice invoice5 = new Invoice("PNR05", "Part Number 5", -2, -3);
        //if price and quantity is negative
        //this should set price and quantity as 0
        printInvoice(invoice5);

        //test setter methods with bigger numbers
        Invoice invoice6 = new Invoice();
        invoice6.setPartNumber("PNR06");
        invoice6.setDescription("Part Number 6");
        invoice6.setQuantityOfPurchasedItems(30);
        invoice6.setPricePerItem(10);
        printInvoice(invoice6);
    }

    public static void printInvoice(Invoice invoice){
        System.out.println("INFO ABOUT INVOICE \n");
        System.out.println("Part Number - " + invoice.getPartNumber());
        System.out.println("Description - " + invoice.getDescription());
        System.out.println("Quantity of purchased items - " + invoice.getQuantityOfPurchasedItems());
        System.out.println("Price per item - " + invoice.getPricePerItem());
        System.out.println("Total Invoice amount - " + invoice.getInvoiceAmount());
        System.out.println("\n");
    }
}
