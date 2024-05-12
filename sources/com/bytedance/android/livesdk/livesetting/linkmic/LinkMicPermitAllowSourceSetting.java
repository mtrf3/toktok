package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_permit_allow_source")
/* loaded from: classes6.dex */
public final class LinkMicPermitAllowSourceSetting {
    public static final LinkMicPermitAllowSourceSetting INSTANCE = new LinkMicPermitAllowSourceSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public static final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LinkMicPermitAllowSourceSetting.class);
    }
}
