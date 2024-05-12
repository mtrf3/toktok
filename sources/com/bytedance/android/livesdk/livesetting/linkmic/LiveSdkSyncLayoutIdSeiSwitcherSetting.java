package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_sync_layout_id_sei_switcher")
/* loaded from: classes6.dex */
public final class LiveSdkSyncLayoutIdSeiSwitcherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkSyncLayoutIdSeiSwitcherSetting INSTANCE = new LiveSdkSyncLayoutIdSeiSwitcherSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkSyncLayoutIdSeiSwitcherSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
