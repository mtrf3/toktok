package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_player_layout_should_fill")
/* loaded from: classes6.dex */
public final class LivePlayerLayoutShouldFillSetting {
    public static final LivePlayerLayoutShouldFillSetting INSTANCE = new LivePlayerLayoutShouldFillSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LivePlayerLayoutShouldFillSetting.class);
    }
}
