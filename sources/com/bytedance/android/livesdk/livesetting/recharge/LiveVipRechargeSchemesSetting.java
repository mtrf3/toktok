package com.bytedance.android.livesdk.livesetting.recharge;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("live_vip_recharge_schemes")
/* loaded from: classes6.dex */
public final class LiveVipRechargeSchemesSetting {
    public static final LiveVipRechargeSchemesSetting INSTANCE = new LiveVipRechargeSchemesSetting();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, String> DEFAULT = C113554cx.LJJJLZIJ(new OSZ("live_room", "sslocal://webcast_lynxview_popup?height=70%25&radius=16rpx&show_mask=1&use_spark=1&variable_height=90%25&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wallet%2Fwallet%2Fpages%2Fvip_recharge.js&container_bg_color=%2300000000&gravity=bottom"), new OSZ("balance", "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wallet%2Fwallet%2Fpages%2Fvip_recharge.js&hide_nav_bar=1&status_font_mode=light&trans_status_bar=1&use_spark=1"));

    public final Map<String, String> getValue() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveVipRechargeSchemesSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final String getLiveRoomUrl() {
        return getValue().get("live_room");
    }
}
