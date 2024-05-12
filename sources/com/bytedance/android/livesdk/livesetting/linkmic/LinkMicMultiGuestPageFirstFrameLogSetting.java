package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C30996CEm;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.concurrent.ThreadLocalRandom;

@SettingsKey("linkmic_multiguestv3_page_first_frame_log")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestPageFirstFrameLogSetting {
    public static final LinkMicMultiGuestPageFirstFrameLogSetting INSTANCE = new LinkMicMultiGuestPageFirstFrameLogSetting();
    public static double randomSampleVale = -1.0d;

    @Group(isDefault = true, value = "default group")
    public static final LinkMicMultiGuestPageFirstFrameLogConfig DEFAULT = new LinkMicMultiGuestPageFirstFrameLogConfig(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 3, null);
    public static final C5H3 config$delegate = C221108m2.LIZIZ(C30996CEm.LJLIL);

    private final LinkMicMultiGuestPageFirstFrameLogConfig getConfig() {
        return (LinkMicMultiGuestPageFirstFrameLogConfig) config$delegate.getValue();
    }

    public final boolean canReport() {
        if (!getConfig().enable) {
            return false;
        }
        if (randomSampleVale < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            randomSampleVale = ThreadLocalRandom.current().nextDouble();
        }
        if (randomSampleVale >= getConfig().sampleRate) {
            return false;
        }
        return true;
    }
}
