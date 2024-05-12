package com.bytedance.lynx.hybrid.webkit.pia;

import X.C61295O3v;
import X.C61317O4r;
import X.C76800UCe;
import X.EnumC37644Eq0;
import X.InterfaceC37464En6;
import X.InterfaceC60656NrI;
import X.InterfaceC88472Yns;
import X.O4K;
import X.O4O;
import X.O4V;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.model.Request;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PiaFetcher extends ResourceFetcher {
    public static final C61317O4r Companion = new C61317O4r();
    public static final String NAME = "pia";

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(Request request, C61295O3v response, InterfaceC88472Yns<? super C61295O3v, C76800UCe> callback) {
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        o.LJIIJ(callback, "callback");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PiaFetcher(Forest forest) {
        super(forest);
        o.LJIIJ(forest, "forest");
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(Request request, C61295O3v response) {
        InterfaceC37464En6 LIZLLL;
        boolean z;
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        Object obj = request.getCustomParams().get("rl_pia_life_cycle");
        if (!(obj instanceof InterfaceC60656NrI)) {
            obj = null;
        }
        InterfaceC60656NrI interfaceC60656NrI = (InterfaceC60656NrI) obj;
        if (interfaceC60656NrI != null && interfaceC60656NrI.LJI(request.getUri()) && (LIZLLL = interfaceC60656NrI.LIZLLL(new O4K(request))) != null) {
            String str = LIZLLL.LJFF().get("pia_forest_from");
            if (str == null) {
                str = NAME;
            }
            response.LLD = str;
            if (LIZLLL.LJIIIZ() == EnumC37644Eq0.Offline) {
                z = true;
            } else {
                z = false;
            }
            response.LLFF = z;
            response.LJLJJL = LIZLLL.LJFF();
            response.LJLLJ = LIZLLL.LJI();
            response.LJLL = LIZLLL.getMimeType();
            response.X(new O4O(new O4V(LIZLLL), null));
            response.LJZL = true;
        }
    }
}
