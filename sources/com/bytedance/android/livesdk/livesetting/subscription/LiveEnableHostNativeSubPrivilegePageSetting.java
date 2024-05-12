package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_host_native_sub_privilege_page")
/* loaded from: classes6.dex */
public final class LiveEnableHostNativeSubPrivilegePageSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableHostNativeSubPrivilegePageSetting INSTANCE = new LiveEnableHostNativeSubPrivilegePageSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableHostNativeSubPrivilegePageSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
