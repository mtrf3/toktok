package X;

import android.os.Handler;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.performance.LiveGCThreadOptSetting;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.BTx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28849BTx {
    public static void LIZIZ() {
        if (!C30326BvG.LIZIZ) {
            LinkedBlockingQueue<java.util.Map<String, String>> linkedBlockingQueue = C28848BTw.LJIILIIL;
            if (linkedBlockingQueue.size() != 0) {
                C28848BTw.LJIILJJIL = true;
                java.util.Map<String, String> poll = linkedBlockingQueue.poll();
                if (poll != null) {
                    LIZ(poll);
                }
                ((Handler) C28848BTw.LJIIJ.getValue()).postDelayed(RunnableC28851BTz.LJLIL, 50L);
                return;
            }
        }
        C28848BTw.LJIILJJIL = false;
    }

    public static void LIZ(java.util.Map map) {
        String str = (String) map.get("event_name");
        IHostMonitorAndLog iHostMonitorAndLog = (IHostMonitorAndLog) CN1.LIZ(IHostMonitorAndLog.class);
        if (iHostMonitorAndLog != null) {
            iHostMonitorAndLog.xe0(str, map);
        }
        if (!LiveGCThreadOptSetting.enableAppLogOpt()) {
            C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_eventlog", map);
        }
    }
}
