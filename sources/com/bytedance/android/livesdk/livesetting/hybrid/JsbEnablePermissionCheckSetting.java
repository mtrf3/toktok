package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("jsb_enable_permission_check")
/* loaded from: classes6.dex */
public final class JsbEnablePermissionCheckSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final JsbEnablePermissionCheckSetting INSTANCE = new JsbEnablePermissionCheckSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(JsbEnablePermissionCheckSetting.class);
    }
}
