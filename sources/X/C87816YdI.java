package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YdI, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87816YdI extends C87797Ycz {
    public final /* synthetic */ C87806Yd8 LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJII.setVisibility(8);
        this.LJLIL.LJ.setAlpha(1.0f);
        C87806Yd8 c87806Yd8 = this.LJLIL;
        c87806Yd8.LIZJ.setCardBackgroundColor(c87806Yd8.LIZIZ.LJFF);
        C87806Yd8 c87806Yd82 = this.LJLIL;
        c87806Yd82.LIZ.setCardBackgroundColor(c87806Yd82.LIZIZ.LJ);
        C87806Yd8 c87806Yd83 = this.LJLIL;
        C31521CYr c31521CYr = c87806Yd83.LIZIZ.LJIIJJI;
        if (c31521CYr != null) {
            c87806Yd83.LJI.setText(c31521CYr.LIZIZ);
            AbstractC87817YdJ.LJI(c87806Yd83.LJFF, c31521CYr);
            c87806Yd83.LJIIL(c31521CYr);
        }
        C87806Yd8 c87806Yd84 = this.LJLIL;
        c87806Yd84.LJIIJ(YZJ.RESET, c87806Yd84.LJI, this.LJLILLLLZI.LIZIZ, -1L, new C87833YdZ(c87806Yd84));
    }

    public C87816YdI(C87806Yd8 c87806Yd8, C31521CYr c31521CYr) {
        this.LJLIL = c87806Yd8;
        this.LJLILLLLZI = c31521CYr;
    }
}
