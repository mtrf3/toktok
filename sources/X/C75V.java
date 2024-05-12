package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.75V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C75V {
    public static final java.util.Map<Integer, InterfaceC1800674w> LIZ = new LinkedHashMap();

    public static java.util.Set LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getPageProviderList  ");
        java.util.Map<Integer, InterfaceC1800674w> map = LIZ;
        LIZ2.append(map.size());
        C71Y.LIZLLL("CommentPageItemManager", X1D.LIZIZ(LIZ2));
        TreeMap treeMap = (TreeMap) C51029K0z.LJJJJJ(map);
        ArrayList arrayList = new ArrayList(treeMap.size());
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return ORZ.LLJILLL(arrayList);
    }
}
