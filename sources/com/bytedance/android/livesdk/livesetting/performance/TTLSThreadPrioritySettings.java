package com.bytedance.android.livesdk.livesetting.performance;

import X.B7H;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.LinkedHashMap;
import java.util.Map;

@SettingsKey("ttls_thread_priority_settings")
/* loaded from: classes6.dex */
public final class TTLSThreadPrioritySettings {
    public static final TTLSThreadPrioritySettings INSTANCE = new TTLSThreadPrioritySettings();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Integer> DEFAULT = new LinkedHashMap();
    public static final C5H3 configs$delegate = C221108m2.LIZIZ(B7H.LJLIL);

    private final Map<String, Integer> getConfigs() {
        return (Map) configs$delegate.getValue();
    }

    public final Map<String, Integer> getThreadConfigs() {
        return getConfigs();
    }
}
