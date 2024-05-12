package X;

import android.animation.Animator;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class C3B implements UOV {
    public final /* synthetic */ Animator LIZ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS171S0100000_5(this.LIZ, 68);
    }

    @Override // X.UOV
    public final void LIZIZ() {
        Animator animator = this.LIZ;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // X.UOV
    public final void LIZJ() {
        Animator animator = this.LIZ;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.UOV
    public final boolean isRunning() {
        Boolean bool;
        Animator animator = this.LIZ;
        if (animator != null) {
            bool = Boolean.valueOf(animator.isRunning());
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public C3B(Animator animator) {
        this.LIZ = animator;
    }
}
