package X;

import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.VqJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80979VqJ implements InterfaceC80984VqO {
    @Override // X.InterfaceC80984VqO
    public final void LIZ(C80972VqC c80972VqC, long j) {
        float f = ((float) (j - c80972VqC.LJLJI)) / ((float) c80972VqC.LJLJJI);
        double d = f;
        if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= d && d <= 1.0d) {
            c80972VqC.LJLL = c80972VqC.LJLJL - (c80972VqC.LJLJLJ * new DecelerateInterpolator(2.0f).getInterpolation(f));
        }
    }
}
