package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;

/* loaded from: classes6.dex */
public final class B39 {
    public long LIZ = 0;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        String str;
        if (this.LIZ == 0) {
            return;
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.LIZ;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_mini_window_mute_or_pause_live_duration")) {
            if (this.LIZIZ) {
                str = "yes";
            } else {
                str = "no";
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_mini_window_mute_or_pause_live_duration");
            LIZ.LJIJJ(Long.valueOf(currentThreadTimeMillis), "duration");
            LIZ.LJIJJ(str, "is_auto");
            LIZ.LJJIIJZLJL();
        }
        C44878HjO.LIZJ("PipMutePlayTimeLogger uploadEndMuteTime, duration is ", currentThreadTimeMillis, "picture_in_picture");
        this.LIZ = 0L;
        this.LIZJ = false;
    }
}
