package com.zuhlke.testing;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class FastDevReloadWithTestsModel {

    @XmlElement(name = "value")
    private String message;

    public FastDevReloadWithTestsModel() {
    }

    public FastDevReloadWithTestsModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}