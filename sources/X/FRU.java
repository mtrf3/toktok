package X;

import com.ss.android.ugc.aweme.notification.lego.ReportColdStartConfig;

/* loaded from: classes7.dex */
public final class FRU extends AbstractC65781Prl implements InterfaceC65784Pro<ReportColdStartConfig[]> {
    public static final FRU LJLIL = new FRU();

    public FRU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.notification.lego.ReportColdStartConfig[], java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ReportColdStartConfig[] invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ReportColdStartConfig[] reportColdStartConfigArr = FRT.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "inbox_cold_start_report_list", 31744, ReportColdStartConfig[].class, reportColdStartConfigArr);
        if (LJIJ == 0) {
            return reportColdStartConfigArr;
        }
        return LJIJ;
    }
}
