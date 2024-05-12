package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_effective_items_log")
/* loaded from: classes6.dex */
public final class LivePublicScreenEffectiveItemsLogSetting {
    public static final LivePublicScreenEffectiveItemsLogSetting INSTANCE = new LivePublicScreenEffectiveItemsLogSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePublicScreenEffectiveItemsLogSetting.class);
    }
}
