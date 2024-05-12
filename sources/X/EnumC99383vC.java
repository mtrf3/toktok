package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.3vC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC99383vC {
    NINETY(0.95d),
    NONE(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);

    public final double LJLIL;

    public static EnumC99383vC valueOf(String str) {
        return (EnumC99383vC) V0N.LJJJ(EnumC99383vC.class, str);
    }

    public final double getRatio() {
        return this.LJLIL;
    }

    EnumC99383vC(double d) {
        this.LJLIL = d;
    }
}
