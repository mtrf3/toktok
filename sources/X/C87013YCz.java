package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YCz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87013YCz {
    public final ViewPropertyAnimator LIZ;
    public float LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        this.LIZ.start();
    }

    public C87013YCz(View view) {
        ViewPropertyAnimator animate = view.animate();
        o.LJIIIIZZ(animate, "view.animate()");
        this.LIZ = animate;
    }

    public final void LIZ(final Animator.AnimatorListener animatorListener) {
        Animator.AnimatorListener animatorListener2;
        ViewPropertyAnimator viewPropertyAnimator = this.LIZ;
        if (animatorListener != null) {
            final AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 13);
            animatorListener2 = new Animator.AnimatorListener(animatorListener, aqS165S0100000_15) { // from class: X.9N3
                public final Animator.AnimatorListener LJLIL;
                public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    this.LJLIL.onAnimationCancel(animation);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    this.LJLIL.onAnimationEnd(animation);
                    this.LJLILLLLZI.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    this.LJLIL.onAnimationRepeat(animation);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    this.LJLIL.onAnimationStart(animation);
                }

                {
                    o.LJIIIZ(animatorListener, "l");
                    this.LJLIL = animatorListener;
                    this.LJLILLLLZI = aqS165S0100000_15;
                }
            };
        } else {
            animatorListener2 = null;
        }
        viewPropertyAnimator.setListener(animatorListener2);
    }

    public final void LIZJ(float f) {
        this.LIZIZ = f;
        this.LIZJ = true;
        this.LIZ.translationY(f);
    }
}
