package com.ss.android.ugc.aweme.bnpl.network.interceptor;

import X.C113554cx;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C91826a0s;
import X.C91893a1x;
import X.C91926a2U;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.OSZ;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class SessionInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        Request request = ((F7S) fbz).LIZJ;
        if (request != null) {
            try {
                Request LIZJ = C91893a1x.LIZJ(request, C113554cx.LJJLIIIIJ(new OSZ("pipo-fp-session-id", C91826a0s.LIZLLL)));
                try {
                    String builder = UriProtector.parse(request.getUrl()).buildUpon().appendQueryParameter("ip_address", C91926a2U.LIZIZ()).toString();
                    o.LJIIIIZZ(builder, "parse(it.url).buildUpon(…Address(true)).toString()");
                    C64908Pdg newBuilder = LIZJ.newBuilder();
                    if (newBuilder != null) {
                        newBuilder.LIZJ(builder);
                        request = newBuilder.LIZ();
                    } else {
                        request = null;
                    }
                } catch (Throwable unused) {
                    request = LIZJ;
                }
            } catch (Throwable unused2) {
            }
        }
        return ((F7S) fbz).LIZ(request);
    }
}
