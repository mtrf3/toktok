package com.bytedance.android.livesdk.livesetting.clientai;

import X.C221108m2;
import X.C32163Cjn;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_friend_notice_optimize_increase")
/* loaded from: classes6.dex */
public final class CohostNoticeStrategySettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final CohostNoticeStrategySettings INSTANCE = new CohostNoticeStrategySettings();
    public static final C5H3 getStickValue$delegate = C221108m2.LIZIZ(C32163Cjn.LJLIL);

    public final int getGetStickValue() {
        return ((Number) getStickValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(CohostNoticeStrategySettings.class);
    }
}
