package X;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes15.dex */
public abstract class WN5 extends WMU {
    public boolean LJ() {
        return this instanceof C81012Vqq;
    }

    public abstract Animator LJFF(C82158WMg c82158WMg, C82158WMg c82158WMg2);

    public abstract Animator LJI(C82158WMg c82158WMg, C82158WMg c82158WMg2);

    @Override // X.WMU
    public final void LIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        WNA wna;
        View view = c82158WMg.LIZIZ;
        View view2 = c82158WMg2.LIZIZ;
        WNA wna2 = null;
        if (c82158WMg.LIZLLL) {
            wna = WN7.LIZ(view);
        } else {
            WN7.LIZIZ(view);
            wna = null;
        }
        if (c82158WMg2.LIZLLL) {
            wna2 = WN7.LIZ(view2);
        } else {
            WN7.LIZIZ(view2);
        }
        view.setVisibility(0);
        this.LIZ.getOverlay().add(view);
        Animator LJFF = LJFF(c82158WMg, c82158WMg2);
        if (!LJ()) {
            LJFF.setDuration(300L);
        }
        LJFF.addListener(new WN6(this, c82158WMg, view, wna, c82158WMg2, view2, wna2, runnable));
        LJFF.start();
        c43356Gzw.LIZIZ(new WNE(LJFF));
    }

    @Override // X.WMU
    public final void LIZIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        WNA wna;
        View view = c82158WMg.LIZIZ;
        View view2 = c82158WMg2.LIZIZ;
        WNA wna2 = null;
        if (c82158WMg.LIZLLL) {
            wna = WN7.LIZ(view);
        } else {
            WN7.LIZIZ(view);
            wna = null;
        }
        if (c82158WMg2.LIZLLL) {
            wna2 = WN7.LIZ(view2);
        } else {
            WN7.LIZIZ(view2);
        }
        view.setVisibility(0);
        float LJIIIIZZ = C16360ka.LJIIIIZZ(view);
        if (LJIIIIZZ > 0.0f) {
            C16360ka.LJIJ(view, 0.0f);
        }
        Animator LJI = LJI(c82158WMg, c82158WMg2);
        if (!LJ()) {
            LJI.setDuration(300L);
        }
        LJI.addListener(new WN8(c82158WMg2, view, LJIIIIZZ, c82158WMg, wna, view2, wna2, runnable));
        LJI.start();
        c43356Gzw.LIZIZ(new WND(LJI));
    }
}
