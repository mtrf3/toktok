package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31471CWt;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_new_gifter_badge_config")
/* loaded from: classes6.dex */
public final class LiveGiftNewGifterBadgeSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "none";
    public static final LiveGiftNewGifterBadgeSetting INSTANCE = new LiveGiftNewGifterBadgeSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31471CWt.LJLIL);

    private final String getSettingValue() {
        return (String) settingValue$delegate.getValue();
    }

    public final String getValue() {
        return getSettingValue();
    }
}
