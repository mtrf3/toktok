package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_use_surfaceview")
/* loaded from: classes6.dex */
public final class LiveGiftSurfaceViewSetting {

    @Group(isDefault = true, value = "TextureView")
    public static final int DEFAULT = 0;
    public static final LiveGiftSurfaceViewSetting INSTANCE = new LiveGiftSurfaceViewSetting();

    @Group("SurfaceView")
    public static final int SURFACE_VIEW = 1;

    @Group("Transparent SurfaceView")
    public static final int TRANSPARENT_SURFACE_VIEW = 2;

    public static final boolean enabled() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftSurfaceViewSetting.class) > 0) {
            return true;
        }
        return false;
    }

    public static final boolean isTransparent() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftSurfaceViewSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftSurfaceViewSetting.class);
    }
}
