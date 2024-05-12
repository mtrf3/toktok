package com.bytedance.android.livesdk.livesetting.wallet;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("recharge_email_binding_url")
/* loaded from: classes6.dex */
public final class LiveRechargeEmailBindingSchemaSetting {
    public static final LiveRechargeEmailBindingSchemaSetting INSTANCE = new LiveRechargeEmailBindingSchemaSetting();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, String> DEFAULT = C113554cx.LJJJLZIJ(new OSZ("email_collect_entry", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fauthorize%2Femail_collect_entry.js&loading_bg_color=ffffff&gravity=bottom&height=60%25&radius=8&show_mask=1&mask_bg_color=00000055&disable_outside_click_close=0&transition_animation=bottom"));

    public final Map<String, String> getValue() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveRechargeEmailBindingSchemaSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final String getEmailCollectUrl() {
        String str = getValue().get("email_collect_entry");
        if (str == null) {
            return "";
        }
        return str;
    }
}
