package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YdG, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87814YdG extends C87797Ycz {
    public final /* synthetic */ C87805Yd7 LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC87817YdJ.LJIIIIZZ(this.LJLIL.LIZ, -2);
        C87805Yd7 c87805Yd7 = this.LJLIL;
        c87805Yd7.LIZ.setCardBackgroundColor(c87805Yd7.LIZIZ.LJ);
        this.LJLIL.LJII.setVisibility(8);
        this.LJLIL.LIZJ.setTranslationY(0.0f);
        C87805Yd7 c87805Yd72 = this.LJLIL;
        c87805Yd72.LIZJ.setCardBackgroundColor(c87805Yd72.LIZIZ.LJFF);
        this.LJLIL.LJ.setAlpha(1.0f);
        C87805Yd7 c87805Yd73 = this.LJLIL;
        C31521CYr c31521CYr = c87805Yd73.LIZIZ.LJIIJJI;
        if (c31521CYr != null) {
            c87805Yd73.LJI.setText(c31521CYr.LIZIZ);
            AbstractC87817YdJ.LJI(c87805Yd73.LJFF, c31521CYr);
            c87805Yd73.LJIIL(c31521CYr);
        }
        C87805Yd7 c87805Yd74 = this.LJLIL;
        c87805Yd74.LJIIJ(YZJ.RESET, c87805Yd74.LJI, this.LJLILLLLZI.LIZIZ, -1L, new C87835Ydb(c87805Yd74));
    }

    public C87814YdG(C87805Yd7 c87805Yd7, C31521CYr c31521CYr) {
        this.LJLIL = c87805Yd7;
        this.LJLILLLLZI = c31521CYr;
    }
}
