package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_upload_video_image_compress_rate")
/* loaded from: classes6.dex */
public final class LiveBroadcastUploadVideoImageCompressRateSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 0.4f;
    public static final LiveBroadcastUploadVideoImageCompressRateSetting INSTANCE = new LiveBroadcastUploadVideoImageCompressRateSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveBroadcastUploadVideoImageCompressRateSetting.class);
    }
}
