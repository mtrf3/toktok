package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_force_upload_video_image")
/* loaded from: classes6.dex */
public final class LiveBroadcastForceUploadVideoImageSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBroadcastForceUploadVideoImageSetting INSTANCE = new LiveBroadcastForceUploadVideoImageSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastForceUploadVideoImageSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
