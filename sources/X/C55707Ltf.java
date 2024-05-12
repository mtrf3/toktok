package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Ltf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55707Ltf {
    public AwemeRawAd LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public JSONObject LIZLLL;
    public java.util.Map<String, String> LJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = this.LIZLLL;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject = jSONObject2;
            AwemeRawAd awemeRawAd = this.LIZ;
            if (awemeRawAd != null) {
                String logExtra = awemeRawAd.getLogExtra();
                if (!TextUtils.isEmpty(logExtra)) {
                    jSONObject.put("log_extra", logExtra);
                }
                jSONObject.put("is_ad_event", "1");
                String LLJILLL = C16880lQ.LLJILLL(EF7.LIZIZ());
                if (!C38354F3m.LJ(LLJILLL)) {
                    jSONObject.put("nt", LLJILLL);
                }
            }
            if (this.LIZJ) {
                jSONObject.put("has_v3", "1");
            }
            java.util.Map<String, String> map = this.LJ;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(this.LIZIZ)) {
                jSONObject.put("refer", this.LIZIZ);
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return jSONObject;
    }
}
