package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_welcome_pack_shortcut_animation_delay")
/* loaded from: classes6.dex */
public final class LiveWelcomePackShortcutAnimationDelay {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 7;
    public static final LiveWelcomePackShortcutAnimationDelay INSTANCE = new LiveWelcomePackShortcutAnimationDelay();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveWelcomePackShortcutAnimationDelay.class);
    }
}
