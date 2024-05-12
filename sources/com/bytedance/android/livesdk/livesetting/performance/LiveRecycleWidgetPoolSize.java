package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30083BrL;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_recycle_widget_pool_size")
/* loaded from: classes6.dex */
public final class LiveRecycleWidgetPoolSize {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 30;
    public static final LiveRecycleWidgetPoolSize INSTANCE = new LiveRecycleWidgetPoolSize();
    public static final C5H3 size$delegate = C221108m2.LIZIZ(C30083BrL.LJLIL);

    public final int getSize() {
        return ((Number) size$delegate.getValue()).intValue();
    }
}
