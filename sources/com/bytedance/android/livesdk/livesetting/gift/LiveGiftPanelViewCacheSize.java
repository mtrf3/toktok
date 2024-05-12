package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_panel_view_cache_size")
/* loaded from: classes6.dex */
public final class LiveGiftPanelViewCacheSize {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftPanelViewCacheSize INSTANCE = new LiveGiftPanelViewCacheSize();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftPanelViewCacheSize.class);
    }
}
