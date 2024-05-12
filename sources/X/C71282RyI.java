package X;

import android.animation.Animator;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.RyI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71282RyI implements UOV {
    public final /* synthetic */ C71264Ry0 LIZ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS178S0100000_12(this.LIZ, 665);
    }

    @Override // X.UOV
    public final void LIZIZ() {
        this.LIZ.LIZLLL.playAnimation();
    }

    @Override // X.UOV
    public final void LIZJ() {
        this.LIZ.LIZLLL.cancelAnimation();
    }

    @Override // X.UOV
    public final boolean isRunning() {
        return this.LIZ.LIZLLL.isAnimating();
    }

    public C71282RyI(C71264Ry0 c71264Ry0) {
        this.LIZ = c71264Ry0;
    }
}
