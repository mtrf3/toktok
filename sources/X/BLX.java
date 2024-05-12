package X;

import Y.ARunnableS2S0100200_5;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;

/* loaded from: classes6.dex */
public final class BLX {
    public static void LIZ(long j, long j2, long j3, BLW blw, C64672PZs c64672PZs, C64738Paw c64738Paw) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_room_enter_full_link_duration", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        if (c64738Paw == null || c64672PZs == null) {
            C30326BvG.LIZ.post(new ARunnableS2S0100200_5(j, j2, blw, 3), null);
        } else {
            C30326BvG.LIZ.post(new RunnableC65880PtM(j, j3, j2, blw, c64672PZs, c64738Paw), null);
        }
    }
}
