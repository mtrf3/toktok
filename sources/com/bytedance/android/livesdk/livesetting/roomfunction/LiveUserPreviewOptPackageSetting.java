package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_preview_opt_package")
/* loaded from: classes6.dex */
public final class LiveUserPreviewOptPackageSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveUserPreviewOptPackageSetting INSTANCE = new LiveUserPreviewOptPackageSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUserPreviewOptPackageSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
