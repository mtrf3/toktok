package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C86263a2 extends TBS implements InterfaceC88472Yns<C86283a4, C76800UCe> {
    public C86263a2(C86373aD c86373aD) {
        super(1, c86373aD, C86373aD.class, "reportSearchQuery", "reportSearchQuery$core_release(Lcom/bytedance/im/core/search/performance/SearchQueryPerformanceData;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C86283a4 c86283a4) {
        long j;
        String num;
        String num2;
        C86283a4 p0 = c86283a4;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("dm_search_result_query_performance");
        C86373aD c86373aD = C86373aD.LIZ;
        Integer valueOf = Integer.valueOf(p0.LJLIL);
        c86373aD.getClass();
        if (valueOf != null && (num2 = valueOf.toString()) != null) {
            c63323OtD.LIZ(num2, "result_count");
        }
        C86373aD.LIZ(c63323OtD, "fts_select_cost", Long.valueOf(p0.LJLILLLLZI));
        C86373aD.LIZ(c63323OtD, "fts_merge_cost", Long.valueOf(p0.LJLJI));
        C86373aD.LIZ(c63323OtD, "fts_business_cost", Long.valueOf(p0.LJLJJI));
        C86373aD.LIZ(c63323OtD, "fts_sort_cost", Long.valueOf(p0.LJLJJL));
        C86373aD.LIZ(c63323OtD, "overall_cost", Long.valueOf(p0.LJLJJLL));
        Integer valueOf2 = Integer.valueOf(p0.LJLJL);
        if (valueOf2 != null && (num = valueOf2.toString()) != null) {
            c63323OtD.LIZ(num, "query_key_count");
        }
        long j2 = 1;
        if (p0.LJLJLJ) {
            j = 1;
        } else {
            j = 0;
        }
        C86373aD.LIZ(c63323OtD, "is_abort", Long.valueOf(j));
        if (!p0.LJLJLLL) {
            j2 = 0;
        }
        C86373aD.LIZ(c63323OtD, "is_sync_data_finished", Long.valueOf(j2));
        c63323OtD.LJFF();
        return C76800UCe.LIZ;
    }
}
