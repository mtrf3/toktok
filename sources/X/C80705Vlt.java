package X;

import android.animation.Animator;

/* renamed from: X.Vlt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80705Vlt implements Animator.AnimatorListener {
    public final /* synthetic */ C80695Vlj LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LJLIL.LJIJI(this.LJLILLLLZI, 0.0f, this.LJLJI, this.LJLJJI);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLIL.LJIJI(this.LJLILLLLZI, 0.0f, this.LJLJI, this.LJLJJI);
    }

    public C80705Vlt(C80695Vlj c80695Vlj, int i, boolean z, boolean z2) {
        this.LJLIL = c80695Vlj;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }
}
