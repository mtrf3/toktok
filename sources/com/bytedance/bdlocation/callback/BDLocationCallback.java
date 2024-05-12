package com.bytedance.bdlocation.callback;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;

/* loaded from: classes10.dex */
public interface BDLocationCallback {
    void onError(BDLocationException bDLocationException);

    void onLocationChanged(BDLocation bDLocation);
}
