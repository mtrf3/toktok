package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gurd_channels")
/* loaded from: classes6.dex */
public final class LiveGurdChannelsSetting {
    public static final LiveGurdChannelsSetting INSTANCE = new LiveGurdChannelsSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {"webcast_activity", "webcast_mt", "tiktok_live_lynx"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveGurdChannelsSetting.class);
    }
}
