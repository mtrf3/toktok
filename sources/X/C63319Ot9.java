package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;

/* renamed from: X.Ot9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63319Ot9 {
    public static volatile C63319Ot9 LIZLLL = null;
    public static boolean LJ = false;
    public static int LJFF = 8;
    public final Handler LIZ = new Handler(C06M.LIZ("RepairManager-Thread").getLooper());
    public ARunnableS46S0100000_10 LIZIZ;
    public long LIZJ;

    public static C63319Ot9 LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C63319Ot9.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C63319Ot9();
                }
            }
        }
        return LIZLLL;
    }

    public final long LIZJ() {
        long j = this.LIZJ;
        if (j > 0) {
            return j;
        }
        if (C63314Ot4.LJIILIIL != null) {
            return r1.optInt("defaultPollingMsgInterval");
        }
        return C63314Ot4.LIZJ;
    }

    public final void LJ() {
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = this.LIZIZ;
        if (aRunnableS46S0100000_10 != null) {
            this.LIZ.removeCallbacks(aRunnableS46S0100000_10);
            this.LIZIZ = null;
            this.LIZJ = 0L;
        }
    }

    public C63319Ot9() {
        LJ = true;
    }

    public static void LIZ() {
        if (C63314Ot4.LJI() || C63314Ot4.LIZ()) {
            C63319Ot9 LIZIZ = LIZIZ();
            if (LIZIZ.LIZIZ == null || C63314Ot4.LJ()) {
                return;
            }
            LIZIZ.LJ();
        }
    }

    public static void LIZLLL() {
        if (C63308Osy.LJI().LJ) {
            if (C63314Ot4.LJI() || C63314Ot4.LIZ()) {
                if (C63314Ot4.LIZ()) {
                    LJFF = 11;
                } else {
                    LJFF = 8;
                }
                C63319Ot9 LIZIZ = LIZIZ();
                if (LIZIZ.LIZIZ == null) {
                    ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(LIZIZ, 167);
                    LIZIZ.LIZIZ = aRunnableS46S0100000_10;
                    LIZIZ.LIZ.postDelayed(aRunnableS46S0100000_10, LIZIZ.LIZJ() * 1000);
                }
            }
        }
    }

    public final void LJFF(long j) {
        this.LIZJ = j;
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = this.LIZIZ;
        if (aRunnableS46S0100000_10 != null) {
            this.LIZ.removeCallbacks(aRunnableS46S0100000_10);
            this.LIZ.postDelayed(this.LIZIZ, LIZJ() * 1000);
        }
    }
}
