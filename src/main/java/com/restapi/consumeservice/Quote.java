package com.restapi.consumeservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private JsonIgnoreProperties.Value value;

    public Quote(){

    }

    public void setQuote(String quote) {
        this.type=quote;
    }

    public void setValue(JsonIgnoreProperties.Value value) {
        this.value = value;
    }

    public String getQuote() {
        return type;
    }

    public JsonIgnoreProperties.Value getValue() {
        return value;
    }

    @Override
    public String toString(){
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
