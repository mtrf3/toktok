package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C31068CHg;
import X.C31069CHh;
import X.C31070CHi;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_center_filter_type")
/* loaded from: classes6.dex */
public final class LiveExtendedScreenFilterTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveExtendedScreenFilterTypeSetting INSTANCE = new LiveExtendedScreenFilterTypeSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C31068CHg.LJLIL);
    public static final C5H3 enableSingle$delegate = C221108m2.LIZIZ(C31070CHi.LJLIL);
    public static final C5H3 enableMulti$delegate = C221108m2.LIZIZ(C31069CHh.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getEnableMulti() {
        return ((Boolean) enableMulti$delegate.getValue()).booleanValue();
    }

    public final boolean getEnableSingle() {
        return ((Boolean) enableSingle$delegate.getValue()).booleanValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveExtendedScreenFilterTypeSetting.class);
    }
}
