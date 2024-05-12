package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70754Rpm implements Animator.AnimatorListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ AnimatorSet LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!this.LJLIL) {
            this.LJLILLLLZI.setVisibility(8);
        }
        C16880lQ.LJLJJL(this.LJLJI);
    }

    public C70754Rpm(boolean z, View view, AnimatorSet animatorSet) {
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = animatorSet;
    }
}
