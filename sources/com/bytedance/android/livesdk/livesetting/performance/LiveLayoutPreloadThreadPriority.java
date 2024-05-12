package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30058Bqw;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_layout_preload_thread_priority")
/* loaded from: classes6.dex */
public final class LiveLayoutPreloadThreadPriority {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = Integer.MIN_VALUE;
    public static final LiveLayoutPreloadThreadPriority INSTANCE = new LiveLayoutPreloadThreadPriority();
    public static final C5H3 priority$delegate = C221108m2.LIZIZ(C30058Bqw.LJLIL);

    public final int getPriority() {
        return ((Number) priority$delegate.getValue()).intValue();
    }
}
