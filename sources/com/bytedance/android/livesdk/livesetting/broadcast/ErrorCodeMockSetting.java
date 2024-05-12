package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("error_code_for_mock")
/* loaded from: classes6.dex */
public final class ErrorCodeMockSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final ErrorCodeMockSetting INSTANCE = new ErrorCodeMockSetting();

    public final boolean enableErrorCodeMock() {
        if (SettingsManager.INSTANCE.getIntValue(ErrorCodeMockSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
