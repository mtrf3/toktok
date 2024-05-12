package Y;

import X.CN1;
import X.OSZ;
import X.U66;
import X.U7T;
import X.UA9;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;

/* loaded from: classes14.dex */
public class ARunnableS0S4201300_13 implements Runnable {
    public final int $t;
    public int i6;
    public long j7;
    public long j8;
    public long j9;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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
        UA9.LJFF().LIZIZ(new ARunnableS0S4311300_13((U66) this.l4, this.j7, (OSZ) this.l5, this.i6, this.j8, this.j9, this.s0, UC0.LJIJI((U66) this.l4), this.s1, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.s2, this.s3, 0));
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new ARunnableS0S4311300_13((U66) this.l4, this.j7, (OSZ) this.l5, this.i6, this.j8, this.j9, this.s0, UC0.LJIJI((U66) this.l4), this.s1, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.s2, this.s3, 1));
    }

    public static final void run$0(ARunnableS0S4201300_13 aRunnableS0S4201300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4201300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S4201300_13 aRunnableS0S4201300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4201300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S4201300_13(int i, long j, long j2, long j3, U7T u7t, String str, String str2, String str3, String str4, OSZ osz, int i2) {
        this.$t = i2;
        this.l4 = u7t;
        this.j7 = j;
        this.l5 = osz;
        this.i6 = i;
        this.j8 = j2;
        this.j9 = j3;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
