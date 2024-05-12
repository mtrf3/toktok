package Y;

import X.U66;
import X.U7T;
import X.UA9;
import X.UC0;

/* loaded from: classes14.dex */
public class ARunnableS0S3100700_13 implements Runnable {
    public final int $t;
    public long j10;
    public long j4;
    public long j5;
    public long j6;
    public long j7;
    public long j8;
    public long j9;
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

    public final void LIZ$0() {
        UA9.LJFF().LIZIZ(new ARunnableS0S3200700_13((U66) this.l3, this.j4, this.j5, this.j6, this.j7, this.j8, UC0.LJIJI((U66) this.l3), this.j9, this.j10, this.s0, this.s1, this.s2, 0));
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new ARunnableS0S3200700_13((U66) this.l3, this.j4, this.j5, this.j6, this.j7, this.j8, UC0.LJIJI((U66) this.l3), this.j9, this.j10, this.s0, this.s1, this.s2, 1));
    }

    public static final void run$0(ARunnableS0S3100700_13 aRunnableS0S3100700_13) {
        boolean LIZ;
        try {
            aRunnableS0S3100700_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3100700_13 aRunnableS0S3100700_13) {
        boolean LIZ;
        try {
            aRunnableS0S3100700_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3100700_13(long j, long j2, long j3, long j4, long j5, long j6, long j7, U7T u7t, String str, String str2, int i) {
        this.$t = i;
        this.l3 = u7t;
        this.j4 = j;
        this.j5 = j2;
        this.j6 = j3;
        this.j7 = j4;
        this.j8 = j5;
        this.j9 = j6;
        this.j10 = j7;
        this.s0 = str;
        this.s2 = str2;
    }
}
