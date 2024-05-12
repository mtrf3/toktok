package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_max_retain_alog_message_size")
/* loaded from: classes6.dex */
public final class LiveMaxRetainAlogMessageSizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 500;
    public static final LiveMaxRetainAlogMessageSizeSetting INSTANCE = new LiveMaxRetainAlogMessageSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMaxRetainAlogMessageSizeSetting.class);
    }
}
