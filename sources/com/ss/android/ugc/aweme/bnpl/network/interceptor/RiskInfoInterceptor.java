package com.ss.android.ugc.aweme.bnpl.network.interceptor;

import X.C113554cx;
import X.C37274Ek2;
import X.C64550PVa;
import X.C64797Pbt;
import X.C91893a1x;
import X.C91894a1y;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.InterfaceC91835a11;
import X.OSZ;
import com.bytedance.retrofit2.client.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RiskInfoInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        Annotation annotation;
        boolean z;
        C37274Ek2 c37274Ek2;
        Method method;
        Request request = ((F7S) fbz).LIZJ;
        if (request != null && (c37274Ek2 = (C37274Ek2) request.tag(C37274Ek2.class)) != null && (method = c37274Ek2.LIZ) != null) {
            annotation = method.getAnnotation(InterfaceC91835a11.class);
        } else {
            annotation = null;
        }
        if (annotation != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && request != null) {
            try {
                Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("risk_info", C91894a1y.LIZJ()));
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
