package Y;

import X.C59316NPs;
import X.N68;
import X.OIA;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;

/* loaded from: classes11.dex */
public class ARunnableS6S0200100_10 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
        if (C59316NPs.LLLLZLLIL(((C59316NPs) this.l0).LJLJLJ)) {
            ((C59316NPs) this.l0).LLJJJJLIIL.LJLJLLL.setValue(null);
            VideoPlayTaskManager videoPlayTaskManager = ((C59316NPs) this.l0).LJLLL;
            N68 n68 = new N68("shakeEggStrictTask");
            n68.LIZIZ(this.j2);
            n68.LIZJ = (int) (((ShakeModel) this.l1).getShowTime() + this.j2);
            n68.LIZLLL = new ARunnableS46S0100000_10((C59316NPs) this.l0, 81);
            n68.LJ = true;
            videoPlayTaskManager.LJLJLJ(n68.LIZ());
        }
    }

    public static final void run$0(ARunnableS6S0200100_10 aRunnableS6S0200100_10) {
        boolean LIZ;
        try {
            aRunnableS6S0200100_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S0200100_10 aRunnableS6S0200100_10) {
        boolean LIZ;
        try {
            ((OIA) aRunnableS6S0200100_10.l1).LIZ.LJIILL((UpdatePackage) aRunnableS6S0200100_10.l0, aRunnableS6S0200100_10.j2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S0200100_10(Object obj, long j, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.l1 = obj2;
    }
}
