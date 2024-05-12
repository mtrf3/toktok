package X;

import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PsO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65820PsO {
    public static C65822PsQ LIZIZ() {
        return new C65822PsQ(null, C113554cx.LJJJLZIJ(new OSZ(2, null), new OSZ(4, null), new OSZ(9, null), new OSZ(17, null), new OSZ(341, null)), C113554cx.LJJJLZIJ(new OSZ(102, null), new OSZ(190, null), new OSZ(412, null)), null, null, null);
    }

    public final synchronized C65822PsQ LIZ() {
        C65822PsQ c65822PsQ;
        if (C65822PsQ.LJII == null) {
            C65822PsQ.LJII = LIZIZ();
        }
        c65822PsQ = C65822PsQ.LJII;
        if (c65822PsQ == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
        }
        return c65822PsQ;
    }

    public static java.util.Map LIZJ(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        if (length2 > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                int optInt2 = optJSONArray2.optInt(i3);
                                if (optInt2 != 0) {
                                    hashSet.add(Integer.valueOf(optInt2));
                                }
                                if (i4 >= length2) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }
}
