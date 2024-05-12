package X;

import com.lynx.react.bridge.JavaOnlyMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EuJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37911EuJ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Object LIZ;

    static {
        new C37910EuI();
    }

    public final JSONObject LIZ() {
        Object obj = this.LIZ;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof java.util.Map) {
            if (obj != null) {
                return C38381F4n.LJIIJ((java.util.Map) obj);
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        }
        if (obj instanceof JavaOnlyMap) {
            C38010Evu.LIZ.getClass();
            return C38010Evu.LJ((JavaOnlyMap) obj);
        }
        return new JSONObject();
    }

    public final String toString() {
        if (C37905EuD.LJIIJJI) {
            String jSONObject = LIZ().toString();
            o.LJFF(jSONObject, "toJSONObject().toString()");
            return jSONObject;
        }
        return "";
    }

    public C37911EuJ(Object parcel) {
        o.LJIIJ(parcel, "parcel");
        this.LIZ = parcel;
    }

    public final JSONObject LIZIZ(C37955Ev1 c37955Ev1) {
        JSONObject jSONObject;
        Boolean bool;
        Object obj = this.LIZ;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if (obj instanceof java.util.Map) {
            if (obj != null) {
                jSONObject = C38381F4n.LJIIJ((java.util.Map) obj);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            }
        } else if (obj instanceof JavaOnlyMap) {
            C38010Evu.LIZ.getClass();
            jSONObject = C38010Evu.LJ((JavaOnlyMap) obj);
        } else {
            jSONObject = new JSONObject();
        }
        if (c37955Ev1 != null) {
            bool = c37955Ev1.LIZIZ;
        } else {
            bool = null;
        }
        jSONObject.put("_jsb_secure_token_checked", bool);
        return jSONObject;
    }
}
