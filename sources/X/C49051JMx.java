package X;

import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JMx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49051JMx extends AbstractC65781Prl implements InterfaceC88472Yns<ProductAnchor, List<? extends Product>> {
    public static final C49051JMx LJLIL = new C49051JMx();

    public C49051JMx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final List<? extends Product> invoke(ProductAnchor productAnchor) {
        ProductAnchor it = productAnchor;
        o.LJIIIZ(it, "it");
        List<Product> list = it.productList;
        if (list != null && (!list.isEmpty())) {
            return list;
        }
        return C61878OQg.INSTANCE;
    }
}
