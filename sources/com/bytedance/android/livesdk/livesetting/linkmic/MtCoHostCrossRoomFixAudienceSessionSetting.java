package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_cross_room_fix_audience_session_enable")
/* loaded from: classes6.dex */
public final class MtCoHostCrossRoomFixAudienceSessionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MtCoHostCrossRoomFixAudienceSessionSetting INSTANCE = new MtCoHostCrossRoomFixAudienceSessionSetting();

    public static final boolean isEnable() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostCrossRoomFixAudienceSessionSetting.class);
    }
}
