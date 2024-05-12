package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_cohost_forward_room_timestamp_check_enabled")
/* loaded from: classes6.dex */
public final class MtCohostForwardRoomsTimestampCheckSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MtCohostForwardRoomsTimestampCheckSetting INSTANCE = new MtCohostForwardRoomsTimestampCheckSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MtCohostForwardRoomsTimestampCheckSetting.class);
    }
}
