package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.32G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32G {
    public static java.util.Map LIZ(java.util.Map map) {
        int i;
        java.util.Map map2;
        int i2;
        if (map == null) {
            return C113554cx.LJJJLIIL();
        }
        Iterator it = map.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            i3 += i2;
        }
        List list2 = (List) map.get("e:love");
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        java.util.Map LJJLIL = C113554cx.LJJLIL(map);
        LJJLIL.remove("e:love");
        if (i * 2 == i3) {
            return LJJLIL;
        }
        List list3 = (List) map.get("e:love");
        List list4 = null;
        if (list3 != null) {
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list3, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            for (Object obj : list3) {
                linkedHashMap.put(((C32H) obj).idempotent_id, obj);
            }
            map2 = C113554cx.LJJLIL(linkedHashMap);
        } else {
            map2 = null;
        }
        java.util.Set entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : entrySet) {
            if (!o.LJ(((Map.Entry) obj2).getKey(), "e:love")) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            if (value != null) {
                arrayList2.add(value);
            }
        }
        Iterator it3 = ((ArrayList) C32I.LJJLI(arrayList2)).iterator();
        while (it3.hasNext()) {
            C32H c32h = (C32H) it3.next();
            if (map2 != null && map2.containsKey(c32h.idempotent_id)) {
                map2.remove(c32h.key);
            }
        }
        Collection collection = (Collection) ((LinkedHashMap) LJJLIL).get("e:❤️");
        if (collection != null) {
            list4 = ORZ.LLJILJILJ(collection);
        }
        if (map2 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = map2.entrySet().iterator();
            while (it4.hasNext()) {
                Object value2 = ((Map.Entry) it4.next()).getValue();
                if (value2 != null) {
                    arrayList3.add(value2);
                }
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C32H c32h2 = (C32H) it5.next();
                if (list4 != null) {
                    C32H c32h3 = new C32H();
                    c32h3.msgUuid = c32h2.msgUuid;
                    c32h3.conversationId = c32h2.conversationId;
                    c32h3.uid = c32h2.uid;
                    c32h3.sec_uid = c32h2.sec_uid;
                    c32h3.create_time = c32h2.create_time;
                    c32h3.create_time_v2 = c32h2.create_time_v2;
                    c32h3.idempotent_id = c32h2.idempotent_id;
                    c32h3.key = "e:❤️";
                    c32h3.value = c32h2.value;
                    c32h3.version = c32h2.version;
                    c32h3.status = c32h2.status;
                    c32h3.deleted = c32h2.deleted;
                    list4.add(c32h3);
                }
            }
        }
        LJJLIL.put("e:❤️", list4);
        return LJJLIL;
    }
}
