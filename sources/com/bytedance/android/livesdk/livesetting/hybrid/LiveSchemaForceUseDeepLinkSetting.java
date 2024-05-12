package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_schema_force_use_deep_link_list_android")
/* loaded from: classes6.dex */
public final class LiveSchemaForceUseDeepLinkSetting {
    public static final LiveSchemaForceUseDeepLinkSetting INSTANCE = new LiveSchemaForceUseDeepLinkSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveSchemaForceUseDeepLinkSetting.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
