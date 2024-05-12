package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C221108m2;
import X.C58474MxC;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_cap_res")
/* loaded from: classes11.dex */
public final class MultiGuestV3ChangeCapResSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3ChangeCapResSetting INSTANCE = new MultiGuestV3ChangeCapResSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58474MxC.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3ChangeCapResSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
