package com.co.territorium.models;

public class Credentials {
    private String typeDocument;
    private String numberDocument;
    private String password;

    public Credentials(String typeDocument, String numberDocument, String password) {
        this.typeDocument = typeDocument;
        this.numberDocument = numberDocument;
        this.password = password;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
