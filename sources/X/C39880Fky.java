package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Fky, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39880Fky implements InterfaceC39901FlJ {
    public final /* synthetic */ C39878Fkw LIZ;

    @Override // X.InterfaceC39901FlJ
    public final void LIZIZ(String url, RequestParams requestParams) {
        o.LJIIJ(url, "url");
        o.LJIIJ(requestParams, "requestParams");
    }

    public C39880Fky(C39878Fkw c39878Fkw) {
        this.LIZ = c39878Fkw;
    }

    @Override // X.InterfaceC39901FlJ
    public final void LIZ(C61295O3v response) {
        SSPResponse.Data data;
        SSPResponse.Prefetch[] prefetchArr;
        o.LJIIJ(response, "response");
        if (response.LJZL && !response.LJZI.isPreload() && (data = this.LIZ.LJLJJLL) != null && (prefetchArr = data.prefetchList) != null) {
            for (SSPResponse.Prefetch prefetch : prefetchArr) {
                String str = prefetch.url;
                if (str != null && str.equals(response.LJZI.getUrl())) {
                    if (response.LJLLLL) {
                        this.LIZ.LJLL++;
                        return;
                    } else {
                        if (!response.LJLLLLLL) {
                            return;
                        }
                        this.LIZ.LJLLI++;
                        return;
                    }
                }
            }
        }
    }
}
