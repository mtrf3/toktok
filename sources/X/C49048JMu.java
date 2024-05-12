package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.List;

/* renamed from: X.JMu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49048JMu extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, List<? extends Product>> {
    public static final C49048JMu LJLIL = new C49048JMu();

    public C49048JMu() {
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
