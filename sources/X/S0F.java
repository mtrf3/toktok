package X;

import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S0F extends AbstractC65781Prl implements InterfaceC88472Yns<ShopWindowAnchorModel, CharSequence> {
    public static final S0F LJLIL = new S0F();

    public S0F() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ShopWindowAnchorModel shopWindowAnchorModel) {
        ShopWindowAnchorModel it = shopWindowAnchorModel;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.LIZ.productId);
    }
}
