package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YdB, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87809YdB extends C87797Ycz {
    public final /* synthetic */ C87808YdA LJLIL;

    public C87809YdB(C87808YdA c87808YdA) {
        this.LJLIL = c87808YdA;
    }

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJII.setVisibility(8);
        this.LJLIL.LJ.setAlpha(1.0f);
        C87808YdA c87808YdA = this.LJLIL;
        c87808YdA.LIZJ.setCardBackgroundColor(c87808YdA.LIZIZ.LJFF);
        C87808YdA c87808YdA2 = this.LJLIL;
        c87808YdA2.LIZ.setCardBackgroundColor(c87808YdA2.LIZIZ.LJ);
        this.LJLIL.LJII(false);
        this.LJLIL.LIZ();
    }
}
