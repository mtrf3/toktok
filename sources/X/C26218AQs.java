package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.AQs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26218AQs {
    public static final C26222AQw LIZ = new C26222AQw("OfflineModeMobUtil");

    public static void LIZ(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Integer num3, Integer num4, Long l, String str6, String str7, String str8, Long l2, Integer num5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i) {
        String str17 = str3;
        String str18 = str2;
        String str19 = str7;
        String str20 = str6;
        String str21 = str4;
        String str22 = str5;
        String str23 = str16;
        String str24 = str15;
        String str25 = str14;
        String str26 = str9;
        String str27 = str8;
        String str28 = str10;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        if ((i & 2) != 0) {
            str18 = null;
        }
        if ((i & 4) != 0) {
            str17 = null;
        }
        if ((i & 8) != 0) {
            str21 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            str22 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            num4 = null;
        }
        if ((i & 512) != 0) {
            l = null;
        }
        if ((i & 1024) != 0) {
            str20 = null;
        }
        if ((i & 2048) != 0) {
            str19 = null;
        }
        if ((i & 4096) != 0) {
            str27 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            l2 = null;
        }
        if ((i & 16384) != 0) {
            num5 = null;
        }
        if ((32768 & i) != 0) {
            str26 = null;
        }
        if ((65536 & i) != 0) {
            str28 = null;
        }
        if ((131072 & i) != 0) {
            str29 = null;
        }
        if ((262144 & i) != 0) {
            str30 = null;
        }
        if ((524288 & i) != 0) {
            str31 = null;
        }
        if ((1048576 & i) != 0) {
            str25 = null;
        }
        if ((2097152 & i) != 0) {
            str24 = null;
        }
        if ((i & 4194304) != 0) {
            str23 = null;
        }
        C188727au LIZLLL = KNV.LIZLLL(str, "eventName");
        if (str18 != null) {
            LIZLLL.LJI("enter_from", str18);
        }
        if (str17 != null) {
            LIZLLL.LJI("enter_method", str17);
        }
        if (str21 != null) {
            LIZLLL.LJI("network_status", str21);
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue < 0) {
                intValue = 0;
            }
            LIZLLL.LIZLLL(intValue, "network_speed");
        }
        if (num2 != null) {
            LIZLLL.LIZLLL(num2.intValue(), "cache_count");
        }
        if (str22 != null) {
            LIZLLL.LJI("block_type", str22);
        }
        if (num3 != null) {
            LIZLLL.LIZLLL(num3.intValue(), "start_reason");
        }
        if (num4 != null) {
            LIZLLL.LIZLLL(num4.intValue(), "end_reason");
        }
        if (l != null) {
            LIZLLL.LJ(l.longValue(), "cache_size");
        }
        if (str20 != null) {
            LIZLLL.LJI("cache_status", str20);
        }
        if (str19 != null) {
            LIZLLL.LJI("clean_type", str19);
        }
        if (str27 != null) {
            LIZLLL.LJI("to_status", str27);
        }
        if (l2 != null) {
            LIZLLL.LJ(l2.longValue(), "duration");
        }
        if (num5 != null) {
            LIZLLL.LIZLLL(num5.intValue(), "cache_percent");
        }
        if (str26 != null) {
            LIZLLL.LJI("toast_type", str26);
        }
        if (str28 != null) {
            LIZLLL.LJI("exit_method", str28);
        }
        if (str29 != null) {
            LIZLLL.LJI("vv", str29);
        }
        if (str30 != null) {
            LIZLLL.LJI("vv_finish", str30);
        }
        if (str31 != null) {
            LIZLLL.LJI("stay_duration", str31);
        }
        if (str25 != null) {
            LIZLLL.LJI("like_count", str25);
        }
        if (str24 != null) {
            LIZLLL.LJI("follow_count", str24);
        }
        if (str23 != null) {
            LIZLLL.LJI("favourite_count", str23);
        }
        java.util.Map<String, String> map = LIZLLL.LIZ;
        LIZ.LIZ(map, str);
        FMX.LJIIL(str, map);
    }
}
