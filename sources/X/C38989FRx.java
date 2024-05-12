package X;

import Y.ACallableS0S4000000_6;
import Y.AfS18S0001000_6;
import android.text.TextUtils;

/* renamed from: X.FRx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38989FRx {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static void LIZ(boolean z) {
        if (z && !LIZIZ) {
            synchronized (C38989FRx.class) {
                if (!LIZIZ) {
                    LIZIZ = true;
                    C84763XOl.LIZJ().LJJJJZI(new AfS18S0001000_6(1, 3));
                    C38987FRv.LIZIZ = new NPV();
                }
            }
        }
        if (LIZ != z) {
            LIZ = z;
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (LIZ && !TextUtils.isEmpty(str)) {
            C10K.LIZIZ(new ACallableS0S4000000_6(C38987FRv.LIZIZ(), C38987FRv.LIZJ(), str, str2, 0), FMX.LIZIZ(), null);
        }
    }
}
