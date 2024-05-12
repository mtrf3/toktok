package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AzR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28037AzR {
    public static String LIZ(HashMap hashMap) {
        HashMap LJ = C27739Aud.LJ("entrance_info", hashMap);
        if (LJ == null) {
            LJ = new HashMap();
        }
        Object obj = LJ.get("room_id");
        if (obj != null) {
            LJ.put("source_content_id", obj);
        }
        List<String> list = C28032AzM.LIZ().addToCardEntranceInfoKeys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : LJ.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C27739Aud.LJI(linkedHashMap);
    }
}
