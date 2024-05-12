package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LoginGuideConfig;

@SettingsKey("login_guide_config")
/* loaded from: classes11.dex */
public final class LoginGuideConfigSetting {
    public static final LoginGuideConfigSetting INSTANCE = new LoginGuideConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LoginGuideConfig DEFAULT = new LoginGuideConfig();

    public final LoginGuideConfig getValue() {
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) SettingsManager.INSTANCE.getValueSafely(LoginGuideConfigSetting.class);
        if (loginGuideConfig == null) {
            return DEFAULT;
        }
        return loginGuideConfig;
    }
}
