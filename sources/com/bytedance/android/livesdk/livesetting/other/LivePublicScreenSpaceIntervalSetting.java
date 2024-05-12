package com.bytedance.android.livesdk.livesetting.other;

import X.C31366CSs;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_comment_opt_space")
/* loaded from: classes6.dex */
public final class LivePublicScreenSpaceIntervalSetting {
    public static final LivePublicScreenSpaceIntervalSetting INSTANCE = new LivePublicScreenSpaceIntervalSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 12;
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C31366CSs.LJLIL);

    public static final int getInterval() {
        return INSTANCE.getValue();
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
