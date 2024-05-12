package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PBW implements PBM {
    @Override // X.PBM
    public final String getName() {
        return "exception";
    }

    @Override // X.PBM
    public final List<String> LIZ() {
        PBX pbx = C64038PBi.LIZ;
        PBY pby = pbx.LJIIL;
        if (pby != null && !C78915Uy7.LJIJJ(pby.LIZLLL)) {
            return pbx.LJIIL.LIZLLL;
        }
        return pbx.LJIIIIZZ;
    }

    @Override // X.PBM
    public final byte[] LIZIZ(HashMap<Long, JSONArray> hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<Long> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                JSONArray jSONArray2 = hashMap.get(it.next());
                if (jSONArray2 != null) {
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        jSONArray.put(jSONArray2.get(i));
                    }
                }
            }
            jSONObject.put("header", PC7.LIZIZ(PC6.LIZIZ().LIZ(String.valueOf(PC7.LIZ()))));
            jSONObject.put("data", jSONArray);
            return PAK.LIZ(jSONObject.toString());
        } catch (Exception unused) {
            return null;
        }
    }
}
