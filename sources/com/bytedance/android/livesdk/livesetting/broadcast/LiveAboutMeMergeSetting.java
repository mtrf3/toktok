package com.bytedance.android.livesdk.livesetting.broadcast;

import X.BPH;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_about_me_merge")
/* loaded from: classes6.dex */
public final class LiveAboutMeMergeSetting {
    public static final LiveAboutMeMergeSetting INSTANCE = new LiveAboutMeMergeSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveAboutMeMergeConfig DEFAULT = new LiveAboutMeMergeConfig(null, null, null, null, null, 31, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(BPH.LJLIL);

    public static final String urlFullscreen() {
        return INSTANCE.getSettingValue().urlFullscreen;
    }

    public static final String urlPopup() {
        return INSTANCE.getSettingValue().urlPopup;
    }

    public static final String urlPopupLiveSheet() {
        return INSTANCE.getSettingValue().urlPopupLiveSheet;
    }

    public static final String urlUpgradePopup() {
        return INSTANCE.getSettingValue().urlUpgradePopup;
    }

    public static final String urlUpgradePopupLiveSheet() {
        return INSTANCE.getSettingValue().urlUpgradePopupLiveSheet;
    }

    public final LiveAboutMeMergeConfig getSettingValue() {
        return (LiveAboutMeMergeConfig) settingValue$delegate.getValue();
    }
}
