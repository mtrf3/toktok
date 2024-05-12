package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.VgU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80370VgU extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.LJLIL) {
            this.LJLILLLLZI.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.LJLIL) {
            this.LJLILLLLZI.setVisibility(0);
        }
    }

    public C80370VgU(boolean z, View view) {
        this.LJLIL = z;
        this.LJLILLLLZI = view;
    }
}
