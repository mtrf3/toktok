package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_effect_shortcut_panel_effect_count")
/* loaded from: classes6.dex */
public final class LiveEffectShortcutPanelEffectCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final LiveEffectShortcutPanelEffectCountSetting INSTANCE = new LiveEffectShortcutPanelEffectCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEffectShortcutPanelEffectCountSetting.class);
    }
}
