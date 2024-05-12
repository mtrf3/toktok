package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FP0 {
    public final java.util.Map<String, String> LIZ;
    public long LIZIZ;
    public long LIZJ;

    public final void LIZIZ() {
        if (((ConcurrentHashMap) this.LIZ).size() > 2 && this.LIZIZ > 0 && ((ConcurrentHashMap) this.LIZ).containsKey("scc_report_reason")) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.LIZIZ;
            java.util.Map<String, String> map = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(uptimeMillis);
            LIZ.append("");
            ((ConcurrentHashMap) map).put("scc_total_cost", X1D.LIZIZ(LIZ));
            C38639FEl.LIZJ("ttwebview_scc", Collections.unmodifiableMap(this.LIZ));
        }
    }

    public FP0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZ = concurrentHashMap;
        concurrentHashMap.put("scc_mode", "coreless");
        concurrentHashMap.put("scc_version", "1");
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
    }

    public final void LIZ(String str, boolean z) {
        String str2;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LIZJ;
        java.util.Map<String, String> map = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(uptimeMillis);
        LIZ.append("");
        ((ConcurrentHashMap) map).put("scc_cloudservice_user_wait_time", X1D.LIZIZ(LIZ));
        java.util.Map<String, String> map2 = this.LIZ;
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        ((ConcurrentHashMap) map2).put("scc_cloudservice_result_apply", str2);
        if (!TextUtils.isEmpty(str)) {
            String str3 = (String) ((ConcurrentHashMap) this.LIZ).get("scc_cloudservice_result");
            if (!TextUtils.isEmpty(str3)) {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    jSONObject.put("error", str);
                    ((ConcurrentHashMap) this.LIZ).put("scc_cloudservice_result", jSONObject.toString());
                } catch (JSONException unused) {
                    C1JX.LJIIIIZZ("json format error:", str3);
                }
            }
        }
        LIZIZ();
    }
}
