package com.bytedance.bdlocation.callback;

import com.bytedance.bdlocation.network.response.LocationResp;

/* loaded from: classes2.dex */
public interface LocationUploadCallback {
    void onError(String str);

    void onSuccess(LocationResp locationResp);
}
