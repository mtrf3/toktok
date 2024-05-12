package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C221108m2;
import X.C58473MxB;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_cap_res_guest")
/* loaded from: classes11.dex */
public final class MultiGuestV3ChangeCapResGuestSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3ChangeCapResGuestSetting INSTANCE = new MultiGuestV3ChangeCapResGuestSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58473MxB.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3ChangeCapResGuestSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
