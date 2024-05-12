package X;

import Y.IDComparatorS43S0000000_15;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class Y6Y extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(24L);
    }

    public final List LJFF() {
        List LJ;
        List LLILZ;
        Y6Z LJI = LJI();
        List<C86832Y6a> list = LJI.LIZIZ;
        List<C86832Y6a> list2 = LJI.LIZJ;
        List<C86832Y6a> list3 = LJI.LIZLLL;
        List LLILZ2 = ORZ.LLILZ(4, list2);
        if (LLILZ2.isEmpty()) {
            LJ = ORZ.LLILZ(4, list3);
        } else {
            LJ = LJ(list3, LLILZ2);
        }
        if (!LLILZ2.isEmpty()) {
            LLILZ = LJ(list, LLILZ2);
        } else if (!LJ.isEmpty()) {
            LLILZ = LJ(list, LJ);
        } else {
            LLILZ = ORZ.LLILZ(4, list);
        }
        return ORZ.LLIIIZ(LLILZ, ORZ.LLIIIZ(LJ, LLILZ2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    public final Y6Z LJI() {
        C86832Y6a c86832Y6a;
        Object obj;
        ?? r7;
        ?? r6;
        List<PublishBehaviorModel> list;
        List<PublishBehaviorModel> list2;
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2.LIZ.getClass();
        List LJ = C43176Gx2.LJ(currentTimeMillis, "publish");
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
        Iterator it = LJ.iterator();
        while (it.hasNext()) {
            arrayList.add(C75792yF.LIZ(((C43189GxF) it.next()).LIZLLL, PublishBehaviorModel.class));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str = ((PublishBehaviorModel) next).publishId;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new C86832Y6a((String) entry.getKey(), ORZ.LLILII(new IDComparatorS43S0000000_15(6), (Iterable) entry.getValue())));
        }
        List LLILII = ORZ.LLILII(new IDComparatorS43S0000000_15(5), arrayList2);
        Iterator it3 = LLILII.iterator();
        while (true) {
            c86832Y6a = null;
            if (it3.hasNext()) {
                obj = it3.next();
                if (((C86832Y6a) obj).LIZJ) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C86832Y6a c86832Y6a2 = (C86832Y6a) obj;
        if (c86832Y6a2 != null && (list2 = c86832Y6a2.LIZ) != null) {
            r7 = new ArrayList(C32I.LJJL(list2, 10));
            for (PublishBehaviorModel publishBehaviorModel : list2) {
                r7.add(new C86832Y6a(publishBehaviorModel.publishId, C47261Igj.LJJIJ(publishBehaviorModel)));
            }
        } else {
            r7 = C61878OQg.INSTANCE;
        }
        Iterator it4 = LLILII.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            ?? next2 = it4.next();
            if (((C86832Y6a) next2).LIZLLL) {
                c86832Y6a = next2;
                break;
            }
        }
        C86832Y6a c86832Y6a3 = c86832Y6a;
        if (c86832Y6a3 != null && (list = c86832Y6a3.LIZ) != null) {
            r6 = new ArrayList(C32I.LJJL(list, 10));
            for (PublishBehaviorModel publishBehaviorModel2 : list) {
                r6.add(new C86832Y6a(publishBehaviorModel2.publishId, C47261Igj.LJJIJ(publishBehaviorModel2)));
            }
        } else {
            r6 = C61878OQg.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : LLILII) {
            C86832Y6a c86832Y6a4 = (C86832Y6a) obj3;
            if (!c86832Y6a4.LIZJ && !c86832Y6a4.LIZLLL && c86832Y6a4.LIZIZ) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : LLILII) {
            C86832Y6a c86832Y6a5 = (C86832Y6a) obj4;
            if (!c86832Y6a5.LIZJ && !c86832Y6a5.LIZLLL && !c86832Y6a5.LIZIZ) {
                arrayList4.add(obj4);
            }
        }
        return new Y6Z(r6, r7, arrayList3, arrayList4);
    }

    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return o.LJ(type, "publish");
    }

    public static List LJ(List list, List list2) {
        if (list2.isEmpty() || list.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        long j = ((C86832Y6a) ORZ.LJLLJ(list2)).LJ;
        long j2 = ((C86832Y6a) ORZ.LLFF(list)).LJFF;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((C86832Y6a) it.next()).LJ > j) {
                if (i != -1) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        if (((C86832Y6a) listIterator.previous()).LJFF < j2) {
                            int nextIndex = listIterator.nextIndex();
                            if (nextIndex != -1) {
                                return list.subList(Math.max(0, i - 2), Math.min(list.size() - 1, nextIndex + 2) + 1);
                            }
                        }
                    }
                    return C61878OQg.INSTANCE;
                }
            } else {
                i++;
            }
        }
        return C61878OQg.INSTANCE;
    }
}
