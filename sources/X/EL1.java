package X;

import com.ss.android.ugc.aweme.hybridkit.web.WebViewInjectServiceImpl;
import com.ss.android.ugc.aweme.webview.IWebViewInjectService;

/* loaded from: classes7.dex */
public final class EL1 implements IWebViewInjectService {
    public static final EL1 LIZIZ = new EL1();
    public final /* synthetic */ IWebViewInjectService LIZ;

    @Override // com.ss.android.ugc.aweme.webview.IWebViewInjectService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public EL1() {
        IWebViewInjectService iWebViewInjectService;
        Object LIZ = C58096Mr6.LIZ(IWebViewInjectService.class, false);
        if (LIZ != null) {
            iWebViewInjectService = (IWebViewInjectService) LIZ;
        } else {
            if (C58096Mr6.g1 == null) {
                synchronized (IWebViewInjectService.class) {
                    if (C58096Mr6.g1 == null) {
                        C58096Mr6.g1 = new WebViewInjectServiceImpl();
                    }
                }
            }
            iWebViewInjectService = C58096Mr6.g1;
        }
        this.LIZ = iWebViewInjectService;
    }
}
