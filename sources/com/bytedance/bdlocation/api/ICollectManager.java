package com.bytedance.bdlocation.api;

import com.bytedance.bdlocation.callback.BluetoothScanCallback;
import com.bytedance.bdlocation.callback.WifiInfoJsonCallback;
import com.bytedance.bdlocation.entity.collect.BDBleInfo;
import com.bytedance.bdlocation.network.model.BaseStation;
import com.google.gson.g;
import java.util.List;

/* loaded from: classes16.dex */
public interface ICollectManager extends IManager {
    BaseStation getBaseStationInfo();

    List<BDBleInfo> getBlueToothList();

    g getWifiInfoJson();

    void getWifiInfoJsonAsync(WifiInfoJsonCallback wifiInfoJsonCallback);

    boolean isBluetoothEnable();

    void setBluetoothScanMode(int i);

    void startBluetoothScan(BluetoothScanCallback bluetoothScanCallback, long j, long j2);

    void stopBluetoothScan();
}
