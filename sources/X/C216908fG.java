package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.8fG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216908fG {
    public static double LIZ(double d, double d2, double d3) {
        double d4 = 1 - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        double d7 = 3;
        return (d5 * d * 1.0d) + C67399Qcl.LIZ(d7, d4, d5, d3, C67399Qcl.LIZ(d6, d7, d, d2, d6 * d4 * LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
    }
}
