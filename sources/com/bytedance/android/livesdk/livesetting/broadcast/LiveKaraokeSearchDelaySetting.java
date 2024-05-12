package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_host_karaok_search_delay_ms")
/* loaded from: classes6.dex */
public final class LiveKaraokeSearchDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 300;
    public static final LiveKaraokeSearchDelaySetting INSTANCE = new LiveKaraokeSearchDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveKaraokeSearchDelaySetting.class);
    }
}
