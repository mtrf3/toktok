package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_image_cache_verify_enable")
/* loaded from: classes6.dex */
public final class GiftImageCacheExpVerifySetting {

    @Group(isDefault = true, value = "Default value (disabled)")
    public static final boolean DEFAULT = false;
    public static final GiftImageCacheExpVerifySetting INSTANCE = new GiftImageCacheExpVerifySetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(GiftImageCacheExpVerifySetting.class);
    }
}
