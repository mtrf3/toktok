package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C30761C5l;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_guide_trigger_setting")
/* loaded from: classes6.dex */
public final class LiveGiftGuideTriggerSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "group two")
    public static final int GROUP_POLLING = 1;

    @Group(isDefault = false, value = "group four")
    public static final int GROUP_POLLING_AND_SCENE = 3;

    @Group(isDefault = false, value = "group three")
    public static final int GROUP_SCENE = 2;
    public static final LiveGiftGuideTriggerSetting INSTANCE = new LiveGiftGuideTriggerSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30761C5l.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
