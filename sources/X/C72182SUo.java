package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.assem.ProductListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SUo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72182SUo extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C72182SUo LJLIL = new C72182SUo();

    public C72182SUo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(ProductListAssem.class);
        uiContentAssem.LJIIIIZZ = new ProductListAssem();
        uiContentAssem.LJI = R.id.clw;
        return C76800UCe.LIZ;
    }
}
