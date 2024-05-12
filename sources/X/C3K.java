package X;

import android.animation.Animator;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class C3K implements UOV {
    public final /* synthetic */ Animator LIZ;
    public final /* synthetic */ C29701Eo LIZIZ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS171S0100000_5(this.LIZ, 758);
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
        this.LIZIZ.updateBitmap("image_4", null);
    }

    @Override // X.UOV
    public final boolean isRunning() {
        Animator animator = this.LIZ;
        if (animator != null) {
            return animator.isRunning();
        }
        return false;
    }

    public C3K(Animator animator, C29701Eo c29701Eo) {
        this.LIZ = animator;
        this.LIZIZ = c29701Eo;
    }
}
