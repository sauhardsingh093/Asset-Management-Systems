package com.stellantis.assetManagement.dao;

import com.stellantis.assetManagement.Entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface AssetRepository extends JpaRepository<Asset, String> {

    List<Asset> findByTid(String tid); // Method to find assets by tid

    Optional<Asset> findBySerialNo(String serialNo);
    List<Asset> findByAssetType(String assetType);
    // Check if an asset exists by its serial number
    boolean existsBySerialNo(String serialNo);

    // Delete an asset by its serial number
    void deleteBySerialNo(String serialNo);

    //For searching leaseType
    List<Asset> findByLeaseType(String leaseType);
    List<Asset> findByInwardDate(Date inwardDate);
}

