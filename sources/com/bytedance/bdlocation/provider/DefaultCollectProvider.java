package com.bytedance.bdlocation.provider;

import com.bytedance.bdlocation.api.ICollectManager;
import com.bytedance.bdlocation.callback.BluetoothScanCallback;
import com.bytedance.bdlocation.callback.WifiInfoJsonCallback;
import com.bytedance.bdlocation.entity.collect.BDBleInfo;
import com.bytedance.bdlocation.network.model.BaseStation;
import com.google.gson.g;
import java.util.List;

/* loaded from: classes16.dex */
public class DefaultCollectProvider implements ICollectManager {
    @Override // com.bytedance.bdlocation.api.ICollectManager
    public BaseStation getBaseStationInfo() {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.ICollectManager
    public List<BDBleInfo> getBlueToothList() {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.ICollectManager
    public g getWifiInfoJson() {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.ICollectManager
    public boolean isBluetoothEnable() {
        return false;
    }

    @Override // com.bytedance.bdlocation.api.ICollectManager
    public void setBluetoothScanMode(int i) {
    }

    @Override // com.bytedance.bdlocation.api.ICollectManager
    public void stopBluetoothScan() {
    }

    @Override // com.bytedance.bdlocation.api.ICollectManager
    public void getWifiInfoJsonAsync(WifiInfoJsonCallback wifiInfoJsonCallback) {
        wifiInfoJsonCallback.onWifiInfoJson(null);
    }

    @Override // com.bytedance.bdlocation.api.ICollectManager
    public void startBluetoothScan(BluetoothScanCallback bluetoothScanCallback, long j, long j2) {
        bluetoothScanCallback.onSuccess(null);
    }
}
