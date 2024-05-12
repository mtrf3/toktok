package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_preview_commerce_tag")
/* loaded from: classes6.dex */
public final class LiveForYouPageCommerceTagSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveForYouPageCommerceTagSetting INSTANCE = new LiveForYouPageCommerceTagSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveForYouPageCommerceTagSetting.class);
    }
}
