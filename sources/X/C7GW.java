package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7GW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GW {
    public static final Calendar LIZ = Calendar.getInstance();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    public static void LIZIZ(NowArchiveResponse nowArchiveResponse, boolean z) {
        ArrayList<C62552ct> arrayList;
        Long lastPushedAtSec;
        List<Aweme> list = nowArchiveResponse.data;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Aweme aweme : list) {
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null && (lastPushedAtSec = nowPostInfo.getLastPushedAtSec()) != null) {
                Date date = new Date(lastPushedAtSec.longValue() * 1000);
                Calendar calendar = LIZ;
                calendar.setTime(date);
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                java.util.Map map = (java.util.Map) linkedHashMap.get(Integer.valueOf(i));
                if (map == null) {
                    map = new LinkedHashMap();
                }
                List list2 = (List) map.get(Integer.valueOf(i2));
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(aweme);
                map.put(Integer.valueOf(i2), list2);
                linkedHashMap.put(Integer.valueOf(i), map);
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            java.util.Map map2 = (java.util.Map) linkedHashMap.get(Integer.valueOf(intValue));
            if (map2 != null) {
                Iterator it2 = map2.keySet().iterator();
                while (it2.hasNext()) {
                    int intValue2 = ((Number) it2.next()).intValue();
                    Collection collection = (Collection) map2.get(Integer.valueOf(intValue2));
                    if (collection == null) {
                        collection = C61878OQg.INSTANCE;
                    }
                    arrayList2.add(new C62552ct(ORZ.LLJILJILJ(collection), intValue, intValue2));
                }
            }
        }
        List LLILII = ORZ.LLILII(new Comparator() { // from class: X.2yb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C62552ct item1 = (C62552ct) obj;
                C62552ct item2 = (C62552ct) obj2;
                o.LJIIIZ(item1, "item1");
                o.LJIIIZ(item2, "item2");
                int i3 = item1.LJLILLLLZI;
                int i4 = item2.LJLILLLLZI;
                if (i3 == i4) {
                    return item1.LJLJI - item2.LJLJI;
                }
                return i3 - i4;
            }
        }, arrayList2);
        if (LLILII.size() <= 1) {
            arrayList = ORZ.LLJILJILJ(LLILII);
        } else {
            ArrayList arrayList3 = new ArrayList();
            int size = LLILII.size() - 1;
            int i3 = 0;
            while (i3 < size) {
                C62552ct c62552ct = (C62552ct) ListProtector.get(LLILII, i3);
                i3++;
                C62552ct c62552ct2 = (C62552ct) ListProtector.get(LLILII, i3);
                arrayList3.add(c62552ct);
                LIZ(c62552ct.LJLILLLLZI, c62552ct.LJLJI, c62552ct2.LJLILLLLZI, c62552ct2.LJLJI, arrayList3);
            }
            arrayList3.add(ListProtector.get(LLILII, LLILII.size() - 1));
            arrayList = arrayList3;
        }
        if (z) {
            Calendar calendar2 = Calendar.getInstance();
            LIZ(((C62552ct) ListProtector.get(arrayList, C47261Igj.LJJI(arrayList))).LJLILLLLZI, ((C62552ct) ListProtector.get(arrayList, C47261Igj.LJJI(arrayList))).LJLJI, calendar2.get(1), calendar2.get(2) + 1, arrayList);
        }
        ((LinkedHashMap) C7GZ.LIZJ).clear();
        ((ArrayList) C7GZ.LIZLLL).clear();
        for (C62552ct c62552ct3 : arrayList) {
            Iterator it3 = ((ArrayList) C7GZ.LIZ).iterator();
            boolean z2 = false;
            while (it3.hasNext()) {
                C62552ct c62552ct4 = (C62552ct) it3.next();
                if (c62552ct3.LJLILLLLZI == c62552ct4.LJLILLLLZI && c62552ct3.LJLJI == c62552ct4.LJLJI) {
                    z2 = true;
                }
            }
            if (!z2) {
                ((ArrayList) C7GZ.LIZLLL).add(c62552ct3);
            }
        }
        for (C62552ct c62552ct5 : arrayList) {
            Iterator it4 = ((ArrayList) C7GZ.LIZ).iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                int i5 = i4 + 1;
                C62552ct c62552ct6 = (C62552ct) it4.next();
                if (c62552ct6.LJLJI == c62552ct5.LJLJI && c62552ct6.LJLILLLLZI == c62552ct5.LJLILLLLZI) {
                    c62552ct6.LJLIL.addAll(c62552ct5.LJLIL);
                    C7GZ.LIZJ.put(Integer.valueOf(((ArrayList) C7GZ.LIZLLL).size() + i4), c62552ct6);
                }
                i4 = i5;
            }
        }
        ((ArrayList) C7GZ.LIZ).addAll(0, C7GZ.LIZLLL);
        long j = nowArchiveResponse.nextCursor;
        boolean z3 = nowArchiveResponse.hasMore;
        C7GY.LIZ = j;
        C7GY.LIZIZ = z3;
    }

    public static void LIZ(int i, int i2, int i3, int i4, List list) {
        int i5;
        if (i != i3) {
            while (true) {
                i2++;
                if (i2 >= 12) {
                    break;
                } else {
                    list.add(new C62552ct(new ArrayList(), i, i2));
                }
            }
            while (true) {
                i++;
                i5 = 0;
                if (i >= i3) {
                    break;
                }
                do {
                    list.add(new C62552ct(new ArrayList(), i, i5));
                    i5++;
                } while (i5 < 12);
            }
            while (i5 < i4) {
                list.add(new C62552ct(new ArrayList(), i3, i5));
                i5++;
            }
            return;
        }
        while (true) {
            i2++;
            if (i2 < i4) {
                list.add(new C62552ct(new ArrayList(), i3, i2));
            } else {
                return;
            }
        }
    }
}
