package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YdE, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87812YdE extends C87797Ycz {
    public final /* synthetic */ C87810YdC LJLIL;

    public C87812YdE(C87810YdC c87810YdC) {
        this.LJLIL = c87810YdC;
    }

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZLLL.setBackground(null);
        this.LJLIL.LIZLLL.setVisibility(8);
        C87810YdC c87810YdC = this.LJLIL;
        c87810YdC.LIZJ.setCardBackgroundColor(c87810YdC.LIZIZ.LJFF);
        this.LJLIL.LJII(false);
    }
}
