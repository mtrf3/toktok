package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("error_code_for_frontend")
/* loaded from: classes6.dex */
public final class ErrorCodeForFrontendSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final ErrorCodeForFrontendSetting INSTANCE = new ErrorCodeForFrontendSetting();

    public final int passErrorCode() {
        return SettingsManager.INSTANCE.getIntValue(ErrorCodeForFrontendSetting.class);
    }
}
