package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("add_sync_lock")
/* loaded from: classes6.dex */
public final class AddSyncLockSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final AddSyncLockSetting INSTANCE = new AddSyncLockSetting();

    @Group("v2")
    public static final boolean V2 = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(AddSyncLockSetting.class);
    }
}
