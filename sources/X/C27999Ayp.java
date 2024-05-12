package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.api.CartApi;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.RecommendAfterAddRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27999Ayp extends R30<RecommendAfterAddRequest, C68352mF, RecommendAfterAddRequest, C68352mF> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<C68352mF> LJII(RecommendAfterAddRequest recommendAfterAddRequest) {
        RecommendAfterAddRequest req = recommendAfterAddRequest;
        o.LJIIIZ(req, "req");
        CartApi.LIZ.getClass();
        return ((CartApi) C27996Aym.LIZIZ.create(CartApi.class)).recommendAfterAdd(req).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}
