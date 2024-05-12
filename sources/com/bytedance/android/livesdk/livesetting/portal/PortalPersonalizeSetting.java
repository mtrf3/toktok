package com.bytedance.android.livesdk.livesetting.portal;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("portal_personalize_template")
/* loaded from: classes6.dex */
public final class PortalPersonalizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final PortalPersonalizeSetting INSTANCE = new PortalPersonalizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(PortalPersonalizeSetting.class);
    }
}
