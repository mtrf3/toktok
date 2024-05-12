package X;

import android.animation.Animator;

/* renamed from: X.7x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C202427x0 implements Animator.AnimatorListener {
    public final Boolean LJLIL;
    public final /* synthetic */ C202467x4 LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C202427x0(C202467x4 c202467x4) {
        this.LJLILLLLZI = c202467x4;
        this.LJLIL = Boolean.FALSE;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LJLILLLLZI.LJI(false);
        this.LJLILLLLZI.LIZIZ();
        this.LJLILLLLZI.removeAnimatorListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLILLLLZI.LJI(false);
        if (this.LJLIL.booleanValue()) {
            this.LJLILLLLZI.LIZ(Boolean.FALSE);
        }
        InterfaceC202447x2 interfaceC202447x2 = this.LJLILLLLZI.LJLJJI;
        if (interfaceC202447x2 != null) {
            interfaceC202447x2.LIZ();
            this.LJLILLLLZI.LJLJJI = null;
        }
        this.LJLILLLLZI.LIZIZ();
        this.LJLILLLLZI.removeAnimatorListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.LJLIL.booleanValue()) {
            this.LJLILLLLZI.LIZ(Boolean.TRUE);
        }
        this.LJLILLLLZI.LJI(true);
    }

    public C202427x0(C202467x4 c202467x4, Boolean bool) {
        this.LJLILLLLZI = c202467x4;
        this.LJLIL = Boolean.FALSE;
        this.LJLIL = bool;
    }
}
