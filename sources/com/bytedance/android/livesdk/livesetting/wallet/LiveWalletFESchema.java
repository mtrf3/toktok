package com.bytedance.android.livesdk.livesetting.wallet;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("live_wallet_schema")
/* loaded from: classes11.dex */
public final class LiveWalletFESchema {
    public static final LiveWalletFESchema INSTANCE = new LiveWalletFESchema();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, String> DEFAULT = C113554cx.LJJJLZIJ(new OSZ("cashback_info", "sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fwallet-recharge%2Fcashback-info&container_bg_color=00000000&show_mask=1&mask_bg_color=00000080&loading_bg_color=00000000"), new OSZ("recharge_payment_success", "sslocal://webcast_lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wallet%2Fwallet%2Fpages%2Frecharge%2Fpayment_success.js&hide_nav_bar=1&gravity=bottom&type=popup&show_mask=1&mask_bg_color=00000080&self_adaptive_height=1&radius=12"), new OSZ("exchange_retention_popup", "sslocal://webcast_lynxview_popup?url=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_revenue/revenue/pages/exchange/exchange_retention_popup.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&container_bg_color=ffffff00"));

    public final Map<String, String> getValue() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveWalletFESchema.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final String getCashbackInfo() {
        String str = getValue().get("cashback_info");
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getRechargePaymentSuccess() {
        String str = getValue().get("recharge_payment_success");
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getRetentionPopupSchema() {
        String str = getValue().get("exchange_retention_popup");
        if (str == null) {
            return "";
        }
        return str;
    }
}
