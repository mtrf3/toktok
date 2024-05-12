package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gamelive_dual_device_qrcode_schema")
/* loaded from: classes6.dex */
public final class GameDualDeviceSchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final GameDualDeviceSchema INSTANCE = new GameDualDeviceSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(GameDualDeviceSchema.class);
    }
}
