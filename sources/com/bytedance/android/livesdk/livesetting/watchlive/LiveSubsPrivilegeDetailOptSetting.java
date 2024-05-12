package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subs_privilege_detail_optimize")
/* loaded from: classes6.dex */
public final class LiveSubsPrivilegeDetailOptSetting {
    public static final LiveSubsPrivilegeDetailOptSetting INSTANCE = new LiveSubsPrivilegeDetailOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveSubsPrivilegeDetailOptConfig DEFAULT = new LiveSubsPrivilegeDetailOptConfig(false, null, null, null, false, 0, false, 127, null);

    public final LiveSubsPrivilegeDetailOptConfig getValue() {
        LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig = (LiveSubsPrivilegeDetailOptConfig) SettingsManager.INSTANCE.getValueSafely(LiveSubsPrivilegeDetailOptSetting.class);
        if (liveSubsPrivilegeDetailOptConfig == null) {
            return DEFAULT;
        }
        return liveSubsPrivilegeDetailOptConfig;
    }
}
