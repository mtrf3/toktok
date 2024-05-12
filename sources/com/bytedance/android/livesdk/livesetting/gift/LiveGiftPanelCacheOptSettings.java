package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C32292Cls;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_panel_cache_opt_settings")
/* loaded from: classes6.dex */
public final class LiveGiftPanelCacheOptSettings {
    public static final LiveGiftPanelCacheOptSettings INSTANCE = new LiveGiftPanelCacheOptSettings();

    @Group(isDefault = true, value = "default group")
    public static final SettingParams DEFAULT = new SettingParams(0, 0, 0, 0, false, 31, null);
    public static final C5H3 settingParams$delegate = C221108m2.LIZIZ(C32292Cls.LJLIL);

    private final SettingParams getSettingParams() {
        return (SettingParams) settingParams$delegate.getValue();
    }

    public final boolean enable() {
        if (getSettingParams().enable > 0) {
            return true;
        }
        return false;
    }

    public final long firstFetchDelay() {
        return getSettingParams().firstFetchDelay;
    }

    public final boolean forcePredictSuccess() {
        return getSettingParams().forcePredictSuccess;
    }

    public final long nextFetchDelay() {
        return getSettingParams().nextFetchDelay;
    }

    public final boolean removeFetchAfterPanelOpened() {
        if (enable() && getSettingParams().removeFetchAfterPanelOpened > 0) {
            return true;
        }
        return false;
    }

    public final SettingParams getDEFAULT() {
        return DEFAULT;
    }
}
