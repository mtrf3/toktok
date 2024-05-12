package Y;

import X.CN1;
import X.U66;
import X.U7T;
import X.UA9;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;

/* loaded from: classes14.dex */
public class ARunnableS0S0101400_13 implements Runnable {
    public final int $t;
    public int i1;
    public long j2;
    public long j3;
    public long j4;
    public long j5;
    public Object l0;

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
        UA9.LJFF().LIZIZ(new ARunnableS0S0211400_13((U66) this.l0, this.j2, this.i1, this.j3, UC0.LJIJI((U66) this.l0), this.j4, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j5, 0));
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new ARunnableS0S0211400_13((U66) this.l0, this.j2, this.i1, this.j3, UC0.LJIJI((U66) this.l0), this.j4, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j5, 1));
    }

    public static final void run$0(ARunnableS0S0101400_13 aRunnableS0S0101400_13) {
        boolean LIZ;
        try {
            aRunnableS0S0101400_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0101400_13 aRunnableS0S0101400_13) {
        boolean LIZ;
        try {
            aRunnableS0S0101400_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0101400_13(U7T u7t, long j, int i, long j2, long j3, long j4, int i2) {
        this.$t = i2;
        this.l0 = u7t;
        this.j2 = j;
        this.i1 = i;
        this.j3 = j2;
        this.j4 = j3;
        this.j5 = j4;
    }
}
