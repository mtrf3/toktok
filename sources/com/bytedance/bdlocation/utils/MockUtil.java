package com.bytedance.bdlocation.utils;

import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.network.model.WifiInfo;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class MockUtil {
    public static g getMockWifiJson() {
        ArrayList arrayList = new ArrayList();
        WifiInfo wifiInfo = new WifiInfo();
        wifiInfo.wifiMac = BDLocationConfig.getMockWifiMac();
        wifiInfo.isCurrent = 1;
        wifiInfo.timeStamp = System.currentTimeMillis() / 1000;
        arrayList.add(wifiInfo);
        j jsonTreeSafely = JsonUtil.toJsonTreeSafely(arrayList, new TypeToken<List<WifiInfo>>() { // from class: com.bytedance.bdlocation.utils.MockUtil.1
        }.getType());
        if (jsonTreeSafely == null || !(jsonTreeSafely instanceof g)) {
            return null;
        }
        return jsonTreeSafely.LJIILLIIL();
    }
}
