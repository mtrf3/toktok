package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YdF, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87813YdF extends C87797Ycz {
    public final /* synthetic */ C87810YdC LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJII.setVisibility(8);
        this.LJLIL.LJIIJJI.setBackground(null);
        this.LJLIL.LJI.setText(this.LJLILLLLZI.LIZIZ);
        AbstractC87817YdJ.LJI(this.LJLIL.LJFF, this.LJLILLLLZI);
        this.LJLIL.LJIIL(this.LJLILLLLZI);
        this.LJLIL.LJ.setAlpha(1.0f);
        AbstractC87817YdJ.LJFF(this.LJLIL.LIZJ);
        C87810YdC c87810YdC = this.LJLIL;
        AbstractC87817YdJ.LJIIIIZZ(c87810YdC.LIZLLL, c87810YdC.LIZJ.getMeasuredWidth());
        this.LJLIL.LIZ();
        C87810YdC c87810YdC2 = this.LJLIL;
        c87810YdC2.LJIIJ(YZJ.RESET, c87810YdC2.LJI, this.LJLILLLLZI.LIZIZ, 3000L, null);
    }

    public C87813YdF(C87810YdC c87810YdC, C31521CYr c31521CYr) {
        this.LJLIL = c87810YdC;
        this.LJLILLLLZI = c31521CYr;
    }
}
