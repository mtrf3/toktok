package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;

/* renamed from: X.XTm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84894XTm extends AbstractC65781Prl implements InterfaceC65784Pro<IAVPerformance> {
    public static final C84894XTm LJLIL = new C84894XTm();

    public C84894XTm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVPerformance invoke() {
        return AVExternalServiceImpl.LIZ().provideAVPerformance();
    }
}
