package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C29307Bep;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_mask_layer_check")
/* loaded from: classes6.dex */
public final class LiveMaskLayerCheckSetting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = true;
    public static final LiveMaskLayerCheckSetting INSTANCE = new LiveMaskLayerCheckSetting();
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C29307Bep.LJLIL);

    private final boolean getCurrentValue() {
        return ((Boolean) currentValue$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getCurrentValue();
    }
}
