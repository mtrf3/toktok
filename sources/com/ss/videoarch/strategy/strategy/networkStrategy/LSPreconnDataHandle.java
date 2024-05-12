package com.ss.videoarch.strategy.strategy.networkStrategy;

import X.C79369VCz;
import X.VD5;
import android.text.TextUtils;

/* loaded from: classes15.dex */
public class LSPreconnDataHandle {
    private native String nativeGetPreconnectIp(String str);

    private native int nativeSetLSConnectToggles(int i, boolean z, int i2, int i3, int i4);

    private native int nativeSetLiveStartOptToggles(boolean z, String str, int i, String str2, String str3, int i2, int i3, String str4);

    public final String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return nativeGetPreconnectIp(str);
    }

    public final void LIZIZ(VD5 vd5) {
        nativeSetLSConnectToggles(3, vd5.LIZ, vd5.LIZIZ, vd5.LIZJ, vd5.LIZLLL);
    }

    public final void LIZJ(C79369VCz c79369VCz) {
        nativeSetLiveStartOptToggles(c79369VCz.LIZ, c79369VCz.LIZIZ, c79369VCz.LIZJ, c79369VCz.LIZLLL, c79369VCz.LJFF, c79369VCz.LJ, c79369VCz.LJI, c79369VCz.LJII);
    }
}
