package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes15.dex */
public final class WN8 extends AnimatorListenerAdapter {
    public final /* synthetic */ C82158WMg LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ C82158WMg LJLJJI;
    public final /* synthetic */ WNA LJLJJL;
    public final /* synthetic */ View LJLJJLL;
    public final /* synthetic */ WNA LJLJL;
    public final /* synthetic */ Runnable LJLJLJ;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.LJLIL.LIZLLL) {
            this.LJLILLLLZI.setVisibility(8);
        }
        float f = this.LJLJI;
        if (f > 0.0f) {
            C16360ka.LJIJ(this.LJLILLLLZI, f);
        }
        if (this.LJLJJI.LIZLLL) {
            WN7.LIZJ(this.LJLILLLLZI, this.LJLJJL);
        } else {
            WN7.LIZIZ(this.LJLILLLLZI);
        }
        if (this.LJLIL.LIZLLL) {
            WN7.LIZJ(this.LJLJJLL, this.LJLJL);
        } else {
            WN7.LIZIZ(this.LJLJJLL);
        }
        this.LJLJLJ.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
    }

    public WN8(C82158WMg c82158WMg, View view, float f, C82158WMg c82158WMg2, WNA wna, View view2, WNA wna2, Runnable runnable) {
        this.LJLIL = c82158WMg;
        this.LJLILLLLZI = view;
        this.LJLJI = f;
        this.LJLJJI = c82158WMg2;
        this.LJLJJL = wna;
        this.LJLJJLL = view2;
        this.LJLJL = wna2;
        this.LJLJLJ = runnable;
    }
}
