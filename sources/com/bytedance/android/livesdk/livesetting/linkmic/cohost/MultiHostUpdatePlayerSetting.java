package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_sdk_multihost_update_player_opt")
/* loaded from: classes6.dex */
public final class MultiHostUpdatePlayerSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiHostUpdatePlayerSetting INSTANCE = new MultiHostUpdatePlayerSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiHostUpdatePlayerSetting.class);
    }
}
