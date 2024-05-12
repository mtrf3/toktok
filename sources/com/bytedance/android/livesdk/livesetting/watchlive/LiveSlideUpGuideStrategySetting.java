package com.bytedance.android.livesdk.livesetting.watchlive;

import X.BKO;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_slide_up_guide_strategy")
/* loaded from: classes6.dex */
public final class LiveSlideUpGuideStrategySetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final LiveSlideUpGuideStrategySetting INSTANCE = new LiveSlideUpGuideStrategySetting();
    public static final C5H3 expVersion$delegate = C221108m2.LIZIZ(BKO.LJLIL);

    public final int getExpVersion() {
        return ((Number) expVersion$delegate.getValue()).intValue();
    }
}
