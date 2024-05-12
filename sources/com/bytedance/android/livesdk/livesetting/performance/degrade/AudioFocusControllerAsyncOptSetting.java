package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C221108m2;
import X.C28745BPx;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("audio_focus_controller_async_opt")
/* loaded from: classes6.dex */
public final class AudioFocusControllerAsyncOptSetting {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;

    @Group("experimental_group")
    public static final boolean ENABLE = true;
    public static final AudioFocusControllerAsyncOptSetting INSTANCE = new AudioFocusControllerAsyncOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C28745BPx.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
