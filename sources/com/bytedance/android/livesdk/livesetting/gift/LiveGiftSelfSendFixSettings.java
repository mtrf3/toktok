package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_self_send_fix")
/* loaded from: classes11.dex */
public final class LiveGiftSelfSendFixSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveGiftSelfSendFixSettings INSTANCE = new LiveGiftSelfSendFixSettings();

    public final boolean getValue() {
        try {
            return SettingsManager.INSTANCE.getBooleanValue(LiveGiftSelfSendFixSettings.class);
        } catch (Throwable unused) {
            return true;
        }
    }
}
