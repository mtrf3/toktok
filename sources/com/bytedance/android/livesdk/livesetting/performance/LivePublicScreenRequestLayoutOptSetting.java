package com.bytedance.android.livesdk.livesetting.performance;

import X.C5H3;
import X.C5P;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_public_screen_request_layout_opt_setting_v2")
/* loaded from: classes6.dex */
public final class LivePublicScreenRequestLayoutOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "all opt")
    public static final int ENABLE_ALL = 4;

    @Group(isDefault = false, value = "RecyclerView intercept requestLayout")
    public static final int ENABLE_SCROLL_INSERTED_OPT = 1;

    @Group(isDefault = false, value = "update opt")
    public static final int ENABLE_SCROLL_UPDATED_OPT = 2;

    @Group(isDefault = false, value = "touch opt")
    public static final int ENABLE_TOUCH_OPT = 3;
    public static final LivePublicScreenRequestLayoutOptSetting INSTANCE = new LivePublicScreenRequestLayoutOptSetting();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C5P.LJLIL);

    public static final boolean enableScrollInsertedOpt() {
        LivePublicScreenRequestLayoutOptSetting livePublicScreenRequestLayoutOptSetting = INSTANCE;
        if (livePublicScreenRequestLayoutOptSetting.getValue() == 1 || livePublicScreenRequestLayoutOptSetting.getValue() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean enableScrollUpdatedOpt() {
        LivePublicScreenRequestLayoutOptSetting livePublicScreenRequestLayoutOptSetting = INSTANCE;
        if (livePublicScreenRequestLayoutOptSetting.getValue() == 2 || livePublicScreenRequestLayoutOptSetting.getValue() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean enableTouchOpt() {
        LivePublicScreenRequestLayoutOptSetting livePublicScreenRequestLayoutOptSetting = INSTANCE;
        if (livePublicScreenRequestLayoutOptSetting.getValue() == 3 || livePublicScreenRequestLayoutOptSetting.getValue() == 4) {
            return true;
        }
        return false;
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
