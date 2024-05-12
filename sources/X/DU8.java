package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* loaded from: classes7.dex */
public final class DU8 {
    public static final long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    static {
        FFL.LJIIIZ().getClass();
        long j = LivePlayEnforceIntervalSetting.DEFAULT;
        long LJIILIIL = FFL.LJIILIIL(31744, LivePlayEnforceIntervalSetting.DEFAULT, "network_notice_time");
        if (LJIILIIL > 0) {
            j = LJIILIIL;
        }
        LIZ = j;
    }
}
