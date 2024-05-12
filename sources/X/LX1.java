package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LX1 {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static int LJIILJJIL;
    public static final HashMap<String, String> LIZ = new HashMap<>();
    public static long LJ = -1;
    public static long LJFF = -1;
    public static long LJI = -1;
    public static long LJII = -1;
    public static long LJIIIIZZ = -1;

    public static void LIZ(long j, long j2, long j3, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_time_from_open_app", String.valueOf(j));
        hashMap.put("duration", String.valueOf(j2));
        hashMap.put("expire_time", String.valueOf(j3));
        hashMap.put("is_success", String.valueOf(z ? 1 : 0));
        hashMap.put("group", "5");
        FMX.LJIIL("friends_tab_cold_start_delete_db_record", hashMap);
    }

    public static void LIZJ(int i, long j, long j2, String scene, String statusMsg, boolean z) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(statusMsg, "statusMsg");
        HashMap hashMap = new HashMap();
        hashMap.put("start_time_from_open_app", String.valueOf(j));
        hashMap.put("duration", String.valueOf(j2));
        hashMap.put("is_success", String.valueOf(z ? 1 : 0));
        hashMap.put("status_code", String.valueOf(i));
        hashMap.put("status_msg", statusMsg);
        hashMap.put(WM7.SCENE_SERVICE, scene);
        FMX.LJIIL("preload_friends_feed_request", hashMap);
    }

    public static void LIZIZ(int i, long j, long j2, boolean z, int i2, String str, String str2, int i3, int i4) {
        HashMap LIZ2 = C1R5.LIZ(str, "statusMsg");
        LIZ2.put("start_time_from_open_app", String.valueOf(j));
        LIZ2.put("duration", String.valueOf(j2));
        LIZ2.put("is_success", String.valueOf(z ? 1 : 0));
        LIZ2.put("status_code", String.valueOf(i2));
        C116484hg.LIZIZ(LIZ2, "status_msg", str, i, WM7.SCENE_SERVICE);
        LIZ2.put("has_response", str2);
        LIZ2.put("red_dot_count", String.valueOf(i3));
        LIZ2.put("avatar_count", String.valueOf(i4));
        FMX.LJIIL("friends_tab_fetch_red_dot", LIZ2);
    }
}
