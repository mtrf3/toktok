package Y;

import X.C48841JEv;
import X.C78613UtF;
import X.X6P;
import X.X6Q;
import X.X6T;
import X.XKX;
import X.XW8;
import X.Y5K;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import ij2.a;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes16.dex */
public class IDDListenerS396S0100000_15 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(IDDListenerS396S0100000_15 iDDListenerS396S0100000_15) {
        X6T x6t = (X6T) iDDListenerS396S0100000_15.l0;
        if (x6t.LJII) {
            return true;
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = X6T.LJIIJJI.get(x6t.LIZIZ);
        if ((copyOnWriteArraySet != null && copyOnWriteArraySet.contains(((X6T) iDDListenerS396S0100000_15.l0).LIZJ)) || ((X6T) iDDListenerS396S0100000_15.l0).LJIIIIZZ != null) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        X6T x6t2 = (X6T) iDDListenerS396S0100000_15.l0;
        if (elapsedRealtime - x6t2.LJFF < 300) {
            x6t2.LJIIIIZZ = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new X6Q((X6T) iDDListenerS396S0100000_15.l0, elapsedRealtime, null), 3);
        } else {
            x6t2.LJIIIIZZ = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new X6P((X6T) iDDListenerS396S0100000_15.l0, null), 3);
        }
        return true;
    }

    public static final boolean onPreDraw$1(IDDListenerS396S0100000_15 iDDListenerS396S0100000_15) {
        ViewTreeObserver viewTreeObserver;
        View view = ((XW8) iDDListenerS396S0100000_15.l0).mView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(iDDListenerS396S0100000_15);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$2(IDDListenerS396S0100000_15 iDDListenerS396S0100000_15) {
        ((Y5K) iDDListenerS396S0100000_15.l0).LJLLLLLL = System.currentTimeMillis();
        a aVar = a.LJIJ;
        Y5K y5k = (Y5K) iDDListenerS396S0100000_15.l0;
        long j = y5k.LJLZ;
        long j2 = y5k.LJLLLLLL;
        aVar.getClass();
        a.LJIIJ(j, j2, "payin_checkout_ocr");
        ((Y5K) iDDListenerS396S0100000_15.l0).LLIIIZ().getViewTreeObserver().removeOnPreDrawListener(iDDListenerS396S0100000_15);
        return true;
    }

    public IDDListenerS396S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
