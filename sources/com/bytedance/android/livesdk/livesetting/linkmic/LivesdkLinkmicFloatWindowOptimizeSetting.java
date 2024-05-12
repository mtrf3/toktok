package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C15380j0;
import X.U4C;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

@SettingsKey("livesdk_linkmic_float_window_optimize_v2")
/* loaded from: classes14.dex */
public final class LivesdkLinkmicFloatWindowOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("v3, round corner, no border")
    public static final int ROUND_CORNER_WITHOUT_BRODER_V3 = 3;

    @Group("v1, round corner, border #57ffffff")
    public static final int ROUND_CORNER_WITH_BORDER_V1 = 1;

    @Group("v2, round corner, border #000000")
    public static final int ROUND_CORNER_WITH_BRODER_V2 = 2;
    public static final LivesdkLinkmicFloatWindowOptimizeSetting INSTANCE = new LivesdkLinkmicFloatWindowOptimizeSetting();
    public static final double CORNER_RADIUS_PX = C15380j0.LIZ(8.0f);
    public static final int STROKE_WIDTH = C15380j0.LIZ(1.5f);

    public final boolean enableAnchorMixStream() {
        if (LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_floating_layout_opt_style_v2") != 0) {
            return true;
        }
        return false;
    }

    public final int getAnchorValue() {
        return LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_floating_layout_opt_style_v2");
    }

    public final int getAudienceValue() {
        Integer LIZIZ = U4C.LIZIZ("linkmic_floating_layout_opt_style_v2");
        if (LIZIZ != null) {
            return LIZIZ.intValue();
        }
        return 0;
    }

    public final double getCORNER_RADIUS_PX() {
        return CORNER_RADIUS_PX;
    }

    public final int getSTROKE_WIDTH() {
        return STROKE_WIDTH;
    }

    public final boolean isV0(boolean z) {
        if (z) {
            if (getAnchorValue() == 0) {
                return true;
            }
        } else if (getAudienceValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isV1(boolean z) {
        if (z) {
            if (getAnchorValue() != 1) {
                return false;
            }
        } else if (getAudienceValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean isV2(boolean z) {
        if (z) {
            if (getAnchorValue() == 2) {
                return true;
            }
        } else if (getAudienceValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isV3(boolean z) {
        if (z) {
            if (getAnchorValue() == 3) {
                return true;
            }
        } else if (getAudienceValue() == 3) {
            return true;
        }
        return false;
    }
}
