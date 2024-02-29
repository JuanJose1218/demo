package com.example.demo.model;

public class DemoResponse extends DemoRequest {
    private String rfc;

    public DemoResponse(String rfc) {
        this.rfc = rfc;

    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
