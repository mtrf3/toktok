package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LnI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55312LnI {
    public static long LIZ;
    public static int LIZIZ;
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static int LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;

    public static void LIZ(HashMap hashMap) {
        long j;
        int i;
        String str = (String) hashMap.get("click_timestamp");
        String str2 = (String) hashMap.get("card_status");
        String str3 = (String) hashMap.get("click_area");
        String str4 = (String) hashMap.get("page_size");
        String str5 = (String) hashMap.get("single_player");
        hashMap.get("enter_from");
        if (str != null) {
            j = CastLongProtector.parseLong(str);
        } else {
            j = 0;
        }
        LIZ = j;
        if (str2 == null) {
            str2 = "";
        }
        LIZJ = str2;
        if (str3 == null) {
            str3 = "";
        }
        LIZLLL = str3;
        int i2 = 0;
        if (str4 != null) {
            i = CastIntegerProtector.parseInt(str4);
        } else {
            i = 0;
        }
        LIZIZ = i;
        if (str5 != null) {
            i2 = CastIntegerProtector.parseInt(str5);
        }
        LJ = i2;
    }

    public static final void LIZLLL(String str, String str2) {
        try {
            if (LIZIZ(str, str2, "", "") && !LJII) {
                long currentTimeMillis = System.currentTimeMillis();
                C188727au c188727au = new C188727au();
                c188727au.LJ(currentTimeMillis - LIZ, "duration");
                c188727au.LIZLLL(LIZIZ, "page_size");
                c188727au.LJIIIZ("card_status", LIZJ);
                c188727au.LJIIIZ("click_area", LIZLLL);
                c188727au.LIZLLL(LJ, "single_player");
                c188727au.LJIIIZ("enter_from", str2);
                FMX.LJIIL("rd_tiktokec_mall_video_view_cell_created", c188727au.LIZ);
                LJII = true;
            }
        } catch (Exception unused) {
        }
    }

    public static boolean LIZIZ(String str, String str2, String str3, String str4) {
        if (o.LJ("from_ttmall_homepage", str) && o.LJ("mall", str2) && o.LJ(str3, str4)) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(String str, String str2, String str3, String str4) {
        try {
            if (LIZIZ(str, str2, str3, str4) && !LJI) {
                long currentTimeMillis = System.currentTimeMillis();
                C188727au c188727au = new C188727au();
                c188727au.LJ(currentTimeMillis - LIZ, "duration");
                c188727au.LIZLLL(LIZIZ, "page_size");
                c188727au.LJIIIZ("card_status", LIZJ);
                c188727au.LJIIIZ("click_area", LIZLLL);
                c188727au.LIZLLL(LJ, "single_player");
                c188727au.LJIIIZ("enter_from", str2);
                FMX.LJIIL("rd_tiktokec_mall_video_try_play", c188727au.LIZ);
                LJI = true;
            }
        } catch (Exception unused) {
        }
    }
}
