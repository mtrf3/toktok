package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_karaoke_echo_allow_list")
/* loaded from: classes6.dex */
public final class LiveKaraokeEchoAllowListSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveKaraokeEchoAllowListSetting INSTANCE = new LiveKaraokeEchoAllowListSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveKaraokeEchoAllowListSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
