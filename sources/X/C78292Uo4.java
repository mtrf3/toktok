package X;

import android.os.SystemClock;
import org.json.JSONObject;

/* renamed from: X.Uo4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78292Uo4 extends IO1 {
    public final String LIZ;
    public long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final void LIZ() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "request_id", this.LIZJ);
        add(jSONObject, "product_id", this.LIZLLL);
        this.LIZIZ = SystemClock.uptimeMillis();
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "api_name", this.LIZ);
        ((QT9) C78273Unl.LJIIIZ().LJI()).LIZ("api_request_start", jSONObject2, null, jSONObject);
    }

    public final void LIZIZ(boolean z, C78368UpI c78368UpI) {
        long j;
        JSONObject jSONObject = new JSONObject();
        long j2 = 0;
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        add(jSONObject, "status", j);
        add(jSONObject, "api_name", this.LIZ);
        if (c78368UpI != null) {
            add(jSONObject, "result_code", c78368UpI.getCode());
            add(jSONObject, "result_detail_code", c78368UpI.getDetailCode());
            add(jSONObject, "result_message", c78368UpI.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "request_id", this.LIZJ);
        add(jSONObject2, "product_id", this.LIZLLL);
        if (this.LIZIZ > 0) {
            j2 = SystemClock.uptimeMillis() - this.LIZIZ;
        }
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "time_consuming", j2);
        ((QT9) C78273Unl.LJIIIZ().LJI()).LIZ("api_request_end", jSONObject, jSONObject3, jSONObject2);
    }

    public C78292Uo4(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
