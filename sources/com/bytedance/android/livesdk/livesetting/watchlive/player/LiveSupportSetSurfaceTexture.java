package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C221108m2;
import X.C58518Mxu;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_support_set_surfacetexture")
/* loaded from: classes11.dex */
public final class LiveSupportSetSurfaceTexture {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final LiveSupportSetSurfaceTexture INSTANCE = new LiveSupportSetSurfaceTexture();
    public static final C5H3 isEnable$delegate = C221108m2.LIZIZ(C58518Mxu.LJLIL);

    public final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }
}
