package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_free_gift_send")
/* loaded from: classes6.dex */
public final class LiveFreeGiftSendSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveFreeGiftSendSetting INSTANCE = new LiveFreeGiftSendSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFreeGiftSendSetting.class);
    }
}
