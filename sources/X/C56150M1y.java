package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.RelationProductData;
import kotlin.jvm.internal.o;

/* renamed from: X.M1y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56150M1y extends AbstractC65781Prl implements InterfaceC88472Yns<RelationProductData, CharSequence> {
    public static final C56150M1y LJLIL = new C56150M1y();

    public C56150M1y() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(RelationProductData relationProductData) {
        RelationProductData it = relationProductData;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.product_id);
    }
}
