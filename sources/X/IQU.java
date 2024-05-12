package X;

import defpackage.b0;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IQU {
    public int LIZ;
    public String LIZIZ;
    public long LIZJ;
    public Object LIZLLL;
    public long LJ;
    public String LJFF;
    public int LJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcessSubUrlData{id=");
        LIZ.append(this.LIZ);
        LIZ.append(", language=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", languageId='");
        LIZ.append(this.LIZJ);
        LIZ.append(", url=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", expire='");
        C62850Ola.LJIIIIZZ(LIZ, this.LJ, '\'', ", format=");
        LIZ.append(this.LJFF);
        LIZ.append(", subId=");
        return b0.LIZJ(LIZ, this.LJI, '}', LIZ);
    }

    public static String LIZ(List<IQU> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (IQU iqu : list) {
            if (iqu != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", iqu.LIZ);
                    jSONObject.put("language", iqu.LIZIZ);
                    jSONObject.put("language_id", iqu.LIZJ);
                    jSONObject.put("url", iqu.LIZLLL);
                    jSONObject.put("expire", iqu.LJ);
                    jSONObject.put("format", iqu.LJFF);
                    jSONObject.put("sub_id", iqu.LJI);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                jSONArray.put(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("list", jSONArray);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return jSONObject2.toString();
    }
}
