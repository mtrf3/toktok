package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C5H3;
import X.C76577U3p;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_live_show_config")
/* loaded from: classes14.dex */
public final class MultiGuestLiveShowConfigSetting {
    public static final MultiGuestLiveShowConfigSetting INSTANCE = new MultiGuestLiveShowConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiGuestLiveShowConfig DEFAULT = new MultiGuestLiveShowConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C76577U3p.LJLIL);

    public final MultiGuestLiveShowConfig getSettingValue() {
        return (MultiGuestLiveShowConfig) settingValue$delegate.getValue();
    }

    public final MultiGuestLiveShowConfig getValue() {
        MultiGuestLiveShowConfig multiGuestLiveShowConfig = (MultiGuestLiveShowConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestLiveShowConfigSetting.class);
        if (multiGuestLiveShowConfig == null) {
            return DEFAULT;
        }
        return multiGuestLiveShowConfig;
    }

    public final boolean isAllowOpenMic() {
        if (getSettingValue().initialAllowOpenMic == 1) {
            return true;
        }
        return false;
    }

    public final boolean isAnimationDowngradeEnabled() {
        if (getSettingValue().animationDowngradeEnabled == 1) {
            return true;
        }
        return false;
    }

    public final boolean isBackUpIm() {
        if (getSettingValue().enableCalibrateContent == 1) {
            return true;
        }
        return false;
    }

    public final boolean isOpenLiveShow() {
        if (getSettingValue().audienceMainSwitch == 1) {
            return true;
        }
        return false;
    }
}
