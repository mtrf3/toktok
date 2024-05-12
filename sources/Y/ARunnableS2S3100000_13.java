package Y;

import X.C31012CFc;
import X.U66;
import X.UA9;
import X.UC0;

/* loaded from: classes14.dex */
public class ARunnableS2S3100000_13 implements Runnable {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

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

    public static final void run$0(ARunnableS2S3100000_13 aRunnableS2S3100000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S3200200_13((U66) aRunnableS2S3100000_13.l3, aRunnableS2S3100000_13.s0, aRunnableS2S3100000_13.s1, aRunnableS2S3100000_13.s2, UC0.LJIJI((U66) aRunnableS2S3100000_13.l3), C31012CFc.LIZIZ(), System.currentTimeMillis(), 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S3100000_13 aRunnableS2S3100000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S3200200_13((U66) aRunnableS2S3100000_13.l3, aRunnableS2S3100000_13.s0, aRunnableS2S3100000_13.s1, aRunnableS2S3100000_13.s2, UC0.LJIJI((U66) aRunnableS2S3100000_13.l3), C31012CFc.LIZIZ(), System.currentTimeMillis(), 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S3100000_13 aRunnableS2S3100000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S3200200_13((U66) aRunnableS2S3100000_13.l3, aRunnableS2S3100000_13.s0, aRunnableS2S3100000_13.s1, aRunnableS2S3100000_13.s2, UC0.LJIJI((U66) aRunnableS2S3100000_13.l3), C31012CFc.LIZIZ(), System.currentTimeMillis(), 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S3100000_13(U66 u66, String str, String str2, String str3, int i) {
        this.$t = i;
        this.l3 = u66;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
