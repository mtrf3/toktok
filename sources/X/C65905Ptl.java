package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Ptl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65905Ptl {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(double d) {
        if (d >= 1) {
            return true;
        }
        if (d > 0 && V0Q.Default.nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d) <= d) {
            return true;
        }
        return false;
    }
}
