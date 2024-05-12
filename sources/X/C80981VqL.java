package X;

import android.view.animation.DecelerateInterpolator;

/* renamed from: X.VqL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80981VqL implements InterfaceC80984VqO {
    @Override // X.InterfaceC80984VqO
    public final void LIZ(C80972VqC c80972VqC, long j) {
        float f = ((float) ((j - c80972VqC.LJLJI) - 600)) / 450;
        if (f < 0.0f) {
            c80972VqC.LJLLJ = 1.0f;
        } else if (f > 1.0f) {
            c80972VqC.LJLLJ = 0.0f;
        } else {
            c80972VqC.LJLLJ = 1 - new DecelerateInterpolator(1.5f).getInterpolation(f);
        }
    }
}
