package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PJ9 {
    public static final HashMap<String, PJ9> LJFF = new HashMap<>();
    public JSONObject LIZ;
    public JSONObject LIZIZ;
    public JSONObject LIZJ;
    public JSONObject LIZLLL;
    public boolean LJ;

    public static JSONArray LIZJ() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, PJ9> entry : LJFF.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            PJC.LJIIJ(jSONObject, entry.getKey(), entry.getValue().LIZ);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public long LIZ() {
        return Long.decode(PJC.LJFF(this.LIZ, "over_all", "get_settings_interval")).longValue() * 1000;
    }

    public static PJ9 LIZIZ(Object obj) {
        String LIZ = PJV.LIZ(obj);
        if (TextUtils.isEmpty(LIZ)) {
            return null;
        }
        return LJFF.get(LIZ);
    }

    public PJ9(JSONObject jSONObject, String str) {
        this.LIZ = jSONObject;
        boolean z = false;
        if (jSONObject != null && PJC.LIZLLL(jSONObject, 0, "exception_modules", "exception", "enable_upload") == 1) {
            z = true;
        }
        this.LJ = z;
        LJFF.put(str, this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("after update aid ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJJJLL();
    }
}
