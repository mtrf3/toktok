package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_prefetch_gift_image")
/* loaded from: classes6.dex */
public final class LivePrefetchGiftImageSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePrefetchGiftImageSetting INSTANCE = new LivePrefetchGiftImageSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePrefetchGiftImageSetting.class);
    }
}
