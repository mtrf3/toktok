package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_linkmic_video_e2e_frame_interval")
/* loaded from: classes6.dex */
public final class BroadcastVideoE2EDelaySampleSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 50;
    public static final BroadcastVideoE2EDelaySampleSetting INSTANCE = new BroadcastVideoE2EDelaySampleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(BroadcastVideoE2EDelaySampleSetting.class);
    }
}
