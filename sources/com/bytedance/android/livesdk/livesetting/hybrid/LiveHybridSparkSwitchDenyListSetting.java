package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;
import ujb.s;

@SettingsKey(preciseExperiment = false, value = "mt_live_hybrid_spark_switch_deny_list")
/* loaded from: classes6.dex */
public final class LiveHybridSparkSwitchDenyListSetting {
    public static final LiveHybridSparkSwitchDenyListSetting INSTANCE = new LiveHybridSparkSwitchDenyListSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveHybridSparkSwitchDenyListSetting.class);
    }

    public static final boolean inDenyList(String schema) {
        o.LJIIIZ(schema, "schema");
        for (String str : INSTANCE.getValue()) {
            if (s.LJJJLZIJ(schema, str, false)) {
                return true;
            }
        }
        return false;
    }
}
