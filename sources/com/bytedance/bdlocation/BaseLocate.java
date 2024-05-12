package com.bytedance.bdlocation;

import android.content.Context;
import com.bytedance.bdlocation.api.ILocate;
import com.bytedance.bdlocation.callback.LocateCallback;
import com.bytedance.bdlocation.exception.BDLocationException;

/* loaded from: classes15.dex */
public abstract class BaseLocate implements ILocate, LocateCallback {
    public Context mContext;
    public LocateCallback mLocateCallback;

    public BaseLocate(Context context) {
        this.mContext = context;
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateStart(String str) {
        LocateCallback locateCallback = this.mLocateCallback;
        if (locateCallback != null) {
            locateCallback.onLocateStart(str);
        }
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateStop(String str) {
        LocateCallback locateCallback = this.mLocateCallback;
        if (locateCallback != null) {
            locateCallback.onLocateStop(str);
        }
    }

    public void setLocateCallback(LocateCallback locateCallback) {
        this.mLocateCallback = locateCallback;
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateChange(String str, BDLocation bDLocation) {
        LocateCallback locateCallback = this.mLocateCallback;
        if (locateCallback != null) {
            locateCallback.onLocateChange(str, bDLocation);
        }
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateError(String str, BDLocationException bDLocationException) {
        LocateCallback locateCallback = this.mLocateCallback;
        if (locateCallback != null) {
            locateCallback.onLocateError(str, bDLocationException);
        }
    }
}
