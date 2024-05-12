package X;

import android.animation.Animator;
import android.widget.FrameLayout;

/* loaded from: classes15.dex */
public final class WO1 implements Animator.AnimatorListener {
    public final WO7 LJLIL;
    public final WO9 LJLILLLLZI;
    public final FrameLayout LJLJI;
    public C29701Eo LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public static void LIZIZ(WO1 wo1) {
        if (wo1.LJLJJI.getHeight() <= 0) {
            wo1.LJLJJI.post(new RunnableC51614KNm(3, wo1));
            return;
        }
        int LIZLLL = C81184Vtc.LIZLLL(wo1.LJLJJI.getContext());
        wo1.LJLJJI.getLocationOnScreen(new int[2]);
        wo1.LJLJJI.setTranslationY(((LIZLLL - wo1.LJLJJI.getHeight()) / 2.0f) - r2[1]);
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

    public WO1(FrameLayout frameLayout, WO4 wo4, C78256UnU c78256UnU) {
        this.LJLJI = frameLayout;
        this.LJLIL = wo4;
        this.LJLILLLLZI = c78256UnU;
    }
}
