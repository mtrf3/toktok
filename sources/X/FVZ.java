package X;

import android.os.SystemClock;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FVZ implements QJ5 {
    @Override // X.QJ5
    public final void LIZ(String str, long j, JSONObject jSONObject) {
    }

    @Override // X.QJ5
    public final void LIZJ(String str, long j, JSONObject jSONObject) {
    }

    @Override // X.QJ5
    public final void LIZIZ(long j) {
        String currentSessionId = AppLog.getCurrentSessionId();
        if (!C84763XOl.LJIIJJI && C39070FVa.LIZ != 0 && SystemClock.uptimeMillis() - C39070FVa.LIZ >= 20000) {
            C76W c76w = new C76W();
            c76w.LIZ("0vv_session_id", currentSessionId);
            JSONObject LIZIZ = c76w.LIZIZ();
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("0vv_hot_launch");
            obtain.setLabelName("perf_monitor");
            obtain.setJsonObject(LIZIZ);
            FMX.onEvent(obtain);
            FMX.LJIILLIIL("0vv_hot_launch", LIZIZ);
        }
    }
}
