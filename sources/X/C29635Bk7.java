package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* renamed from: X.Bk7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29635Bk7 {
    public static final java.util.Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;

    public static void LIZ(String str, java.util.Map map) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("livesdk_sticker_perf_");
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        C0K2.LJII(0, LIZIZ2, map);
        map.put("event_name", LIZIZ2);
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_sticker", map);
    }

    public static void LIZJ(int i, int i2) {
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("sticker_type", Integer.valueOf(i));
        linkedHashMap.put("load_result", Integer.valueOf(i2));
        long j2 = LJ;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j2 != -1 && elapsedRealtime > j2) {
            j = elapsedRealtime - j2;
        } else {
            j = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j));
        LIZ("image_show", linkedHashMap);
        LJ = -1L;
    }

    public static void LIZLLL(int i, int i2) {
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("sticker_type", Integer.valueOf(i));
        linkedHashMap.put("load_result", Integer.valueOf(i2));
        long j2 = LIZLLL;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j2 != -1 && elapsedRealtime > j2) {
            j = elapsedRealtime - j2;
        } else {
            j = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j));
        LIZ("sticker_show", linkedHashMap);
        LIZLLL = -1L;
    }

    public static void LIZIZ(int i, int i2, String str) {
        long j;
        String str2;
        long j2;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            j = LIZJ;
            str2 = "set_server";
        } else {
            j = LIZIZ;
            str2 = "del_server";
        }
        if (j == -1 || str2.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("load_result", Integer.valueOf(i2));
        if (str != null && str.length() != 0) {
            linkedHashMap.put("failed_Type", str);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > j) {
            j2 = elapsedRealtime - j;
        } else {
            j2 = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j2));
        LIZ(str2, linkedHashMap);
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LIZJ = -1L;
            return;
        }
        LIZIZ = -1L;
    }
}
