package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_scroll_angle")
/* loaded from: classes6.dex */
public final class LiveScrollAngleSetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final LiveScrollAngleSetting INSTANCE = new LiveScrollAngleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveScrollAngleSetting.class);
    }
}
