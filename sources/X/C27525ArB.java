package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import kotlin.jvm.internal.o;

/* renamed from: X.ArB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27525ArB extends AbstractC65781Prl implements InterfaceC88472Yns<RelateProduct, CharSequence> {
    public static final C27525ArB LJLIL = new C27525ArB();

    public C27525ArB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(RelateProduct relateProduct) {
        RelateProduct it = relateProduct;
        o.LJIIIZ(it, "it");
        String str = it.productID;
        if (str != null) {
            return str;
        }
        return "";
    }
}
