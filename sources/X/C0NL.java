package X;

import android.util.SparseArray;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0NL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NL {
    public static final /* synthetic */ int LIZIZ = 0;
    public final SparseArray<C0NJ> LIZ;

    public C0NL() {
        throw null;
    }

    public C0NL(SparseArray sparseArray) {
        this.LIZ = sparseArray;
    }

    public final JSONObject LIZ(Q9H q9h, java.util.Map definitionMap) {
        o.LJIIIZ(definitionMap, "definitionMap");
        JSONObject jSONObject = new JSONObject();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI == -1) {
                q9h.LJ(LIZJ);
                for (int i = 0; i < this.LIZ.size(); i++) {
                    C0NJ valueAt = this.LIZ.valueAt(i);
                    if (valueAt != null && (!jSONObject.has(valueAt.LIZ))) {
                        if (valueAt.LIZLLL) {
                            jSONObject.put(valueAt.LIZ, new JSONArray());
                        } else {
                            Object LIZIZ2 = valueAt.LIZIZ();
                            if ((!o.LJ(LIZIZ2, -1)) && LIZIZ2 != null) {
                                jSONObject.put(valueAt.LIZ, LIZIZ2);
                            }
                        }
                    }
                }
                return jSONObject;
            }
            C0NJ c0nj = this.LIZ.get(LJI);
            if (c0nj == null) {
                Q9J.LIZJ(q9h);
            } else if (c0nj.LIZLLL) {
                JSONArray optJSONArray = jSONObject.optJSONArray(c0nj.LIZ);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put(c0nj.LIZ, optJSONArray);
                }
                optJSONArray.put(c0nj.LIZ(q9h, definitionMap));
            } else if (c0nj instanceof C30471Hn) {
                OSZ LIZ = ((C30471Hn) c0nj).LIZ(q9h, definitionMap);
                JSONObject optJSONObject = jSONObject.optJSONObject(c0nj.LIZ);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    jSONObject.put(c0nj.LIZ, optJSONObject);
                }
                String obj = LIZ.getFirst().toString();
                Object second = LIZ.getSecond();
                if (second != null) {
                    optJSONObject.put(obj, second);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("decodedFieldData has null value: ");
                    LIZ2.append(LIZ);
                    String LIZIZ3 = X1D.LIZIZ(LIZ2);
                    LIZIZ3.toString();
                    throw new IllegalArgumentException(LIZIZ3);
                }
            } else {
                jSONObject.put(c0nj.LIZ, c0nj.LIZ(q9h, definitionMap));
            }
        }
    }
}
