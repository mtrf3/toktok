package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C28667BMx;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("broadcast_image_cache_refactor_enable")
/* loaded from: classes6.dex */
public final class LiveBroadcastImageCacheRefactorSetting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastImageCacheRefactorSetting INSTANCE = new LiveBroadcastImageCacheRefactorSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C28667BMx.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
