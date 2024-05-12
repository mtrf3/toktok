package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class B8V implements Runnable {
    public static final B8V LJLIL = new B8V();

    public static void LIZ() {
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL != null) {
            C29889BoD LIZIZ = C29889BoD.LIZIZ(LIZLLL);
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            long LIZLLL2 = B8U.LIZLLL();
            int LJFF = LIZIZ.LJFF(B8U.LIZJ(currentUserId), -1);
            if (LJFF != 1) {
                if (LJFF == 3) {
                    LIZIZ.LJIIIIZZ(4, B8U.LIZJ(currentUserId));
                }
            } else {
                LIZIZ.LJIIIIZZ(2, B8U.LIZJ(currentUserId));
            }
            LIZIZ.LJIIIIZZ(Long.valueOf(LIZLLL2), B8U.LJI(currentUserId));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
