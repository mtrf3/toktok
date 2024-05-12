package Y;

import X.C90467Zex;
import X.C90606ZhC;
import X.C90776Zjw;
import X.C90865ZlN;
import X.ZY4;
import com.byted.cast.common.api.IBrowseListener;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes29.dex */
public class IDRunnableS7S0101000_24 implements Runnable {
    public final int $t;
    public int i1;
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

    public static final void run$0(IDRunnableS7S0101000_24 iDRunnableS7S0101000_24) {
        boolean LIZ;
        try {
            ZY4 zy4 = ((C90606ZhC) iDRunnableS7S0101000_24.l0).LJFF.LIZJ.LJIILLIIL;
            if (zy4 != null) {
                zy4.LJIIIZ(iDRunnableS7S0101000_24.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS7S0101000_24 iDRunnableS7S0101000_24) {
        boolean LIZ;
        try {
            ZY4 zy4 = ((C90606ZhC) iDRunnableS7S0101000_24.l0).LJFF.LIZJ.LJIILLIIL;
            if (zy4 != null) {
                zy4.LJIIJ(iDRunnableS7S0101000_24.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS7S0101000_24 iDRunnableS7S0101000_24) {
        C90467Zex c90467Zex = (C90467Zex) iDRunnableS7S0101000_24.l0;
        int i = iDRunnableS7S0101000_24.i1;
        IBrowseListener iBrowseListener = c90467Zex.LJIIL;
        if (iBrowseListener != null) {
            if (i == 5) {
                iBrowseListener.onBrowse(i, new ArrayList(((ConcurrentHashMap) c90467Zex.LJIILL).values()));
            } else {
                if (i != 7) {
                    return;
                }
                iBrowseListener.onBrowse(i, new ArrayList(((ConcurrentHashMap) c90467Zex.LJIILLIIL).values()));
            }
        }
    }

    public static final void run$3(IDRunnableS7S0101000_24 iDRunnableS7S0101000_24) {
        switch (iDRunnableS7S0101000_24.i1) {
            case 0:
                ((C90865ZlN) iDRunnableS7S0101000_24.l0).LJIILIIL = -1;
                return;
            default:
                IBrowseListener iBrowseListener = ((C90776Zjw) iDRunnableS7S0101000_24.l0).LIZ.LJII;
                if (iBrowseListener != null) {
                    iBrowseListener.onBrowse(4, null);
                    return;
                }
                return;
        }
    }

    public IDRunnableS7S0101000_24(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
