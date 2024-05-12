package Y;

import X.U66;
import X.U7T;
import X.UA9;
import X.UC0;

/* loaded from: classes14.dex */
public class ARunnableS0S2100800_13 implements Runnable {
    public final int $t;
    public long j10;
    public long j3;
    public long j4;
    public long j5;
    public long j6;
    public long j7;
    public long j8;
    public long j9;
    public Object l2;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        UA9.LJFF().LIZIZ(new ARunnableS0S2200800_13((U66) this.l2, this.j3, this.j4, this.j5, this.j6, this.j7, UC0.LJIJI((U66) this.l2), this.j8, this.j9, this.s0, this.s1, this.j10, 0));
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new ARunnableS0S2200800_13((U66) this.l2, this.j3, this.j4, this.j5, this.j6, this.j7, UC0.LJIJI((U66) this.l2), this.j8, this.j9, this.s0, this.s1, this.j10, 1));
    }

    public static final void run$0(ARunnableS0S2100800_13 aRunnableS0S2100800_13) {
        boolean LIZ;
        try {
            aRunnableS0S2100800_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2100800_13 aRunnableS0S2100800_13) {
        boolean LIZ;
        try {
            aRunnableS0S2100800_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2100800_13(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, U7T u7t, String str, String str2, int i) {
        this.$t = i;
        this.l2 = u7t;
        this.j3 = j;
        this.j4 = j2;
        this.j5 = j3;
        this.j6 = j4;
        this.j7 = j5;
        this.j8 = j6;
        this.j9 = j7;
        this.s0 = str;
        this.s1 = str2;
        this.j10 = j8;
    }
}
