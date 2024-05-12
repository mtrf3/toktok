package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C232469Ak;
import X.C26165AOr;
import X.C27491Aqd;
import X.C38943FQd;
import X.C47261Igj;
import X.C51029K0z;
import X.C5S1;
import X.C61520OCm;
import X.C78685UuP;
import X.C84763XOl;
import X.EF7;
import X.O3U;
import X.OSZ;
import android.app.Activity;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.poplayer.core.PopupManager;

/* loaded from: classes5.dex */
public class ARunnableS10S1000000_4 implements Runnable {
    public final int $t;
    public String s0;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C61520OCm LJII;
        try {
            String LIZ = C38943FQd.LIZ();
            if (!C78685UuP.LJJJZ(O3U.LIZJ(LIZ, this.s0)) && (LJII = O3U.LJII(LIZ)) != null) {
                LJII.LIZIZ(null, null, C51029K0z.LJJIIZI(new OSZ(LIZ, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(this.s0)))), null);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public ARunnableS10S1000000_4(int i) {
        this.$t = i;
        this.s0 = "tiktok_web_creation_promote";
    }

    public static final void run$0(ARunnableS10S1000000_4 aRunnableS10S1000000_4) {
        boolean LIZ;
        try {
            String LIZIZ = C27491Aqd.LIZIZ(aRunnableS10S1000000_4.s0);
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(LIZIZ);
            c5s1.LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S1000000_4 aRunnableS10S1000000_4) {
        boolean LIZ;
        ActivityC45651qj activityC45651qj;
        try {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null) {
                PopupManager.LJIIL(new C26165AOr(activityC45651qj, aRunnableS10S1000000_4.s0));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS10S1000000_4 aRunnableS10S1000000_4) {
        boolean LIZ;
        try {
            aRunnableS10S1000000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS10S1000000_4 aRunnableS10S1000000_4) {
        boolean LIZ;
        try {
            C232469Ak.LJFF(aRunnableS10S1000000_4.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S1000000_4(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
