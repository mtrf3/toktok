package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_new_academy")
/* loaded from: classes6.dex */
public final class LiveCenterNewAcademySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCenterNewAcademySetting INSTANCE = new LiveCenterNewAcademySetting();

    public final boolean isNewAcademy() {
        if (SettingsManager.INSTANCE.getIntValue(LiveCenterNewAcademySetting.class) != 0) {
            return true;
        }
        return false;
    }
}
