package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_component_disappear_check_duration")
/* loaded from: classes6.dex */
public final class LiveMatchComponentDisappearCheckDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;
    public static final LiveMatchComponentDisappearCheckDurationSetting INSTANCE = new LiveMatchComponentDisappearCheckDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMatchComponentDisappearCheckDurationSetting.class);
    }
}
