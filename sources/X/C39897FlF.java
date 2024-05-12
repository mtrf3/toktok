package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import kotlin.jvm.internal.o;

/* renamed from: X.FlF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39897FlF implements InterfaceC39901FlJ {
    public final /* synthetic */ AdWebViewInterceptorService LIZ;
    public final /* synthetic */ InterfaceC39904FlM LIZIZ;

    @Override // X.InterfaceC39901FlJ
    public final void LIZIZ(String url, RequestParams requestParams) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(requestParams, "requestParams");
    }

    @Override // X.InterfaceC39901FlJ
    public final void LIZ(C61295O3v response) {
        String str;
        o.LJIIIZ(response, "response");
        if (!o.LJ(response.LJZI.getForest(), this.LIZ.LIZLLL().LIZ) || response.LJZI.isPreload() || o.LJ(response.LLD, "commerce_web")) {
            return;
        }
        Object obj = response.LJZI.getCustomParams().get("rl_container_uuid");
        View view = null;
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        C31999Ch9.LIZJ.getClass();
        InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ != null) {
            view = LIZIZ.LIZJ();
        }
        boolean z = view instanceof WebView;
        this.LIZIZ.LIZ(response);
    }

    public C39897FlF(AdWebViewInterceptorService adWebViewInterceptorService, InterfaceC39904FlM interfaceC39904FlM) {
        this.LIZ = adWebViewInterceptorService;
        this.LIZIZ = interfaceC39904FlM;
    }
}
