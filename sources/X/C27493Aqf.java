package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27493Aqf {
    public static final LinkedHashMap<String, Object> LIZ = new LinkedHashMap<>();
    public static final java.util.Map<String, Long> LIZIZ = new LinkedHashMap();

    public static long LIZ(String str) {
        java.util.Map<String, Long> map = LIZIZ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long longValue = l.longValue();
            map.remove(str);
            return SystemClock.elapsedRealtime() - longValue;
        }
        return 0L;
    }

    public static void LIZJ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("button_name", str);
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public static void LJ(String str) {
        LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LIZIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("ba_info_finish", str2);
        }
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }

    public static void LIZLLL(Boolean bool, String inputBoxName) {
        o.LJIIIZ(inputBoxName, "inputBoxName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("input_box_name", inputBoxName);
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("has_auto_input_last_time", V1M.LJJJJZ(bool.booleanValue()));
        }
        C76542zS.LIZ("tiktokec_input_click", linkedHashMap);
    }
}
