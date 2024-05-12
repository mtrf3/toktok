package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.C221108m2;
import X.C58504Mxg;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_preview_card_resource_opt")
/* loaded from: classes11.dex */
public final class LivePreviewCardResourceOpt {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePreviewCardResourceOpt INSTANCE = new LivePreviewCardResourceOpt();
    public static final C5H3 isOpt$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58504Mxg.LJLIL);

    public final boolean isOpt() {
        return ((Boolean) isOpt$delegate.getValue()).booleanValue();
    }
}
