package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.lynx.tasm.base.LLog;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ui4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77920Ui4 {
    public final HashMap<String, Long> LIZ;
    public final String LIZIZ;

    public C77920Ui4(String str) {
        this.LIZIZ = str;
        new HashMap();
        this.LIZ = new HashMap<>();
    }

    public final void LIZ(String str) {
        if (str != null && this.LIZ.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.LIZ.get(str);
            if (l != null) {
                long longValue = currentTimeMillis - l.longValue();
                JSONObject LJ = C47135Ieh.LJ("resource_url", str, "lottie_url", str);
                JSONObject LIZLLL = Q7K.LIZLLL("cost", longValue);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("virtual_aid", this.LIZIZ);
                HybridMultiMonitor.getInstance().customReport(str, "", "lottie_fetch_total_cost", LJ, LIZLLL, null, jSONObject, 2);
            }
        }
    }

    public final void LIZIZ(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", String.valueOf(1));
        jSONObject.put("resource_url", str2);
        jSONObject.put("lottie_url", str);
        jSONObject.put("message", str3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", this.LIZIZ);
        HybridMultiMonitor.getInstance().customReport(str, "", "lottie_fetch_error", jSONObject, null, null, jSONObject2, 2);
    }

    public final void LIZJ(String str, String str2, Float f, Float f2, Float f3, Float f4, Boolean bool) {
        if (!o.LIZJ(f, 0.0f)) {
            JSONObject LJ = C47135Ieh.LJ("bid", str2, "lottie_src", str);
            LJ.put("frame_rate", String.valueOf(f2));
            LJ.put("frame_num", String.valueOf(f3));
            LJ.put("real_frame", String.valueOf(f));
            LJ.put("ideal_time", String.valueOf(f4));
            LJ.put("loop", String.valueOf(bool));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("virtual_aid", this.LIZIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("lottieUrl is ");
            LIZ.append(str);
            LIZ.append(", bid is ");
            LIZ.append(str2);
            LIZ.append(", realFrame is ");
            LIZ.append(f);
            LLog.LIZLLL(1, "byted-lottie", X1D.LIZIZ(LIZ));
            HybridMultiMonitor.getInstance().customReport(str, "", "lottie_animation_performance", LJ, null, null, jSONObject, 2);
        }
    }
}
