package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.NxL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61031NxL {
    public static boolean LIZ(Object obj, Object obj2) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (obj == obj2) {
            if (!(obj instanceof Collection) && !(obj instanceof java.util.Map) && !(obj instanceof Object[])) {
                return true;
            }
            return false;
        }
        Boolean bool4 = null;
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{obj, obj2})).size() == 2) {
            bool = Boolean.valueOf(obj instanceof InterfaceC61032NxM);
        } else {
            bool = null;
        }
        Boolean bool5 = Boolean.TRUE;
        if (o.LJ(bool, bool5)) {
            if (obj != null) {
                InterfaceC61032NxM interfaceC61032NxM = (InterfaceC61032NxM) obj;
                if (obj2 != null) {
                    return interfaceC61032NxM.LIZ();
                }
                o.LJIIZILJ();
                throw null;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.model.sync.ISyncComparable<T>");
        }
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{obj, obj2})).size() == 2) {
            bool2 = Boolean.valueOf(obj instanceof List);
        } else {
            bool2 = null;
        }
        if (o.LJ(bool2, bool5)) {
            if (obj != null) {
                List list = (List) obj;
                if (obj2 != null) {
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    ListIterator listIterator = list.listIterator();
                    ListIterator listIterator2 = list2.listIterator();
                    while (listIterator.hasNext() && listIterator2.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = listIterator2.next();
                        C73919Szj.LIZLLL.getClass();
                        if (!LIZ(next, next2)) {
                            return false;
                        }
                    }
                    return true;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<*>");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<*>");
        }
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{obj, obj2})).size() == 2) {
            bool3 = Boolean.valueOf(obj instanceof Object[]);
        } else {
            bool3 = null;
        }
        if (o.LJ(bool3, bool5)) {
            if (obj != null) {
                Object[] objArr = (Object[]) obj;
                if (obj2 != null) {
                    Object[] objArr2 = (Object[]) obj2;
                    if (objArr.length != objArr2.length) {
                        return false;
                    }
                    C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(objArr);
                    C38489F8r LJJIIJZLJL2 = C30581Hy.LJJIIJZLJL(objArr2);
                    while (LJJIIJZLJL.hasNext() && LJJIIJZLJL2.hasNext()) {
                        Object next3 = LJJIIJZLJL.next();
                        Object next4 = LJJIIJZLJL2.next();
                        C73919Szj.LIZLLL.getClass();
                        if (!LIZ(next3, next4)) {
                            return false;
                        }
                    }
                    return true;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<*>");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<*>");
        }
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{obj, obj2})).size() == 2) {
            bool4 = Boolean.valueOf(obj instanceof java.util.Map);
        }
        if (o.LJ(bool4, bool5)) {
            if (obj != null) {
                java.util.Map map = (java.util.Map) obj;
                if (obj2 != null) {
                    java.util.Map map2 = (java.util.Map) obj2;
                    if (map.size() != map2.size()) {
                        return false;
                    }
                    java.util.Set entrySet = map.entrySet();
                    if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                        return true;
                    }
                    Iterator it = entrySet.iterator();
                    if (!it.hasNext()) {
                        return true;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (!map2.containsKey(key)) {
                        return false;
                    }
                    Object obj3 = map2.get(key);
                    C73919Szj.LIZLLL.getClass();
                    if (LIZ(value, obj3)) {
                        return true;
                    }
                    return false;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        }
        return o.LJ(obj2, obj);
    }
}
