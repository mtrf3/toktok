package Y;

import X.OSZ;
import X.U66;
import X.U6D;
import X.U7T;
import X.UA9;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S4210200_13 implements Runnable {
    public final int $t;
    public long j7;
    public long j8;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z6;

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
        JSONObject LJIJI = UC0.LJIJI((U66) this.l4);
        UA9.LJFF().LIZIZ(new ARunnableS0S4310200_13(this.j7, this.j8, (U66) this.l4, this.s0, this.s1, this.s2, this.s3, (OSZ) this.l5, LJIJI, this.z6, 0));
    }

    public final void LIZ$1() {
        JSONObject LJIJI = UC0.LJIJI((U66) this.l4);
        UA9.LJFF().LIZIZ(new ARunnableS0S4310200_13(this.j7, this.j8, (U66) this.l4, this.s0, this.s1, this.s2, this.s3, (OSZ) this.l5, LJIJI, this.z6, 1));
    }

    public final void LIZ$2() {
        JSONObject LJIJI = UC0.LJIJI((U66) this.l4);
        UA9.LJFF().LIZIZ(new ARunnableS0S4310200_13(this.j7, this.j8, (U66) this.l4, this.s0, this.s1, this.s2, this.s3, (OSZ) this.l5, LJIJI, this.z6, 2));
    }

    public static final void run$0(ARunnableS0S4210200_13 aRunnableS0S4210200_13) {
        boolean LIZ;
        try {
            aRunnableS0S4210200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S4210200_13 aRunnableS0S4210200_13) {
        boolean LIZ;
        try {
            aRunnableS0S4210200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S4210200_13 aRunnableS0S4210200_13) {
        boolean LIZ;
        try {
            aRunnableS0S4210200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S4210200_13(long j, long j2, U7T u7t, String str, String str2, String str3, String str4, OSZ osz, int i) {
        this.$t = i;
        this.l4 = u7t;
        this.s0 = str;
        this.j7 = j;
        this.j8 = j2;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.l5 = osz;
        this.z6 = true;
    }

    public ARunnableS0S4210200_13(long j, long j2, U6D u6d, String str, String str2, String str3, String str4, OSZ osz, boolean z, int i) {
        this.$t = i;
        this.l4 = u6d;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.j7 = j;
        this.j8 = j2;
        this.s3 = str4;
        this.l5 = osz;
        this.z6 = z;
    }
}
