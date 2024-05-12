package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class VAB implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference<VAA> LJLIL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View LJ;
        VAA vaa = this.LJLIL.get();
        if (vaa != null && !((ArrayList) vaa.LIZIZ).isEmpty() && (LJ = vaa.LJ()) != null) {
            int LIZLLL = VAA.LIZLLL(LJ);
            int LIZJ = VAA.LIZJ(LJ);
            if ((LIZLLL > 0 || LIZLLL == Integer.MIN_VALUE) && (LIZJ > 0 || LIZJ == Integer.MIN_VALUE)) {
                Iterator it = new ArrayList(vaa.LIZIZ).iterator();
                while (it.hasNext()) {
                    ((UHU) it.next()).LIZ(LIZLLL, LIZJ);
                }
                vaa.LIZ();
            }
        }
        return true;
    }

    public VAB(VAA vaa) {
        this.LJLIL = new WeakReference<>(vaa);
    }
}
