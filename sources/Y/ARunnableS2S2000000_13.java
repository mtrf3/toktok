package Y;

import X.C0NE;
import X.C28733BPl;
import X.U4R;
import X.X1D;
import java.util.List;

/* loaded from: classes14.dex */
public class ARunnableS2S2000000_13 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

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
        if (this.s0.length() == 0) {
            return;
        }
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.s0);
        LIZ.append(' ');
        LIZ.append(this.s1);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZLLL("ttlive_interact", LIZIZ);
        if (((List) U4R.LIZIZ.getValue()).contains(this.s0)) {
            return;
        }
        String str = this.s0;
        String str2 = this.s1;
        if (str2 == null) {
            str2 = "";
        }
        U4R.LJ(str, str2);
    }

    public static final void run$0(ARunnableS2S2000000_13 aRunnableS2S2000000_13) {
        boolean LIZ;
        try {
            if (aRunnableS2S2000000_13.s0.length() != 0) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(aRunnableS2S2000000_13.s0);
                LIZ2.append(' ');
                LIZ2.append(aRunnableS2S2000000_13.s1);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                LJIILIIL.getClass();
                C0NE.LIZ("ttlive_interact", LIZIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S2000000_13 aRunnableS2S2000000_13) {
        boolean LIZ;
        try {
            aRunnableS2S2000000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S2000000_13 aRunnableS2S2000000_13) {
        boolean LIZ;
        try {
            if (aRunnableS2S2000000_13.s0.length() != 0) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(aRunnableS2S2000000_13.s0);
                LIZ2.append(' ');
                LIZ2.append(aRunnableS2S2000000_13.s1);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                LJIILIIL.getClass();
                C0NE.LJII("ttlive_interact", LIZIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S2000000_13(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
