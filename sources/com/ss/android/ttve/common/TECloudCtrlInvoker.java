package com.ss.android.ttve.common;

import X.FWO;

/* loaded from: classes12.dex */
public class TECloudCtrlInvoker {
    private native int nativeVerifyJson(byte[] bArr, byte[] bArr2);

    static {
        FWO.LIZJ();
    }

    public final boolean LIZ(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty() || nativeVerifyJson(str.getBytes(), str2.getBytes()) != 0) {
            return false;
        }
        return true;
    }
}
