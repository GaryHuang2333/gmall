package com.gary.gmall.domain;

public class Order {
    private Product product;
    private int quantity;
    private Address address;
    private Person person;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                ", quantity=" + quantity +
                ", address=" + address +
                ", person=" + person +
                '}';
    }
}
