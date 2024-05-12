package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C58476MxE;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_set_text_opt")
/* loaded from: classes11.dex */
public final class LiveSetTextOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSetTextOptSetting INSTANCE = new LiveSetTextOptSetting();
    public static final C5H3 enabled$delegate = C221108m2.LIZIZ(C58476MxE.LJLIL);

    public final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSetTextOptSetting.class);
    }
}
