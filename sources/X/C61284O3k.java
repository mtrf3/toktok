package X;

import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.model.Request;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS15S0500000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.O3k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61284O3k {
    public volatile boolean LIZ;
    public final LinkedList<ResourceFetcher> LIZIZ;

    public C61284O3k(LinkedList<ResourceFetcher> linkedList) {
        this.LIZIZ = linkedList;
    }

    public final void LIZ(Request request, C61295O3v response, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns) {
        o.LJIIJ(response, "response");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch, request = ");
        LIZ.append(request);
        LIZ.append('}');
        C39930Flm.LIZ("ResourceFetcherChain", X1D.LIZIZ(LIZ));
        if (!request.getFetcherSequence().contains("gecko")) {
            response.LL.LIZIZ(1, "disabled_by_config");
        }
        if (this.LIZIZ.isEmpty()) {
            C61287O3n c61287O3n = response.LL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ResourceFetcherChain# no fetcher for url:");
            LIZ2.append(request.getUrl());
            LIZ2.append(" geckoModel:");
            LIZ2.append(request.getGeckoModel());
            c61287O3n.LIZLLL(1, X1D.LIZIZ(LIZ2));
            interfaceC88472Yns.invoke(response);
            return;
        }
        if (request.isASync()) {
            LIZIZ(request, response, interfaceC88472Yns);
            return;
        }
        while (true) {
            if (!(!this.LIZIZ.isEmpty())) {
                break;
            }
            try {
                ResourceFetcher pop = this.LIZIZ.pop();
                response.LJLJLLL = pop;
                pop.fetchSync(request, response);
                if (response.LJZL) {
                    response.LLFII = C16880lQ.LJLLJ(pop.getClass());
                    interfaceC88472Yns.invoke(response);
                    return;
                }
            } catch (Throwable th) {
                if (this.LIZIZ.isEmpty()) {
                    C61287O3n c61287O3n2 = response.LL;
                    String str = null;
                    StringBuilder LIZIZ = C25620zW.LIZIZ("catch error on ", null, ", error:");
                    LIZIZ.append(th.getMessage());
                    LIZIZ.append(' ');
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        str = cause.getMessage();
                    }
                    LIZIZ.append(str);
                    c61287O3n2.LIZLLL(3, X1D.LIZIZ(LIZIZ));
                } else {
                    C39930Flm.LIZIZ("ResourceFetcherChain", "fetchSync catch error", th);
                }
            }
            if (this.LIZ) {
                response.LJLILLLLZI = true;
                response.LL.LIZLLL(2, "ResourceFetcherChain# on cancel load");
                break;
            }
        }
        interfaceC88472Yns.invoke(response);
    }

    public final void LIZIZ(Request request, C61295O3v c61295O3v, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns) {
        try {
            ResourceFetcher pop = this.LIZIZ.pop();
            c61295O3v.LJLJLLL = pop;
            pop.fetchAsync(request, c61295O3v, new AqS15S0500000_10(this, c61295O3v, interfaceC88472Yns, pop, request, 0));
        } catch (Throwable th) {
            C39930Flm.LIZIZ("ResourceFetcherChain", " onException ", th);
            if (!this.LIZIZ.isEmpty()) {
                LIZIZ(request, c61295O3v, interfaceC88472Yns);
                return;
            }
            C61287O3n c61287O3n = c61295O3v.LL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ResourceFetcherChain# ");
            LIZ.append(th.getMessage());
            c61287O3n.LIZLLL(3, X1D.LIZIZ(LIZ));
            interfaceC88472Yns.invoke(c61295O3v);
        }
    }
}
