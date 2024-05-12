package com.bytedance.forest.chain.fetchers;

import X.C61295O3v;
import X.C61296O3w;
import X.C61304O4e;
import X.C61325O4z;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.O4E;
import X.O4F;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.Request;
import java.io.File;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS70S0400000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CDNFetcher extends ResourceFetcher {
    public static final O4E Companion = new O4E();
    public static File directory;
    public static boolean isInitialized;
    public C61296O3w fetchTask;

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
        C61296O3w c61296O3w = this.fetchTask;
        if (c61296O3w == null || c61296O3w.LIZIZ) {
            return;
        }
        c61296O3w.LJIIL.LJZI.getNetDepender().LIZIZ(c61296O3w);
        c61296O3w.LIZ = O4F.CANCEL;
        c61296O3w.LIZ();
        c61296O3w.LJIIJJI = null;
    }

    public final C61296O3w getFetchTask() {
        return this.fetchTask;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDNFetcher(Forest forest) {
        super(forest);
        o.LJIIJ(forest, "forest");
    }

    public final void setFetchTask(C61296O3w c61296O3w) {
        this.fetchTask = c61296O3w;
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(Request request, C61295O3v response) {
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        doFetch(request, response, C61304O4e.LJLIL);
    }

    public final void doFetch(Request request, C61295O3v c61295O3v, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns) {
        c61295O3v.W(null, "cdn_total_start");
        if (ujb.o.LJJJJJL(request.getUrl())) {
            c61295O3v.LL.LIZ(1, "CDN Url Blank");
            c61295O3v.W(null, "cdn_total_finish");
            interfaceC88472Yns.invoke(c61295O3v);
        } else {
            if (request.getUri().isOpaque()) {
                c61295O3v.LL.LIZ(2, "cdn Url is not Hierarchical");
                c61295O3v.W(null, "cdn_total_finish");
                interfaceC88472Yns.invoke(c61295O3v);
                return;
            }
            C61296O3w c61296O3w = this.fetchTask;
            if (c61296O3w == null) {
                c61296O3w = new C61296O3w(c61295O3v, request.getNetDepender(), new AqS141S0200000_10(c61295O3v, interfaceC88472Yns, 3));
                c61295O3v.W(null, "cdn_cache_start");
                c61295O3v.LJLJJLL = c61296O3w;
                c61296O3w.LJIILIIL.LIZ(c61296O3w.LJIIL.LJZI.getForest().getApplication(), c61296O3w);
            }
            this.fetchTask = c61296O3w;
        }
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(Request request, C61295O3v response, InterfaceC88472Yns<? super C61295O3v, C76800UCe> callback) {
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        o.LJIIJ(callback, "callback");
        C61325O4z.LJ(new AqS70S0400000_10(this, request, response, callback, 0));
    }
}
