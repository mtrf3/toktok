package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import X.C64598PWw;
import X.C64605PXd;
import X.C64606PXe;
import X.C64618PXq;
import X.C64735Pat;
import X.InterfaceC39184FZk;
import X.InterfaceC48121Iub;
import X.PW8;
import X.PXZ;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Request;

/* loaded from: classes12.dex */
public class OkHttp3SecurityFactorInterceptor implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        Map<String, String> onCallToAddSecurityFactor;
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        if ("1".equals(request.headers().LIZLLL("x-metasec-bypass-mssdk"))) {
            C64618PXq newBuilder = request.newBuilder();
            newBuilder.LJFF("x-metasec-bypass-mssdk");
            return pw8.LIZ(newBuilder.LIZIZ());
        }
        String str = request.url().LJIIIIZZ;
        Map<String, List<String>> LJIIIZ = request.headers().LJIIIZ();
        InterfaceC39184FZk interfaceC39184FZk = C64735Pat.LJIILL;
        if (interfaceC39184FZk == null || (onCallToAddSecurityFactor = interfaceC39184FZk.onCallToAddSecurityFactor(str, LJIIIZ)) == null) {
            return pw8.LIZ(request);
        }
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJIIIIZZ(request.url());
        c64618PXq.LJ(request.method(), request.body());
        c64618PXq.LJI(Object.class, request.tag());
        C64605PXd LJI = request.headers().LJI();
        for (Map.Entry entry : ((HashMap) onCallToAddSecurityFactor).entrySet()) {
            LJI.LIZ((String) entry.getKey(), (String) entry.getValue());
        }
        c64618PXq.LIZJ = new C64606PXe(LJI).LJI();
        return pw8.LIZ(c64618PXq.LIZIZ());
    }
}
