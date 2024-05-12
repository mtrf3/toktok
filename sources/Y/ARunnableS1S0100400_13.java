package Y;

import X.CN1;
import X.U66;
import X.U7T;
import X.UA9;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;

/* loaded from: classes14.dex */
public class ARunnableS1S0100400_13 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public long j4;
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
        UA9.LJFF().LIZIZ(new ARunnableS0S0210400_13((U66) this.l0, this.j1, UC0.LJIJI((U66) this.l0), this.j2, this.j3, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j4, 0));
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new ARunnableS0S0210400_13((U66) this.l0, this.j1, UC0.LJIJI((U66) this.l0), this.j2, this.j3, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j4, 1));
    }

    public static final void run$0(ARunnableS1S0100400_13 aRunnableS1S0100400_13) {
        boolean LIZ;
        try {
            aRunnableS1S0100400_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0100400_13 aRunnableS1S0100400_13) {
        boolean LIZ;
        try {
            aRunnableS1S0100400_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0100400_13(U7T u7t, long j, long j2, long j3, long j4, int i) {
        this.$t = i;
        this.l0 = u7t;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
        this.j4 = j4;
    }
}
