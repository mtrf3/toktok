package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_tax_flow_popup_url")
/* loaded from: classes6.dex */
public final class LiveExchangeTaxSchemaSetting {
    public static final LiveExchangeTaxSchemaSetting INSTANCE = new LiveExchangeTaxSchemaSetting();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_webview_popup?url=https%3A%2F%2Fwww.tiktok.com%2Fweb-inapp%2Fincome-wallet%2Ftax-flow%3Fbusiness_type%3DCOIN_EXCHANGE_US&use_spark=1&height=70%25&drag_height_percent=90&show_mask=1&drag_by_gesture=1&popup_enter_type=bottom&mask_color=00000055&loading_bg_color=FFFFFF";

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue(LiveExchangeTaxSchemaSetting.class);
        if (stringValue == null) {
            return DEFAULT;
        }
        return stringValue;
    }

    public final String getTaxUrlForClient() {
        return getValue();
    }
}
