package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_jsb_with_namespace_android")
/* loaded from: classes6.dex */
public final class LiveSparkJsbWithNamespaceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSparkJsbWithNamespaceSetting INSTANCE = new LiveSparkJsbWithNamespaceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSparkJsbWithNamespaceSetting.class);
    }
}
