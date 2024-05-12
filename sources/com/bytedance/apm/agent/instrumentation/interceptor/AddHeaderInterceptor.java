package com.bytedance.apm.agent.instrumentation.interceptor;

import X.C64092PDk;
import X.C64094PDm;
import X.C64598PWw;
import X.C64618PXq;
import X.InterfaceC48121Iub;
import X.PXZ;
import android.text.TextUtils;
import okhttp3.Request;

/* loaded from: classes.dex */
public class AddHeaderInterceptor implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public C64598PWw intercept(PXZ pxz) {
        Request request = pxz.request();
        C64618PXq newBuilder = request.newBuilder();
        if (TextUtils.isEmpty(request.header("x-tt-trace-log"))) {
            C64092PDk c64092PDk = C64094PDm.LIZ;
            if (c64092PDk.LJZL) {
                if (c64092PDk.LJIILL() && c64092PDk.LJLJLLL) {
                    newBuilder.LIZ("x-tt-trace-log", "01");
                } else if (c64092PDk.LJLJLJ == 1 && c64092PDk.LJLJLLL) {
                    newBuilder.LIZ("x-tt-trace-log", "02");
                }
            }
        }
        return pxz.LIZ(newBuilder.LIZIZ());
    }
}
