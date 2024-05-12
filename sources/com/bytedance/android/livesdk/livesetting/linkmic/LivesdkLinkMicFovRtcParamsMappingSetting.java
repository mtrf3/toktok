package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey(preciseExperiment = false, value = "livesdk_optimize_fov_config_id_map")
/* loaded from: classes6.dex */
public final class LivesdkLinkMicFovRtcParamsMappingSetting {
    public static final LivesdkLinkMicFovRtcParamsMappingSetting INSTANCE = new LivesdkLinkMicFovRtcParamsMappingSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, String> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, String> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely(LivesdkLinkMicFovRtcParamsMappingSetting.class);
    }

    public final String getMappedParamsKey(String str) {
        String str2;
        Map<String, String> value = getValue();
        if (value == null || (str2 = value.get(str)) == null) {
            return str;
        }
        return str2;
    }
}
