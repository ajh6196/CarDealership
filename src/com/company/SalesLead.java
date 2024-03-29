package com.company;
import java.util.Date;

public class SalesLead {
    protected int salesLeadID;
    protected String sl_firstName, sl_lastName, sl_phoneNumber, sl_Email;
    protected Boolean salesLeadActive;
    protected Date salesLeadDate;

    private int salesPersonID;

    // add salesPeople id to know which one added a salesLead

    public SalesLead() {}


    public int getSalesLeadID() {
        return salesLeadID;
    }

    public void setSalesLeadID(int _salesLeadID) {
        this.salesLeadID = _salesLeadID;
    }

    public String getSl_firstName() {
        return sl_firstName;
    }

    public void setSl_firstName(String _sl_firstName){
        this.sl_firstName = sl_firstName;
    }

    public String getSl_lastName() {
        return sl_lastName;
    }

    public void setSl_lastName(String _sl_lastName){
        this.sl_lastName = _sl_lastName;
    }

    public String getSl_phoneNumber() {
        return sl_phoneNumber;
    }

    public void setSl_phoneNumber(String _sl_phoneNumber){
        this.sl_phoneNumber = _sl_phoneNumber;
    }

    public String getSl_Email() {
        return sl_Email;
    }

    public void setSl_Email(String _sl_Email){
        this.sl_Email = _sl_Email;
    }

    public Date getSl_Date() {
        return salesLeadDate;
    }

    public void setSl_Date(Date _sl_Date){
        this.salesLeadDate = _sl_Date;
    }
}