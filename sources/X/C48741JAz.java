package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.JAz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48741JAz implements Animator.AnimatorListener {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C48740JAy LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        this.LJLIL.invoke();
        this.LJLILLLLZI.setVisibility(8);
        View view = this.LJLJI.LIZJ;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        this.LJLIL.invoke();
        this.LJLILLLLZI.setVisibility(8);
        View view = this.LJLJI.LIZJ;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
    }

    public C48741JAz(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, View view, C48740JAy c48740JAy) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = view;
        this.LJLJI = c48740JAy;
    }
}
