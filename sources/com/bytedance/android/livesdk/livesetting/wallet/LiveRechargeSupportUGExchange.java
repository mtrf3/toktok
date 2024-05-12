package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_recharge_support_ug_exchange")
/* loaded from: classes6.dex */
public final class LiveRechargeSupportUGExchange {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveRechargeSupportUGExchange INSTANCE = new LiveRechargeSupportUGExchange();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRechargeSupportUGExchange.class);
    }
}
