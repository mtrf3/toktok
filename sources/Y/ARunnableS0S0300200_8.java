package Y;

import X.C46757IWr;
import X.IPH;
import X.IX4;
import X.IX5;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* loaded from: classes9.dex */
public class ARunnableS0S0300200_8 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

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
        IX4 ix4;
        OnUIPlayListener onUIPlayListener = ((C46757IWr) this.l2).LIZIZ;
        if (onUIPlayListener != null && (ix4 = (IX4) this.l0) != null) {
            onUIPlayListener.onPreparePlay(ix4.LJIIIZ);
            IPH iph = (IPH) this.l1;
            long j = this.j3;
            iph.LIZLLL = j;
            iph.LJFF = j;
            iph.LJ = this.j4;
            iph.LJIIJ = 3;
            IX4 ix42 = (IX4) this.l0;
            iph.LJI = ix42.LLD;
            iph.LJIILJJIL = ix42.LLIFFJFJJ;
            ix42.getClass();
            iph.LJIIIIZZ = null;
            try {
                ((C46757IWr) this.l2).LIZIZ.onPreparePlay(((IX4) this.l0).LJIIIZ, (IPH) this.l1);
            } catch (AbstractMethodError e) {
                e.printStackTrace();
            }
        }
    }

    public static final void run$0(ARunnableS0S0300200_8 aRunnableS0S0300200_8) {
        boolean LIZ;
        try {
            aRunnableS0S0300200_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0300200_8 aRunnableS0S0300200_8) {
        IX5 ix5 = (IX5) aRunnableS0S0300200_8.l0;
        IPH iph = (IPH) aRunnableS0S0300200_8.l1;
        long j = aRunnableS0S0300200_8.j3;
        long j2 = aRunnableS0S0300200_8.j4;
        IX4 ix4 = (IX4) aRunnableS0S0300200_8.l2;
        OnUIPlayListener onUIPlayListener = ix5.LJJII;
        if (onUIPlayListener != null) {
            iph.LIZLLL = j;
            iph.LJFF = j;
            iph.LJ = j2;
            iph.LJIIJ = 3;
            iph.LJI = ix4.LLD;
            iph.LJIILJJIL = ix4.LLIFFJFJJ;
            iph.LJIIIIZZ = null;
            onUIPlayListener.onPreparePlay(ix4.LJIIIZ);
            ix5.LJJII.onPreparePlay(ix4.LJIIIZ, iph);
        }
    }

    public ARunnableS0S0300200_8(Object obj, Object obj2, Object obj3, long j, long j2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.j3 = j;
        this.j4 = j2;
    }
}
