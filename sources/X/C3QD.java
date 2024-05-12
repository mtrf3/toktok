package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.3QD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(C3QC performanceData) {
        long j;
        String str;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(performanceData, "performanceData");
        o.LJIIIZ(onEventV3, "onEventV3");
        C34B.LIZIZ("IMSearchPerformanceAnalyticsUtils", performanceData.toString());
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        LIZJ("sync_type", performanceData.LJLIL, c65864Pt6);
        LIZIZ(Integer.valueOf(performanceData.LJLILLLLZI), "origin_data_count", c65864Pt6);
        LIZIZ(Integer.valueOf(performanceData.LJLJI), "fts_data_count", c65864Pt6);
        LIZ(c65864Pt6, "overall_cost", Long.valueOf(performanceData.LJLJJI));
        LIZ(c65864Pt6, "fetch_data_cost", Long.valueOf(performanceData.LJLJJL));
        LIZ(c65864Pt6, "generate_fts_data_cost", Long.valueOf(performanceData.LJLJJLL));
        LIZ(c65864Pt6, "md5_comparison_cost", Long.valueOf(performanceData.LJLJL));
        if (performanceData.LJLJLJ) {
            j = 1;
        } else {
            j = 0;
        }
        LIZ(c65864Pt6, "md5_skip", Long.valueOf(j));
        LIZ(c65864Pt6, "fts_data_overall_cost", Long.valueOf(performanceData.LJLJL + performanceData.LJLJLLL + performanceData.LJLLILLLL));
        LIZIZ(Integer.valueOf(performanceData.LJLL + performanceData.LJLLJ), "fts_data_overall_count", c65864Pt6);
        LIZIZ(Integer.valueOf(performanceData.LJLLI + performanceData.LJLLL), "fts_data_overall_final_count", c65864Pt6);
        LIZ(c65864Pt6, "update_fts_data_cost", Long.valueOf(performanceData.LJLJLLL));
        LIZIZ(Integer.valueOf(performanceData.LJLL), "update_fts_data_count", c65864Pt6);
        LIZIZ(Integer.valueOf(performanceData.LJLLI), "update_fts_data_final_count", c65864Pt6);
        LIZ(c65864Pt6, "delete_fts_data_cost", Long.valueOf(performanceData.LJLLILLLL));
        LIZIZ(Integer.valueOf(performanceData.LJLLL), "delete_fts_data_final_count", c65864Pt6);
        LIZIZ(Integer.valueOf(performanceData.LJLLJ), "delete_fts_data_count", c65864Pt6);
        if (performanceData.LJLLLL) {
            str = "manual";
        } else {
            str = "cold_start";
        }
        LIZJ("sync_stage", str, c65864Pt6);
        onEventV3.LIZIZ("dm_search_sync_data_performance", c65864Pt6);
        c65864Pt6.build();
    }

    public static void LIZ(C65864Pt6 c65864Pt6, String str, Long l) {
        String str2;
        if (l != null) {
            str2 = l.toString();
        } else {
            str2 = null;
        }
        LIZJ(str, str2, c65864Pt6);
    }

    public static void LIZIZ(Integer num, String str, C65864Pt6 c65864Pt6) {
        String str2;
        if (num != null) {
            str2 = num.toString();
        } else {
            str2 = null;
        }
        LIZJ(str, str2, c65864Pt6);
    }

    public static void LIZJ(String str, String str2, C65864Pt6 c65864Pt6) {
        if (str2 != null) {
            c65864Pt6.put(str, str2);
        }
    }

    public static void LIZLLL(String str, String str2, boolean z, long j, Long l, String str3, Long l2, Integer num, Long l3, Long l4, Integer num2, Long l5, Integer num3, int i) {
        long j2;
        Long l6 = l;
        String str4 = str3;
        Long l7 = l2;
        Integer num4 = num;
        Long l8 = l3;
        Long l9 = l4;
        Integer num5 = num2;
        Long l10 = l5;
        Integer num6 = num3;
        C85323Wm onEventV3 = null;
        if ((i & 16) != 0) {
            l6 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            l7 = null;
        }
        if ((i & 128) != 0) {
            num4 = null;
        }
        if ((i & 256) != 0) {
            l8 = null;
        }
        if ((i & 512) != 0) {
            l9 = null;
        }
        if ((i & 1024) != 0) {
            num5 = null;
        }
        if ((i & 2048) != 0) {
            l10 = null;
        }
        if ((i & 4096) != 0) {
            num6 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            onEventV3 = C772831o.LIZ();
        }
        o.LJIIIZ(onEventV3, "onEventV3");
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        LIZJ("page_type", str, c65864Pt6);
        LIZJ("page_status", str2, c65864Pt6);
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        LIZ(c65864Pt6, "is_first_load", Long.valueOf(j2));
        LIZ(c65864Pt6, "overall_cost", Long.valueOf(j));
        LIZ(c65864Pt6, "suggested_query_cost", l6);
        LIZJ("suggested_query_type", str4, c65864Pt6);
        LIZ(c65864Pt6, "suggested_convert_cost", l7);
        LIZIZ(num4, "suggested_count", c65864Pt6);
        LIZ(c65864Pt6, "recent_query_cost", l8);
        LIZ(c65864Pt6, "recent_convert_cost", l9);
        LIZIZ(num5, "recent_count", c65864Pt6);
        LIZ(c65864Pt6, "result_overall_cost", l10);
        LIZIZ(num6, "result_count", c65864Pt6);
        onEventV3.LIZIZ("dm_search_page_load_performance", c65864Pt6);
        c65864Pt6.build();
    }
}
