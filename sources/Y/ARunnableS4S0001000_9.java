package Y;

import X.C2NH;
import X.C2U8;
import X.C38840FMe;
import X.C52224Kea;
import X.C54251LQx;
import X.C55041Liv;
import X.LQ2;
import X.LQM;
import X.X1D;
import android.os.Handler;

/* loaded from: classes10.dex */
public class ARunnableS4S0001000_9 implements Runnable {
    public final int $t;
    public int i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (this.i0 == 3) {
            LQM.LJIIZILJ = false;
            LQM.LJIJI = false;
            LQM.LJIIIZ = true;
            LQM.LIZLLL = false;
            LQM.LIZ = false;
            LQM.LJ = false;
            LQM.LJIILLIIL = null;
            LQM.LJFF = null;
            LQM.LJI = null;
            LQM.LJIIIIZZ = null;
            LQM.LJIILL = null;
            LQM.LJII = null;
            LQM.LJIJI = false;
            LQM.LJIIIZ = true;
            LQM.LJIJ = true;
            LQM.LJ = false;
            LQM.LJJ.removeCallbacksAndMessages(null);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("livesdk_bubble_restart_");
        LIZ.append(this.i0);
        LQ2.LJFF(X1D.LIZIZ(LIZ));
        LQM.LJI();
    }

    public static final void run$0(ARunnableS4S0001000_9 aRunnableS4S0001000_9) {
        switch (aRunnableS4S0001000_9.i0) {
            case 0:
                if (C55041Liv.LJ == null) {
                    synchronized (C38840FMe.class) {
                        if (C55041Liv.LJ == null) {
                            C55041Liv.LJ = new C55041Liv();
                        }
                    }
                }
                C55041Liv c55041Liv = C55041Liv.LJ;
                c55041Liv.getClass();
                if (!C52224Kea.LIZ) {
                    return;
                }
                Handler handler = C2NH.LIZ;
                if (c55041Liv.LIZLLL == null) {
                    c55041Liv.LIZLLL = new ARunnableS11S0101000_7(4, c55041Liv, 13);
                }
                handler.postAtFrontOfQueue(c55041Liv.LIZLLL);
                return;
            default:
                return;
        }
    }

    public static final void run$1(ARunnableS4S0001000_9 aRunnableS4S0001000_9) {
        boolean LIZ;
        try {
            C54251LQx c54251LQx = new C54251LQx(-3);
            c54251LQx.LJLJI = aRunnableS4S0001000_9.i0;
            C2U8.LIZIZ(c54251LQx);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS4S0001000_9 aRunnableS4S0001000_9) {
        boolean LIZ;
        try {
            aRunnableS4S0001000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S0001000_9(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}
