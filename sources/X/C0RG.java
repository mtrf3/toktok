package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.0RG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RG {
    public static void LIZ(C36241bY c36241bY, AnonymousClass140 anonymousClass140) {
        C36671cF c36671cF;
        String LIZ = C48559J3z.LIZ("/payment/v1/pay");
        List<Pair<String, String>> LIZIZ = c36241bY.LIZIZ();
        QKY qky = new QKY();
        C36671cF c36671cF2 = new C36671cF();
        try {
            c36671cF = new C36671cF(C276216o.LJIIL.LIZ.LJIIJJI.LIZLLL(LIZ, LIZIZ, (java.util.Map) c36241bY.LJ, qky));
        } catch (Throwable th) {
            th = th;
        }
        try {
            anonymousClass140.LIZ(c36671cF);
        } catch (Throwable th2) {
            th = th2;
            c36671cF2 = c36671cF;
            c36671cF2.LIZLLL = "exception";
            c36671cF2.LJ = th.getLocalizedMessage();
            anonymousClass140.LIZ(c36671cF2);
        }
    }

    public static void LIZIZ(C36251bZ c36251bZ, AnonymousClass141 anonymousClass141) {
        System.currentTimeMillis();
        try {
            anonymousClass141.LIZ(new C36681cG(C276216o.LJIIL.LIZ.LJIIJJI.LIZLLL(C48559J3z.LIZ("/payment/v1/payment_details"), c36251bZ.LIZIZ(), (java.util.Map) c36251bZ.LJ, new QKY())));
        } catch (Throwable th) {
            C36681cG c36681cG = new C36681cG();
            c36681cG.LJFF = "exception";
            c36681cG.LJI = th.getLocalizedMessage();
            anonymousClass141.LIZ(c36681cG);
        }
    }
}
