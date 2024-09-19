package com.stellantis.assetManagement.Service;


import com.stellantis.assetManagement.Entity.Asset;
import com.stellantis.assetManagement.Entity.Employee;

import com.stellantis.assetManagement.dao.AssetRepository;

import com.stellantis.assetManagement.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Asset> getAssetsByTid(String tid) {
        return assetRepository.findByTid(tid);
    }
    public Asset getAssetBySerialNo(String serialNo) {
        return assetRepository.findById(serialNo).orElse(null);
    }
    public Asset updateAssetBySerialNo(String serialNo, Asset updatedAsset) {
        Asset existingAsset = assetRepository.findById(serialNo)
                .orElseThrow(() -> new RuntimeException("Asset not found with serial number: " + serialNo));

        // Update the fields you want to allow modification
        existingAsset.setRes(updatedAsset.getRes());
        existingAsset.setTid(updatedAsset.getTid());
        existingAsset.setComputerName(updatedAsset.getComputerName());
        existingAsset.setModel(updatedAsset.getModel());
        existingAsset.setModelType(updatedAsset.getModelType());
        existingAsset.setAssetType(updatedAsset.getAssetType());
        existingAsset.setLeaseType(updatedAsset.getLeaseType());
        existingAsset.setAssetTag(updatedAsset.getAssetTag());
        existingAsset.setMake(updatedAsset.getMake());
        existingAsset.setIMEI(updatedAsset.getIMEI());
        existingAsset.setIMSI(updatedAsset.getIMSI());
        existingAsset.setSimNumber(updatedAsset.getSimNumber());
        existingAsset.setSIMBillingCycle(updatedAsset.getSIMBillingCycle());
        existingAsset.setPhoneConfiguration(updatedAsset.getPhoneConfiguration());
        existingAsset.setPhoneColour(updatedAsset.getPhoneColour());
        existingAsset.setItemReceivedInBox(updatedAsset.getItemReceivedInBox());
        existingAsset.setAssetVendorContact(updatedAsset.getAssetVendorContact());
        existingAsset.setRemarks(updatedAsset.getRemarks());
        existingAsset.setAssetAllocationStatus(updatedAsset.getAssetAllocationStatus());
        existingAsset.setInvoiceNumber(updatedAsset.getInvoiceNumber());
        existingAsset.setInvoiceDate(updatedAsset.getInvoiceDate());
        existingAsset.setInwardLocation(updatedAsset.getInwardLocation());
        existingAsset.setInwardDate(updatedAsset.getInwardDate());
        existingAsset.setBasicAmount(updatedAsset.getBasicAmount());
        existingAsset.setGst(updatedAsset.getGst());
        existingAsset.setTsc(updatedAsset.getTsc());
        existingAsset.setTaxAmount(updatedAsset.getTaxAmount());
        existingAsset.setTotalAmount(updatedAsset.getTotalAmount());
        // Update other fields as needed

        // Save the updated asset to the database
        return assetRepository.save(existingAsset);
    }
    public Asset updateAssetBySerialNo1(String serialNo, Asset updatedAsset) {
        Asset existingAsset = assetRepository.findById(serialNo)
                .orElseThrow(() -> new RuntimeException("Asset not found with serial number: " + serialNo));

        // Update the fields you want to allow modification
        existingAsset.setRes(updatedAsset.getRes());
        existingAsset.setTid(updatedAsset.getTid());
        existingAsset.setComputerName(updatedAsset.getComputerName());
        existingAsset.setModel(updatedAsset.getModel());
        existingAsset.setModelType(updatedAsset.getModelType());
        existingAsset.setAssetType(updatedAsset.getAssetType());
        existingAsset.setLeaseType(updatedAsset.getLeaseType());
        existingAsset.setAssetTag(updatedAsset.getAssetTag());
        existingAsset.setMake(updatedAsset.getMake());
        existingAsset.setIMEI(updatedAsset.getIMEI());
        existingAsset.setIMSI(updatedAsset.getIMSI());
        existingAsset.setSimNumber(updatedAsset.getSimNumber());
        existingAsset.setSIMBillingCycle(updatedAsset.getSIMBillingCycle());
        existingAsset.setPhoneConfiguration(updatedAsset.getPhoneConfiguration());
        existingAsset.setPhoneColour(updatedAsset.getPhoneColour());
        existingAsset.setItemReceivedInBox(updatedAsset.getItemReceivedInBox());
        existingAsset.setAssetVendorContact(updatedAsset.getAssetVendorContact());
        existingAsset.setRemarks(updatedAsset.getRemarks());
        existingAsset.setAssetAllocationStatus(updatedAsset.getAssetAllocationStatus());
        existingAsset.setInvoiceNumber(updatedAsset.getInvoiceNumber());
        existingAsset.setInvoiceDate(updatedAsset.getInvoiceDate());
        existingAsset.setInwardLocation(updatedAsset.getInwardLocation());
        existingAsset.setInwardDate(updatedAsset.getInwardDate());
        existingAsset.setBasicAmount(updatedAsset.getBasicAmount());
        existingAsset.setGst(updatedAsset.getGst());
        existingAsset.setTsc(updatedAsset.getTsc());
        existingAsset.setTaxAmount(updatedAsset.getTaxAmount());
        existingAsset.setTotalAmount(updatedAsset.getTotalAmount());
        // Update other fields as needed

        // Save the updated asset to the database
        return assetRepository.save(existingAsset);
    }
    public List<Asset> getAssetsByType(String assetType) {
        // Implement the logic to fetch assets by their type from the repository
        return assetRepository.findByAssetType(assetType);
    }
    //For searching leaseType
    public List<Asset> getRentedAssets() {
        return assetRepository.findByLeaseType("RENTED");
    }
    public List<Asset> getAssetsByInwardDate(Date inwardDate) {
        return assetRepository.findByInwardDate(inwardDate);
    }
    public List<Asset> getLeasedAssets() {
        return assetRepository.findByLeaseType("Leased");
    }
    public List<Asset> getLaptops() {        return assetRepository.findByAssetType("laptop");    }
    public List<Asset> getMonitors() {
        return assetRepository.findByAssetType("monitor");
    }
    public List<Asset> getSim() {
        return assetRepository.findByAssetType("SIM");
    }
    public List<Asset> getDataCard() {
        return assetRepository.findByAssetType("datacard");
    }
    public List<Asset> getPhone() {
        return assetRepository.findByAssetType("phone");
    }
    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public Asset saveAsset(Asset asset) {
        return assetRepository.save(asset);
    }
    public void deleteAsset(String serialNo) {
        assetRepository.deleteById(serialNo);
    }
    public Asset addAsset(Asset asset) {
        return assetRepository.save(asset);
    }




}
