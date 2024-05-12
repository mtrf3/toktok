package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_blur_effect_bg_opt")
/* loaded from: classes6.dex */
public final class LiveServerGiveGaussianBackground {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final LiveServerGiveGaussianBackground INSTANCE = new LiveServerGiveGaussianBackground();

    @Group("v1")
    public static final int ONLINE = 0;

    @Group("v2")
    public static final int SERVER_GIVE_GAUSSIAN = 1;

    @Group("v3")
    public static final int SERVER_GIVE_GAUSSIAN2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveServerGiveGaussianBackground.class);
    }
}
