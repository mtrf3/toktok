package Y;

import X.C31012CFc;
import X.C76671U7f;
import X.C76765UAv;
import X.RunnableC79288V9w;
import X.U4R;
import X.U66;
import X.U7U;
import X.U7V;
import X.U9F;
import X.UA9;
import X.UC0;
import X.VA0;
import X.X1D;
import android.os.Handler;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import java.util.HashSet;

/* loaded from: classes14.dex */
public class ARunnableS5S2100000_13 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    public final void LIZ$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveRoomMessage msg=");
        LIZ.append(this.s0);
        U4R.LIZLLL("RtcRoomMsgSuccessRateMonitor", X1D.LIZIZ(LIZ));
        C76671U7f c76671U7f = (C76671U7f) this.l2;
        if (!c76671U7f.LJ) {
            U4R.LIZLLL("RtcRoomMsgSuccessRateMonitor", "onStart");
            c76671U7f.LJ = true;
            C76765UAv c76765UAv = (C76765UAv) c76671U7f.LJII.getValue();
            ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(c76671U7f, 267);
            long j = c76671U7f.LIZLLL;
            Handler LIZ2 = c76765UAv.LIZ();
            if (LIZ2 != null) {
                LIZ2.postDelayed(new ARunnableS49S0100000_13(aRunnableS49S0100000_13, 266), j);
            }
        }
        LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) U7V.LJIILLIIL(LinkLayerRTCMessage.class, this.s0);
        if (linkLayerRTCMessage != null) {
            C76671U7f c76671U7f2 = (C76671U7f) this.l2;
            String str = this.s1;
            if (c76671U7f2.LJIIIIZZ.contains(linkLayerRTCMessage.getMethod()) && linkLayerRTCMessage.getUid().length() > 0) {
                if (c76671U7f2.LJI.get(str) == null) {
                    c76671U7f2.LJI.put(str, new HashSet<>());
                }
                HashSet<Long> hashSet = c76671U7f2.LJI.get(str);
                if (hashSet != null) {
                    hashSet.add(Long.valueOf(linkLayerRTCMessage.getIndex()));
                }
            }
        }
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
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS5S2100000_13 aRunnableS5S2100000_13) {
        boolean LIZ;
        try {
            ((RunnableC79288V9w) aRunnableS5S2100000_13.l2).LJLJJLL.LJIIJJI(aRunnableS5S2100000_13.s0);
            ((RunnableC79288V9w) aRunnableS5S2100000_13.l2).LJLJJLL.LJIIIIZZ(aRunnableS5S2100000_13.s1);
            VA0 va0 = ((RunnableC79288V9w) aRunnableS5S2100000_13.l2).LJLJJLL.LJIJ;
            if (va0 != null) {
                va0.LIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S2100000_13 aRunnableS5S2100000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S2200200_13((U66) aRunnableS5S2100000_13.l2, aRunnableS5S2100000_13.s0, UC0.LJIJI((U66) aRunnableS5S2100000_13.l2), C31012CFc.LIZIZ(), System.currentTimeMillis(), aRunnableS5S2100000_13.s1, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S2100000_13 aRunnableS5S2100000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S2200200_13((U66) aRunnableS5S2100000_13.l2, aRunnableS5S2100000_13.s0, UC0.LJIJI((U66) aRunnableS5S2100000_13.l2), C31012CFc.LIZIZ(), System.currentTimeMillis(), aRunnableS5S2100000_13.s1, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS5S2100000_13 aRunnableS5S2100000_13) {
        boolean LIZ;
        try {
            aRunnableS5S2100000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS5S2100000_13 aRunnableS5S2100000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS5S2100000_13.l2).LJFF;
            if (u9f != null) {
                u9f.LJJIII(aRunnableS5S2100000_13.s0, aRunnableS5S2100000_13.s1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS5S2100000_13 aRunnableS5S2100000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS5S2100000_13.l2).LJFF;
            if (u9f != null) {
                u9f.LJIIJJI(aRunnableS5S2100000_13.s0, aRunnableS5S2100000_13.s1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S2100000_13(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
