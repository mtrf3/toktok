package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_host_divider_conf")
/* loaded from: classes6.dex */
public final class MultiHostDividerSettings {
    public static final MultiHostDividerSettings INSTANCE = new MultiHostDividerSettings();

    @Group(isDefault = true, value = "default group")
    public static final MultiHostDividerSettingsConf DEFAULT = new MultiHostDividerSettingsConf(false, 1, null);

    public final MultiHostDividerSettingsConf getValue() {
        MultiHostDividerSettingsConf multiHostDividerSettingsConf = (MultiHostDividerSettingsConf) SettingsManager.INSTANCE.getValueSafely(MultiHostDividerSettings.class);
        if (multiHostDividerSettingsConf == null) {
            return DEFAULT;
        }
        return multiHostDividerSettingsConf;
    }
}
