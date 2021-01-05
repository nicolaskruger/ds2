package com.devsuperior.dsdeliver.entities;

public enum OrderStatus {
    PENDING(0),
    DELIVERED(1);
    private int code;
    public int getCode(){
        return code;
    }
    OrderStatus(int code){
        this.code = code;
    }
}
