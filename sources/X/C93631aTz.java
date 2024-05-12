package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.aTz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93631aTz extends AnimatorListenerAdapter {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C93632aU0 LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C93632aU0 c93632aU0 = this.LJLILLLLZI;
        c93632aU0.LJLJI = this.LJLIL;
        c93632aU0.LJLJJI = 0.0f;
    }

    public C93631aTz(C93632aU0 c93632aU0, int i) {
        this.LJLILLLLZI = c93632aU0;
        this.LJLIL = i;
    }
}
