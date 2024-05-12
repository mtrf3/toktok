package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71331Rz5 extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ ShopWindowAnchorModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ AnchorPanelAdapter LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C68322mC<String> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71331Rz5(ShopWindowAnchorModel shopWindowAnchorModel, String str, AnchorPanelAdapter anchorPanelAdapter, int i, String str2, C68322mC<String> c68322mC) {
        super(1);
        this.LJLIL = shopWindowAnchorModel;
        this.LJLILLLLZI = str;
        this.LJLJI = anchorPanelAdapter;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = c68322mC;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String schema = str;
        o.LJIIIZ(schema, "schema");
        ShopWindowAnchorModel shopWindowAnchorModel = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        AnchorPanelAdapter anchorPanelAdapter = this.LJLJI;
        ProductListModel productListModel = anchorPanelAdapter.LJLIL;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        int i = anchorPanelAdapter.LJLL;
        int i2 = this.LJLJJI;
        c71361RzZ.getClass();
        SmartRouter.buildRoute(C78949Uyf.LJIILL(this.LJLJI.LJLILLLLZI), C71360RzY.LJJ(schema, shopWindowAnchorModel, str2, productListModel, C71361RzZ.LJJJJJ(i, i2), this.LJLJI.LJLIL.getEventType(), this.LJLJJL, this.LJLJJLL.element, this.LJLJI.LJLJJI, null, null, null, null)).open();
        return C76800UCe.LIZ;
    }
}
