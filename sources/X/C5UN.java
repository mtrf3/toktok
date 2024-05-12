package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.5UN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UN extends C113554cx {
    public static final C51653KOz LJJLJ(java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        return ORZ.LJLIIIL(map.entrySet());
    }

    public static final List LJJLJLI(java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        if (map.size() == 0) {
            return C61878OQg.INSTANCE;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C61878OQg.INSTANCE;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C47261Igj.LJJIJ(new OSZ(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new OSZ(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new OSZ(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
