package com.bytedance.bdlocation.callback;

import com.bytedance.bdlocation.exception.BDLocationException;
import com.google.gson.g;

/* loaded from: classes16.dex */
public interface WifiInfoJsonCallback {
    void onFailed(BDLocationException bDLocationException);

    void onWifiInfoJson(g gVar);
}
