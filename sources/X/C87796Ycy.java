package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ycy, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87796Ycy extends C87797Ycz {
    public final /* synthetic */ C87793Ycv LJLIL;
    public final /* synthetic */ CharSequence LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJII(false);
        C87793Ycv c87793Ycv = this.LJLIL;
        if (!c87793Ycv.LJIIZILJ) {
            c87793Ycv.LJI.setText(this.LJLILLLLZI);
        }
        C87793Ycv c87793Ycv2 = this.LJLIL;
        int i = c87793Ycv2.LJIILL - 1;
        c87793Ycv2.LJIILL = i;
        if (i == 0) {
            RunnableC87795Ycx runnableC87795Ycx = c87793Ycv2.LJIILJJIL;
            c87793Ycv2.LJIILJJIL = null;
            if (runnableC87795Ycx != null) {
                runnableC87795Ycx.run();
            }
        }
    }

    public C87796Ycy(C87793Ycv c87793Ycv, CharSequence charSequence) {
        this.LJLIL = c87793Ycv;
        this.LJLILLLLZI = charSequence;
    }
}
