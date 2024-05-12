package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttls_video_encode_lock_optimize")
/* loaded from: classes6.dex */
public final class TTLSVideoEncodeLockOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TTLSVideoEncodeLockOptimizeSetting INSTANCE = new TTLSVideoEncodeLockOptimizeSetting();

    public final boolean enableVideoEncodeLockOptimize() {
        if (SettingsManager.INSTANCE.getIntValue(TTLSVideoEncodeLockOptimizeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
