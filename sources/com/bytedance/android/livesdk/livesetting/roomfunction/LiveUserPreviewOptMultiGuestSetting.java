package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_preview_opt_multi_guest")
/* loaded from: classes6.dex */
public final class LiveUserPreviewOptMultiGuestSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveUserPreviewOptMultiGuestSetting INSTANCE = new LiveUserPreviewOptMultiGuestSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUserPreviewOptMultiGuestSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
