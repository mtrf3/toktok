package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_recharge_vip_entrance")
/* loaded from: classes14.dex */
public final class LiveRechargeVipEntranceSetting {
    public static final LiveRechargeVipEntranceSetting INSTANCE = new LiveRechargeVipEntranceSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {"gift", "click", "shortcut_gift", "first_recharge", "redpacket", "archor_exchange", "ug_content", "subscribe"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveRechargeVipEntranceSetting.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
