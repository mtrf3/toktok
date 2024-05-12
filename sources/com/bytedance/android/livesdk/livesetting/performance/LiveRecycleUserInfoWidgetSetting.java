package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C29721BlV;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_recycle_user_info_widget")
/* loaded from: classes6.dex */
public final class LiveRecycleUserInfoWidgetSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRecycleUserInfoWidgetSetting INSTANCE = new LiveRecycleUserInfoWidgetSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C29721BlV.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
