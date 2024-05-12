package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_upload_video_image_interval")
/* loaded from: classes6.dex */
public final class LiveBroadcastUploadVideoImageIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 2;
    public static final LiveBroadcastUploadVideoImageIntervalSetting INSTANCE = new LiveBroadcastUploadVideoImageIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveBroadcastUploadVideoImageIntervalSetting.class);
    }
}
