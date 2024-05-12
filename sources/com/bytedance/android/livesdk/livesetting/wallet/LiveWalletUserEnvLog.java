package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_user_google_env_check")
/* loaded from: classes6.dex */
public final class LiveWalletUserEnvLog {
    public static final LiveWalletUserEnvLog INSTANCE = new LiveWalletUserEnvLog();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWalletUserEnvLog.class);
    }
}
