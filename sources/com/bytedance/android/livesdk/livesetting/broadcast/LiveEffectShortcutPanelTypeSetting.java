package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_effect_shortcut_panel_type")
/* loaded from: classes6.dex */
public final class LiveEffectShortcutPanelTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEffectShortcutPanelTypeSetting INSTANCE = new LiveEffectShortcutPanelTypeSetting();

    @Group("open full panel, show shortcut panel after close full panel")
    public static final int V1 = 1;

    @Group("open shortcut panel, hide shortcut panel after close full panel")
    public static final int V2 = 2;

    @Group("open shortcut panel, show shortcut panel after close full panel")
    public static final int V3 = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEffectShortcutPanelTypeSetting.class);
    }

    public final boolean canShowShortCutPanelWhenClickEntrance() {
        if (getValue() >= 2) {
            return true;
        }
        return false;
    }

    public final boolean canShowShortCutPanelWhenCloseFullPanel() {
        if (getValue() % 2 == 1) {
            return true;
        }
        return false;
    }
}
