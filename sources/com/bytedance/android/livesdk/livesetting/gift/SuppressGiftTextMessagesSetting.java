package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("suppress_gift_text_messages")
/* loaded from: classes6.dex */
public final class SuppressGiftTextMessagesSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SuppressGiftTextMessagesSetting INSTANCE = new SuppressGiftTextMessagesSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SuppressGiftTextMessagesSetting.class);
    }
}
