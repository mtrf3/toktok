package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1V {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Object callLocation, Throwable th, int i, String str) {
        o.LJIIJ(callLocation, "callLocation");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('[');
        LIZ2.append(C16880lQ.LJLLJ(callLocation.getClass()));
        LIZ2.append("]code:");
        LIZ2.append(i);
        LIZ2.append("  msg:");
        LIZ2.append(str);
        String message = X1D.LIZIZ(LIZ2);
        o.LJIIJ(message, "message");
        if (Q1A.LIZIZ() != null) {
            C66336Q1s LIZIZ = Q1A.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LIZ.e("StrategyCenter", message, th);
                return;
            }
            return;
        }
        if (th == null) {
            return;
        }
        th.printStackTrace();
    }
}
