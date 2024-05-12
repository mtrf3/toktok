package X;

import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.RzF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71341RzF extends AbstractC65781Prl implements InterfaceC88472Yns<ShopWindowAnchorModel, CharSequence> {
    public static final C71341RzF LJLIL = new C71341RzF();

    public C71341RzF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ShopWindowAnchorModel shopWindowAnchorModel) {
        ShopWindowAnchorModel it = shopWindowAnchorModel;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{\"product_id\":\"");
        LIZ.append(it.LIZ.productId);
        LIZ.append("\"}");
        return X1D.LIZIZ(LIZ);
    }
}
