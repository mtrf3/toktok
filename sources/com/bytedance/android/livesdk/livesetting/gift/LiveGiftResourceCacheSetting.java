package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_resource_download_cache_duration")
/* loaded from: classes6.dex */
public final class LiveGiftResourceCacheSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 0;
    public static final LiveGiftResourceCacheSetting INSTANCE = new LiveGiftResourceCacheSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveGiftResourceCacheSetting.class);
    }
}
