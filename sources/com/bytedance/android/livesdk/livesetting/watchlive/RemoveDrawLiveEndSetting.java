package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("remove_draw_live_end")
/* loaded from: classes6.dex */
public final class RemoveDrawLiveEndSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final RemoveDrawLiveEndSetting INSTANCE = new RemoveDrawLiveEndSetting();

    @Group("v1")
    public static final int enableValue = 1;

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getIntValue(RemoveDrawLiveEndSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
