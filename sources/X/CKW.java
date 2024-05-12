package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMetricsSetting;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* loaded from: classes6.dex */
public final class CKW {
    public static LiveCore LIZ;

    static {
        new YA6();
    }

    public static C31824CeK LIZ() {
        C31824CeK c31824CeK = new C31824CeK("metrics.model", EnumC31874Cf8.METRIC_MODEL, null, null, LiveAudioMetricsSetting.INSTANCE.getAudioUrl(), null, false, 0, false, 1004);
        c31824CeK.LJFF = true;
        c31824CeK.LJ = "metric_model";
        c31824CeK.LJI = 10;
        return c31824CeK;
    }
}
