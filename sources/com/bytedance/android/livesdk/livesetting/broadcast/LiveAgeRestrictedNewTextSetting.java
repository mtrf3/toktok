package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_room_age_restriction_copy_type")
/* loaded from: classes6.dex */
public final class LiveAgeRestrictedNewTextSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAgeRestrictedNewTextSetting INSTANCE = new LiveAgeRestrictedNewTextSetting();

    public final boolean useNewText() {
        if (SettingsManager.INSTANCE.getIntValue(LiveAgeRestrictedNewTextSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
