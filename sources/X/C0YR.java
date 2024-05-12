package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0YR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YR {
    public static final C32281Om LIZ = new C0YM<C0YQ>() { // from class: X.1Om
        @Override // X.C0YM
        public final C0YQ LIZIZ() {
            if (C01H.LIZIZ != null) {
                return C09000Wy.LIZ.LJIIIIZZ;
            }
            return null;
        }
    };

    public static boolean LIZIZ() {
        return LIZ.LIZ() != null;
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        C32281Om c32281Om = LIZ;
        if (c32281Om.LIZ() != null) {
            try {
                jSONObject.put("sdkVersion", "2.2.12.d");
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            try {
                jSONObject.put("second_appid", "4159");
                jSONObject.put("second_appname", "vboost_oversea");
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onInternalEventV3 ");
            LIZ2.append(str);
            LIZ2.append(": ");
            LIZ2.append(jSONObject);
            X1D.LIZIZ(LIZ2);
            C0YN.LIZ(3);
            c32281Om.LIZ().LIZ(str, jSONObject);
        }
    }
}
