package X;

import android.util.Pair;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class AAP {
    public static String LIZ(String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(str, linkedHashMap);
        String str3 = (String) LIZJ.first;
        if (str3 != null && str3.equals("aweme://webDialog") && (str2 = (String) LIZJ.second) != null && str2.equals("/eventDetail")) {
            return (String) linkedHashMap.get("event_id");
        }
        return null;
    }
}
