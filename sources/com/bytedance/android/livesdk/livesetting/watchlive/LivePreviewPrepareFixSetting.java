package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58517Mxt;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_preview_prepare_fix")
/* loaded from: classes11.dex */
public final class LivePreviewPrepareFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("v1")
    public static final int ENABLE = 1;
    public static final LivePreviewPrepareFixSetting INSTANCE = new LivePreviewPrepareFixSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C58517Mxt.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
