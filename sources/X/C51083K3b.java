package X;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.K3b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51083K3b implements Animator.AnimatorListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p0) {
        o.LJIIIZ(p0, "p0");
        this.LJLIL.setBackgroundColor(this.LJLILLLLZI);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p0) {
        o.LJIIIZ(p0, "p0");
    }

    public C51083K3b(View view, int i) {
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
