package X;

import android.animation.Animator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LB8 extends LB5 {
    public final /* synthetic */ LB6 LJLIL;

    public LB8(LB6 lb6) {
        this.LJLIL = lb6;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p0) {
        o.LJIIIZ(p0, "p0");
        ConstraintLayout constraintLayout = this.LJLIL.LIZLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        FrameLayout frameLayout = this.LJLIL.LIZJ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintLayout constraintLayout = this.LJLIL.LIZLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        FrameLayout frameLayout = this.LJLIL.LIZJ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }
}
