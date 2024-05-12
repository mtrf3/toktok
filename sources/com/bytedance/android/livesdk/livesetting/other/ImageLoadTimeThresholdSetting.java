package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C28257B7d;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_image_load_time_threshold")
/* loaded from: classes6.dex */
public final class ImageLoadTimeThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 342;
    public static final ImageLoadTimeThresholdSetting INSTANCE = new ImageLoadTimeThresholdSetting();
    public static final C5H3 threshold$delegate = C221108m2.LIZIZ(C28257B7d.LJLIL);

    private final long getThreshold() {
        return ((Number) threshold$delegate.getValue()).longValue();
    }

    public static final long threshold() {
        return INSTANCE.getThreshold();
    }
}
