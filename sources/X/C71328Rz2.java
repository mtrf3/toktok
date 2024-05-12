package X;

import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71328Rz2 extends AbstractC65781Prl implements InterfaceC88472Yns<ShopWindowAnchorModel, CharSequence> {
    public static final C71328Rz2 LJLIL = new C71328Rz2();

    public C71328Rz2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ShopWindowAnchorModel shopWindowAnchorModel) {
        ShopWindowAnchorModel it = shopWindowAnchorModel;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.LIZ.productId);
    }
}
