//12003325 Angela Sternig

package at.aau.serg.exercises.bills;

import java.util.List;

public class Order {

    private Long id;
    private Customer customer;
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void erstelleRechnung() {
        //calculate temporary price
        Double totalPrice= temporaryPrice();

        //check for shipping costs
        if(totalPrice<=100) {
            shipping(totalPrice);
        }

        totalPrice= temporaryPrice();

        outPut(totalPrice);
    }

    private double temporaryPrice(){
        Double totalPrice = 0.0d;
        for (Item item : getItems()) {
            totalPrice+=item.getPrice();
        }
        return totalPrice;
    }

    private List<Item> shipping(double totalPrice){
        if(totalPrice<=100) {
            Item item = new Item();
            item.setId(99L);
            item.setName("Porto und Versand");
            if(totalPrice>90) {
                item.setPrice(totalPrice*0.05);
            } else if(totalPrice>50) {
                item.setPrice(7.5d);
            } else {
                item.setPrice(10d);
            }
            getItems().add(item);
        }
        return getItems();
    }

    private void outPut(double totalPrice){
        System.out.println("Rechnung:");
        for (Item item : getItems()) {
            System.out.println(item.getName()+": "+item.getPrice());
        }
        System.out.println("Total: "+ totalPrice);
    }
}
