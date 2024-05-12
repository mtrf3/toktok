package X;

import Y.ARunnableS13S0000000_6;
import Y.ARunnableS20S0000000_14;

/* renamed from: X.Flx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39941Flx {
    public static volatile boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        C64493PSv.LIZ().execute(new ARunnableS13S0000000_6(14));
        if (C39942Fly.LIZJ.booleanValue()) {
            C64493PSv.LIZ().execute(new ARunnableS20S0000000_14(3));
        } else {
            C64493PSv.LIZ().execute(new ARunnableS13S0000000_6(15));
            C64493PSv.LIZ().execute(new ARunnableS20S0000000_14(2));
        }
    }
}
