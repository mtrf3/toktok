package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.ErR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37733ErR {
    public final java.util.Map<String, C37734ErS> LIZ = new HashMap();

    public static List<C37734ErS> LIZ(int i, String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i != 0) {
                if (i == 1) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!next.equals("bdwk_create")) {
                            arrayList.add(new C37734ErS(next, jSONObject.optString(next)));
                        }
                    }
                }
            } else {
                JSONObject optJSONObject = jSONObject.optJSONObject("bdwk_create");
                if (optJSONObject != null) {
                    Iterator<String> keys2 = optJSONObject.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        arrayList.add(new C37734ErS(next2, optJSONObject.optString(next2)));
                    }
                }
            }
        } catch (Exception unused) {
            C78949Uyf.LJIJJ("AddressParam");
        }
        return arrayList;
    }
}
