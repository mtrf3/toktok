package X;

import android.animation.Animator;

/* renamed from: X.af7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94321af7 extends C93918aYc {
    public final /* synthetic */ InterfaceC65784Pro LJLIL;

    public C94321af7(InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLIL.invoke();
    }
}
