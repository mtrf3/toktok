package X;

import android.animation.Animator;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.RyJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71283RyJ implements UOV {
    public final /* synthetic */ C71265Ry1 LIZ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS178S0100000_12(this.LIZ, 667);
    }

    @Override // X.UOV
    public final void LIZIZ() {
        this.LIZ.LIZ.playAnimation();
    }

    @Override // X.UOV
    public final void LIZJ() {
        this.LIZ.LIZ.cancelAnimation();
    }

    @Override // X.UOV
    public final boolean isRunning() {
        return this.LIZ.LIZ.isAnimating();
    }

    public C71283RyJ(C71265Ry1 c71265Ry1) {
        this.LIZ = c71265Ry1;
    }
}
