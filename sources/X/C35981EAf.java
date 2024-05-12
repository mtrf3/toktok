package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.EAf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35981EAf {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(String str) {
        HashMap<String, Object> LJII;
        if (!C78685UuP.LJJJZ(str) || str == null || (LJII = C27739Aud.LJII(str)) == null || !(!LJII.isEmpty())) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : LJII.entrySet()) {
            Object value = entry.getValue();
            if (C65777Prh.LJII(value) && value != null) {
                LinkedList linkedList = new LinkedList();
                linkedList.addFirst(value);
                linkedHashMap.put(entry.getKey(), linkedList);
            }
        }
        return linkedHashMap;
    }
}
