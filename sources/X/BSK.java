package X;

import android.animation.Animator;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class BSK implements UOV {
    public final /* synthetic */ C29701Eo LIZ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS171S0100000_5(this.LIZ, 380);
    }

    @Override // X.UOV
    public final void LIZIZ() {
        this.LIZ.playAnimation();
    }

    @Override // X.UOV
    public final void LIZJ() {
        this.LIZ.cancelAnimation();
    }

    @Override // X.UOV
    public final boolean isRunning() {
        return this.LIZ.isAnimating();
    }

    public BSK(C29701Eo c29701Eo) {
        this.LIZ = c29701Eo;
    }
}
