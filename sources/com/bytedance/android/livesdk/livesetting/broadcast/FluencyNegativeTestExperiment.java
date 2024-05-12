package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

@SettingsKey("live_fluency_negative_test")
/* loaded from: classes6.dex */
public final class FluencyNegativeTestExperiment {
    public static final FluencyNegativeTestExperiment INSTANCE = new FluencyNegativeTestExperiment();

    @Group(isDefault = true, value = "default group")
    public static final FluencyNegativeTestSettings DEFAULT = new FluencyNegativeTestSettings(false, 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 7, null);
    public static final FluencyNegativeTestSettings setting = (FluencyNegativeTestSettings) SettingsManager.INSTANCE.getValueSafely(FluencyNegativeTestExperiment.class);

    private final boolean isEnable() {
        FluencyNegativeTestSettings fluencyNegativeTestSettings = setting;
        if (fluencyNegativeTestSettings != null) {
            return fluencyNegativeTestSettings.enable;
        }
        return false;
    }

    public final double dropFrames() {
        FluencyNegativeTestSettings fluencyNegativeTestSettings = setting;
        if (fluencyNegativeTestSettings != null) {
            return fluencyNegativeTestSettings.dropFrames;
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final boolean isBroadcastEnterSceneEnable() {
        FluencyNegativeTestSettings fluencyNegativeTestSettings = setting;
        if (fluencyNegativeTestSettings != null && fluencyNegativeTestSettings.scene == 0 && isEnable()) {
            return true;
        }
        return false;
    }

    public final boolean isBroadcastPeriodSceneEnable() {
        FluencyNegativeTestSettings fluencyNegativeTestSettings = setting;
        if (fluencyNegativeTestSettings != null && fluencyNegativeTestSettings.scene == 1 && isEnable()) {
            return true;
        }
        return false;
    }

    public final FluencyNegativeTestSettings getDEFAULT() {
        return DEFAULT;
    }

    public final FluencyNegativeTestSettings getSetting() {
        return setting;
    }
}
