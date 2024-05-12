package com.bytedance.sdk.xbridge.runtime.depend;

import android.app.Activity;

/* loaded from: classes16.dex */
public interface IHostPermissionDepend {
    boolean hasPermission(Activity activity, String str);

    void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str);
}
