package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("news_account_gift")
/* loaded from: classes6.dex */
public final class NewsAccountGiftSettings {

    @Group(isDefault = true, value = "Default value, disabled")
    public static final boolean DEFAULT = false;
    public static final NewsAccountGiftSettings INSTANCE = new NewsAccountGiftSettings();

    public static final boolean isFeatureEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(NewsAccountGiftSettings.class);
    }
}
