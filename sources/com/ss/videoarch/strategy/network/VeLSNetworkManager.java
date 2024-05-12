package com.ss.videoarch.strategy.network;

import X.C16880lQ;
import X.C38891FOd;
import X.C79326VBi;
import android.text.TextUtils;

/* loaded from: classes15.dex */
public class VeLSNetworkManager {
    private native String nativeGetAbrAutoSettings();

    private native void nativeGetLSSettings();

    private native String nativeGetLSStrategySDKSettings();

    private native String nativeGetLivePlayerSettings();

    private native String nativeGetQuicSettings();

    private native String nativeGetRTMPlayer();

    private native String nativeGetStrategyConfig();

    private native String nativeGetStrategyConfigByName(String str, String str2);

    public native void nativeStartPeriodicRequest();

    static {
        boolean z;
        if (!C79326VBi.LIZ()) {
            try {
            } catch (Throwable unused) {
                z = false;
            }
            if (!TextUtils.isEmpty("livestrategy")) {
                C16880lQ.LLJJJIL("livestrategy");
                z = true;
                synchronized (C79326VBi.class) {
                    C79326VBi.LIZ = z;
                }
                return;
            }
            throw new Exception("Invalid library name.");
        }
    }

    public VeLSNetworkManager() {
        new C38891FOd();
    }
}
