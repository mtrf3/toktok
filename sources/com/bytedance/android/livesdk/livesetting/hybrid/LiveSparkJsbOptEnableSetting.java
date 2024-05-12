package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;
import ujb.s;

@SettingsKey(preciseExperiment = false, value = "mt_live_spark_jsb_opt_enable")
/* loaded from: classes6.dex */
public final class LiveSparkJsbOptEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSparkJsbOptEnableSetting INSTANCE = new LiveSparkJsbOptEnableSetting();

    public static final boolean enable(String schema) {
        o.LJIIIZ(schema, "schema");
        if (!SettingsManager.INSTANCE.getBooleanValue(LiveSparkJsbOptEnableSetting.class)) {
            return false;
        }
        for (String str : LiveSparkJsbOptDenyListSetting.getValue()) {
            if (s.LJJJLZIJ(schema, str, false)) {
                return false;
            }
        }
        return true;
    }
}
