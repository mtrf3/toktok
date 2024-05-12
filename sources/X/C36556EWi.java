package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EWi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36556EWi {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZJ(JSONObject jSONObject, InterfaceC88472Yns interfaceC88472Yns) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJFF(keys, "this.keys()");
        while (keys.hasNext()) {
            String it = keys.next();
            o.LJFF(it, "it");
            hashMap.put(it, interfaceC88472Yns.invoke(new OSZ(it, jSONObject.opt(it))));
        }
        return hashMap;
    }

    public static Object LIZLLL(Class cls, C36548EWa c36548EWa) {
        if (o.LJ(cls, Number.class)) {
            int i = C39363Fcd.LIZ[c36548EWa.LJLJL.LJLIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Integer.valueOf(c36548EWa.LJLJL.LJLJJI);
                    }
                    return Integer.valueOf(c36548EWa.LJLJL.LJLJJI);
                }
                return Long.valueOf(c36548EWa.LJLJL.LJLJJLL);
            }
            return Double.valueOf(c36548EWa.LJLJL.LJLILLLLZI);
        }
        if (o.LJ(cls, Boolean.TYPE) || o.LJ(cls, Boolean.class)) {
            return Boolean.valueOf(c36548EWa.LJLJL.LJLJJL);
        }
        return c36548EWa.LJLJL.LJLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x008b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EWZ LJ(X.EWZ r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36556EWi.LJ(X.EWZ, org.json.JSONObject):X.EWZ");
    }

    public static Object LIZ(Object obj, C36548EWa c36548EWa, C36550EWc c36550EWc) {
        InterfaceC65350Pko<? extends XBaseModel> interfaceC65350Pko;
        InterfaceC65350Pko<? extends XBaseModel> interfaceC65350Pko2;
        boolean z = obj instanceof JSONObject;
        InterfaceC65350Pko<? extends XBaseModel> interfaceC65350Pko3 = null;
        r2 = null;
        Class cls = null;
        if (z) {
            if (c36548EWa != null) {
                interfaceC65350Pko = c36548EWa.LJLJI;
            } else {
                interfaceC65350Pko = null;
            }
            if (!o.LJ(interfaceC65350Pko, C65352Pkq.LIZ(C35771E2d.class))) {
                if (c36548EWa != null && (interfaceC65350Pko2 = c36548EWa.LJLJI) != null) {
                    cls = C39557Ffl.LIZ(interfaceC65350Pko2);
                }
                if (obj != null) {
                    return LJFF(cls, (JSONObject) obj, c36550EWc);
                }
                throw new C37692Eqm("null cannot be cast to non-null type org.json.JSONObject");
            }
        }
        if (obj instanceof JSONArray) {
            if (c36548EWa != null) {
                interfaceC65350Pko3 = c36548EWa.LJLJI;
            }
            if (!o.LJ(interfaceC65350Pko3, C65352Pkq.LIZ(C35771E2d.class))) {
                if (obj != null) {
                    return O5Y.LJJJJZ((JSONArray) obj, new AqS137S0200000_6(c36548EWa, c36550EWc, 2));
                }
                throw new C37692Eqm("null cannot be cast to non-null type org.json.JSONArray");
            }
            return C38381F4n.LJII((JSONArray) obj);
        }
        if (z) {
            return C38381F4n.LJIIIIZZ((JSONObject) obj);
        }
        if (o.LJ(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    public static JSONObject LIZIZ(JSONObject jSONObject, EWZ ewz, C36550EWc c36550EWc) {
        Object opt;
        if (ewz == null) {
            return null;
        }
        HashMap<String, C36548EWa> hashMap = ewz.LJLILLLLZI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap.size()));
        for (Map.Entry<String, C36548EWa> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object opt2 = jSONObject.opt(entry.getValue().LJLILLLLZI);
            if ((opt2 == null || o.LJ(opt2, JSONObject.NULL)) && entry.getValue().LJLJL.LJLIL != DefaultType.NONE) {
                jSONObject.put(entry.getValue().LJLILLLLZI, LIZLLL(entry.getValue().LJLJLJ, entry.getValue()));
            }
            if ((!o.LJ(entry.getValue().LJLJI, C65352Pkq.LIZ(C35771E2d.class))) && (opt2 instanceof JSONObject)) {
                JSONObject jSONObject2 = (JSONObject) opt2;
                EWZ ewz2 = c36550EWc.LJLJJL.get(C39557Ffl.LIZ(entry.getValue().LJLJI));
                if (ewz2 != null) {
                    opt = LIZIZ(jSONObject2, ewz2, c36550EWc);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else if ((!o.LJ(entry.getValue().LJLJI, C65352Pkq.LIZ(C35771E2d.class))) && (opt2 instanceof JSONArray)) {
                opt = O5Y.LJJJJZ((JSONArray) opt2, new AqS137S0200000_6(entry, c36550EWc, 3));
            } else {
                opt = jSONObject.opt(entry.getValue().LJLILLLLZI);
            }
            linkedHashMap.put(key, opt);
        }
        return new JSONObject(linkedHashMap);
    }

    public static Object LJFF(Class cls, JSONObject jSONObject, C36550EWc c36550EWc) {
        EWZ LJ;
        if (cls == null || (LJ = LJ(c36550EWc.LJLJJL.get(cls), jSONObject)) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C36559EWl(jSONObject, c36550EWc, cls, LJ));
    }
}
