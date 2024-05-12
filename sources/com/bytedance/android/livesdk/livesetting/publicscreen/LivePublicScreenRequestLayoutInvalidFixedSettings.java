package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C58513Mxp;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_public_screen_request_layout_invalid_fixed_settings")
/* loaded from: classes11.dex */
public final class LivePublicScreenRequestLayoutInvalidFixedSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivePublicScreenRequestLayoutInvalidFixedSettings INSTANCE = new LivePublicScreenRequestLayoutInvalidFixedSettings();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C58513Mxp.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
