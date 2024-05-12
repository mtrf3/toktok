package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_enable_url_list")
/* loaded from: classes6.dex */
public final class LiveStreamEnableUrlListSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveStreamEnableUrlListSetting INSTANCE = new LiveStreamEnableUrlListSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveStreamEnableUrlListSetting.class);
    }
}
