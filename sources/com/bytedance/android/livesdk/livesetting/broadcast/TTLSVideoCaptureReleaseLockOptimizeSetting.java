package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttls_video_capture_release_lock_optimize")
/* loaded from: classes6.dex */
public final class TTLSVideoCaptureReleaseLockOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TTLSVideoCaptureReleaseLockOptimizeSetting INSTANCE = new TTLSVideoCaptureReleaseLockOptimizeSetting();

    public final boolean enableVideoCaptureReleaseLockOptimize() {
        if (SettingsManager.INSTANCE.getIntValue(TTLSVideoCaptureReleaseLockOptimizeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
