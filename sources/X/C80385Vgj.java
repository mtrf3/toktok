package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.Vgj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80385Vgj extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.LJLIL) {
            this.LJLILLLLZI.setVisibility(4);
            this.LJLJI.setAlpha(1.0f);
            this.LJLJI.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.LJLIL) {
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJI.setAlpha(0.0f);
            this.LJLJI.setVisibility(4);
        }
    }

    public C80385Vgj(boolean z, View view, View view2) {
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = view2;
    }
}
