package Y;

import X.U66;
import X.U7T;
import X.UA9;
import X.UC0;

/* loaded from: classes14.dex */
public class ARunnableS0S3101300_13 implements Runnable {
    public final int $t;
    public int i4;
    public long j5;
    public long j6;
    public long j7;
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
        UA9.LJFF().LIZIZ(new ARunnableS0S3201300_13((U66) this.l3, this.j5, this.i4, UC0.LJIJI((U66) this.l3), this.j6, this.j7, this.s0, this.s1, this.s2, 0));
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new ARunnableS0S3201300_13((U66) this.l3, this.j5, this.i4, UC0.LJIJI((U66) this.l3), this.j6, this.j7, this.s0, this.s1, this.s2, 1));
    }

    public static final void run$0(ARunnableS0S3101300_13 aRunnableS0S3101300_13) {
        boolean LIZ;
        try {
            aRunnableS0S3101300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3101300_13 aRunnableS0S3101300_13) {
        boolean LIZ;
        try {
            aRunnableS0S3101300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3101300_13(U7T u7t, long j, int i, long j2, long j3, String str, String str2, int i2) {
        this.$t = i2;
        this.l3 = u7t;
        this.j5 = j;
        this.i4 = i;
        this.j6 = j2;
        this.j7 = j3;
        this.s0 = str;
        this.s2 = str2;
    }
}
