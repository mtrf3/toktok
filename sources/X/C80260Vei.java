package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.Vei, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80260Vei extends AnimatorListenerAdapter {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C80258Veg LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLILLLLZI.selectedPosition = this.LJLIL;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LJLILLLLZI.selectedPosition = this.LJLIL;
    }

    public C80260Vei(C80258Veg c80258Veg, int i) {
        this.LJLILLLLZI = c80258Veg;
        this.LJLIL = i;
    }
}
