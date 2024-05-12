package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_component_disappear_enable")
/* loaded from: classes6.dex */
public final class LiveMatchComponentDisappearEnableSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMatchComponentDisappearEnableSettings INSTANCE = new LiveMatchComponentDisappearEnableSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchComponentDisappearEnableSettings.class);
    }
}
