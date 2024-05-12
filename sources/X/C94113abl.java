package X;

import android.animation.Animator;
import android.view.ViewGroup;

/* renamed from: X.abl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94113abl extends C93719aVP {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLILLLLZI.invoke(animator);
    }

    public C94113abl(ViewGroup viewGroup, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = interfaceC88472Yns;
    }
}
