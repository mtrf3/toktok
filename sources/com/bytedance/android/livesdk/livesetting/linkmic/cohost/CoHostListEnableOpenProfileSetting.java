package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_list_open_profile")
/* loaded from: classes6.dex */
public final class CoHostListEnableOpenProfileSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final CoHostListEnableOpenProfileSetting INSTANCE = new CoHostListEnableOpenProfileSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostListEnableOpenProfileSetting.class);
    }
}
