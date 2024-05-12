package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C29523BiJ;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_user_level_use_spark_setting")
/* loaded from: classes6.dex */
public final class LiveGiftGuideUserLevelSparkSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group(isDefault = false, value = "group two")
    public static final boolean USE_SPARK = true;
    public static final LiveGiftGuideUserLevelSparkSetting INSTANCE = new LiveGiftGuideUserLevelSparkSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C29523BiJ.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
