package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_bitrate_adapt")
/* loaded from: classes6.dex */
public final class LiveStreamBitrateAdaptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;
    public static final LiveStreamBitrateAdaptSetting INSTANCE = new LiveStreamBitrateAdaptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStreamBitrateAdaptSetting.class);
    }
}
