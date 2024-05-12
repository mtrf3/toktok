package Y;

import X.C31012CFc;
import X.C76762UAs;
import X.U66;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3300000_13 implements Runnable {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S3300000_13 aRunnableS0S3300000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS0S3300000_13.l3);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS0S3300000_13.l4;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S3400200_13((U66) aRunnableS0S3300000_13.l3, LIZIZ, currentTimeMillis, LJIJI, c76762UAs, aRunnableS0S3300000_13.s0, aRunnableS0S3300000_13.s1, (Boolean) aRunnableS0S3300000_13.l5, aRunnableS0S3300000_13.s2, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3300000_13 aRunnableS0S3300000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS0S3300000_13.l3);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS0S3300000_13.l4;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S3400200_13((U66) aRunnableS0S3300000_13.l3, LIZIZ, currentTimeMillis, LJIJI, c76762UAs, aRunnableS0S3300000_13.s0, aRunnableS0S3300000_13.s1, (Boolean) aRunnableS0S3300000_13.l5, aRunnableS0S3300000_13.s2, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3300000_13(U66 u66, C76762UAs c76762UAs, String str, String str2, Boolean bool, String str3, int i) {
        this.$t = i;
        this.l3 = u66;
        this.l4 = c76762UAs;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = bool;
        this.s2 = str3;
    }
}
