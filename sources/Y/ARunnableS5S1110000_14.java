package Y;

import X.C79355VCl;

/* loaded from: classes15.dex */
public class ARunnableS5S1110000_14 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final void run$0(ARunnableS5S1110000_14 aRunnableS5S1110000_14) {
        boolean LIZ;
        try {
            ((C79355VCl) aRunnableS5S1110000_14.l1).LIZJ(aRunnableS5S1110000_14.s0, aRunnableS5S1110000_14.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S1110000_14 aRunnableS5S1110000_14) {
        boolean LIZ;
        try {
            ((C79355VCl) aRunnableS5S1110000_14.l1).LIZIZ(aRunnableS5S1110000_14.s0, aRunnableS5S1110000_14.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S1110000_14(C79355VCl c79355VCl, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = c79355VCl;
        this.s0 = str;
        this.z2 = z;
    }
}
