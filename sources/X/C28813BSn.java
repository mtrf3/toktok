package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.BSn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28813BSn implements UOV {
    public final /* synthetic */ C68322mC<ValueAnimator> LIZ;

    @Override // X.UOV
    public final InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ() {
        return new AqS171S0100000_5(this.LIZ, (C68322mC<ValueAnimator>) 660);
    }

    @Override // X.UOV
    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LIZ.element;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // X.UOV
    public final void LIZJ() {
        ValueAnimator valueAnimator = this.LIZ.element;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // X.UOV
    public final boolean isRunning() {
        ValueAnimator valueAnimator = this.LIZ.element;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    public C28813BSn(C68322mC<ValueAnimator> c68322mC) {
        this.LIZ = c68322mC;
    }
}
