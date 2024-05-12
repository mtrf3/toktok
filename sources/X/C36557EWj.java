package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EWj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36557EWj implements InterfaceC37669EqP<ReadableMap> {
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

    public static final Object LJFF(Method method, InterfaceC36563EWp interfaceC36563EWp) {
        Class<?> returnType = method.getReturnType();
        if (o.LJ(returnType, Number.class)) {
            int i = C39361Fcb.LIZ[interfaceC36563EWp.defaultValue().type().ordinal()];
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
        C36550EWc c36550EWc;
        InterfaceC36563EWp interfaceC36563EWp;
        ConcurrentHashMap<Class<? extends InterfaceC37666EqM>, C36550EWc> concurrentHashMap;
        ReadableMap params = (ReadableMap) obj;
        o.LJIIJ(params, "params");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        C36562EWo LIZ = C36551EWd.LIZ(str);
        if (LIZ != null && (concurrentHashMap = LIZ.LIZJ) != null) {
            c36550EWc = concurrentHashMap.get(cls);
        } else {
            c36550EWc = null;
        }
        if (c36550EWc != null) {
            HashMap<String, Object> hashMap = params.toHashMap();
            o.LJFF(hashMap, "params.toHashMap()");
            EWZ LJ = C36555EWh.LJ(c36550EWc.LJLJI, hashMap);
            if (LJ == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap.size()));
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), C36555EWh.LIZ(entry.getValue(), LJ.LJLILLLLZI.get(entry.getKey()), c36550EWc));
            }
            return linkedHashMap;
        }
        System.out.println((Object) "idl ReadableMap->Map. no cache");
        Class<? extends XBaseModel> LIZ2 = C36565EWr.LIZ(cls);
        if (LIZ2 == null) {
            return null;
        }
        HashMap<String, Object> hashMap2 = params.toHashMap();
        o.LJFF(hashMap2, "params.toHashMap()");
        HashMap<String, OSZ<Method, InterfaceC36563EWp>> LJI = LJI(LIZ2, hashMap2);
        if (LJI == null) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap2.size()));
        for (Map.Entry<String, Object> entry2 : hashMap2.entrySet()) {
            String key = entry2.getKey();
            OSZ<Method, InterfaceC36563EWp> osz = LJI.get(entry2.getKey());
            if (osz != null) {
                interfaceC36563EWp = osz.getSecond();
            } else {
                interfaceC36563EWp = null;
            }
            linkedHashMap2.put(key, LIZJ(entry2.getValue(), interfaceC36563EWp));
        }
        return linkedHashMap2;
    }

    @Override // X.InterfaceC37669EqP
    public final Object LIZIZ(Class cls, java.util.Map params) {
        o.LJIIJ(params, "params");
        return C38381F4n.LIZLLL(params);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.Object r8, X.InterfaceC36563EWp r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof java.util.Map
            r6 = 0
            if (r0 == 0) goto L9a
            if (r9 == 0) goto L97
            java.lang.Class r0 = r9.nestedClassType()
            X.Prg r1 = X.C65352Pkq.LIZ(r0)
        Lf:
            java.lang.Class<X.E2d> r0 = X.C35771E2d.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L9a
            r0 = 1
        L1e:
            java.lang.String r5 = "null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap"
            if (r0 == 0) goto L3a
            if (r9 == 0) goto L28
            java.lang.Class r6 = r9.nestedClassType()
        L28:
            if (r8 == 0) goto L9c
            com.lynx.react.bridge.ReadableMap r8 = (com.lynx.react.bridge.ReadableMap) r8
            java.util.HashMap r1 = r8.toHashMap()
            java.lang.String r0 = "(value as ReadableMap).toHashMap()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.Object r4 = r7.LJII(r6, r1)
        L39:
            return r4
        L3a:
            boolean r0 = r8 instanceof java.util.List
            if (r0 == 0) goto L92
            if (r9 == 0) goto L90
            java.lang.Class r0 = r9.nestedClassType()
            X.Prg r1 = X.C65352Pkq.LIZ(r0)
        L48:
            java.lang.Class<X.E2d> r0 = X.C35771E2d.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L92
            if (r8 == 0) goto La8
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r8, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r8.iterator()
        L69:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r3.next()
            if (r9 == 0) goto L8e
            java.lang.Class r2 = r9.nestedClassType()
        L79:
            if (r0 == 0) goto La2
            com.lynx.react.bridge.ReadableMap r0 = (com.lynx.react.bridge.ReadableMap) r0
            java.util.HashMap r1 = r0.toHashMap()
            java.lang.String r0 = "(it as ReadableMap).toHashMap()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.Object r0 = r7.LJII(r2, r1)
            r4.add(r0)
            goto L69
        L8e:
            r2 = r6
            goto L79
        L90:
            r1 = r6
            goto L48
        L92:
            java.lang.Object r4 = X.C38381F4n.LJFF(r8)
            goto L39
        L97:
            r1 = r6
            goto Lf
        L9a:
            r0 = 0
            goto L1e
        L9c:
            X.Eqm r0 = new X.Eqm
            r0.<init>(r5)
            throw r0
        La2:
            X.Eqm r0 = new X.Eqm
            r0.<init>(r5)
            throw r0
        La8:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<*>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36557EWj.LIZJ(java.lang.Object, X.EWp):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    public final HashMap<String, Object> LJ(Class<? extends XBaseModel> cls, HashMap<String, Object> hashMap) {
        Method[] declaredMethods;
        ?? r4;
        HashMap hashMap2 = null;
        hashMap2 = null;
        if (cls != null && (declaredMethods = cls.getDeclaredMethods()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                InterfaceC36563EWp interfaceC36563EWp = (InterfaceC36563EWp) method.getAnnotation(InterfaceC36563EWp.class);
                if (interfaceC36563EWp != null && interfaceC36563EWp.isGetter()) {
                    arrayList.add(method);
                }
            }
            hashMap2 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Method method2 = (Method) it.next();
                InterfaceC36563EWp interfaceC36563EWp2 = (InterfaceC36563EWp) method2.getAnnotation(InterfaceC36563EWp.class);
                Object obj = hashMap.get(interfaceC36563EWp2.keyPath());
                if (obj == null && interfaceC36563EWp2.defaultValue().type() != DefaultType.NONE) {
                    hashMap.put(interfaceC36563EWp2.keyPath(), LJFF(method2, interfaceC36563EWp2));
                }
                String keyPath = interfaceC36563EWp2.keyPath();
                if ((!o.LJ(C65352Pkq.LIZ(interfaceC36563EWp2.nestedClassType()), C65352Pkq.LIZ(C35771E2d.class))) && (obj instanceof ReadableMap)) {
                    Class<? extends XBaseModel> nestedClassType = interfaceC36563EWp2.nestedClassType();
                    HashMap<String, Object> hashMap3 = ((ReadableMap) obj).toHashMap();
                    o.LJFF(hashMap3, "value.toHashMap()");
                    r4 = LJ(nestedClassType, hashMap3);
                } else if ((!o.LJ(C65352Pkq.LIZ(interfaceC36563EWp2.nestedClassType()), C65352Pkq.LIZ(C35771E2d.class))) && (obj instanceof ReadableArray)) {
                    ArrayList<Object> arrayList2 = ((ReadableArray) obj).toArrayList();
                    o.LJFF(arrayList2, "value.toArrayList()");
                    r4 = new ArrayList(C32I.LJJL(arrayList2, 10));
                    Iterator<Object> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Class<? extends XBaseModel> nestedClassType2 = interfaceC36563EWp2.nestedClassType();
                        if (next != null) {
                            HashMap<String, Object> hashMap4 = ((ReadableMap) next).toHashMap();
                            o.LJFF(hashMap4, "(it as ReadableMap).toHashMap()");
                            r4.add(LJ(nestedClassType2, hashMap4));
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
                        }
                    }
                } else {
                    r4 = hashMap.get(interfaceC36563EWp2.keyPath());
                }
                hashMap2.put(keyPath, r4);
            }
        }
        return hashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, X.OSZ<java.lang.reflect.Method, X.InterfaceC36563EWp>> LJI(java.lang.Class<? extends com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel> r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36557EWj.LJI(java.lang.Class, java.util.HashMap):java.util.HashMap");
    }

    public final Object LJII(Class<? extends XBaseModel> cls, HashMap<String, Object> hashMap) {
        if (cls == null || LJI(cls, hashMap) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C36560EWm(this, cls, hashMap));
    }
}
