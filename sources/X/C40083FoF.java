package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.FoF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40083FoF {
    public final java.util.Map<String, Object> LIZ = new HashMap();
    public final JSONObject LIZIZ;

    public C40083FoF(JSONObject jSONObject) {
        this.LIZIZ = jSONObject;
    }

    public final Object LIZIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (((HashMap) this.LIZ).containsKey(str)) {
            return ((HashMap) this.LIZ).get(str);
        }
        if (this.LIZIZ.has(str)) {
            Object o = this.LIZIZ.opt(str);
            if (!((HashMap) this.LIZ).containsKey(str)) {
                java.util.Map<String, Object> map = this.LIZ;
                o.LJFF(o, "o");
                ((HashMap) map).put(str, o);
            }
            return o;
        }
        int LJJLIIJ = s.LJJLIIJ(str, ".", 6);
        if (LJJLIIJ < 0) {
            return null;
        }
        String substring = str.substring(0, LJJLIIJ);
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Object LIZIZ = LIZIZ(substring);
        if (LIZIZ == null || !(LIZIZ instanceof JSONObject)) {
            return null;
        }
        String substring2 = str.substring(LJJLIIJ + 1);
        o.LJFF(substring2, "(this as java.lang.String).substring(startIndex)");
        Object opt = ((JSONObject) LIZIZ).opt(substring2);
        if (opt != null && !((HashMap) this.LIZ).containsKey(str)) {
            ((HashMap) this.LIZ).put(str, opt);
        }
        return opt;
    }

    public final Long LIZJ(Long l, String str) {
        Object LIZIZ = LIZIZ(str);
        if (LIZIZ == null || !(LIZIZ instanceof Number)) {
            return l;
        }
        return Long.valueOf(((Number) LIZIZ).longValue());
    }

    public final String LIZLLL(String str, String str2) {
        Object LIZIZ = LIZIZ(str);
        if (LIZIZ == null || !(LIZIZ instanceof String)) {
            return str2;
        }
        return (String) LIZIZ;
    }

    public final Long LIZ(Long l, String str, String str2) {
        return C40082FoE.LIZ(l, LIZIZ(str), LIZIZ(str2));
    }
}
