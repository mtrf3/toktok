package X;

import com.bytedance.vmsdk.log.VLog;
import java.util.TimerTask;

/* renamed from: X.FXp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39137FXp extends TimerTask {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (VLog.detectALogDependence()) {
                cancel();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
