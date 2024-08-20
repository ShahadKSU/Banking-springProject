package com.BSF.Banking.model;

public class ActivateBeneficiary {

    private String actionURL;

    public ActivateBeneficiary() {
    }

    public ActivateBeneficiary(String actionURL) {
        this.actionURL = actionURL;
    }

    public String getActionURL() {
        return actionURL;
    }

    public void setActionURL(String actionURL) {
        this.actionURL = actionURL;
    }

    @Override
    public String toString() {
        return "actionURL='" + actionURL +"'";
    }
}