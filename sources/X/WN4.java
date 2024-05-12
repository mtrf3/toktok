package X;

import Y.ARunnableS0S0600001_14;
import Y.ARunnableS17S0400000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes15.dex */
public final class WN4 extends WMU {
    public final WN3 LIZJ;
    public final WN3 LIZLLL;

    @Override // X.WMU
    public final void LIZJ(Class cls, Class cls2) {
    }

    public WN4(int i, int i2, Activity activity) {
        this.LIZJ = WN3.LIZJ(activity, i);
        this.LIZLLL = WN3.LIZJ(activity, i2);
    }

    @Override // X.WMU
    public final void LIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        View view = c82158WMg.LIZIZ;
        View view2 = c82158WMg2.LIZIZ;
        WN7.LIZIZ(view);
        WN7.LIZIZ(view2);
        view.setVisibility(0);
        this.LIZ.getOverlay().add(view);
        GL4 gl4 = new GL4(new ARunnableS17S0400000_14(this, view, view2, runnable, 4));
        WN3 wn3 = this.LIZJ;
        Animation animation = wn3.LIZ;
        if (animation != null) {
            WN3.LIZLLL(animation);
        } else {
            Animator animator = wn3.LIZIZ;
            if (animator != null && (animator instanceof ValueAnimator)) {
                ((ValueAnimator) animator).reverse();
            }
        }
        this.LIZJ.LIZ(gl4);
        this.LIZJ.LJ(view);
        WN3 wn32 = this.LIZLLL;
        Animation animation2 = wn32.LIZ;
        if (animation2 != null) {
            WN3.LIZLLL(animation2);
        } else {
            Animator animator2 = wn32.LIZIZ;
            if (animator2 != null && (animator2 instanceof ValueAnimator)) {
                ((ValueAnimator) animator2).reverse();
            }
        }
        this.LIZLLL.LIZ(gl4);
        this.LIZLLL.LJ(view2);
        c43356Gzw.LIZIZ(new WNC(this));
    }

    @Override // X.WMU
    public final void LIZIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        View view = c82158WMg.LIZIZ;
        View view2 = c82158WMg2.LIZIZ;
        WN7.LIZIZ(view);
        WN7.LIZIZ(view2);
        view.setVisibility(0);
        float LJIIIIZZ = C16360ka.LJIIIIZZ(view);
        if (LJIIIIZZ > 0.0f) {
            C16360ka.LJIJ(view, 0.0f);
        }
        if (c82158WMg.LIZJ.value < WME.VIEW_CREATED.value) {
            this.LIZ.getOverlay().add(view);
        }
        GL4 gl4 = new GL4(new ARunnableS0S0600001_14(this, c82158WMg2, view, LJIIIIZZ, view2, c82158WMg, runnable, 1));
        this.LIZJ.LIZ(gl4);
        this.LIZLLL.LIZ(gl4);
        this.LIZLLL.LJ(view);
        this.LIZJ.LJ(view2);
        c43356Gzw.LIZIZ(new WNB(this));
    }
}
