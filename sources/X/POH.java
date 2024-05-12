package X;

import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class POH {
    public static PIR LIZ(POJ poj) {
        PIU piu;
        Object obj = poj.LIZLLL;
        PIR pir = null;
        if (obj instanceof PIU) {
            piu = (PIU) obj;
            if (piu != null) {
                String service = poj.LIZIZ;
                o.LJIIIZ(service, "service");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(service);
                LIZ.append('_');
                LIZ.append(POW.LIZ.incrementAndGet());
                pir = piu.LIZLLL(X1D.LIZIZ(LIZ));
            }
        } else {
            piu = null;
        }
        C64375POh.LJI(new AqS142S0200000_11(piu, pir, 0));
        return pir;
    }
}
