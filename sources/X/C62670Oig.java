package X;

import Y.AfS59S0200000_10;
import android.app.Activity;

/* renamed from: X.Oig, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62670Oig {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        T06 LIZIZ;
        C68322mC c68322mC = new C68322mC();
        T t = 0;
        t = 0;
        c68322mC.element = null;
        AfS59S0200000_10 afS59S0200000_10 = new AfS59S0200000_10(interfaceC65784Pro, c68322mC, 8);
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null && (LIZIZ = interfaceC62484Ofg.LIZIZ()) != null) {
            t = LIZIZ.LJJJJZI(afS59S0200000_10);
        }
        c68322mC.element = t;
    }

    public static boolean LIZIZ(Activity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
