package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService;
import com.ss.android.ugc.aweme.commercialize.service.SplashAdOutService;

/* loaded from: classes11.dex */
public final class NW5 extends AbstractC65781Prl implements InterfaceC65784Pro<NPU> {
    public static final NW5 LJLIL = new NW5();

    public NW5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final NPU invoke() {
        ISplashAdOutService splashAdOutService;
        Object LIZ = C58096Mr6.LIZ(ISplashAdOutService.class, false);
        if (LIZ != null) {
            splashAdOutService = (ISplashAdOutService) LIZ;
        } else {
            splashAdOutService = new SplashAdOutService();
        }
        return splashAdOutService.LIZ();
    }
}
