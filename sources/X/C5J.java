package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeOptPhase1;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes6.dex */
public final class C5J {
    public static int LIZ() {
        double doubleValue;
        if (LiveFirstRechargeOptPhase1.INSTANCE.getValue() == 3) {
            Double LIZ = InterfaceC30442Bx8.N1.LIZ();
            if (LIZ != null) {
                doubleValue = LIZ.doubleValue();
            }
            doubleValue = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            Double LIZ2 = InterfaceC30442Bx8.M1.LIZ();
            if (LIZ2 != null) {
                doubleValue = LIZ2.doubleValue();
            }
            doubleValue = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return (int) doubleValue;
    }
}
