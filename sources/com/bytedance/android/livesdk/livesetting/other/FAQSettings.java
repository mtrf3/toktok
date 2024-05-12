package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscribe_need_show_faq")
/* loaded from: classes6.dex */
public final class FAQSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FAQSettings INSTANCE = new FAQSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FAQSettings.class);
    }
}
