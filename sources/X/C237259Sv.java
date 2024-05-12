package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9Sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237259Sv {
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static final java.util.Map<String, Boolean> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, Boolean> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public static long LJ = -1;
    public static String LJIIIIZZ = "";

    public static void LJIIJJI() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LIZLLL(1, "is_success");
        FMX.LJIIL("profile_request_response", c188727au.LIZ);
    }

    public static void LJII(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJIIIZ("report_scene", str);
        FMX.LJIIL("profile_platform_view_model_get_error", c188727au.LIZ);
    }

    public static void LJIIIIZZ(long j) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJ(j, "profile_init_view_cost_time");
        c188727au.LJIIIZ("report_scene", "profile_platform_data_statistics");
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mobForProfilePlatformInitViewCostTime costTime: ");
        LIZ2.append(j);
        C221018lt.LJFF("ProfilePlatformStatistics", X1D.LIZIZ(LIZ2));
    }

    public static void LIZ(String methodFrom, ProfileUser profileUser) {
        o.LJIIIZ(methodFrom, "methodFrom");
        if (profileUser != null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJIIIZ("report_scene", "profile_platform_profile_user_null");
        c188727au.LJIIIZ("method_from", methodFrom);
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
    }

    public static void LIZIZ(long j, String str) {
        if (!LJFF) {
            if (o.LJ(str, "page_on_resume_complete_time")) {
                LJFF = true;
            }
            if (LJ == -1) {
                return;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
            c188727au.LJIIIZ("report_scene", "profile_page_load_time");
            c188727au.LJ(j - LJ, str);
            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
        }
    }

    public static void LIZJ(long j, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJIIIZ("report_scene", str);
        c188727au.LJ(j, "profile_platform_convert_data_cost_time");
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
    }

    public static void LIZLLL(long j, String str) {
        java.util.Map<String, Boolean> map = LIZ;
        Object obj = ((LinkedHashMap) map).get(str);
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(obj, bool)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
            c188727au.LJIIIZ("report_scene", "profile_component_cost_time");
            c188727au.LJIIIZ("component_tag", str);
            c188727au.LJ(j, "component_tab_create_time");
            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
            map.put(str, bool);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mobForComponentTabCreateCostTime: ");
            LIZ2.append(str);
            LIZ2.append(", costTime: ");
            LIZ2.append(j);
            C221018lt.LJFF("ProfilePlatformStatistics", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJ(Exception exc, m mVar) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJIIIZ("report_scene", "convert_data_exception");
        c188727au.LJIIIZ("error_msg", exc.getMessage());
        c188727au.LJFF(exc.getStackTrace(), "stack_info");
        c188727au.LJFF(mVar, "biz_data");
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
    }

    public static void LJFF(String str, String str2) {
        String str3;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJIIIZ("report_scene", "profile_icon_error");
        c188727au.LJIIIZ("error_msg", str);
        c188727au.LJIIIZ("icon_name", str2);
        ProfileUser profileUser = C237409Tk.LIZ;
        if (profileUser != null && (serverTimeExtra = profileUser.extra) != null) {
            str3 = serverTimeExtra.logid;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_id", str3);
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
    }

    public static void LJI(String str, String str2) {
        String str3;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C188727au LIZLLL2 = KNV.LIZLLL(str, "errorMsg");
        LIZLLL2.LJIIIZ("profile_attributes", LJIIIIZZ);
        LIZLLL2.LJIIIZ("report_scene", "profile_text_error");
        LIZLLL2.LJIIIZ("error_msg", str);
        LIZLLL2.LJIIIZ("text_name", str2);
        ProfileUser profileUser = C237409Tk.LIZ;
        if (profileUser != null && (serverTimeExtra = profileUser.extra) != null) {
            str3 = serverTimeExtra.logid;
        } else {
            str3 = null;
        }
        LIZLLL2.LJIIIZ("log_id", str3);
        FMX.LJIIL("profile_performance_data_statistics", LIZLLL2.LIZ);
    }

    public static void LJIIIZ(long j, boolean z) {
        int i;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", LJIIIIZZ);
        c188727au.LJIIIZ("report_scene", "profile_request_data");
        c188727au.LJ(j, "profile_request_data_cost_time");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_success");
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
    }

    public static void LJIIJ(String str, Throwable th) {
        C188727au LIZLLL2 = KNV.LIZLLL(str, "methodFrom");
        LIZLLL2.LJIIIZ("profile_attributes", LJIIIIZZ);
        LIZLLL2.LJIIIZ("method_from", str);
        LIZLLL2.LIZLLL(0, "is_success");
        LIZLLL2.LJIIIZ("enter_from", "personal_homepage");
        LIZLLL2.LJIIIZ("fail_info", th.getMessage());
        if (th instanceof C38333F2r) {
            LIZLLL2.LJIIIZ("response", ((C38333F2r) th).getResponse());
            LIZLLL2.LIZLLL(C90393gh.LIZ(th), "status_code");
        }
        FMX.LJIIL("profile_request_response", LIZLLL2.LIZ);
    }

    public static void LJIIL(long j, String str) {
        C188727au LIZLLL2 = KNV.LIZLLL(str, "tag");
        LIZLLL2.LJIIIZ("profile_attributes", LJIIIIZZ);
        LIZLLL2.LJIIIZ("report_scene", "old_layout_generate_view");
        LIZLLL2.LJIIIZ("component_tag", str);
        LIZLLL2.LJ(j, "old_layout_generate_view_cost_time");
        FMX.LJIIL("profile_performance_data_statistics", LIZLLL2.LIZ);
    }
}
