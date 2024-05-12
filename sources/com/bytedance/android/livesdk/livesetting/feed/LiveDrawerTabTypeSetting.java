package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_drawer_tab_type")
/* loaded from: classes6.dex */
public final class LiveDrawerTabTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveDrawerTabTypeSetting INSTANCE = new LiveDrawerTabTypeSetting();

    @Group("v1")
    public static final int TAB = 1;

    @Group("v2")
    public static final int TAB_LANDING = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveDrawerTabTypeSetting.class);
    }
}
