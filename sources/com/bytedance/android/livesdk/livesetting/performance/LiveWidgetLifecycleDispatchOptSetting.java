package com.bytedance.android.livesdk.livesetting.performance;

import X.BLF;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.widget.WidgetManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_widget_lifecycle_dispatch_opt")
/* loaded from: classes6.dex */
public final class LiveWidgetLifecycleDispatchOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveWidgetLifecycleDispatchOptSetting INSTANCE = new LiveWidgetLifecycleDispatchOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(BLF.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public static final void init() {
        WidgetManager.enableWidgetLifecycleDispatchOpt(INSTANCE.getEnable());
    }
}
