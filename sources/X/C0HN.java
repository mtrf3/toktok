package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0HN, reason: invalid class name */
/* loaded from: classes.dex */
public class C0HN {
    public final List<C0HM> LIZ;

    public C0HN(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C0HM(optJSONObject));
                }
            }
        }
        this.LIZ = arrayList;
    }
}
