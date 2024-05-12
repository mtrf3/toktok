package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_anim_opt")
/* loaded from: classes6.dex */
public final class LivePublicScreenAnimOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenAnimOptSetting INSTANCE = new LivePublicScreenAnimOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenAnimOptSetting.class);
    }
}
