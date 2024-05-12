package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import defpackage.i0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ED5 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.annotation.Annotation r1, java.lang.Object r2) {
        /*
            boolean r0 = r1 instanceof X.ED7
            if (r0 == 0) goto L12
            X.ED7 r1 = (X.ED7) r1
            java.lang.String[] r0 = r1.option()
            boolean r0 = X.ORY.LJJIJIIJIL(r2, r0)
            if (r0 != 0) goto L2b
        L10:
            r0 = 1
        L11:
            return r0
        L12:
            boolean r0 = r1 instanceof X.ED6
            if (r0 == 0) goto L10
            X.ED6 r1 = (X.ED6) r1
            int[] r1 = r1.option()
            if (r2 == 0) goto L2d
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r0 = r2.intValue()
            boolean r0 = X.ORY.LJJIJ(r0, r1)
            if (r0 != 0) goto L2b
            goto L10
        L2b:
            r0 = 0
            goto L11
        L2d:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ED5.LIZIZ(java.lang.annotation.Annotation, java.lang.Object):boolean");
    }

    public static XBaseModel LIZJ(Class cls, String str) {
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new EWY(cls, str));
        if (newProxyInstance != null) {
            return (XBaseModel) newProxyInstance;
        }
        throw new C37692Eqm("null cannot be cast to non-null type T");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static Object LIZLLL(Object obj, Class cls, Class cls2) {
        Object linkedHashMap;
        if (o.LJ(cls2, Object.class) && (obj instanceof InterfaceC35934E8k)) {
            return ((InterfaceC35934E8k) obj).getValue();
        }
        if ((obj instanceof Integer) || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || obj == null) {
            return obj;
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            linkedHashMap = new ArrayList(C32I.LJJL(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                linkedHashMap.add(LIZLLL(it.next(), cls, cls2));
            }
        } else if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), LIZLLL(entry.getValue(), cls, cls2));
            }
        } else {
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                return obj;
            }
            XBaseModel xBaseModel = (XBaseModel) cls.cast(obj);
            if (xBaseModel != null) {
                return xBaseModel.convert();
            }
            return null;
        }
        return linkedHashMap;
    }

    public static void LIZ(boolean z, Annotation annotation, Object obj, String str) {
        if (z) {
            if (obj instanceof Collection) {
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return;
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (LIZIZ(annotation, it.next())) {
                    }
                }
                return;
            }
            if (!LIZIZ(annotation, obj)) {
                return;
            }
            throw new EGN(i0.LJFF(str, " is not valid"));
        }
    }
}
