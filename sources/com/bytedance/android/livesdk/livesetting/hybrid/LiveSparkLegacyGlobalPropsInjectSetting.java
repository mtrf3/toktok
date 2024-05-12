package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_legacy_global_props_inject")
/* loaded from: classes6.dex */
public final class LiveSparkLegacyGlobalPropsInjectSetting {
    public static final LiveSparkLegacyGlobalPropsInjectSetting INSTANCE = new LiveSparkLegacyGlobalPropsInjectSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {""};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveSparkLegacyGlobalPropsInjectSetting.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
