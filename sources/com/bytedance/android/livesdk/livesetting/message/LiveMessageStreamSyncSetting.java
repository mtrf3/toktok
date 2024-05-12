package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_stream_sync")
/* loaded from: classes6.dex */
public final class LiveMessageStreamSyncSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMessageStreamSyncSetting INSTANCE = new LiveMessageStreamSyncSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessageStreamSyncSetting.class);
    }
}
