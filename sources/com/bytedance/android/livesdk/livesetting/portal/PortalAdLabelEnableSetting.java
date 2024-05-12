package com.bytedance.android.livesdk.livesetting.portal;

import X.BSZ;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_portal_show_ad_label")
/* loaded from: classes6.dex */
public final class PortalAdLabelEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PortalAdLabelEnableSetting INSTANCE = new PortalAdLabelEnableSetting();
    public static final C5H3 getStickValue$delegate = C221108m2.LIZIZ(BSZ.LJLIL);

    public final boolean getGetStickValue() {
        return ((Boolean) getStickValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PortalAdLabelEnableSetting.class);
    }
}
