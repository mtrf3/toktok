package com.bytedance.android.livesdk.livesetting.linkmic;

import X.BFN;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("linkmic_multiguestv3_android_moderator_tech_switch")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting INSTANCE = new LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting();
    public static final C5H3 lazyValue$delegate = C221108m2.LIZIZ(BFN.LJLIL);

    private final boolean getLazyValue() {
        return ((Boolean) lazyValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getLazyValue();
    }
}
