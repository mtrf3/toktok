package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS9S0401000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ghs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42236Ghs<T, R extends Annotation> {
    public final Class<T> LIZ;
    public final Class<R> LIZIZ;
    public final boolean LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 730));

    public final C42238Ghu LIZ(Class<?> cls, String str) {
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
                if (!this.LIZJ || field.isAnnotationPresent(this.LIZIZ)) {
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
        }
        return new C42238Ghu(cls, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    public final void LIZIZ(T any, InterfaceC42234Ghq<R> interfaceC42234Ghq) {
        o.LJIIIZ(any, "any");
        LIZJ((C42238Ghu) this.LIZLLL.getValue(), any, interfaceC42234Ghq);
    }

    public C42236Ghs(Class<T> cls, Class<R> cls2, boolean z) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
        this.LIZJ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(C42238Ghu c42238Ghu, Object obj, InterfaceC42234Ghq<R> interfaceC42234Ghq) {
        Annotation annotation;
        for (Field field : c42238Ghu.LJLJI) {
            try {
                if (field.get(obj) != null && (annotation = field.getAnnotation(this.LIZIZ)) != null) {
                    interfaceC42234Ghq.LJ(field, obj, annotation);
                }
            } catch (Throwable th) {
                C78886Uxe.LJJIII(th);
            }
        }
        for (Field field2 : c42238Ghu.LJLJJI) {
            LJ(field2, (List) field2.get(obj), field2.getAnnotation(this.LIZIZ), interfaceC42234Ghq);
        }
        for (Field field3 : c42238Ghu.LJLJJL) {
            if (!field3.getType().getComponentType().isPrimitive()) {
                LIZLLL(field3, (Object[]) field3.get(obj), field3.getAnnotation(this.LIZIZ), interfaceC42234Ghq);
            }
        }
        for (Field field4 : c42238Ghu.LJLJJLL) {
            LJII(field4, (java.util.Set) field4.get(obj), field4.getAnnotation(this.LIZIZ), interfaceC42234Ghq);
        }
        for (Field field5 : c42238Ghu.LJLJL) {
            LJFF(field5, (java.util.Map) field5.get(obj), field5.getAnnotation(this.LIZIZ), interfaceC42234Ghq);
        }
        for (C42238Ghu c42238Ghu2 : c42238Ghu.LJLJLJ) {
            try {
                Field LJIILL = C78886Uxe.LJIILL(c42238Ghu.LJLIL, c42238Ghu2.LJLILLLLZI);
                LJIILL.setAccessible(true);
                Object obj2 = LJIILL.get(obj);
                if (obj2 != null) {
                    LIZJ(c42238Ghu2, obj2, interfaceC42234Ghq);
                }
            } catch (Throwable th2) {
                C78886Uxe.LJJIII(th2);
            }
        }
    }

    public final void LIZLLL(Field field, Object[] objArr, R r, InterfaceC42234Ghq<R> interfaceC42234Ghq) {
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            int length = objArr.length;
                            for (int i = 0; i < length; i++) {
                                Object obj2 = objArr[i];
                                if (obj2 != null) {
                                    LJI(field, obj2, r, interfaceC42234Ghq, new AqS9S0401000_7((InterfaceC42234Ghq) interfaceC42234Ghq, (InterfaceC42234Ghq<int>) field, (Field) objArr, (Object[]) i, (int) r, 0));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C78886Uxe.LJJIII(th);
            }
        }
    }

    public final void LJ(Field field, List<?> list, R r, InterfaceC42234Ghq<R> interfaceC42234Ghq) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator<?> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                Object obj = ListProtector.get(list, i);
                                if (obj != null) {
                                    LJI(field, obj, r, interfaceC42234Ghq, new AqS9S0401000_7((InterfaceC42234Ghq) interfaceC42234Ghq, (InterfaceC42234Ghq<int>) field, (Field) list, (List<?>) i, (int) r, 1));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C78886Uxe.LJJIII(th);
            }
        }
    }

    public final void LJFF(Field field, java.util.Map<?, ?> map, R r, InterfaceC42234Ghq<R> interfaceC42234Ghq) {
        if (map == null) {
            return;
        }
        try {
            if (map.isEmpty()) {
                return;
            }
            java.util.Set<?> keySet = map.keySet();
            o.LJIIIIZZ(keySet, "map.keySet()");
            for (Object obj : keySet) {
                if (map.get(obj) != null) {
                    if (obj == null) {
                        return;
                    }
                    java.util.Set<?> keySet2 = map.keySet();
                    o.LJIIIIZZ(keySet2, "map.keySet()");
                    for (Object obj2 : keySet2) {
                        Object obj3 = map.get(obj2);
                        if (obj3 != null) {
                            LJI(field, obj3, r, interfaceC42234Ghq, new C42235Ghr(interfaceC42234Ghq, field, map, obj2, r));
                        }
                    }
                    return;
                }
            }
        } catch (Exception e) {
            C78886Uxe.LJJIII(e);
        }
    }

    public final void LJII(Field field, java.util.Set<?> set, R r, InterfaceC42234Ghq<R> interfaceC42234Ghq) {
        if (set != null) {
            try {
                if (!set.isEmpty()) {
                    Iterator<?> it = set.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : set) {
                                if (obj != null) {
                                    LJI(field, obj, r, interfaceC42234Ghq, new GTH(interfaceC42234Ghq, field, set, obj, r, arrayList));
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
                C78886Uxe.LJJIII(th);
            }
        }
    }

    public final void LJI(Field field, Object obj, R r, InterfaceC42234Ghq<R> interfaceC42234Ghq, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive()) {
            if (o.LJ(cls, String.class)) {
                if (r != null) {
                    interfaceC65784Pro.invoke();
                }
            } else {
                if (List.class.isAssignableFrom(cls)) {
                    LJ(field, (List) obj, r, interfaceC42234Ghq);
                    return;
                }
                if (cls.isArray()) {
                    LIZLLL(field, (Object[]) obj, r, interfaceC42234Ghq);
                    return;
                }
                if (java.util.Set.class.isAssignableFrom(cls)) {
                    LJII(field, (java.util.Set) obj, r, interfaceC42234Ghq);
                } else if (java.util.Map.class.isAssignableFrom(cls)) {
                    LJFF(field, (java.util.Map) obj, r, interfaceC42234Ghq);
                } else {
                    LIZJ(LIZ(cls, ""), obj, interfaceC42234Ghq);
                }
            }
        }
    }
}
