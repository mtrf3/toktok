package X;

import Y.ALAdapterS12S0100000_15;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.YGp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87107YGp extends AbstractC87105YGn {
    public Animator LIZJ;

    @Override // X.AbstractC87105YGn
    public void LIZLLL() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.pause();
        }
    }

    @Override // X.AbstractC87105YGn
    public void LJFF() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.resume();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87107YGp(C87098YGg stateContext) {
        super(stateContext);
        o.LJIIIZ(stateContext, "stateContext");
    }

    public final void LJI(Animator animator) {
        this.LIZJ = animator;
        if (animator != null) {
            animator.addListener(new ALAdapterS12S0100000_15(this, 1));
        }
    }
}
