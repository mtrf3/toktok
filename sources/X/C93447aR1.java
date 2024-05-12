package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.aR1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93447aR1 implements Animator.AnimatorListener {
    public final /* synthetic */ C68322mC LJLIL;
    public final /* synthetic */ C68322mC LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLILLLLZI.element = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLIL.element = null;
    }

    public C93447aR1(C68322mC c68322mC, C68322mC c68322mC2) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c68322mC2;
    }
}
