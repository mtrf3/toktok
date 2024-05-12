package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_sound_effect_new_panel_type")
/* loaded from: classes6.dex */
public final class LiveSoundEffectNewPanelTypeSetting {

    @Group(isDefault = true, value = "Default group")
    public static final int DEFAULT = 0;
    public static final LiveSoundEffectNewPanelTypeSetting INSTANCE = new LiveSoundEffectNewPanelTypeSetting();

    @Group("Group with more sound effects and reorder function")
    public static final int MORE_SFX_AND_REORDER = 2;

    @Group("Group with more sound effects only, no reorder function")
    public static final int MORE_SFX_ONLY = 1;

    public static final boolean useNewSoundEffectDialog() {
        if (INSTANCE.getValue() == 2) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSoundEffectNewPanelTypeSetting.class);
    }
}
