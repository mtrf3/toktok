package X;

import Y.ARunnableS51S0100000_15;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YGl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87103YGl extends C87107YGp {
    public Animator LIZLLL;

    @Override // X.AbstractC87105YGn
    public final void LIZIZ() {
        this.LIZ.LIZJ("popupbadge");
        ARunnableS51S0100000_15 aRunnableS51S0100000_15 = new ARunnableS51S0100000_15(this, 12);
        this.LIZIZ = aRunnableS51S0100000_15;
        this.LIZ.LIZ.post(aRunnableS51S0100000_15);
    }

    @Override // X.AbstractC87105YGn
    public final void LJ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        LJI(null);
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LIZLLL = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87103YGl(C87098YGg stateContext) {
        super(stateContext);
        o.LJIIIZ(stateContext, "stateContext");
    }
}
