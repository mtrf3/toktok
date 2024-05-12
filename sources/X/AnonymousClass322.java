package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.322, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass322 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static java.util.Map LIZ(java.util.Map map) {
        ?? r3;
        C80763Ey.LIZ(false).toString();
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            if (list != null) {
                r3 = new ArrayList();
                for (Object obj : list) {
                    if (!TextUtils.equals(String.valueOf(((C32H) obj).uid), r6)) {
                        r3.add(obj);
                    }
                }
            } else {
                r3 = C61878OQg.INSTANCE;
            }
            ORS.LJJLIIIJILLIZJL(r3, arrayList);
        }
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C32H c32h = (C32H) next;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c32h.key);
            LIZ.append(c32h.msgUuid);
            LIZ.append(c32h.conversationId);
            LIZ.append(c32h.idempotent_id);
            linkedHashMap.put(X1D.LIZIZ(LIZ), next);
        }
        return linkedHashMap;
    }

    public static List LIZIZ(java.util.Map map, java.util.Map map2, AnonymousClass320 anonymousClass320) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                if (map2 == null || !map2.containsKey(key)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                C32H c32h = (C32H) entry2.getValue();
                String str = ((C32H) entry2.getValue()).key;
                o.LJIIIIZZ(str, "entry.value.key");
                arrayList.add(new C772131h(new AnonymousClass323(c32h, str), anonymousClass320));
            }
            return arrayList;
        }
        return null;
    }
}
