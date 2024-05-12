package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C221108m2;
import X.C5H3;
import X.CTL;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("bad_phones_watch_live_common_ui_opt")
/* loaded from: classes6.dex */
public final class BadPhonesWatchLiveCommonUIOptSetting {
    public static final BadPhonesWatchLiveCommonUIOptSetting INSTANCE = new BadPhonesWatchLiveCommonUIOptSetting();

    @Group(isDefault = true, value = "control_group")
    public static final BadPhonesWatchLiveCommonUIConfig DEFAULT = new BadPhonesWatchLiveCommonUIConfig();
    public static final C5H3 delayWidgetLoadConfig$delegate = C221108m2.LIZIZ(CTL.LJLIL);

    private final BadPhonesWatchLiveCommonUIConfig getDelayWidgetLoadConfig() {
        return (BadPhonesWatchLiveCommonUIConfig) delayWidgetLoadConfig$delegate.getValue();
    }

    public final boolean getDisableGaussBlurred() {
        return getDelayWidgetLoadConfig().disableGaussBlurred;
    }

    public final boolean getRemoveBottomShadow() {
        return getDelayWidgetLoadConfig().removeBottomShadow;
    }

    public final boolean getRemoveInsertMessageAnimation() {
        return getDelayWidgetLoadConfig().removeInsertMessageAnimation;
    }

    public final boolean getRemoveTopShadow() {
        return getDelayWidgetLoadConfig().removeTopShadow;
    }
}
