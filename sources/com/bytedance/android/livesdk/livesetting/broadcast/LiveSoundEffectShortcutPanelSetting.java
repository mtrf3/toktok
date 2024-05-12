package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sound_effect_shortcut_panel_default_open")
/* loaded from: classes6.dex */
public final class LiveSoundEffectShortcutPanelSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "default open")
    public static final int DEFAULT_OPEN = 1;
    public static final LiveSoundEffectShortcutPanelSetting INSTANCE = new LiveSoundEffectShortcutPanelSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveSoundEffectShortcutPanelSetting.class) != 0) {
            return true;
        }
        return false;
    }
}
