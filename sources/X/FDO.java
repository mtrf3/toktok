package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FDO {
    public final JSONObject LIZ;
    public final List<String> LIZIZ = new ArrayList();
    public final List<FDN> LIZJ = new ArrayList();
    public final long LIZLLL;

    public final void LIZ(JSONObject jSONObject) {
        JSONArray names;
        if (jSONObject != null && (names = jSONObject.names()) != null && names.length() > 0) {
            int length = names.length();
            for (int i = 0; i < length; i++) {
                String publicSchema = names.optString(i);
                if (!TextUtils.isEmpty(publicSchema)) {
                    List<String> list = this.LIZIZ;
                    o.LJIIIIZZ(publicSchema, "publicSchema");
                    list.add(publicSchema);
                    JSONObject optJSONObject = jSONObject.optJSONObject(publicSchema);
                    if (optJSONObject != null) {
                        this.LIZJ.add(new FDN(publicSchema, optJSONObject));
                    }
                }
            }
        }
    }

    public FDO(String str, Long l) {
        this.LIZLLL = -1L;
        if (l != null) {
            this.LIZLLL = l.longValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.LIZ = jSONObject;
                LIZ(jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public FDO(JSONObject jSONObject, Long l) {
        this.LIZLLL = -1L;
        if (l != null) {
            this.LIZLLL = l.longValue();
        }
        this.LIZ = jSONObject;
        LIZ(jSONObject);
    }
}
