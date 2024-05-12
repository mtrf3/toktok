package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.37c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C787237c {
    public static final java.util.Map<String, Integer> LIZ = C113554cx.LJJL(new OSZ("1-2", 0), new OSZ("1-1", 1), new OSZ("1-8", 2), new OSZ("1-7", 3), new OSZ("1-4", 4));

    public static List LIZ(List list) {
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        String str4;
        java.util.Map<String, Integer> order = LIZ;
        o.LJIIIZ(order, "order");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str5 = ((C787637g) obj).LIZ;
            Object obj2 = linkedHashMap.get(str5);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str5, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    C789537z c789537z = ((C787637g) next).LIZJ;
                    if (c789537z != null && (str4 = c789537z.LIZIZ) != null) {
                        str = ujb.o.LJJJJZ(str4, "_", "-", false);
                    } else {
                        str = null;
                    }
                    Integer num = order.get(str);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    do {
                        Object next2 = it.next();
                        C789537z c789537z2 = ((C787637g) next2).LIZJ;
                        if (c789537z2 != null && (str3 = c789537z2.LIZIZ) != null) {
                            str2 = ujb.o.LJJJJZ(str3, "_", "-", false);
                        } else {
                            str2 = null;
                        }
                        Integer num2 = order.get(str2);
                        if (num2 != null) {
                            i2 = num2.intValue();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it.hasNext());
                }
                linkedHashMap2.put(key, next);
            } else {
                throw new NoSuchElementException();
            }
        }
        return ORZ.LLJI(linkedHashMap2.values());
    }
}
