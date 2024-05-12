package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YdY, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87832YdY extends C87797Ycz {
    public final /* synthetic */ C87807Yd9 LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        C87807Yd9 c87807Yd9 = this.LJLIL;
        c87807Yd9.LJIIJ(YZJ.RESET, c87807Yd9.LJIIJ, this.LJLILLLLZI.LIZIZ, 3050L, null);
    }

    public C87832YdY(C87807Yd9 c87807Yd9, C31521CYr c31521CYr) {
        this.LJLIL = c87807Yd9;
        this.LJLILLLLZI = c31521CYr;
    }
}
