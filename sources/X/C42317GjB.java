package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;

/* renamed from: X.GjB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42317GjB extends AbstractC65781Prl implements InterfaceC65784Pro<ICreativePerformanceMonitorService> {
    public static final C42317GjB LJLIL = new C42317GjB();

    public C42317GjB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ICreativePerformanceMonitorService invoke() {
        return AVExternalServiceImpl.LIZ().performanceMonitorService();
    }
}
