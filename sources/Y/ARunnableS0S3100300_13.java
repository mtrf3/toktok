package Y;

import X.U66;
import X.U7T;
import X.UA9;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3100300_13 implements Runnable {
    public final int $t;
    public long j4;
    public long j5;
    public long j6;
    public Object l3;
    public String s0;
    public String s1 = null;
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

    public static final void run$0(ARunnableS0S3100300_13 aRunnableS0S3100300_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS0S3100300_13.l3);
            UA9.LJFF().LIZIZ(new ARunnableS0S3200300_13(aRunnableS0S3100300_13.j4, aRunnableS0S3100300_13.j5, aRunnableS0S3100300_13.j6, (U66) aRunnableS0S3100300_13.l3, aRunnableS0S3100300_13.s0, aRunnableS0S3100300_13.s1, aRunnableS0S3100300_13.s2, LJIJI, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3100300_13 aRunnableS0S3100300_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS0S3100300_13.l3);
            UA9.LJFF().LIZIZ(new ARunnableS0S3200300_13(aRunnableS0S3100300_13.j4, aRunnableS0S3100300_13.j5, aRunnableS0S3100300_13.j6, (U66) aRunnableS0S3100300_13.l3, aRunnableS0S3100300_13.s0, aRunnableS0S3100300_13.s1, aRunnableS0S3100300_13.s2, LJIJI, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3100300_13(U7T u7t, long j, long j2, long j3, String str, String str2, int i) {
        this.$t = i;
        this.l3 = u7t;
        this.j4 = j;
        this.j5 = j2;
        this.j6 = j3;
        this.s0 = str;
        this.s2 = str2;
    }
}
