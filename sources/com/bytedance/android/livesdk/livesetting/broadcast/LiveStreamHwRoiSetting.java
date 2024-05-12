package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_hw_roi")
/* loaded from: classes6.dex */
public final class LiveStreamHwRoiSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveStreamHwRoiSetting INSTANCE = new LiveStreamHwRoiSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveStreamHwRoiSetting.class);
    }
}
