package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.VgC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80352VgC extends AnimatorListenerAdapter {
    public final /* synthetic */ C80342Vg2 LJLIL;

    public C80352VgC(C80342Vg2 c80342Vg2) {
        this.LJLIL = c80342Vg2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C80342Vg2 c80342Vg2 = this.LJLIL;
        c80342Vg2.LIZJ.setChecked(c80342Vg2.LJIIIZ);
        this.LJLIL.LJIILL.start();
    }
}
