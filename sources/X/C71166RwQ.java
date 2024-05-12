package X;

import com.google.gson.internal.b;
import org.json.JSONObject;

/* renamed from: X.RwQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71166RwQ {
    public static long LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static String LJI;
    public static String LJII;
    public static long LJIIIIZZ;
    public static JSONObject LJIIIZ;
    public static String LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;

    public static boolean LIZ(Long l) {
        if (l != null && l.longValue() != 0) {
            long j = LIZIZ;
            if (j != 0 && j == l.longValue()) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(Long l) {
        if ((l == null || l.longValue() == 0 || LIZ(l)) && LIZLLL) {
            b.LJJIJIIJIL("rd_tiktokec_entrance_exit", new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("anchor_show_type", "live_cart_tag"), new OSZ("entrance_form", "live_cart"), new OSZ("page_name", "live"), new OSZ(WM7.SCENE_SERVICE, "bag"), new OSZ("room_id", String.valueOf(Long.valueOf(LIZIZ))), new OSZ("duration", Long.valueOf(System.currentTimeMillis() - LIZ)), new OSZ("user_type", LJII), new OSZ("source", LJI), new OSZ("has_report_preshow", Integer.valueOf(LJFF ? 1 : 0)), new OSZ("has_report_show", Integer.valueOf(LJ ? 1 : 0)), new OSZ("has_ec_perm", Integer.valueOf(LIZJ ? 1 : 0)));
        }
        LIZ = 0L;
        LJIIIIZZ = 0L;
        LIZIZ = 0L;
        LIZLLL = false;
        LJFF = false;
        LJ = false;
        LIZJ = false;
        LJI = null;
        LJII = EnumC71217RxF.AUDIENCE.getRoleStr();
        LJIIIZ = null;
        LJIIJ = null;
        LJIIJJI = false;
        LJIIL = false;
    }
}
