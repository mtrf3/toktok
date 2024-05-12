package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_enable_kotlin")
/* loaded from: classes6.dex */
public final class LiveGiftEnableKotlin {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftEnableKotlin INSTANCE = new LiveGiftEnableKotlin();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftEnableKotlin.class);
    }
}
