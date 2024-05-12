package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_normal_gift_and_barrage_self_firstly")
/* loaded from: classes6.dex */
public final class LiveEnableNormalGiftAndBarrageSelfFirstlySetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableNormalGiftAndBarrageSelfFirstlySetting INSTANCE = new LiveEnableNormalGiftAndBarrageSelfFirstlySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableNormalGiftAndBarrageSelfFirstlySetting.class);
    }
}