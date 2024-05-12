package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C221108m2;
import X.C4Z;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_fps_anchor")
/* loaded from: classes6.dex */
public final class MultiGuestV3ChangeFpsAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3ChangeFpsAnchorSetting INSTANCE = new MultiGuestV3ChangeFpsAnchorSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C4Z.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3ChangeFpsAnchorSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
