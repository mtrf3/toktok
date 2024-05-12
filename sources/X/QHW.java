package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHW implements J2V {
    public final /* synthetic */ java.util.Set LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C66749QHp LIZJ;

    @Override // X.J2V
    public final Object LIZ() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$$APP_ID", this.LIZJ.LIZ.LJLJI.LJIIIZ);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.LIZ.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("$$EVENT_LOCAL_ID_ARRAY", jSONArray);
            if (this.LIZIZ) {
                str = "success";
            } else {
                str = "failed";
            }
            jSONObject.put("$$UPLOAD_STATUS", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public QHW(C66749QHp c66749QHp, java.util.Set set, boolean z) {
        this.LIZJ = c66749QHp;
        this.LIZ = set;
        this.LIZIZ = z;
    }
}
