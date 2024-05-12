package X;

import kotlin.jvm.internal.AqS2S1000100_9;

/* renamed from: X.Lv3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55793Lv3 {
    public static long LIZIZ;
    public static long LIZJ;
    public static int LJ;
    public static int LJI;
    public static long LJIIIIZZ;
    public static boolean LJIIIZ;
    public static String LIZ = "mall";
    public static String LIZLLL = "";
    public static String LJFF = "default";
    public static String LJII = "";

    public static void LIZ(C27943Axv c27943Axv) {
        c27943Axv.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c27943Axv.LIZLLL("page_name", "mall_racun_channel");
        c27943Axv.LIZLLL("previous_page", LIZ);
        c27943Axv.LIZLLL("enter_from", LIZ);
    }

    public static void LIZJ(String str) {
        if (LIZIZ == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - LIZIZ;
        LIZIZ = 0L;
        C76542zS.LIZJ("tiktokec_stay_page", new AqS2S1000100_9(currentTimeMillis, str, 0));
    }

    public static void LIZIZ(String str, C55794Lv4 c55794Lv4) {
        String str2;
        int i;
        String str3;
        int i2 = c55794Lv4.LIZIZ;
        if (i2 == 1) {
            str2 = "Following";
        } else if (i2 == 2) {
            str2 = "Explore";
        } else {
            str2 = "null";
        }
        Integer num = c55794Lv4.LJIILJJIL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        String str4 = c55794Lv4.LIZLLL;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = c55794Lv4.LIZJ;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = c55794Lv4.LJIIJ;
        if (str7 == null) {
            str7 = "";
        }
        int i3 = c55794Lv4.LJ;
        if (i3 == 2) {
            str3 = "live";
        } else if (i3 == 3) {
            str3 = "video";
        } else {
            str3 = "mall";
        }
        String str8 = c55794Lv4.LJFF;
        String str9 = c55794Lv4.LJI;
        String str10 = c55794Lv4.LJIILL;
        if (str10 == null) {
            str10 = LJII;
        }
        String str11 = c55794Lv4.LJII;
        if (str11 != null) {
            str5 = str11;
        }
        C76542zS.LIZJ(str, new C55795Lv5(str2, c55794Lv4, str3, i, str4, str6, str7, str5, str8, str9, str10));
    }
}
