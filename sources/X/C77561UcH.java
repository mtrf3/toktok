package X;

import Y.ARunnableS9S0200100_13;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.UcH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77561UcH extends C73102SmY {
    public final /* synthetic */ Runnable LJLIL;

    public C77561UcH(ARunnableS9S0200100_13 aRunnableS9S0200100_13) {
        this.LJLIL = aRunnableS9S0200100_13;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        Runnable runnable = this.LJLIL;
        if (runnable != null) {
            runnable.run();
        }
    }
}
