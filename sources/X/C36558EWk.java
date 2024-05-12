package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EWk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36558EWk implements InterfaceC37669EqP<JSONObject> {
    public InterfaceC38263Ezz LIZ;

    public static final int LIZLLL(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new EGQ("the key is null");
        }
        throw new EGQ("the key is not a number");
    }

    public static java.util.Map LJFF(JSONObject jSONObject, InterfaceC88472Yns interfaceC88472Yns) {
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

    public static final Object LJI(Method method, InterfaceC36563EWp interfaceC36563EWp) {
        Class<?> returnType = method.getReturnType();
        if (o.LJ(returnType, Number.class)) {
            int i = C39362Fcc.LIZ[interfaceC36563EWp.defaultValue().type().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Integer.valueOf(interfaceC36563EWp.defaultValue().intValue());
                    }
                    return Integer.valueOf(interfaceC36563EWp.defaultValue().intValue());
                }
                return Long.valueOf(interfaceC36563EWp.defaultValue().longValue());
            }
            return Double.valueOf(interfaceC36563EWp.defaultValue().doubleValue());
        }
        if (o.LJ(returnType, Boolean.TYPE) || o.LJ(returnType, Boolean.class)) {
            return Boolean.valueOf(interfaceC36563EWp.defaultValue().boolValue());
        }
        return interfaceC36563EWp.defaultValue().stringValue();
    }

    @Override // X.InterfaceC37669EqP
    public final java.util.Map LIZ(Class cls, Object obj) {
        String str;
        HashMap LJII;
        ConcurrentHashMap<Class<? extends InterfaceC37666EqM>, C36550EWc> concurrentHashMap;
        C36550EWc c36550EWc;
        JSONObject params = (JSONObject) obj;
        o.LJIIJ(params, "params");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        C36562EWo LIZ = C36551EWd.LIZ(str);
        if (LIZ != null && (concurrentHashMap = LIZ.LIZJ) != null && (c36550EWc = concurrentHashMap.get(cls)) != null) {
            EWZ LJ = C36556EWi.LJ(c36550EWc.LJLJI, params);
            if (LJ == null) {
                return null;
            }
            return C36556EWi.LIZJ(params, new AqS137S0200000_6(LJ, c36550EWc, 4));
        }
        Class LIZ2 = C36565EWr.LIZ(cls);
        if (LIZ2 == null || (LJII = LJII(params, LIZ2)) == null) {
            return null;
        }
        return LJFF(params, new AqS137S0200000_6(this, LJII, 0));
    }

    @Override // X.InterfaceC37669EqP
    public final Object LIZIZ(Class cls, java.util.Map params) {
        o.LJIIJ(params, "params");
        return C38381F4n.LJIIJ(params);
    }

    public final Object LIZJ(Object obj, InterfaceC36563EWp interfaceC36563EWp) {
        C65776Prg c65776Prg;
        boolean z = obj instanceof JSONObject;
        C65776Prg c65776Prg2 = null;
        Class<? extends XBaseModel> cls = null;
        if (z) {
            if (interfaceC36563EWp != null) {
                c65776Prg = C65352Pkq.LIZ(interfaceC36563EWp.nestedClassType());
            } else {
                c65776Prg = null;
            }
            if (!o.LJ(c65776Prg, C65352Pkq.LIZ(C35771E2d.class))) {
                if (interfaceC36563EWp != null) {
                    cls = interfaceC36563EWp.nestedClassType();
                }
                if (obj != null) {
                    return LJIIIIZZ((JSONObject) obj, cls);
                }
                throw new C37692Eqm("null cannot be cast to non-null type org.json.JSONObject");
            }
        }
        if (obj instanceof JSONArray) {
            if (interfaceC36563EWp != null) {
                c65776Prg2 = C65352Pkq.LIZ(interfaceC36563EWp.nestedClassType());
            }
            if (!o.LJ(c65776Prg2, C65352Pkq.LIZ(C35771E2d.class))) {
                if (obj != null) {
                    return O5Y.LJJJJZ((JSONArray) obj, new AqS172S0100000_6(this, interfaceC36563EWp, 4));
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

    public final JSONObject LJ(JSONObject jSONObject, Class cls) {
        Method[] declaredMethods;
        Object opt;
        if (cls != null && (declaredMethods = cls.getDeclaredMethods()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                InterfaceC36563EWp interfaceC36563EWp = (InterfaceC36563EWp) method.getAnnotation(InterfaceC36563EWp.class);
                if (interfaceC36563EWp != null && interfaceC36563EWp.isGetter()) {
                    arrayList.add(method);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Method method2 = (Method) it.next();
                InterfaceC36563EWp interfaceC36563EWp2 = (InterfaceC36563EWp) method2.getAnnotation(InterfaceC36563EWp.class);
                Object opt2 = jSONObject.opt(interfaceC36563EWp2.keyPath());
                if ((opt2 == null || o.LJ(opt2, JSONObject.NULL)) && interfaceC36563EWp2.defaultValue().type() != DefaultType.NONE) {
                    jSONObject.put(interfaceC36563EWp2.keyPath(), LJI(method2, interfaceC36563EWp2));
                }
                C65776Prg LIZ = C65352Pkq.LIZ(interfaceC36563EWp2.nestedClassType());
                String keyPath = interfaceC36563EWp2.keyPath();
                if ((!o.LJ(C65352Pkq.LIZ(interfaceC36563EWp2.nestedClassType()), C65352Pkq.LIZ(C35771E2d.class))) && (opt2 instanceof JSONObject)) {
                    opt = LJ((JSONObject) opt2, C39557Ffl.LIZ(LIZ));
                } else if ((!o.LJ(C65352Pkq.LIZ(interfaceC36563EWp2.nestedClassType()), C65352Pkq.LIZ(C35771E2d.class))) && (opt2 instanceof JSONArray)) {
                    opt = O5Y.LJJJJZ((JSONArray) opt2, new AqS137S0200000_6(LIZ, this, 1));
                } else {
                    opt = jSONObject.opt(interfaceC36563EWp2.keyPath());
                }
                jSONObject2.put(keyPath, opt);
            }
            return jSONObject2;
        }
        return new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b7 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap LJII(org.json.JSONObject r13, java.lang.Class r14) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36558EWk.LJII(org.json.JSONObject, java.lang.Class):java.util.HashMap");
    }

    public final Object LJIIIIZZ(JSONObject jSONObject, Class cls) {
        if (cls == null || LJII(jSONObject, cls) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C36564EWq(this, cls, jSONObject));
    }
}
