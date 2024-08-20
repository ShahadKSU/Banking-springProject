package com.BSF.Banking.model;

public class IVRactivateBen {
    private String challengeType;
    private String actionUrl;
    private String mobileNumber;

    // Getters and setters
    public String getChallengeType() {
        return challengeType;
    }

    public void setChallengeType(String challengeType) {
        this.challengeType = challengeType;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "IVRactivateBen{" +
                "challengeType='" + challengeType + '\'' +
                ", actionUrl='" + actionUrl + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
