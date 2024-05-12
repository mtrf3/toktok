package com.ss.android.ttve.log;

import X.C57964Moy;
import X.FWO;

/* loaded from: classes16.dex */
public class TELog2ClientInvoker {
    public static native void nativeInit();

    public static native void nativeSetIsToLogcat(boolean z);

    static {
        synchronized (FWO.class) {
            FWO.LIZJ();
        }
    }

    public static boolean onNativeCallback_checkJni(byte[] bArr) {
        if (bArr != null) {
            bArr[0] = 1;
            return true;
        }
        C57964Moy.LIZLLL(4, "onCheckJni data is null");
        return false;
    }

    public static void onNativeCallback_logToLocal(int i, String str) {
        C57964Moy.LIZLLL(i, str);
    }
}
