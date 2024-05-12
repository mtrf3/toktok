package com.ss.android.vesdk.runtime.oauth;

import X.FWO;

/* loaded from: classes7.dex */
public class TEOAuth {
    public static native int nativeActivate(String str, String str2, String str3, String str4, String str5, String str6);

    public static native String nativeGetActivationCode();

    static {
        FWO.LIZJ();
    }
}
