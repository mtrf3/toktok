package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_fix_public_screen_shake")
/* loaded from: classes6.dex */
public final class LiveFixPublicScreenShakeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveFixPublicScreenShakeSetting INSTANCE = new LiveFixPublicScreenShakeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFixPublicScreenShakeSetting.class);
    }
}
