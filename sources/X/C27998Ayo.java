package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.api.CartApi;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27998Ayo extends R30<BundleAddItemsToCartRequest, RYJ, BundleAddItemsToCartRequest, RYJ> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<RYJ> LJII(BundleAddItemsToCartRequest bundleAddItemsToCartRequest) {
        BundleAddItemsToCartRequest req = bundleAddItemsToCartRequest;
        o.LJIIIZ(req, "req");
        CartApi.LIZ.getClass();
        return ((CartApi) C27996Aym.LIZIZ.create(CartApi.class)).addToCartBundle(req).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}
