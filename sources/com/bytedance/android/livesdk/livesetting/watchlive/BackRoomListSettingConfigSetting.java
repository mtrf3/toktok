package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.backroom.BackRoomListSettingConfig;

@SettingsKey("back_room_list_setting_config")
/* loaded from: classes6.dex */
public final class BackRoomListSettingConfigSetting {
    public static final BackRoomListSettingConfigSetting INSTANCE = new BackRoomListSettingConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final BackRoomListSettingConfig DEFAULT = new BackRoomListSettingConfig(null, null, null);

    public final BackRoomListSettingConfig getValue() {
        BackRoomListSettingConfig backRoomListSettingConfig = (BackRoomListSettingConfig) SettingsManager.INSTANCE.getValueSafely(BackRoomListSettingConfigSetting.class);
        if (backRoomListSettingConfig == null) {
            return DEFAULT;
        }
        return backRoomListSettingConfig;
    }

    public final BackRoomListSettingConfig getDEFAULT() {
        return DEFAULT;
    }
}
