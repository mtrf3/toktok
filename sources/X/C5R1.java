package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.5R1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5R1 implements Animator.AnimatorListener {
    public final C5R4 LJLIL;

    public C5R1(C5R4 callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = callback;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZLLL(animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZIZ();
        C16880lQ.LJLJLJ(this, animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZJ(animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZ();
    }
}
