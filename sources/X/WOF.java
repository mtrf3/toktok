package X;

import android.animation.Animator;
import android.widget.FrameLayout;

/* loaded from: classes15.dex */
public final class WOF implements Animator.AnimatorListener {
    public final WOV LJLIL;
    public final InterfaceC82204WOa LJLILLLLZI;
    public final FrameLayout LJLJI;
    public C29701Eo LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LJLJJLL = false;
        C170666ms.LIZIZ("record cound down onAnimationCancel() called");
        this.LJLIL.LIZIZ();
        this.LJLILLLLZI.release();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C170666ms.LIZIZ("record cound down onAnimationEnd() called");
        this.LJLJJLL = false;
        C29701Eo c29701Eo = this.LJLJJI;
        if (c29701Eo != null && this.LJLJI != null && c29701Eo.isAnimating()) {
            this.LJLJJI.setVisibility(8);
        }
        this.LJLIL.LIZ();
        this.LJLILLLLZI.release();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LJLILLLLZI.LIZ(this.LJLJJL);
    }

    public WOF(FrameLayout frameLayout, WOL wol, C78255UnT c78255UnT) {
        this.LJLJI = frameLayout;
        this.LJLIL = wol;
        this.LJLILLLLZI = c78255UnT;
    }
}
