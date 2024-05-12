package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("battle_clickable_switch")
/* loaded from: classes11.dex */
public final class LiveMatchTrackRepeatReportAvoidSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMatchTrackRepeatReportAvoidSetting INSTANCE = new LiveMatchTrackRepeatReportAvoidSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchTrackRepeatReportAvoidSetting.class);
    }
}
