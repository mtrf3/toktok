package com.bytedance.android.livesdk.livesetting.goodybag;

import X.BR5;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_goody_bag_anchor_enable")
/* loaded from: classes6.dex */
public final class GoodyBagFeatureAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GoodyBagFeatureAnchorSetting INSTANCE = new GoodyBagFeatureAnchorSetting();
    public static final C5H3 getStickValue$delegate = C221108m2.LIZIZ(BR5.LJLIL);

    public final boolean getGetStickValue() {
        return ((Boolean) getStickValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GoodyBagFeatureAnchorSetting.class);
    }
}
