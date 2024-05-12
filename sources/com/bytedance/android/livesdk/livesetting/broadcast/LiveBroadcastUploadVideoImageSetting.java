package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_upload_video_image")
/* loaded from: classes6.dex */
public final class LiveBroadcastUploadVideoImageSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBroadcastUploadVideoImageSetting INSTANCE = new LiveBroadcastUploadVideoImageSetting();

    public final boolean isDisable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastUploadVideoImageSetting.class) == 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastUploadVideoImageSetting.class) == 1) {
            return true;
        }
        return false;
    }
}