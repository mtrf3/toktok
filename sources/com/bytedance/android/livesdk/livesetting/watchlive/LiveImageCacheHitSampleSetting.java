package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("image_cache_hit_sample")
/* loaded from: classes6.dex */
public final class LiveImageCacheHitSampleSetting {
    public static final LiveImageCacheHitSampleSetting INSTANCE = new LiveImageCacheHitSampleSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveImageCacheHitSampleSetting.class);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
