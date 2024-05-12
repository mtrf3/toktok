package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PJc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64240PJc {
    public static boolean LIZ(JSONObject jSONObject, JSONArray jSONArray, InterfaceC64239PJb interfaceC64239PJb) {
        JSONObject optJSONObject;
        if (PJC.LJI(jSONArray)) {
            C78685UuP.LJJJLL();
            return interfaceC64239PJb.LIZ(jSONObject);
        }
        boolean z = true;
        for (int i = 0; i < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i)) != null; i++) {
            JSONObject jSONObject2 = new JSONObject();
            PKN.LJI(jSONObject2, jSONObject);
            PKN.LJI(jSONObject2, optJSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("uploadFromFile with aidData ");
            LIZ.append(optJSONObject);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJJJLL();
            z &= interfaceC64239PJb.LIZ(jSONObject2);
        }
        return z;
    }
}
