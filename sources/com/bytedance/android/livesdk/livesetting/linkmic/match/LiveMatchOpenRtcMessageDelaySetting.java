package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("match_open_rtc_msg_delay")
/* loaded from: classes6.dex */
public final class LiveMatchOpenRtcMessageDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;
    public static final LiveMatchOpenRtcMessageDelaySetting INSTANCE = new LiveMatchOpenRtcMessageDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveMatchOpenRtcMessageDelaySetting.class);
    }
}
