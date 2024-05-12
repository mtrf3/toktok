package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;

/* renamed from: X.GjA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42316GjA extends AbstractC65781Prl implements InterfaceC65784Pro<ICreativePerformanceMonitorService> {
    public static final C42316GjA LJLIL = new C42316GjA();

    public C42316GjA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ICreativePerformanceMonitorService invoke() {
        return AVExternalServiceImpl.LIZ().performanceMonitorService();
    }
}
