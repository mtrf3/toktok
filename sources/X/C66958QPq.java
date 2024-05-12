package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QPq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66958QPq extends AbstractC67056QTk {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C66957QPp LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        C66961QPt c66961QPt = this.LIZIZ.LIZJ;
        if (c66961QPt != null) {
            int i = c66961QPt.LIZIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("protocol_type", i);
                C79146V4k.LJJJZ("passport_frontier_message_error", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LIZIZ.LIZJ(this.LIZ, null, false);
    }

    public C66958QPq(C66957QPp c66957QPp, String str) {
        this.LIZIZ = c66957QPp;
        this.LIZ = str;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        String str;
        QQK qqk = (QQK) qqi;
        if (qqk != null) {
            if ("session_expired".equalsIgnoreCase(qqk.LJIIIZ)) {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = qqk.LJII;
                if (jSONObject != null && jSONObject.optJSONObject("data") != null) {
                    String optString = qqk.LJII.optJSONObject("data").optString("log_id");
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList.add(new FBY("X-TT-LOGID", optString));
                    }
                }
                this.LIZIZ.LIZJ(this.LIZ, arrayList, true);
                return;
            }
            str = qqk.LJI;
        } else {
            str = "";
        }
        C38901fq.LJIIIIZZ(i, str);
        this.LIZIZ.LIZJ(this.LIZ, null, false);
    }
}
