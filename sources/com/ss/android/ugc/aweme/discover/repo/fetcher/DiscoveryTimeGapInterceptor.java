package com.ss.android.ugc.aweme.discover.repo.fetcher;

import X.C36910EeA;
import X.C64668PZo;
import X.C64797Pbt;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.K4J;
import com.bytedance.retrofit2.client.Request;

/* loaded from: classes7.dex */
public final class DiscoveryTimeGapInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        try {
            Request request = ((F7S) fbz).LIZJ;
            Object obj = null;
            if (request == null) {
                return null;
            }
            C64797Pbt<?> LIZ = ((F7S) fbz).LIZ(request);
            T t = LIZ.LIZIZ;
            C36910EeA c36910EeA = LIZ.LIZ;
            if (c36910EeA != null) {
                obj = c36910EeA.LJFF;
            }
            if ((t instanceof K4J) && (obj instanceof C64668PZo)) {
                ((K4J) t).setRequestInfo((C64668PZo) obj);
            }
            return LIZ;
        } catch (Throwable unused) {
            F7S f7s = (F7S) fbz;
            return f7s.LIZ(f7s.LIZJ);
        }
    }
}
