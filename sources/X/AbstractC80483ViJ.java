package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.ViJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80483ViJ extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean LJLIL;
    public final /* synthetic */ C80475ViB LJLILLLLZI;

    public abstract float LIZIZ();

    public AbstractC80483ViJ(C80476ViC c80476ViC) {
        this.LJLILLLLZI = c80476ViC;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLILLLLZI.getClass();
        this.LJLIL = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.LJLIL) {
            this.LJLILLLLZI.getClass();
            LIZIZ();
            this.LJLIL = true;
        }
        C80475ViB c80475ViB = this.LJLILLLLZI;
        valueAnimator.getAnimatedFraction();
        c80475ViB.getClass();
    }
}
