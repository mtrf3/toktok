package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C221108m2;
import X.C58475MxD;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_split_dsl_params")
/* loaded from: classes11.dex */
public final class MultiGuestV3RtcAllowedSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3RtcAllowedSetting INSTANCE = new MultiGuestV3RtcAllowedSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58475MxD.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3RtcAllowedSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
