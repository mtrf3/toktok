package com.bytedance.bdlocation.callback;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;

/* loaded from: classes15.dex */
public interface LocateCallback {
    void onLocateChange(String str, BDLocation bDLocation);

    void onLocateError(String str, BDLocationException bDLocationException);

    void onLocateStart(String str);

    void onLocateStop(String str);
}
