package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_nudge_url")
/* loaded from: classes6.dex */
public final class LiveNudgeUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveNudgeUrlSetting INSTANCE = new LiveNudgeUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveNudgeUrlSetting.class);
    }
}
