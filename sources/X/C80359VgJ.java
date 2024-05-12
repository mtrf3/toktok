package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.VgJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80359VgJ extends AnimatorListenerAdapter {
    public final /* synthetic */ C80343Vg3 LJLIL;

    public C80359VgJ(C80343Vg3 c80343Vg3) {
        this.LJLIL = c80343Vg3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LJLIL.LIZ.setEndIconVisible(true);
    }
}
