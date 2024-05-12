package com.bytedance.android.livesdk.livesetting.portal;

import X.BSN;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_envelope_portal")
/* loaded from: classes6.dex */
public final class PortalFeatureSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PortalFeatureSetting INSTANCE = new PortalFeatureSetting();
    public static final C5H3 getStickValue$delegate = C221108m2.LIZIZ(BSN.LJLIL);

    public final boolean getGetStickValue() {
        return ((Boolean) getStickValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PortalFeatureSetting.class);
    }
}
