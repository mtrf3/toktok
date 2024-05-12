package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_paid_event_recharge_page")
/* loaded from: classes6.dex */
public final class LivePaidEventSchema {

    @Group(isDefault = true, value = "default")
    public static final String DEFAULT = "";
    public static final LivePaidEventSchema INSTANCE = new LivePaidEventSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePaidEventSchema.class);
    }
}
