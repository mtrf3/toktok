package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.VgK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80360VgK extends AnimatorListenerAdapter {
    public final /* synthetic */ C80343Vg3 LJLIL;

    public C80360VgK(C80343Vg3 c80343Vg3) {
        this.LJLIL = c80343Vg3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLIL.LIZ.setEndIconVisible(false);
    }
}
