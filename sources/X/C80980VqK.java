package X;

import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.VqK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80980VqK implements InterfaceC80984VqO {
    @Override // X.InterfaceC80984VqO
    public final void LIZ(C80972VqC c80972VqC, long j) {
        long j2 = j - c80972VqC.LJLJI;
        long j3 = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        float f = ((float) (j2 - j3)) / ((float) (c80972VqC.LJLJJI - j3));
        double d = f;
        if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= d && d <= 1.0d) {
            c80972VqC.LJLLI = (c80972VqC.LJLLILLLL * new DecelerateInterpolator(1.5f).getInterpolation(f)) + 1.5f;
        }
    }
}
