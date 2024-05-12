package X;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.APz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26199APz implements Animator.AnimatorListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
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
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLIL.setAlpha(this.LJLILLLLZI);
        this.LJLIL.setVisibility(0);
    }

    public C26199APz(View view, float f) {
        this.LJLIL = view;
        this.LJLILLLLZI = f;
    }
}
