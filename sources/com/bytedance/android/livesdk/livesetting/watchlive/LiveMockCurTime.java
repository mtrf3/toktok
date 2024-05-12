package com.bytedance.android.livesdk.livesetting.watchlive;

import X.B8W;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_slide_up_mock_time")
/* loaded from: classes6.dex */
public final class LiveMockCurTime {

    @Group(isDefault = true, value = "default")
    public static final long DEFAULT = -1;
    public static final LiveMockCurTime INSTANCE = new LiveMockCurTime();
    public static final C5H3 curTime$delegate = C221108m2.LIZIZ(B8W.LJLIL);

    public final long getCurTime() {
        return ((Number) curTime$delegate.getValue()).longValue();
    }
}
