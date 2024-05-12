package com.bytedance.android.livesdk.livesetting.performance;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey(preciseExperiment = false, value = "live_upgrade_api_map")
/* loaded from: classes6.dex */
public final class LiveUpgradeApiMapSetting {

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Double> DEFAULT;
    public static final LiveUpgradeApiMapSetting INSTANCE = new LiveUpgradeApiMapSetting();

    static {
        Double valueOf = Double.valueOf(-10.0d);
        DEFAULT = C113554cx.LJJL(new OSZ("/webcast/feed/", valueOf), new OSZ("/webcast/room/enter/", valueOf));
    }

    public final Map<String, Double> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely(LiveUpgradeApiMapSetting.class);
    }
}
