package com.ss.android.ugc.aweme.net.monitor;

import X.C64797Pbt;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.PPC;
import X.PPD;
import X.PY7;
import com.bytedance.retrofit2.client.Request;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TTNetMonitorInterceptor implements InterfaceC37216Ej6 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Pbt, R] */
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        C64797Pbt<?> c64797Pbt;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        PY7 py7 = PY7.LIZLLL;
        PPC<Request, C64797Pbt<?>> LIZ = py7.LIZ(new PPC<>(request, 62));
        PPD ppd = LIZ.LJFF;
        if (ppd == PPD.INTERCEPT && (c64797Pbt = LIZ.LIZIZ) != null) {
            return c64797Pbt;
        }
        PPD ppd2 = PPD.EXCEPTION;
        if (ppd != ppd2 || (runtimeException2 = LIZ.LJ) == null) {
            Request request2 = LIZ.LIZ;
            o.LJI(request2);
            LIZ.LIZIZ = f7s.LIZ(request2);
            PPC<Request, C64797Pbt<?>> LIZLLL = py7.LIZLLL(LIZ);
            if (LIZLLL.LJFF != ppd2 || (runtimeException = LIZLLL.LJ) == null) {
                C64797Pbt<?> c64797Pbt2 = LIZLLL.LIZIZ;
                o.LJI(c64797Pbt2);
                return c64797Pbt2;
            }
            throw runtimeException;
        }
        throw runtimeException2;
    }
}
