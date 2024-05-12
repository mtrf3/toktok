package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_fix_error_ua")
/* loaded from: classes6.dex */
public final class LiveSparkFixErrorUASetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSparkFixErrorUASetting INSTANCE = new LiveSparkFixErrorUASetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSparkFixErrorUASetting.class);
    }
}
