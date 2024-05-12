package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_app_in_auditing")
/* loaded from: classes11.dex */
public final class LiveWebRechargeAuditing {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveWebRechargeAuditing INSTANCE = new LiveWebRechargeAuditing();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWebRechargeAuditing.class);
    }
}
