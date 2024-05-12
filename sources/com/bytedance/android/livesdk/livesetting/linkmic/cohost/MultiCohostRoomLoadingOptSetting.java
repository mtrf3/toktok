package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_audience_enter_room_layout_sei_optz")
/* loaded from: classes6.dex */
public final class MultiCohostRoomLoadingOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiCohostRoomLoadingOptSetting INSTANCE = new MultiCohostRoomLoadingOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiCohostRoomLoadingOptSetting.class);
    }
}
