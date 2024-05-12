package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LUC extends AnimatorListenerAdapter {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ LUG LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.LJLIL);
        LJIIIIZZ.LJJIIJ = this.LJLILLLLZI.LIZIZ;
        LJIIIIZZ.LIZIZ("FEPXYH_Transformer");
        C16880lQ.LLJJJ(LJIIIIZZ);
        LUG lug = this.LJLILLLLZI;
        lug.LIZLLL = LUG.LIZJ(lug.LIZIZ);
        Animator animator = this.LJLILLLLZI.LIZLLL;
        if (animator != null) {
            animator.start();
        }
    }

    public LUC(String str, LUG lug) {
        this.LJLIL = str;
        this.LJLILLLLZI = lug;
    }
}
