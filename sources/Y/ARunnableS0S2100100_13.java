package Y;

import X.C276516r;
import X.C29401Dk;
import X.C31012CFc;
import X.C74824TYe;
import X.CH1;
import X.CN1;
import X.U66;
import X.UA9;
import X.UAB;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ARunnableS0S2100100_13 implements Runnable {
    public final int $t;
    public long j3;
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
        int i;
        String logId;
        Throwable th = (Throwable) this.l2;
        if (th instanceof C29401Dk) {
            i = ((C276516r) th).getErrorCode();
        } else {
            i = 1;
        }
        Throwable th2 = (Throwable) this.l2;
        if (th2 instanceof CH1) {
            logId = ((CH1) th2).getxTtLogId();
        } else {
            logId = "";
        }
        String str = this.s0;
        long j = this.j3;
        o.LJIIIIZZ(logId, "logId");
        C74824TYe.LJJLIIIJ(i, str, logId, j, this.s1);
    }

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new UAB((U66) this.l2, this.s0, UC0.LJIJI((U66) this.l2), C31012CFc.LIZIZ(), System.currentTimeMillis(), this.s1, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j3));
    }

    public static final void run$0(ARunnableS0S2100100_13 aRunnableS0S2100100_13) {
        boolean LIZ;
        try {
            aRunnableS0S2100100_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2100100_13 aRunnableS0S2100100_13) {
        boolean LIZ;
        try {
            aRunnableS0S2100100_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2100100_13(long j, String str, String str2, Object obj, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.j3 = j;
        this.s1 = str2;
    }
}
