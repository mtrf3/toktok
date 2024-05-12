package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_fe_schema")
/* loaded from: classes6.dex */
public final class MultiGuestFeSchemaConfigSetting {
    public static final MultiGuestFeSchemaConfigSetting INSTANCE = new MultiGuestFeSchemaConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiGuestFeSchemaConfig DEFAULT = new MultiGuestFeSchemaConfig(null, null, 3, null);

    public final MultiGuestFeSchemaConfig getValue() {
        MultiGuestFeSchemaConfig multiGuestFeSchemaConfig = (MultiGuestFeSchemaConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestFeSchemaConfigSetting.class);
        if (multiGuestFeSchemaConfig == null) {
            return DEFAULT;
        }
        return multiGuestFeSchemaConfig;
    }
}
