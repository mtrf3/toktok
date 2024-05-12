package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EWh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36555EWh {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZIZ(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new EGQ("the key is null");
        }
        throw new EGQ("the key is not a number");
    }

    public static Object LIZLLL(Class cls, C36548EWa c36548EWa) {
        if (o.LJ(cls, Number.class)) {
            int i = C39360Fca.LIZ[c36548EWa.LJLJL.LJLIL.ordinal()];
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

    /* JADX WARN: Removed duplicated region for block: B:116:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EWZ LJ(X.EWZ r9, java.util.HashMap r10) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36555EWh.LJ(X.EWZ, java.util.HashMap):X.EWZ");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(java.lang.Object r7, X.C36548EWa r8, X.C36550EWc r9) {
        /*
            boolean r0 = r7 instanceof java.util.Map
            r6 = 0
            if (r0 == 0) goto L96
            if (r8 == 0) goto L93
            X.Pko<? extends com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel> r1 = r8.LJLJI
        L9:
            java.lang.Class<X.E2d> r0 = X.C35771E2d.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L96
            r0 = 1
        L18:
            java.lang.String r4 = "null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap"
            if (r0 == 0) goto L38
            if (r8 == 0) goto L26
            X.Pko<? extends com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel> r0 = r8.LJLJI
            if (r0 == 0) goto L26
            java.lang.Class r6 = X.C39557Ffl.LIZ(r0)
        L26:
            if (r7 == 0) goto L98
            com.lynx.react.bridge.ReadableMap r7 = (com.lynx.react.bridge.ReadableMap) r7
            java.util.HashMap r1 = r7.toHashMap()
            java.lang.String r0 = "(value as ReadableMap).toHashMap()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.Object r5 = LJFF(r6, r1, r9)
        L37:
            return r5
        L38:
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L8e
            if (r8 == 0) goto L8c
            X.Pko<? extends com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel> r1 = r8.LJLJI
        L40:
            java.lang.Class<X.E2d> r0 = X.C35771E2d.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L8e
            if (r7 == 0) goto La4
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r7, r0)
            r5.<init>(r0)
            java.util.Iterator r3 = r7.iterator()
        L61:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r1 = r3.next()
            if (r8 == 0) goto L8a
            X.Pko<? extends com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel> r0 = r8.LJLJI
            if (r0 == 0) goto L8a
            java.lang.Class r2 = X.C39557Ffl.LIZ(r0)
        L75:
            if (r1 == 0) goto L9e
            com.lynx.react.bridge.ReadableMap r1 = (com.lynx.react.bridge.ReadableMap) r1
            java.util.HashMap r1 = r1.toHashMap()
            java.lang.String r0 = "(it as ReadableMap).toHashMap()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.Object r0 = LJFF(r2, r1, r9)
            r5.add(r0)
            goto L61
        L8a:
            r2 = r6
            goto L75
        L8c:
            r1 = r6
            goto L40
        L8e:
            java.lang.Object r5 = X.C38381F4n.LJFF(r7)
            goto L37
        L93:
            r1 = r6
            goto L9
        L96:
            r0 = 0
            goto L18
        L98:
            X.Eqm r0 = new X.Eqm
            r0.<init>(r4)
            throw r0
        L9e:
            X.Eqm r0 = new X.Eqm
            r0.<init>(r4)
            throw r0
        La4:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<*>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36555EWh.LIZ(java.lang.Object, X.EWa, X.EWc):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    public static java.util.Map LIZJ(HashMap hashMap, EWZ ewz, C36550EWc c36550EWc) {
        ?? r5;
        if (ewz == null) {
            return null;
        }
        HashMap<String, C36548EWa> hashMap2 = ewz.LJLILLLLZI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap2.size()));
        for (Map.Entry<String, C36548EWa> entry : hashMap2.entrySet()) {
            String key = entry.getKey();
            Object obj = hashMap.get(entry.getValue().LJLILLLLZI);
            if (obj == null && entry.getValue().LJLJL.LJLIL != DefaultType.NONE) {
                hashMap.put(entry.getValue().LJLILLLLZI, LIZLLL(entry.getValue().LJLJLJ, entry.getValue()));
            }
            if ((!o.LJ(entry.getValue().LJLJI, C65352Pkq.LIZ(C35771E2d.class))) && (obj instanceof ReadableMap)) {
                HashMap<String, Object> hashMap3 = ((ReadableMap) obj).toHashMap();
                o.LJFF(hashMap3, "value.toHashMap()");
                EWZ ewz2 = c36550EWc.LJLJJL.get(C39557Ffl.LIZ(entry.getValue().LJLJI));
                if (ewz2 != null) {
                    r5 = LIZJ(hashMap3, ewz2, c36550EWc);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else if ((!o.LJ(entry.getValue().LJLJI, C65352Pkq.LIZ(C35771E2d.class))) && (obj instanceof ReadableArray)) {
                ArrayList<Object> arrayList = ((ReadableArray) obj).toArrayList();
                o.LJFF(arrayList, "value.toArrayList()");
                r5 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator<Object> it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        HashMap<String, Object> hashMap4 = ((ReadableMap) next).toHashMap();
                        o.LJFF(hashMap4, "(v as ReadableMap).toHashMap()");
                        EWZ ewz3 = c36550EWc.LJLJJL.get(C39557Ffl.LIZ(entry.getValue().LJLJI));
                        if (ewz3 != null) {
                            r5.add(LIZJ(hashMap4, ewz3, c36550EWc));
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
                    }
                }
            } else {
                r5 = hashMap.get(entry.getValue().LJLILLLLZI);
            }
            linkedHashMap.put(key, r5);
        }
        return linkedHashMap;
    }

    public static Object LJFF(Class cls, HashMap hashMap, C36550EWc c36550EWc) {
        EWZ LJ;
        if (cls == null || (LJ = LJ(c36550EWc.LJLJJL.get(cls), hashMap)) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C36554EWg(hashMap, c36550EWc, cls, LJ));
    }
}
