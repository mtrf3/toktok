package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.ar.core.InstallActivity;

/* renamed from: X.aST, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93537aST extends AnimatorListenerAdapter {
    public final /* synthetic */ InstallActivity LJLIL;

    public C93537aST(InstallActivity installActivity) {
        this.LJLIL = installActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLIL.showSpinner();
    }
}
