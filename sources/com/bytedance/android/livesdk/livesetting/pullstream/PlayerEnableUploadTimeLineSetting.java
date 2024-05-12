package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("player_enable_upload_time_line")
/* loaded from: classes6.dex */
public final class PlayerEnableUploadTimeLineSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PlayerEnableUploadTimeLineSetting INSTANCE = new PlayerEnableUploadTimeLineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PlayerEnableUploadTimeLineSetting.class);
    }
}
