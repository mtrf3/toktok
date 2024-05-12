package X;

import android.animation.Animator;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public final class UON implements UOV {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ UOM LIZIZ;
    public final /* synthetic */ Animator LIZJ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS179S0100000_13(this.LIZJ, 447);
    }

    @Override // X.UOV
    public final void LIZIZ() {
        if (!this.LIZ) {
            this.LIZIZ.LIZ.LIZ();
        }
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // X.UOV
    public final void LIZJ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.UOV
    public final boolean isRunning() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            return animator.isRunning();
        }
        return false;
    }

    public UON(boolean z, UOM uom, Animator animator) {
        this.LIZ = z;
        this.LIZIZ = uom;
        this.LIZJ = animator;
    }
}
