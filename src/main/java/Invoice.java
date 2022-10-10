public class Invoice {
    private String partNumber;
    private String description;
    private int quantityOfPurchasedItems;
    private int pricePerItem;

    public Invoice(String partNumber, String description, int quantityOfPurchasedItems, int pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantityOfPurchasedItems = quantityOfPurchasedItems;
        this.pricePerItem = pricePerItem;
    }
    public Invoice(){ }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantityOfPurchasedItems() {
        if (quantityOfPurchasedItems > 0) {
            return quantityOfPurchasedItems;
        }else {
            this.quantityOfPurchasedItems = 0;
        }
        return quantityOfPurchasedItems;
    }
    public void setQuantityOfPurchasedItems(int quantityOfPurchasedItems) {
        this.quantityOfPurchasedItems = quantityOfPurchasedItems;
    }
    public int getPricePerItem() {
        if (pricePerItem > 0) {
            return pricePerItem;
        }else {
            this.pricePerItem = 0;
        }
        return pricePerItem;
    }
    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public int getInvoiceAmount(){
        return getQuantityOfPurchasedItems() * getPricePerItem();
    }
}

