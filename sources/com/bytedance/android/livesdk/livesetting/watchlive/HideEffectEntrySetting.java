package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C30487Bxr;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_hide_effect_entry")
/* loaded from: classes6.dex */
public final class HideEffectEntrySetting {

    @Group(isDefault = true, value = "default group (show effect entry)")
    public static final boolean DEFAULT = false;
    public static final HideEffectEntrySetting INSTANCE = new HideEffectEntrySetting();
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C30487Bxr.LJLIL);

    private final boolean getCurrentValue() {
        return ((Boolean) currentValue$delegate.getValue()).booleanValue();
    }

    public final boolean shouldHide() {
        return getCurrentValue();
    }
}
