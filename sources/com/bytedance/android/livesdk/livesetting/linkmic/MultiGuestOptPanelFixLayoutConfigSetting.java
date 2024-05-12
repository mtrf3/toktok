package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_opt_panel_fix_layout_config")
/* loaded from: classes6.dex */
public final class MultiGuestOptPanelFixLayoutConfigSetting {
    public static final MultiGuestOptPanelFixLayoutConfigSetting INSTANCE = new MultiGuestOptPanelFixLayoutConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiGuestOptPanelFixLayoutConfig DEFAULT = new MultiGuestOptPanelFixLayoutConfig(0, false, 3, null);

    public final MultiGuestOptPanelFixLayoutConfig getValue() {
        MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig = (MultiGuestOptPanelFixLayoutConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestOptPanelFixLayoutConfigSetting.class);
        if (multiGuestOptPanelFixLayoutConfig == null) {
            return DEFAULT;
        }
        return multiGuestOptPanelFixLayoutConfig;
    }
}
