package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class FHR {
    public static boolean LIZ;
    public static final java.util.Map<String, Integer> LIZIZ = new HashMap();
    public static final HashSet<FI2> LIZJ = new HashSet<>();

    public static java.util.Map LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<FI2> it = LIZJ.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LIZ());
        }
        arrayList.addAll(((HashMap) LIZIZ).values());
        HashMap hashMap = new HashMap();
        hashMap.put("vids", arrayList.toString());
        return hashMap;
    }
}
