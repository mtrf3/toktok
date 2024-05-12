package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.Yd6, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87804Yd6 extends C87797Ycz {
    public final /* synthetic */ C87810YdC LJLIL;

    public C87804Yd6(C87810YdC c87810YdC) {
        this.LJLIL = c87810YdC;
    }

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJIIL.setTranslationX(0.0f);
        this.LJLIL.LJIIL.setVisibility(8);
        AbstractC87817YdJ.LJIIIIZZ(this.LJLIL.LIZLLL, 0);
    }
}
