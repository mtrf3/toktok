package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sticker_gift_timeout_duration")
/* loaded from: classes6.dex */
public final class StickerGiftTimeoutSettings {
    public static final StickerGiftTimeoutSettings INSTANCE = new StickerGiftTimeoutSettings();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 30000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(StickerGiftTimeoutSettings.class);
    }
}
