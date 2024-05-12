package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_permission_apply_lynx_url")
/* loaded from: classes6.dex */
public final class LivePermissionApplyLynx {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LivePermissionApplyLynx INSTANCE = new LivePermissionApplyLynx();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePermissionApplyLynx.class);
    }
}
