package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* renamed from: X.Vgq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80392Vgq extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC80386Vgk LJLIL;
    public final /* synthetic */ Drawable LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLIL.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LJLIL.setCircularRevealOverlayDrawable(this.LJLILLLLZI);
    }

    public C80392Vgq(InterfaceC80386Vgk interfaceC80386Vgk, Drawable drawable) {
        this.LJLIL = interfaceC80386Vgk;
        this.LJLILLLLZI = drawable;
    }
}
