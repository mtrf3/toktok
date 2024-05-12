package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C5H3;
import X.UYJ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.live.model.LiveScrollConfig;

@SettingsKey("live_scroll_config")
/* loaded from: classes14.dex */
public final class LiveAdjustScrollConfigSetting {
    public static final LiveAdjustScrollConfigSetting INSTANCE = new LiveAdjustScrollConfigSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(UYJ.LJLIL);

    @Group(isDefault = true, value = "default group")
    public static final LiveScrollConfig DEFAULT = new LiveScrollConfig(0.0f, 0, 0.0f, 7, null);

    public final LiveScrollConfig getValue() {
        return (LiveScrollConfig) value$delegate.getValue();
    }

    public final LiveScrollConfig getDEFAULT() {
        return DEFAULT;
    }
}
