package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.api.CartApi;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27997Ayn extends R30<AddItemToCartRequest, C58045MqH, AddItemToCartRequest, C58045MqH> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<C58045MqH> LJII(AddItemToCartRequest addItemToCartRequest) {
        AddItemToCartRequest req = addItemToCartRequest;
        o.LJIIIZ(req, "req");
        CartApi.LIZ.getClass();
        return ((CartApi) C27996Aym.LIZIZ.create(CartApi.class)).addToCart(req).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}
