package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.UcG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77560UcG extends C73102SmY {
    public final /* synthetic */ C9CS LJLIL;
    public final /* synthetic */ C29701Eo LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL.indexOfChild(this.LJLILLLLZI) >= 0) {
            C9CS c9cs = this.LJLIL;
            C29701Eo c29701Eo = this.LJLILLLLZI;
            if (C78996UzQ.LJJIIJZLJL(c29701Eo)) {
                C78996UzQ.LJI();
            }
            c9cs.removeView(c29701Eo);
        }
    }

    public C77560UcG(C29701Eo c29701Eo, C9CS c9cs) {
        this.LJLIL = c9cs;
        this.LJLILLLLZI = c29701Eo;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation, z);
        if (this.LJLIL.indexOfChild(this.LJLILLLLZI) >= 0) {
            C9CS c9cs = this.LJLIL;
            C29701Eo c29701Eo = this.LJLILLLLZI;
            if (C78996UzQ.LJJIIJZLJL(c29701Eo)) {
                C78996UzQ.LJI();
            }
            c9cs.removeView(c29701Eo);
        }
    }
}
