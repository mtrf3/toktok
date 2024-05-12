package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C30109Brl;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_opt_share_get_thumb")
/* loaded from: classes6.dex */
public final class LiveOptShareGetThumbSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveOptShareGetThumbSetting INSTANCE = new LiveOptShareGetThumbSetting();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C30109Brl.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
