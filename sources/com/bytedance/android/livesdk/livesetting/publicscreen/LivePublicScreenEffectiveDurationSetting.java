package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_effective_duration")
/* loaded from: classes6.dex */
public final class LivePublicScreenEffectiveDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 724;
    public static final LivePublicScreenEffectiveDurationSetting INSTANCE = new LivePublicScreenEffectiveDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LivePublicScreenEffectiveDurationSetting.class);
    }
}
