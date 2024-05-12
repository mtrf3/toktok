package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_upload_video_image_height")
/* loaded from: classes6.dex */
public final class LiveBroadcastUploadVideoImageHeightSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 640;
    public static final LiveBroadcastUploadVideoImageHeightSetting INSTANCE = new LiveBroadcastUploadVideoImageHeightSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastUploadVideoImageHeightSetting.class);
    }
}
