package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_caption_delay_time")
/* loaded from: classes6.dex */
public final class LiveCaptionDelayTime {
    public static final LiveCaptionDelayTime INSTANCE = new LiveCaptionDelayTime();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 500;

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveCaptionDelayTime.class);
    }
}
