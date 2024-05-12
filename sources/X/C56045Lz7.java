package X;

import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS0S4010100_9;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS4S1001000_9;
import kotlin.jvm.internal.AqS52S0110000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lz7 */
/* loaded from: classes10.dex */
public final class C56045Lz7 {
    public static final C56045Lz7 LIZ = new C56045Lz7();
    public static final ConcurrentHashMap<String, Integer> LIZIZ;
    public static final String LIZJ;
    public static final C62822Ol8 LIZLLL;

    static {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("tiktokec_cart_entrance_show", 1);
        concurrentHashMap.put("tiktokec_cart_entrance_show_test", 1);
        LIZIZ = concurrentHashMap;
        LynxEnv.LJIIIZ().getClass();
        LIZJ = "2.10.16-rc.10";
        LIZLLL = C221108m2.LIZIZ(M0I.LJLIL);
    }

    public static String LIZIZ() {
        FashionMallFragment.LJZ.getClass();
        if (C51762KTe.LIZIZ()) {
            return "homepage_mall";
        }
        return "mall";
    }

    public static java.util.Map LIZJ() {
        return (java.util.Map) LIZLLL.getValue();
    }

    public static void LIZ(C27943Axv c27943Axv) {
        Boolean LJ = C38987FRv.LJ();
        o.LJIIIIZZ(LJ, "isFirstInstallAndFirstLaunchLowCost()");
        c27943Axv.LIZLLL("is_first_launch", Integer.valueOf(LJ.booleanValue() ? 1 : 0));
        int i = 0;
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        if (createIMainServicebyMonsterPlugin != null && createIMainServicebyMonsterPlugin.isAppHot()) {
            i = 1;
        }
        c27943Axv.LIZLLL("is_cold_launch", Integer.valueOf(i ^ 1));
        c27943Axv.LIZLLL("is_first_enter_mall", Integer.valueOf(C56090Lzq.LIZIZ() ? 1 : 0));
    }

    public static void LIZLLL(java.util.Map extraParams) {
        o.LJIIIZ(extraParams, "extraParams");
        C76542zS.LIZJ("tiktokec_button_click", new AqS174S0100000_8(extraParams, (java.util.Map<String, String>) 196));
    }

    public static void LJ(java.util.Map map) {
        C76542zS.LIZJ("tiktokec_button_show", new AqS174S0100000_8(map, (java.util.Map<String, String>) 197));
    }

    public static void LJII(int i, String str) {
        C76542zS.LIZJ("rd_tiktokec_mall_error_view_status", new AqS4S1001000_9(i, str, 0));
    }

    public static void LJIIIZ(java.util.Map map, boolean z) {
        C76542zS.LIZJ("rd_tiktokec_network_available", new AqS52S0110000_9(z, (boolean) map, (java.util.Map<String, ? extends Object>) 5));
    }

    public static void LJIIJ(int i, long j, java.util.Map map) {
        C76542zS.LIZJ("rd_tiktokec_mall_power_preload", new C27573Arx(i, j, map));
    }

    public static /* synthetic */ void LJIIJJI(C56045Lz7 c56045Lz7, int i, long j, int i2) {
        if ((i2 & 4) != 0) {
            j = 0;
        }
        c56045Lz7.getClass();
        LJIIJ(i, j, null);
    }

    public static void LJFF(String stage, long j, boolean z, boolean z2, java.util.Map map) {
        o.LJIIIZ(stage, "stage");
        C76542zS.LIZJ("rd_tiktokec_mall_container_lifecycle_dur", new C56044Lz6(stage, j, z, z2, map));
    }

    public static /* synthetic */ void LJI(C56045Lz7 c56045Lz7, String str, long j, boolean z, int i) {
        boolean z2;
        long j2 = j;
        boolean z3 = z;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        c56045Lz7.getClass();
        LJFF(str, j2, z2, z3, null);
    }

    public static void LJIILL(long j, String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c188727au.LJIIIZ("account_type", "e_commerce");
        c188727au.LJIIIZ("notification_type", "official");
        c188727au.LJIIIZ("enter_from", "mall_notification");
        c188727au.LJIIIZ("page_name", "mall");
        c188727au.LJIIIZ("template_id", str2);
        c188727au.LJ(j, "message_time");
        c188727au.LIZLLL(0, "is_read");
        c188727au.LJIIIZ("timeline", str4);
        c188727au.LJIIIZ("content_id", str3);
        FMX.LJIIL("official_message_inner_message", c188727au.LIZ);
    }

    public static void LJIIIIZZ(long j, String str, String str2, String str3, String str4, boolean z) {
        C76542zS.LIZJ("tiktokec_stay_page", new AqS0S4010100_9(j, str, str3, str2, str4, z, 1));
    }

    public static void LJIIL(String stage, String str, long j, boolean z, boolean z2, java.util.Map map) {
        o.LJIIIZ(stage, "stage");
        C76542zS.LIZJ("rd_tiktokec_mall_stage_dur_native", new C56043Lz5(str, stage, j, z, z2, map));
    }

    public static void LJIILJJIL(long j, String str, String str2, String str3, String str4, boolean z) {
        C76542zS.LIZJ("tiktokec_stay_mall", new AqS0S4010100_9(j, str, str3, str2, str4, z, 0));
    }

    public static /* synthetic */ void LJIILIIL(C56045Lz7 c56045Lz7, String str, String str2, long j, boolean z, java.util.Map map, int i) {
        boolean z2;
        java.util.Map map2 = map;
        boolean z3 = z;
        String str3 = str2;
        long j2 = j;
        if ((i & 2) != 0) {
            str3 = null;
        }
        if ((i & 4) != 0) {
            j2 = 0;
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            map2 = null;
        }
        c56045Lz7.getClass();
        LJIIL(str, str3, j2, z2, z3, map2);
    }
}
