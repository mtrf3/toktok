package com.bytedance.android.livesdk.livesetting.other;

import X.C61878OQg;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

@SettingsKey("live_chain_monitor_exclude_error_codes")
/* loaded from: classes6.dex */
public final class LiveChainMonitorExcludeErrorCodesSetting {
    public static final LiveChainMonitorExcludeErrorCodesSetting INSTANCE = new LiveChainMonitorExcludeErrorCodesSetting();

    @Group(isDefault = true, value = "default group")
    public static final List<Integer> DEFAULT = C61878OQg.INSTANCE;

    public final List<Integer> getValue() {
        List<Integer> list = (List) SettingsManager.INSTANCE.getValueSafely(LiveChainMonitorExcludeErrorCodesSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }
}
