package com.ss.android.ugc.aweme.net.interceptor;

import X.C64598PWw;
import X.C64618PXq;
import X.C64627PXz;
import X.PW8;
import X.PXZ;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.net.IReleaseInterceptor;
import okhttp3.Request;

/* loaded from: classes12.dex */
public class DevicesNullInterceptor implements IReleaseInterceptor {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        if (TextUtils.equals("", request.url().LJIILL("device_id"))) {
            C64618PXq newBuilder = request.newBuilder();
            C64627PXz LJIIJ = request.url().LJIIJ();
            LJIIJ.LJFF("device_id");
            newBuilder.LJIIIIZZ(LJIIJ.LIZJ());
            request = newBuilder.LIZIZ();
        }
        return pw8.LIZ(request);
    }
}
