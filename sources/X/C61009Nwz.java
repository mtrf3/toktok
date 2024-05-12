package X;

import android.animation.Animator;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;

/* renamed from: X.Nwz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61009Nwz implements Animator.AnimatorListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ BottomSheetBehavior LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomSheetBehavior bottomSheetBehavior = this.LJLILLLLZI;
        bottomSheetBehavior.LJJII = null;
        int i = this.LJLIL;
        if (i == 0) {
            bottomSheetBehavior.setStateInternal(5);
            this.LJLILLLLZI.LJJ = false;
            return;
        }
        if (i == bottomSheetBehavior.LIZIZ) {
            bottomSheetBehavior.setStateInternal(4);
            BottomSheetBehavior bottomSheetBehavior2 = this.LJLILLLLZI;
            C60576Nq0 c60576Nq0 = bottomSheetBehavior2.LJIILIIL;
            if (c60576Nq0 != null && !bottomSheetBehavior2.LJJIII) {
                if (bottomSheetBehavior2.LIZIZ == bottomSheetBehavior2.LJIJJLI) {
                    c60576Nq0.onEvent("enterFullScreen");
                } else {
                    c60576Nq0.onEvent("enterHalfScreen");
                }
                this.LJLILLLLZI.LJJIII = true;
                return;
            }
            return;
        }
        int i2 = bottomSheetBehavior.LJIJJLI;
        if (i == i2 && !bottomSheetBehavior.LJJIFFI) {
            bottomSheetBehavior.LIZIZ = i2;
        }
        C60576Nq0 c60576Nq02 = bottomSheetBehavior.LJIILIIL;
        if (c60576Nq02 != null && !bottomSheetBehavior.LJJIII) {
            c60576Nq02.onEvent("enterFullScreen");
            this.LJLILLLLZI.LJJIII = true;
        }
    }

    public C61009Nwz(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.LJLILLLLZI = bottomSheetBehavior;
        this.LJLIL = i;
    }
}
