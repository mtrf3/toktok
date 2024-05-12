package X;

import android.animation.Animator;

/* renamed from: X.af6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94320af6 extends C93918aYc {
    public final /* synthetic */ InterfaceC65784Pro LJLIL;

    public C94320af6(InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLIL.invoke();
    }
}
