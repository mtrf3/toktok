package com.bytedance.bdlocation.trace;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.LocateCallback;
import com.bytedance.bdlocation.exception.BDLocationException;

/* loaded from: classes15.dex */
public interface TraceCallback extends LocateCallback {
    void onError(BDLocationException bDLocationException);

    void onLocationChanged(BDLocation bDLocation);

    void onStart(LocationTrace locationTrace);

    void onStop();
}
