package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_scm_label_page_url")
/* loaded from: classes6.dex */
public final class StateControlMediaLabelPageUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://www.tiktok.com/tns-inapp/pages/state-affiliated-media?show_nav_bar=1";
    public static final StateControlMediaLabelPageUrl INSTANCE = new StateControlMediaLabelPageUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(StateControlMediaLabelPageUrl.class);
    }
}
