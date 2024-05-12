package com.ss.android.ugc.aweme.bnpl.network.interceptor;

import X.C113554cx;
import X.C64550PVa;
import X.C64797Pbt;
import X.C91824a0q;
import X.C91893a1x;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.OSZ;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CommonParamInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        Request request = ((F7S) fbz).LIZJ;
        if (request != null) {
            try {
                Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("priority_region", C91824a0q.LIZIZ));
                if (o.LJ(request.getMethod(), "POST") && (request.getRequestBody() instanceof C64550PVa)) {
                    request = C91893a1x.LIZ(request, LJJLIIIIJ);
                } else {
                    request = C91893a1x.LIZIZ(request, LJJLIIIIJ);
                }
            } catch (Throwable unused) {
            }
        }
        return ((F7S) fbz).LIZ(request);
    }
}
