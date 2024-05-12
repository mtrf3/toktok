package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jix, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49947Jix {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object LIZ(Object obj, ChunkPatch chunkPatch) {
        C49948Jiy c49948Jiy;
        Object obj2;
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (obj != null && arrayList != null && arrayList.size() != 0) {
            if (((String) ListProtector.get(arrayList, 0)).equals("")) {
                ListProtector.remove(arrayList, 0);
            }
            if (arrayList.size() <= 1) {
                return obj;
            }
            HashMap<String, C49948Jiy> hashMap = chunkPatch.LIZLLL;
            if (hashMap != 0) {
                c49948Jiy = (C49948Jiy) hashMap.get(ListProtector.get(arrayList, 0));
            } else {
                c49948Jiy = null;
            }
            if (c49948Jiy != null && c49948Jiy.LIZIZ == obj) {
                ListProtector.remove(arrayList, 0);
                Object obj3 = c49948Jiy.LIZJ;
                if (arrayList.size() <= 1) {
                    chunkPatch.LIZ = obj3;
                    return obj3;
                }
                if (obj3 instanceof List) {
                    int parseInt = CastIntegerProtector.parseInt((String) ListProtector.get(arrayList, 0));
                    List list = (List) obj3;
                    if (parseInt > list.size() - 1) {
                        return null;
                    }
                    Object obj4 = ListProtector.get(list, parseInt);
                    ListProtector.remove(arrayList, 0);
                    if (arrayList.size() <= 1) {
                        chunkPatch.LIZ = obj4;
                        return obj4;
                    }
                    return LIZ(obj4, chunkPatch);
                }
                if (obj3 instanceof java.util.Map) {
                    return LIZJ((java.util.Map) obj3, chunkPatch);
                }
                return LIZ(obj3, chunkPatch);
            }
            if (obj instanceof java.util.Map) {
                return LIZJ((java.util.Map) obj, chunkPatch);
            }
            Field[] LIZ = C65348Pkm.LIZ(obj);
            for (int i = 0; i <= arrayList.size() - 1; i++) {
                Object obj5 = ListProtector.get(arrayList, 0);
                C49948Jiy c49948Jiy2 = (C49948Jiy) hashMap.get(obj5);
                if (c49948Jiy2 != null && (obj2 = c49948Jiy2.LIZIZ) != null && obj2.getClass().equals(obj.getClass())) {
                    Field field = c49948Jiy2.LIZ;
                    field.setAccessible(true);
                    ListProtector.remove(arrayList, 0);
                    if (arrayList.size() <= 1) {
                        Object obj6 = field.get(obj);
                        chunkPatch.LIZ = obj6;
                        return obj6;
                    }
                    if (Collection.class.isAssignableFrom(field.getType())) {
                        List list2 = (List) field.get(obj);
                        int parseInt2 = CastIntegerProtector.parseInt((String) ListProtector.get(arrayList, 0));
                        if (parseInt2 > list2.size() - 1) {
                            return null;
                        }
                        Object obj7 = ListProtector.get(list2, parseInt2);
                        ListProtector.remove(arrayList, 0);
                        if (arrayList.size() <= 1) {
                            chunkPatch.LIZ = obj7;
                            return obj7;
                        }
                        return LIZ(obj7, chunkPatch);
                    }
                    Object obj8 = field.get(obj);
                    chunkPatch.LIZ = obj8;
                    return LIZ(obj8, chunkPatch);
                }
                for (Field field2 : LIZ) {
                    field2.setAccessible(true);
                    List<String> LIZIZ = C65348Pkm.LIZIZ(field2);
                    if (LIZIZ != null) {
                        Iterator<String> it = LIZIZ.iterator();
                        while (it.hasNext()) {
                            if (it.next().equals(obj5)) {
                                ListProtector.remove(arrayList, 0);
                                if (arrayList.size() <= 1) {
                                    Object obj9 = field2.get(obj);
                                    chunkPatch.LIZ = obj9;
                                    C49948Jiy c49948Jiy3 = new C49948Jiy();
                                    c49948Jiy3.LIZ = field2;
                                    c49948Jiy3.LIZIZ = obj;
                                    c49948Jiy3.LIZJ = obj9;
                                    hashMap.put(obj5, c49948Jiy3);
                                    return obj9;
                                }
                                if (Collection.class.isAssignableFrom(field2.getType())) {
                                    List list3 = (List) field2.get(obj);
                                    C49948Jiy c49948Jiy4 = new C49948Jiy();
                                    c49948Jiy4.LIZ = field2;
                                    c49948Jiy4.LIZIZ = obj;
                                    c49948Jiy4.LIZJ = list3;
                                    hashMap.put(obj5, c49948Jiy4);
                                    Object obj10 = ListProtector.get(list3, CastIntegerProtector.parseInt((String) ListProtector.get(arrayList, 0)));
                                    ListProtector.remove(arrayList, 0);
                                    if (arrayList.size() <= 1) {
                                        chunkPatch.LIZ = obj10;
                                        return obj10;
                                    }
                                    return LIZ(obj10, chunkPatch);
                                }
                                Object obj11 = field2.get(obj);
                                chunkPatch.LIZ = obj11;
                                C49948Jiy c49948Jiy5 = new C49948Jiy();
                                c49948Jiy5.LIZ = field2;
                                c49948Jiy5.LIZIZ = obj;
                                c49948Jiy5.LIZJ = obj11;
                                hashMap.put(obj5, c49948Jiy5);
                                return LIZ(obj11, chunkPatch);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Object LIZJ(java.util.Map<String, Object> map, ChunkPatch chunkPatch) {
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList == null) {
            return null;
        }
        if (((String) ListProtector.get(arrayList, 0)).equals("")) {
            ListProtector.remove(arrayList, 0);
        }
        if (arrayList.size() <= 1) {
            return map;
        }
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            Object obj = ListProtector.get(arrayList, 0);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getKey().equals(obj)) {
                    ListProtector.remove(arrayList, 0);
                    Object value = entry.getValue();
                    chunkPatch.LIZ = value;
                    chunkPatch.LIZIZ = arrayList;
                    if (arrayList.size() <= 1) {
                        return value;
                    }
                    if (value instanceof ArrayList) {
                        try {
                            Object obj2 = ListProtector.get((ArrayList) value, CastIntegerProtector.parseInt((String) ListProtector.get(arrayList, 0)));
                            ListProtector.remove(arrayList, 0);
                            if (arrayList.size() <= 1) {
                                chunkPatch.LIZ = obj2;
                                return obj2;
                            }
                            if (obj2 instanceof java.util.Map) {
                                return LIZJ((java.util.Map) obj2, chunkPatch);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (value instanceof java.util.Map) {
                        return LIZJ((java.util.Map) value, chunkPatch);
                    }
                }
            }
        }
        return null;
    }

    public static Field LIZIZ(String str, Object obj, HashMap hashMap) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        if (hashMap != null && hashMap.get(str) != null && ((C49948Jiy) hashMap.get(str)).LIZIZ != null && ((C49948Jiy) hashMap.get(str)).LIZIZ.getClass().equals(obj.getClass())) {
            C49948Jiy c49948Jiy = (C49948Jiy) hashMap.get(str);
            c49948Jiy.LIZ.setAccessible(true);
            return c49948Jiy.LIZ;
        }
        for (Field field : C65348Pkm.LIZ(obj)) {
            field.setAccessible(true);
            List<String> LIZIZ = C65348Pkm.LIZIZ(field);
            if (LIZIZ != null) {
                Iterator<String> it = LIZIZ.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return field;
                    }
                }
            }
        }
        return null;
    }
}
