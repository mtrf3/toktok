package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.Vgl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80387Vgl extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC80386Vgk LJLIL;

    public C80387Vgl(InterfaceC80386Vgk interfaceC80386Vgk) {
        this.LJLIL = interfaceC80386Vgk;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C80391Vgp revealInfo = this.LJLIL.getRevealInfo();
        revealInfo.LIZJ = Float.MAX_VALUE;
        this.LJLIL.setRevealInfo(revealInfo);
    }
}
