package X;

import com.ss.android.ugc.aweme.service.AnalyticsDetailService;
import com.ss.android.ugc.aweme.service.IAnalyticsDetailService;

/* renamed from: X.3Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80253Cz extends AbstractC65781Prl implements InterfaceC65784Pro<IAnalyticsDetailService> {
    public static final C80253Cz LJLIL = new C80253Cz();

    public C80253Cz() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.IAnalyticsDetailService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IAnalyticsDetailService invoke() {
        ?? LIZ = C58096Mr6.LIZ(IAnalyticsDetailService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        return new AnalyticsDetailService();
    }
}
