package X;

import com.bytedance.android.live.browser.IHostJsbRegisterService;
import com.ss.android.ugc.aweme.live.ILiveBDXBridgeService;
import java.util.List;

/* renamed from: X.Mth, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58257Mth implements ILiveBDXBridgeService {
    public static final C58257Mth LIZ = new C58257Mth();

    @Override // com.ss.android.ugc.aweme.live.ILiveBDXBridgeService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList;
        IHostJsbRegisterService iHostJsbRegisterService = (IHostJsbRegisterService) CN1.LIZ(IHostJsbRegisterService.class);
        if (iHostJsbRegisterService == null || (provideXBridgetIDLMethodList = iHostJsbRegisterService.provideXBridgetIDLMethodList()) == null) {
            return C61878OQg.INSTANCE;
        }
        return provideXBridgetIDLMethodList;
    }
}
