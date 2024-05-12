package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interactive_gift_config")
/* loaded from: classes6.dex */
public final class LynxDowngradeSettings {
    public static final LynxDowngradeSettings INSTANCE = new LynxDowngradeSettings();

    @Group(isDefault = true, value = "default group")
    public static final DowngradeSettings DEFAULT = new DowngradeSettings();

    public final DowngradeSettings getValue() {
        DowngradeSettings downgradeSettings = (DowngradeSettings) SettingsManager.INSTANCE.getValueSafely(LynxDowngradeSettings.class);
        if (downgradeSettings == null) {
            return DEFAULT;
        }
        return downgradeSettings;
    }

    public final DowngradeSettings getDEFAULT() {
        return DEFAULT;
    }
}
