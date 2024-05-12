package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_upload_video_image_width")
/* loaded from: classes6.dex */
public final class LiveBroadcastUploadVideoImageWidthSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 360;
    public static final LiveBroadcastUploadVideoImageWidthSetting INSTANCE = new LiveBroadcastUploadVideoImageWidthSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastUploadVideoImageWidthSetting.class);
    }
}
