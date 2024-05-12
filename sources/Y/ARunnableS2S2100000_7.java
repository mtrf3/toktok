package Y;

import X.C38816FLg;
import X.C42393GkP;
import X.C44066HRe;
import X.H78;
import X.ICJ;
import X.X1D;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes8.dex */
public class ARunnableS2S2100000_7 implements Runnable {
    public final int $t;
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
        try {
            Aweme LIZIZ = DetailApi.LIZIZ(this.s0, "");
            if (LIZIZ != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("aweme detail api response: ");
                LIZ.append(LIZIZ);
                H78.LJI(X1D.LIZIZ(LIZ));
            } else {
                H78.LJI("aweme detail api response is null");
            }
            C38816FLg.LIZJ(new ARunnableS6S1200000_7((C42393GkP) this.l2, this.s1, LIZIZ, 3));
        } catch (Exception unused) {
            ((C42393GkP) this.l2).LIZJ();
        }
    }

    public static final void run$0(ARunnableS2S2100000_7 aRunnableS2S2100000_7) {
        boolean LIZ;
        try {
            try {
                C38816FLg.LIZJ(new ARunnableS26S0200000_7(aRunnableS2S2100000_7, DetailApi.LIZIZ(aRunnableS2S2100000_7.s0, ""), 21));
            } catch (Exception unused) {
                ((C44066HRe) aRunnableS2S2100000_7.l2).LIZLLL();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S2100000_7 aRunnableS2S2100000_7) {
        boolean LIZ;
        try {
            ((ICJ) aRunnableS2S2100000_7.l2).LJIIJJI(aRunnableS2S2100000_7.s0, aRunnableS2S2100000_7.s1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S2100000_7 aRunnableS2S2100000_7) {
        boolean LIZ;
        try {
            ((ICJ) aRunnableS2S2100000_7.l2).LJIIJJI(aRunnableS2S2100000_7.s0, aRunnableS2S2100000_7.s1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS2S2100000_7 aRunnableS2S2100000_7) {
        boolean LIZ;
        try {
            aRunnableS2S2100000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S2100000_7(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
