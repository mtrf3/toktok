package com.bytedance.android.livesdk.livesetting.performance;

import X.ORY;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey(preciseExperiment = false, value = "live_watch_scroll_fps_opt")
/* loaded from: classes6.dex */
public final class LiveWatchScrollFpsOptSetting {
    public static final LiveWatchScrollFpsOptSetting INSTANCE = new LiveWatchScrollFpsOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveWatchScrollFpsOptSetting.class);
    }

    public final boolean enable(String key) {
        o.LJIIIZ(key, "key");
        return ORY.LJJIJIIJIL(key, getValue());
    }
}
