package com.bytedance.bdlocation.api;

import android.os.Looper;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;

/* loaded from: classes15.dex */
public interface ILocate extends IManager {
    BDPoint convertGCJ02(BDPoint bDPoint);

    String getLocateName();

    boolean isAMapDataAvailable(double d, double d2);

    void startLocation(BDLocationCallback bDLocationCallback, LocationOption locationOption, Looper looper);

    void stopLocation();
}
