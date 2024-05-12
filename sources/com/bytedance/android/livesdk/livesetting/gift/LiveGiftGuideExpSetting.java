package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C30762C5m;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_guide_exp_setting")
/* loaded from: classes6.dex */
public final class LiveGiftGuideExpSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "group three")
    public static final int GROUP_CLIENT_AI = 2;

    @Group(isDefault = false, value = "group two")
    public static final int GROUP_REQUEST = 1;
    public static final LiveGiftGuideExpSetting INSTANCE = new LiveGiftGuideExpSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30762C5m.LJLIL);

    public static /* synthetic */ void getGROUP_CLIENT_AI$annotations() {
    }

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
