package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_list_ack_enable")
/* loaded from: classes6.dex */
public final class LiveGiftSendGiftListAckSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftSendGiftListAckSettings INSTANCE = new LiveGiftSendGiftListAckSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftSendGiftListAckSettings.class);
    }
}
