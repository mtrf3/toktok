package X;

import android.animation.Animator;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.UCn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76809UCn implements Animator.AnimatorListener {
    public final /* synthetic */ C76805UCj LJLIL;
    public final /* synthetic */ InterfaceC65784Pro LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (this.LJLIL.LJLIL) {
            this.LJLILLLLZI.invoke();
            if (!o.LJ(this.LJLJI, this.LJLJJI)) {
                this.LJLJI.setAlpha(1.0f);
            }
        }
    }

    public C76809UCn(C76805UCj c76805UCj, InterfaceC65784Pro interfaceC65784Pro, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.LJLIL = c76805UCj;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = viewGroup;
        this.LJLJJI = viewGroup2;
    }
}
