package com.bytedance.android.livesdk.livesetting.goodybag;

import X.BR6;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_goody_bag_audience_enable")
/* loaded from: classes6.dex */
public final class GoodyBagFeatureAudienceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GoodyBagFeatureAudienceSetting INSTANCE = new GoodyBagFeatureAudienceSetting();
    public static final C5H3 getStickValue$delegate = C221108m2.LIZIZ(BR6.LJLIL);

    public final boolean getGetStickValue() {
        return ((Boolean) getStickValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GoodyBagFeatureAudienceSetting.class);
    }
}
