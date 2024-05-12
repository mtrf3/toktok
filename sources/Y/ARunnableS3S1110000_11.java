package Y;

import J.N;
import X.C78248UnM;
import X.C78939UyV;
import X.EGD;
import X.PHC;
import X.PI9;
import X.QFT;
import com.ttnet.org.chromium.net.impl.TTCronetNetExpRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class ARunnableS3S1110000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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
        if (!this.z2) {
            synchronized (((TTCronetNetExpRequest) this.l1).LJIIJ) {
                TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) this.l1;
                if ((!tTCronetNetExpRequest.LJIIIZ || tTCronetNetExpRequest.LJIIIIZZ != 0) && tTCronetNetExpRequest.LJIIIIZZ != 0) {
                    N.M6$xRvea(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest);
                    tTCronetNetExpRequest.LJIIIIZZ = 0L;
                }
            }
        }
        try {
            ((QFT) ((TTCronetNetExpRequest) this.l1).LJI).LIZ.mCallback.LIZ(this.s0);
        } catch (Exception e) {
            C78939UyV.LJII("Exception in callback: ", e);
        }
    }

    public final void LIZ$1() {
        if (((PHC) this.l1).LJLZ == null) {
            C78248UnM.LJIIJ();
        }
        long currentTimeMillis = System.currentTimeMillis();
        PHC phc = (PHC) this.l1;
        Map<String, PI9<Long, Long>> map = phc.LJLJJL;
        if (map == null) {
            map = new HashMap<>();
        }
        phc.LJLJJL = map;
        ((PHC) this.l1).LJLJJL.put(this.s0, new PI9<>(Long.valueOf(currentTimeMillis), Long.valueOf(((PHC) this.l1).LJLLLLLL.LIZ())));
        PHC phc2 = (PHC) this.l1;
        Map<String, PI9<Long, Long>> map2 = phc2.LJLJJLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        phc2.LJLJJLL = map2;
        ((PHC) this.l1).LJLJJLL.put(this.s0, new PI9<>(Long.valueOf(currentTimeMillis), Long.valueOf(((PHC) this.l1).LJLLLLLL.LIZ.LIZJ())));
        PHC phc3 = (PHC) this.l1;
        Map<String, PI9<Long, Long>> map3 = phc3.LJLJL;
        if (map3 == null) {
            map3 = new HashMap<>();
        }
        phc3.LJLJL = map3;
        ((PHC) this.l1).LJLJL.put(this.s0, new PI9<>(Long.valueOf(currentTimeMillis), Long.valueOf(((PHC) this.l1).LJLLLLLL.LIZ.LJIILL())));
        if (this.z2) {
            EGD.LIZ.LJJIZ(this.s0);
        }
    }

    public static final void run$0(ARunnableS3S1110000_11 aRunnableS3S1110000_11) {
        boolean LIZ;
        try {
            aRunnableS3S1110000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S1110000_11 aRunnableS3S1110000_11) {
        boolean LIZ;
        try {
            aRunnableS3S1110000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S1110000_11(Object obj, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z2 = z;
        this.s0 = str;
    }
}
