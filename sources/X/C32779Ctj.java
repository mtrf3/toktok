package X;

import Y.IDAListenerS74S0100000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Ctj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32779Ctj implements Animator.AnimatorListener {
    public final /* synthetic */ AnimatorSet LJLIL;
    public final /* synthetic */ C32727Cst LJLILLLLZI;
    public final /* synthetic */ C56414MCc LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLIL.addListener(new IDAListenerS74S0100000_5(this.LJLILLLLZI, 10));
        this.LJLIL.addListener(new IDAListenerS74S0100000_5(this.LJLJI, 9));
        this.LJLIL.addListener(new IDAListenerS74S0100000_5(this.LJLJI, 8));
    }

    public C32779Ctj(AnimatorSet animatorSet, C32727Cst c32727Cst, C56414MCc c56414MCc) {
        this.LJLIL = animatorSet;
        this.LJLILLLLZI = c32727Cst;
        this.LJLJI = c56414MCc;
    }
}
