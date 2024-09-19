package com.stellantis.assetManagement.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "asset")
public class Asset {

    public static Object AllocationStatus;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_no")
    private String serialNo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @JoinColumn(name = "tid")
    private String tid;

    @Column(name = "res")
    private String res;

    @Column(name = "computer_name")
    private String computerName;

    @Column(name = "model")
    private String model;

    @Column(name = "model_type")
    private String modelType;

    @Column(name = "asset_type")

    private String assetType;

    @Column(name = "lease_type")
    /*@Enumerated(EnumType.STRING)*/
    private String leaseType;

    @Column(name = "asset_tag")
    private String assetTag;

    @Column(name = "make")
    private String make;

    @Column(name = "IMEI")
    private String IMEI;

    @Column(name = "IMSI")
    private String IMSI;

    @Column(name = "SIM_number")
    private String simNumber;

    @Column(name = "SIM_billing_cycle")
    private String SIMBillingCycle;

    @Column(name = "phone_configuration")
    private String phoneConfiguration;

    @Column(name = "phone_colour")
    private String phoneColour;

    @Column(name = "item_received_in_box")
    private String itemReceivedInBox;

    @Column(name = "asset_vendor_contact")
    private String assetVendorContact;

    @Column(name = "asset_allocation_status")
    /*@Enumerated(EnumType.STRING)*/
    private String  assetAllocationStatus;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "invoice_date")
    private Date invoiceDate;

    @Column(name = "inward_location")
    private String inwardLocation;

    @Column(name = "inward_date")
    private Date inwardDate;

    @Column(name = "basic_amount")
    private BigDecimal basicAmount;

    @Column(name = "gst")
    private BigDecimal gst;

    @Column(name = "tsc")
    private BigDecimal tsc;

    @Column(name = "tax_amount")
    private BigDecimal taxAmount;
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInwardLocation() {
        return inwardLocation;
    }

    public void setInwardLocation(String inwardLocation) {
        this.inwardLocation = inwardLocation;
    }

    public Date getInwardDate() {
        return inwardDate;
    }

    public void setInwardDate(Date inwardDate) {
        this.inwardDate = inwardDate;
    }

    public BigDecimal getBasicAmount() {
        return basicAmount;
    }

    public void setBasicAmount(BigDecimal basicAmount) {
        this.basicAmount = basicAmount;
    }

    public BigDecimal getGst() {
        return gst;
    }

    public void setGst(BigDecimal gst) {
        this.gst = gst;
    }

    public BigDecimal tsc() {
        return tsc;
    }

    public void setTcs(BigDecimal tsc) {
        this.tsc = tsc;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public BigDecimal getTsc() {
        return tsc;
    }

    public void setTsc(BigDecimal tsc) {
        this.tsc = tsc;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }

    //    @ManyToOne
//    @Column(name = "allocatedTo")
//    private Employee allocatedTo;
//
//    // Other existing attributes, getters, and setters...
//
//    public Employee getAllocatedTo() {
//        return allocatedTo;
//    }
//
//    public void setAllocatedTo(Employee allocatedTo) {
//        this.allocatedTo = allocatedTo;
//    }
//
    public Asset() {
    }

    public static Object getAllocationStatus() {
        return AllocationStatus;
    }

    public static void setAllocationStatus(Object allocationStatus) {
        AllocationStatus = allocationStatus;
    }
// Getters and Setters

    // Getters and Setters for serialNo, res, and other fields

    public String getRes() {
        return res;
    }


    public String getComputerName() {
        return computerName;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getModel() {
        return model;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public String getAssetTag() {
        return assetTag;
    }

    public String getMake() {
        return make;
    }





    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }



    public void setMake(String make) {
        this.make = make;
    }

    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag;
    }

    public String getSIMBillingCycle() {
        return SIMBillingCycle;
    }

    public String getPhoneConfiguration() {
        return phoneConfiguration;
    }

    public void setPhoneConfiguration(String phoneConfiguration) {
        this.phoneConfiguration = phoneConfiguration;
    }

    public void setSIMBillingCycle(String SIMBillingCycle) {
        this.SIMBillingCycle = SIMBillingCycle;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    public String getPhoneColour() {
        return phoneColour;
    }

    public String getItemReceivedInBox() {
        return itemReceivedInBox;
    }

    public void setItemReceivedInBox(String itemReceivedInBox) {
        this.itemReceivedInBox = itemReceivedInBox;
    }

    public String getAssetVendorContact() {
        return assetVendorContact;
    }

    public void setAssetVendorContact(String assetVendorContact) {
        this.assetVendorContact = assetVendorContact;
    }

    public String getAssetAllocationStatus() {
        return assetAllocationStatus;
    }

    public void setAssetAllocationStatus(String assetAllocationStatus) {
        this.assetAllocationStatus = assetAllocationStatus;
    }

    public void setPhoneColour(String phoneColour) {
        this.phoneColour = phoneColour;
    }


    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }


    // Other getters and setters for the remaining fields

    // Enum for AssetType
    /*public enum AssetType {
        LAPTOP, DATACARD, SIM, MONITOR, PHONE
    }

    // Enum for LeaseType
    public enum LeaseType {
        LEASED, RENTED
    }

    // Enum for AssetAllocationStatus
    public enum AssetAllocationStatus {
        INSTOCK, ALLOCATED, REPAIR
    }*/


}
