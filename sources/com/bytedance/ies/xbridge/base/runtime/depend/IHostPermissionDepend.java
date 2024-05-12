package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;

/* loaded from: classes16.dex */
public interface IHostPermissionDepend {
    boolean hasPermission(Activity activity, String str);

    void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str, Cert cert);
}
