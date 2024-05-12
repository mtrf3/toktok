package X;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQ0 implements Animator.AnimatorListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLIL.setAlpha(this.LJLILLLLZI);
        this.LJLIL.setVisibility(0);
    }

    public AQ0(View view, float f) {
        this.LJLIL = view;
        this.LJLILLLLZI = f;
    }
}
