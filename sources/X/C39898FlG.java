package X;

import com.bytedance.forest.model.Request;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import kotlin.jvm.internal.o;

/* renamed from: X.FlG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39898FlG implements InterfaceC39899FlH {
    public final /* synthetic */ AdWebViewInterceptorService LIZ;
    public final /* synthetic */ InterfaceC39904FlM LIZIZ;

    @Override // X.InterfaceC39899FlH
    public final void LIZ(Request request) {
        if (!o.LJ(request.getForest(), this.LIZ.LIZLLL().LIZ) || request.isPreload()) {
            return;
        }
        request.setFetcherSequence(C47261Igj.LJJIJIL("commerce_web"));
        request.getCustomParams().put("interceptor", this.LIZIZ);
        request.setNeedLocalFile(false);
    }

    public C39898FlG(AdWebViewInterceptorService adWebViewInterceptorService, InterfaceC39904FlM interfaceC39904FlM) {
        this.LIZ = adWebViewInterceptorService;
        this.LIZIZ = interfaceC39904FlM;
    }
}
