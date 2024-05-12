package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_replay_faq")
/* loaded from: classes6.dex */
public final class LiveReplayFaqSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveReplayFaqSetting INSTANCE = new LiveReplayFaqSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveReplayFaqSetting.class);
    }
}
