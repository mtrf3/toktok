package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_capture_video_record_duration")
/* loaded from: classes6.dex */
public final class LiveCaptureVideoRecordDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 0.0f;
    public static final LiveCaptureVideoRecordDurationSetting INSTANCE = new LiveCaptureVideoRecordDurationSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveCaptureVideoRecordDurationSetting.class);
    }
}
