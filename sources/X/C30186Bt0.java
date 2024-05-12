package X;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Bt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30186Bt0 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!this.LJLIL) {
            this.LJLJI.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL || !this.LJLILLLLZI) {
            this.LJLJI.setVisibility(0);
        }
    }

    public C30186Bt0(boolean z, View view, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = view;
    }
}
