package X;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EvW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37986EvW {
    public String LIZ;
    public ArrayList<C37987EvX> LIZIZ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", this.LIZ);
        JSONArray jSONArray = new JSONArray();
        ArrayList<C37987EvX> arrayList = this.LIZIZ;
        if (arrayList != null) {
            Iterator<C37987EvX> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                C37987EvX next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C37987EvX c37987EvX = next;
                    c37987EvX.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("channel", c37987EvX.LIZ);
                    jSONObject2.put("version", c37987EvX.LIZIZ);
                    jSONArray.put(jSONObject2);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        jSONObject.put("packages", jSONArray);
        return jSONObject;
    }
}
