package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.List;

/* renamed from: X.JMv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49049JMv extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, List<? extends Product>> {
    public static final C49049JMv LJLIL = new C49049JMv();

    public C49049JMv() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final List<? extends Product> invoke(AnchorCommonStruct anchorCommonStruct) {
        ProductAnchor LIZ = C49462Jb8.LIZ(anchorCommonStruct);
        if (LIZ != null) {
            return LIZ.productList;
        }
        return null;
    }
}
