package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_check_directionality_count")
/* loaded from: classes6.dex */
public final class LivePublicScreenCheckDirectionalityCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 20;
    public static final LivePublicScreenCheckDirectionalityCountSetting INSTANCE = new LivePublicScreenCheckDirectionalityCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePublicScreenCheckDirectionalityCountSetting.class);
    }
}
