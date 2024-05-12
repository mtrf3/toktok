package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C30420Bwm;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "beauty_panel_memory_opt")
/* loaded from: classes6.dex */
public final class BeautyPanelMemoryOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final BeautyPanelMemoryOptSetting INSTANCE = new BeautyPanelMemoryOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30420Bwm.LJLIL);

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getValue();
    }
}
