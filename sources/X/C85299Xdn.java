package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xdn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85299Xdn {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_index", String.valueOf((C35908E7k.LIZIZ().getInt("guided_location_permission_show_count", 0) + (C35908E7k.LIZIZ().getInt("system_location_setting_show_count", 0) + (C35908E7k.LIZJ() + C35908E7k.LIZIZ().getInt("pre_location_permission_show_count", 0)))) - 1));
        FMX.LJIIL("overall_location_permission_result", linkedHashMap);
    }

    public static void LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_index", String.valueOf((C35908E7k.LIZIZ().getInt("guided_location_permission_show_count", 0) + (C35908E7k.LIZIZ().getInt("system_location_setting_show_count", 0) + (C35908E7k.LIZJ() + C35908E7k.LIZIZ().getInt("pre_location_permission_show_count", 0)))) - 1));
        FMX.LJIIL("overall_location_permission_show", linkedHashMap);
    }

    public static void LJFF(int i) {
        FRW.LIZIZ(i, "system_location_permission_trace");
    }

    public static void LIZ(long j, boolean z) {
        String str;
        OSZ[] oszArr = new OSZ[3];
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("is_allow", str);
        oszArr[1] = new OSZ("show_duration", String.valueOf(j));
        oszArr[2] = new OSZ("show_index", String.valueOf(C35908E7k.LIZIZ().getInt("pre_location_permission_show_count", 0) - 1));
        FMX.LJIIL("pre_location_permission_result", C113554cx.LJJL(oszArr));
        LIZIZ();
    }

    public static void LIZLLL(long j, boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_allow", str);
        c188727au.LJ(j, "show_duration");
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        c188727au.LJIIIZ("show_index", String.valueOf(C35908E7k.LIZJ() - 1));
        FMX.LJIIL("system_location_permission_result", c188727au.LIZ);
        LIZIZ();
    }

    public static void LJ(Boolean bool, String str, String str2, String str3) {
        long j = C35908E7k.LIZIZ().getLong("system_location_permission_show_ts", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        C35908E7k.LIZIZ().storeInt("system_location_permission_show_count", C35908E7k.LIZJ() + 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_page", str3);
        }
        if (bool != null) {
            linkedHashMap.put("is_black_layer", String.valueOf(bool.booleanValue() ? 1 : 0));
        }
        linkedHashMap.put("show_index", String.valueOf(C35908E7k.LIZJ() - 1));
        if (j > 0) {
            linkedHashMap.put("time_int", String.valueOf((currentTimeMillis - j) / 86400000));
        } else {
            linkedHashMap.put("time_int", "-1");
        }
        FMX.LJIIL("system_location_permission_show", linkedHashMap);
        LIZJ();
        C35908E7k.LIZIZ().storeLong("system_location_permission_show_ts", System.currentTimeMillis());
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        C35908E7k.LJFF(System.currentTimeMillis(), curUserId);
    }

    public static void LJI(int i, long j, String str, String str2, String str3, InterfaceC88472Yns interfaceC88472Yns) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_page", str3);
        }
        linkedHashMap.put("is_allow", String.valueOf(i));
        linkedHashMap.put("show_duration", String.valueOf(j));
        linkedHashMap.put("show_index", String.valueOf(C35908E7k.LIZIZ().getInt("system_location_setting_show_count", 0) - 1));
        interfaceC88472Yns.invoke(linkedHashMap);
        FMX.LJIIL("system_location_setting_result", linkedHashMap);
        LIZIZ();
    }
}
