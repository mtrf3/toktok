package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("link_injector_data_holder_opt")
/* loaded from: classes11.dex */
public final class LinkMicLinkInjectorOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkMicLinkInjectorOptSetting INSTANCE = new LinkMicLinkInjectorOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicLinkInjectorOptSetting.class);
    }

    public final boolean isOptLinkInjector() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
