package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_exchange_entrance_schema")
/* loaded from: classes6.dex */
public final class LiveExchangeEntranceSchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveExchangeEntranceSchema INSTANCE = new LiveExchangeEntranceSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveExchangeEntranceSchema.class);
    }
}
