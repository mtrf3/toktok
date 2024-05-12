package com.bytedance.android.livesdk.livesetting.broadcast;

import X.BZF;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_dirty_lens")
/* loaded from: classes6.dex */
public final class LiveDirtyLensDetectionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final boolean ENABLED;
    public static final LiveDirtyLensDetectionSetting INSTANCE;
    public static final float THRESHOLD;
    public static final C5H3 VALUE$delegate;

    static {
        boolean z;
        float f;
        LiveDirtyLensDetectionSetting liveDirtyLensDetectionSetting = new LiveDirtyLensDetectionSetting();
        INSTANCE = liveDirtyLensDetectionSetting;
        VALUE$delegate = C221108m2.LIZIZ(BZF.LJLIL);
        if (liveDirtyLensDetectionSetting.getVALUE() != 0) {
            z = true;
        } else {
            z = false;
        }
        ENABLED = z;
        int value = liveDirtyLensDetectionSetting.getVALUE();
        if (value != 0) {
            if (value != 1) {
                f = 1.0f;
            } else {
                f = 0.9f;
            }
        } else {
            f = 2.0f;
        }
        THRESHOLD = f;
    }

    private final int getVALUE() {
        return ((Number) VALUE$delegate.getValue()).intValue();
    }

    public final boolean getENABLED() {
        return ENABLED;
    }

    public final float getTHRESHOLD() {
        return THRESHOLD;
    }
}
