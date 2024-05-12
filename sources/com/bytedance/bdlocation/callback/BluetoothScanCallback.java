package com.bytedance.bdlocation.callback;

import com.bytedance.bdlocation.entity.collect.BDBleInfo;
import java.util.List;

/* loaded from: classes12.dex */
public interface BluetoothScanCallback {
    void onError();

    void onScan(BDBleInfo bDBleInfo);

    void onSuccess(List<BDBleInfo> list);
}
