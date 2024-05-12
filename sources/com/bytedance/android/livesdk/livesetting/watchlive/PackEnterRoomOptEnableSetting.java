package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("pack_enter_room_opt_enable")
/* loaded from: classes6.dex */
public final class PackEnterRoomOptEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PackEnterRoomOptEnableSetting INSTANCE = new PackEnterRoomOptEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(PackEnterRoomOptEnableSetting.class);
    }
}
