package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C30990CEg;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

@SettingsKey(preciseExperiment = false, value = "multi_guest_anchor_threshold_config")
/* loaded from: classes6.dex */
public final class MultiGuestAnchorThresholdConfigSetting {
    public static final MultiGuestAnchorThresholdConfigSetting INSTANCE = new MultiGuestAnchorThresholdConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiGuestThresholdConfig DEFAULT = new MultiGuestThresholdConfig(null, 0, 3, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C30990CEg.LJLIL);

    private final MultiGuestThresholdConfig getSettingValue() {
        return (MultiGuestThresholdConfig) settingValue$delegate.getValue();
    }

    public final MultiGuestThresholdConfig getValue() {
        MultiGuestThresholdConfig multiGuestThresholdConfig = (MultiGuestThresholdConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestAnchorThresholdConfigSetting.class);
        if (multiGuestThresholdConfig == null) {
            return DEFAULT;
        }
        return multiGuestThresholdConfig;
    }

    public final int getMaxCoins() {
        return getSettingValue().maxCoins;
    }

    public final List<Integer> getOptions() {
        return getSettingValue().options;
    }
}
