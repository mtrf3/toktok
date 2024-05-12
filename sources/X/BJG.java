package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BJG extends C05630Jz {
    public long LIZ;
    public long LIZIZ;

    public final void LJIIIZ(String str) {
        long j;
        if (this.LIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            j = 0;
        }
        this.LIZ = 0L;
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_request_feed_api_all")) {
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJI(jSONObject, "request_type", str);
            C0K2.LJIIJ(0, j, "ttlive_request_feed_api_all", jSONObject);
        }
    }

    public final void LJIIIIZZ(String str, Throwable th) {
        int i;
        String str2;
        if (this.LIZ > 0) {
            SystemClock.uptimeMillis();
        }
        this.LIZ = 0L;
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C276516r) {
            i = ((C276516r) th).getErrorCode();
        } else {
            i = 0;
        }
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        C05630Jz.LIZ(i, "error_code", jSONObject);
        C05630Jz.LJI(jSONObject, "error_msg", str2);
        C05630Jz.LJI(jSONObject, "request_type", str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_request_feed_api_all")) {
            C0K2.LJIIJJI(1, "ttlive_request_feed_api_all", jSONObject);
        }
        C0K2.LJIIIIZZ("ttlive_request_feed_api_error", 1, jSONObject);
    }
}
