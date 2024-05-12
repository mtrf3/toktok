package Y;

import X.C31012CFc;
import X.C76671U7f;
import X.CN1;
import X.U4R;
import X.U66;
import X.U7U;
import X.U9F;
import X.UA9;
import X.UC0;
import X.X1D;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS8S1100100_13 implements Runnable {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    public final void LIZ$1() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcUserLeft, linkMicId=");
        LIZ.append(this.s0);
        LIZ.append(", leaveReason=");
        LIZ.append(this.j2);
        U4R.LIZLLL("RtcRoomMsgSuccessRateMonitor", X1D.LIZIZ(LIZ));
        C76671U7f c76671U7f = (C76671U7f) this.l1;
        String str = this.s0;
        c76671U7f.getClass();
        HashMap hashMap = new HashMap();
        HashSet<Long> remove = c76671U7f.LJI.remove(str);
        if (remove != null) {
            hashMap.put(str, remove);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.s0);
        LIZ2.append(" leave");
        c76671U7f.LIZ(X1D.LIZIZ(LIZ2), hashMap);
    }

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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        UA9.LJFF().LIZIZ(new ARunnableS0S1210300_13((U66) this.l1, this.s0, UC0.LJIJI((U66) this.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j2, 0));
    }

    public final void LIZ$2() {
        UA9.LJFF().LIZIZ(new ARunnableS0S1210300_13((U66) this.l1, this.s0, UC0.LJIJI((U66) this.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j2, 1));
    }

    public static final void run$0(ARunnableS8S1100100_13 aRunnableS8S1100100_13) {
        boolean LIZ;
        try {
            aRunnableS8S1100100_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S1100100_13 aRunnableS8S1100100_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS8S1100100_13.l1);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            UA9.LJFF().LIZIZ(new ARunnableS0S1200300_13(LIZIZ, currentTimeMillis, aRunnableS8S1100100_13.j2, LJIJI, (U66) aRunnableS8S1100100_13.l1, aRunnableS8S1100100_13.s0, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S1100100_13 aRunnableS8S1100100_13) {
        boolean LIZ;
        try {
            aRunnableS8S1100100_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S1100100_13 aRunnableS8S1100100_13) {
        boolean LIZ;
        try {
            aRunnableS8S1100100_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S1100100_13 aRunnableS8S1100100_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS8S1100100_13.l1).LJFF;
            if (u9f != null) {
                u9f.LJJIIZI(aRunnableS8S1100100_13.s0, aRunnableS8S1100100_13.j2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS8S1100100_13(long j, Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.j2 = j;
    }
}
