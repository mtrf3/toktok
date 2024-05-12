package Y;

import X.CN1;
import X.OSZ;
import X.U66;
import X.U6D;
import X.UA9;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;

/* loaded from: classes14.dex */
public class ARunnableS1S2210200_13 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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
        UA9.LJFF().LIZIZ(new ARunnableS0S2320200_13((U66) this.l2, this.s0, this.j5, this.j6, this.s1, (OSZ) this.l3, UC0.LJIJI((U66) this.l2), this.z4, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), 0));
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new ARunnableS0S2320200_13((U66) this.l2, this.s0, this.j5, this.j6, this.s1, (OSZ) this.l3, UC0.LJIJI((U66) this.l2), this.z4, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), 1));
    }

    public static final void run$0(ARunnableS1S2210200_13 aRunnableS1S2210200_13) {
        boolean LIZ;
        try {
            aRunnableS1S2210200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S2210200_13 aRunnableS1S2210200_13) {
        boolean LIZ;
        try {
            aRunnableS1S2210200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S2210200_13(long j, long j2, U6D u6d, String str, String str2, OSZ osz, boolean z, int i) {
        this.$t = i;
        this.l2 = u6d;
        this.s0 = str;
        this.j5 = j;
        this.j6 = j2;
        this.s1 = str2;
        this.l3 = osz;
        this.z4 = z;
    }
}
