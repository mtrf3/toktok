package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fast_gift_icon_hide")
/* loaded from: classes6.dex */
public final class LiveFastGiftIconHideSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFastGiftIconHideSetting INSTANCE = new LiveFastGiftIconHideSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFastGiftIconHideSetting.class);
    }
}
