package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YdQ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87824YdQ extends C87797Ycz {
    public final /* synthetic */ C87823YdP LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJIIIZ.setVisibility(0);
        C87823YdP c87823YdP = this.LJLIL;
        c87823YdP.LJII.setCardBackgroundColor(c87823YdP.LIZIZ.LJ);
        this.LJLIL.LJII.setTranslationY(0.0f);
        this.LJLIL.LJII.setVisibility(8);
        C87823YdP c87823YdP2 = this.LJLIL;
        c87823YdP2.LIZ.setRadius(c87823YdP2.LIZIZ.LJIIIIZZ);
        this.LJLIL.LJII(false);
    }

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJI.setText(this.LJLILLLLZI.LIZIZ);
        AbstractC87817YdJ.LJI(this.LJLIL.LJFF, this.LJLILLLLZI);
        this.LJLIL.LJIIL(this.LJLILLLLZI);
    }

    public C87824YdQ(C87823YdP c87823YdP, C31521CYr c31521CYr) {
        this.LJLIL = c87823YdP;
        this.LJLILLLLZI = c31521CYr;
    }
}
