package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes15.dex */
public final class WN6 extends AnimatorListenerAdapter {
    public final /* synthetic */ C82158WMg LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ WNA LJLJI;
    public final /* synthetic */ C82158WMg LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ WNA LJLJJLL;
    public final /* synthetic */ Runnable LJLJL;
    public final /* synthetic */ WN5 LJLJLJ;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.LJLIL.LIZLLL) {
            WN7.LIZJ(this.LJLILLLLZI, this.LJLJI);
        } else {
            WN7.LIZIZ(this.LJLILLLLZI);
        }
        if (this.LJLJJI.LIZLLL) {
            WN7.LIZJ(this.LJLJJL, this.LJLJJLL);
        } else {
            WN7.LIZIZ(this.LJLJJL);
        }
        this.LJLJLJ.LIZ.getOverlay().remove(this.LJLILLLLZI);
        this.LJLJL.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
    }

    public WN6(WN5 wn5, C82158WMg c82158WMg, View view, WNA wna, C82158WMg c82158WMg2, View view2, WNA wna2, Runnable runnable) {
        this.LJLJLJ = wn5;
        this.LJLIL = c82158WMg;
        this.LJLILLLLZI = view;
        this.LJLJI = wna;
        this.LJLJJI = c82158WMg2;
        this.LJLJJL = view2;
        this.LJLJJLL = wna2;
        this.LJLJL = runnable;
    }
}
