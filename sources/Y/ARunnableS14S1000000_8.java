package Y;

import X.C46368IHs;
import X.C48236IwS;
import X.C49521Jc5;
import X.IOK;
import X.X1D;
import android.text.TextUtils;
import ujb.o;
import ujb.s;

/* loaded from: classes9.dex */
public class ARunnableS14S1000000_8 implements Runnable {
    public final int $t;
    public String s0;

    public final void LIZ$0() {
        String LJ;
        String LJJJJZI;
        String str = this.s0;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        C46368IHs.LIZ = true;
        if (C48236IwS.LJIIJ) {
            LJ = IOK.LJI();
        } else if (C48236IwS.LJIIIIZZ) {
            LJ = IOK.LJFF();
        } else {
            LJ = IOK.LJ();
        }
        if (TextUtils.isEmpty(LJ) || !s.LJJJLZIJ(LJ, str, false)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(',');
        if (o.LJJJLIIL(LJ, X1D.LIZIZ(LIZ), false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(',');
            LJJJJZI = o.LJJJJZI(LJ, X1D.LIZIZ(LIZ2), "", false);
        } else if (o.LJJJLIIL(LJ, str, false)) {
            LJJJJZI = o.LJJJJZI(LJ, str, "", false);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(',');
            LIZ3.append(str);
            LJJJJZI = o.LJJJJZI(LJ, X1D.LIZIZ(LIZ3), "", false);
        }
        if (C48236IwS.LJIIJ) {
            IOK.LJIIIZ(LJJJJZI);
        } else if (C48236IwS.LJIIIIZZ) {
            IOK.LJIIIIZZ(LJJJJZI);
        } else {
            IOK.LJII(LJJJJZI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS14S1000000_8 aRunnableS14S1000000_8) {
        boolean LIZ;
        try {
            aRunnableS14S1000000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S1000000_8 aRunnableS14S1000000_8) {
        boolean LIZ;
        try {
            C49521Jc5.LIZ(aRunnableS14S1000000_8.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS14S1000000_8(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
