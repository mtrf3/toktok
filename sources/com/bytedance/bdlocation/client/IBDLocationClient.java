package com.bytedance.bdlocation.client;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;

/* loaded from: classes16.dex */
public interface IBDLocationClient {
    BDLocation getLocation();

    void getLocation(BDLocationCallback bDLocationCallback);

    void setClientOption(BDLocationClientOption bDLocationClientOption);

    void startLocation(BDLocationCallback bDLocationCallback);

    void stopLocation();
}
