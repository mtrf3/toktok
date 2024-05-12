package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS49S1200000_7;
import kotlin.jvm.internal.AqS61S0400000_1;
import kotlin.jvm.internal.AqS70S0201000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ght, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42237Ght {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 729));

    public static C42239Ghv LIZ(Class cls, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (!C78886Uxe.LJJJI(cls)) {
            Iterator it = ((ArrayList) C78886Uxe.LJIJ(cls)).iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                field.setAccessible(true);
                if (!field.getType().isPrimitive() && !field.getType().isEnum() && !o.LJ(field.getType(), cls)) {
                    if (o.LJ(field.getType(), String.class)) {
                        arrayList.add(field);
                    } else if (List.class.isAssignableFrom(field.getType())) {
                        arrayList2.add(field);
                    } else if (field.getType().isArray()) {
                        arrayList3.add(field);
                    } else if (java.util.Set.class.isAssignableFrom(field.getType())) {
                        arrayList4.add(field);
                    } else if (java.util.Map.class.isAssignableFrom(field.getType())) {
                        arrayList5.add(field);
                    } else if (!LatestUnreadVideoInfo.class.isAssignableFrom(field.getType())) {
                        Class<?> type = field.getType();
                        o.LJIIIIZZ(type, "it.type");
                        String name = field.getName();
                        o.LJIIIIZZ(name, "it.name");
                        arrayList6.add(LIZ(type, name));
                    }
                }
            }
        }
        return new C42239Ghv(cls, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    public final void LIZIZ(C42239Ghv c42239Ghv, Object obj, AqS49S1200000_7 aqS49S1200000_7) {
        for (Field field : c42239Ghv.LJLJI) {
            try {
                if (field.get(obj) != null) {
                    Object obj2 = field.get(obj);
                    if (obj2 instanceof String) {
                        String str = (String) aqS49S1200000_7.invoke(obj2);
                        if (!o.LJ(str, obj2)) {
                            field.set(obj, str);
                        }
                    }
                }
            } catch (Throwable th) {
                EQV.LIZ(th);
            }
        }
        for (Field field2 : c42239Ghv.LJLJJI) {
            LIZLLL(field2, (List) field2.get(obj), aqS49S1200000_7);
        }
        for (Field field3 : c42239Ghv.LJLJJL) {
            if (!field3.getType().getComponentType().isPrimitive()) {
                LIZJ(field3, (Object[]) field3.get(obj), aqS49S1200000_7);
            }
        }
        for (Field field4 : c42239Ghv.LJLJJLL) {
            LJI(field4, (java.util.Set) field4.get(obj), aqS49S1200000_7);
        }
        for (Field field5 : c42239Ghv.LJLJL) {
            LJ(field5, (java.util.Map) field5.get(obj), aqS49S1200000_7);
        }
        for (C42239Ghv c42239Ghv2 : c42239Ghv.LJLJLJ) {
            try {
                Field LJIILL = C78886Uxe.LJIILL(c42239Ghv.LJLIL, c42239Ghv2.LJLILLLLZI);
                LJIILL.setAccessible(true);
                Object obj3 = LJIILL.get(obj);
                if (obj3 != null) {
                    LIZIZ(c42239Ghv2, obj3, aqS49S1200000_7);
                }
            } catch (Throwable th2) {
                EQV.LIZ(th2);
            }
        }
    }

    public final void LIZJ(Field field, Object[] objArr, AqS49S1200000_7 aqS49S1200000_7) {
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            int length = objArr.length;
                            for (int i = 0; i < length; i++) {
                                Object obj2 = objArr[i];
                                if (obj2 != null) {
                                    LJFF(field, obj2, aqS49S1200000_7, new AqS70S0201000_7(objArr, aqS49S1200000_7, i, 2));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                EQV.LIZ(th);
            }
        }
    }

    public final void LIZLLL(Field field, List list, AqS49S1200000_7 aqS49S1200000_7) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                Object obj = ListProtector.get(list, i);
                                if (obj != null) {
                                    LJFF(field, obj, aqS49S1200000_7, new AqS70S0201000_7(list, i, aqS49S1200000_7, 3));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                EQV.LIZ(th);
            }
        }
    }

    public final void LJ(Field field, java.util.Map map, AqS49S1200000_7 aqS49S1200000_7) {
        if (map == null) {
            return;
        }
        try {
            if (map.isEmpty()) {
                return;
            }
            java.util.Set keySet = map.keySet();
            o.LJIIIIZZ(keySet, "map.keySet()");
            for (Object obj : keySet) {
                if (map.get(obj) != null) {
                    if (obj == null) {
                        return;
                    }
                    Iterator it = map.entrySet().iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        Object obj2 = map.get(key);
                        if (obj2 != null) {
                            LJFF(field, obj2, aqS49S1200000_7, new C65802i8(obj2, key, entry, aqS49S1200000_7, it, arrayList));
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        OSZ osz = (OSZ) it2.next();
                        map.put(osz.getFirst(), osz.getSecond());
                    }
                    return;
                }
            }
        } catch (Exception e) {
            EQV.LIZ(e);
        }
    }

    public final void LJI(Field field, java.util.Set set, AqS49S1200000_7 aqS49S1200000_7) {
        if (set != null) {
            try {
                if (!set.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            for (Object obj : set) {
                                if (obj != null) {
                                    LJFF(field, obj, aqS49S1200000_7, new AqS61S0400000_1(obj, set, aqS49S1200000_7, arrayList, 2));
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                OSZ osz = (OSZ) it2.next();
                                set.remove(osz.getFirst());
                                set.add(osz.getSecond());
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                EQV.LIZ(th);
            }
        }
    }

    public final void LJFF(Field field, Object obj, AqS49S1200000_7 aqS49S1200000_7, InterfaceC65784Pro interfaceC65784Pro) {
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive()) {
            if (o.LJ(cls, String.class)) {
                interfaceC65784Pro.invoke();
                return;
            }
            if (List.class.isAssignableFrom(cls)) {
                LIZLLL(field, (List) obj, aqS49S1200000_7);
                return;
            }
            if (cls.isArray()) {
                LIZJ(field, (Object[]) obj, aqS49S1200000_7);
                return;
            }
            if (java.util.Set.class.isAssignableFrom(cls)) {
                LJI(field, (java.util.Set) obj, aqS49S1200000_7);
            } else if (java.util.Map.class.isAssignableFrom(cls)) {
                LJ(field, (java.util.Map) obj, aqS49S1200000_7);
            } else {
                LIZIZ(LIZ(cls, ""), obj, aqS49S1200000_7);
            }
        }
    }
}
