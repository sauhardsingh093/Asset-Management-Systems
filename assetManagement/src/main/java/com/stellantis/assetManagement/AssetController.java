package com.stellantis.assetManagement;

import com.stellantis.assetManagement.Entity.Asset;
import com.stellantis.assetManagement.Service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@Controller
@CrossOrigin("*")
@RequestMapping("assets")
public class AssetController {

    @Autowired
    private AssetService assetService;


    @GetMapping("/asset/{assetType}")
    public ResponseEntity<List<Asset>> getAssetsByType(@RequestParam(required = false) String assetType) {
        if (assetType == null || assetType.isEmpty()) {
            // If type is null or empty, return bad request status
            return ResponseEntity.badRequest().build();
        }

        // Call a service (assetService) to retrieve assets by their type
        List<Asset> assets = assetService.getAssetsByType(assetType);

        // Return the retrieved assets with an OK response if found
        return ResponseEntity.ok(assets);
    }

    @GetMapping("/bytid/{tid}")
    public ResponseEntity<List<Asset>> getAssetsByTid(@PathVariable String tid) {
        List<Asset> assets = assetService.getAssetsByTid(tid);
        return new ResponseEntity<>(assets, HttpStatus.OK);
    }
    @PutMapping("/{serialNo}")
    public ResponseEntity<Asset> updateAssetBySerialNo(
            @PathVariable String serialNo,
            @RequestBody Asset updatedAsset
    ) {
        Asset updated = assetService.updateAssetBySerialNo(serialNo, updatedAsset);
        return ResponseEntity.ok(updated);
    }
    @GetMapping("/bydate")
    public List<Asset> getAssetsByInwardDate(
            @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date inwardDate    ) {
        return assetService.getAssetsByInwardDate(inwardDate);
    }
    @GetMapping("/rented")
    @ResponseBody
    public List<Asset> getRentedAssets() {
        return assetService.getRentedAssets();
    }

    @GetMapping("/leased")
    @ResponseBody
    public List<Asset> getLeasedAssets() {
        return assetService.getLeasedAssets();
    }
    @PutMapping("asset/{serialNo}")
    public ResponseEntity<Asset> updateTid(
            @PathVariable String serialNo,
            @RequestBody Asset updatedAsset
    ) {
        Asset updated = assetService.updateAssetBySerialNo1(serialNo, updatedAsset);
        return ResponseEntity.ok(updated);
    }

    @GetMapping("/laptops")
    public List<Asset> getLaptops() {
        return assetService.getLaptops();
    }
    @GetMapping("/monitors")
    public List<Asset> getMonitors() {
        return assetService.getMonitors();
    }

    @GetMapping("/getSIM")
    public List<Asset> getSim() {
        return assetService.getSim();
    }
    @GetMapping("/getDataCard")
    public List<Asset> getDataCard() {
        return assetService.getDataCard();
    }
    @GetMapping("/getPhone")
    public List<Asset> getPhone() {
        return assetService.getPhone();
    }

    @GetMapping("/{serialNo}")
    public Asset getAssetBySerialNo(@PathVariable String serialNo) {
        return assetService.getAssetBySerialNo(serialNo);
    }

    @GetMapping(value = "/allassets")
    public List<Asset> getAllAssets() {
        return assetService.getAllAssets();
    }

    public AssetService getAssetService() {
        return assetService;
    }

    public void setAssetService(AssetService assetService) {
        this.assetService = assetService;
    }

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @PostMapping("/add")
    public ResponseEntity<Asset> addAsset(@RequestBody Asset asset) {
        Asset savedAsset = assetService.addAsset(asset);
        return new ResponseEntity<>(savedAsset, HttpStatus.CREATED);
    }

    @DeleteMapping("/{serialNo}")
    public ResponseEntity<?> deleteAsset(@PathVariable String serialNo) {
        assetService.deleteAsset(serialNo);
        return ResponseEntity.ok().build();
    }



}

