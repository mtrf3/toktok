package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("livecore_error_code_for_frontend")
/* loaded from: classes6.dex */
public final class LiveCoreErrorCodeForFrontendSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoreErrorCodeForFrontendSetting INSTANCE = new LiveCoreErrorCodeForFrontendSetting();

    public final int passLiveCoreErrorCode() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoreErrorCodeForFrontendSetting.class);
    }
}
