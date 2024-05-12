package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C29582BjG;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_live_image_loader_module")
/* loaded from: classes6.dex */
public final class LiveImageLoaderModuleSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveImageLoaderModuleSetting INSTANCE = new LiveImageLoaderModuleSetting();
    public static final C5H3 useModule$delegate = C221108m2.LIZIZ(C29582BjG.LJLIL);

    private final boolean getUseModule() {
        return ((Boolean) useModule$delegate.getValue()).booleanValue();
    }

    public static final boolean useImageModule() {
        return INSTANCE.getUseModule();
    }
}
