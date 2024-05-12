package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class QZB {
    public static void LIZ(List<QZT<?>> list) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) list;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                QZT qzt = (QZT) it.next();
                QZC qzc = new QZC(qzt);
                Iterator it2 = qzt.LIZ.iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    if (qzt.LIZLLL == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z3 = !z2;
                    N3I n3i = new N3I(cls, z3);
                    if (!hashMap.containsKey(n3i)) {
                        hashMap.put(n3i, new HashSet());
                    }
                    java.util.Set set = (java.util.Set) hashMap.get(n3i);
                    if (set.isEmpty() || z3) {
                        set.add(qzc);
                    } else {
                        throw new IllegalArgumentException(C16880lQ.LLLZ("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            } else {
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    for (QZC qzc2 : (java.util.Set) it3.next()) {
                        for (QZW qzw : qzc2.LIZ.LIZIZ) {
                            if (qzw.LIZJ == 0) {
                                Class<?> cls2 = qzw.LIZ;
                                if (qzw.LIZIZ == 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                java.util.Set<QZC> set2 = (java.util.Set) hashMap.get(new N3I(cls2, z));
                                if (set2 != null) {
                                    for (QZC qzc3 : set2) {
                                        ((HashSet) qzc2.LIZIZ).add(qzc3);
                                        ((HashSet) qzc3.LIZJ).add(qzc2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it4 = hashMap.values().iterator();
                while (it4.hasNext()) {
                    hashSet.addAll((Collection) it4.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    QZC qzc4 = (QZC) it5.next();
                    if (((HashSet) qzc4.LIZJ).isEmpty()) {
                        hashSet2.add(qzc4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    QZC qzc5 = (QZC) hashSet2.iterator().next();
                    hashSet2.remove(qzc5);
                    i++;
                    Iterator it6 = ((HashSet) qzc5.LIZIZ).iterator();
                    while (it6.hasNext()) {
                        QZC qzc6 = (QZC) it6.next();
                        ((HashSet) qzc6.LIZJ).remove(qzc5);
                        if (((HashSet) qzc6.LIZJ).isEmpty()) {
                            hashSet2.add(qzc6);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it7 = hashSet.iterator();
                while (it7.hasNext()) {
                    QZC qzc7 = (QZC) it7.next();
                    if (!((HashSet) qzc7.LIZJ).isEmpty() && !((HashSet) qzc7.LIZIZ).isEmpty()) {
                        arrayList2.add(qzc7.LIZ);
                    }
                }
                throw new QZA(arrayList2);
            }
        }
    }
}
