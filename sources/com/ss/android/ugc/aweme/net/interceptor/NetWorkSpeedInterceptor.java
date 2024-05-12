package com.ss.android.ugc.aweme.net.interceptor;

import X.C64598PWw;
import X.PW8;
import X.PXZ;
import X.PZM;
import X.PZN;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import okhttp3.Request;

/* loaded from: classes12.dex */
public class NetWorkSpeedInterceptor implements INetReleaseInterceptor {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        PZM pzm = PZN.LIZ;
        if (pzm.LIZIZ.getAndIncrement() == 0) {
            pzm.LIZJ.sendEmptyMessage(1);
            pzm.LIZLLL = SystemClock.elapsedRealtime();
        }
        C64598PWw LIZ = pw8.LIZ(request);
        if (pzm.LIZIZ.decrementAndGet() == 0) {
            pzm.LIZJ.sendEmptyMessage(2);
        }
        return LIZ;
    }
}
