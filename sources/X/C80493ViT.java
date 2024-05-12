package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.ViT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80493ViT extends AnimatorListenerAdapter {
    public final /* synthetic */ C80492ViS LJLIL;

    public C80493ViT(C80492ViS c80492ViS) {
        this.LJLIL = c80492ViS;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C80492ViS c80492ViS = this.LJLIL;
        if (c80492ViS.LIZIZ == animator) {
            c80492ViS.LIZIZ = null;
        }
    }
}
