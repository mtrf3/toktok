package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rys, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71318Rys extends TAT {
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ AnchorPanelAdapter LJLJJL;
    public final /* synthetic */ ShopWindowAnchorModel LJLJJLL;
    public final /* synthetic */ SY4 LJLJL;
    public final /* synthetic */ String LJLJLJ;

    @Override // X.TAT
    public final void LIZ(View view) {
        List list;
        if (view != null) {
            int i = this.LJLJJI;
            int panelStyle = this.LJLJJL.LJLJLJ.getPanelStyle();
            ProductListModel productListModel = this.LJLJJL.LJLIL;
            ShopWindowAnchorModel shopWindowAnchorModel = this.LJLJJLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            java.util.Map<String, List<PromotionLogo>> map = this.LJLJJL.LJLLILLLL;
            if (map != null) {
                list = (List) ((LinkedHashMap) map).get(this.LJLJLJ);
            } else {
                list = null;
            }
            c71361RzZ.getClass();
            java.util.Map LJJIJIIJIL = C71361RzZ.LJJIJIIJIL(list);
            if (LJJIJIIJIL != null) {
                linkedHashMap.putAll(LJJIJIIJIL);
            }
            C71366Rze.LIZJ(String.valueOf(this.LJLJJLL.LIZ.productId), linkedHashMap);
            C71363Rzb.LJFF(i, panelStyle, productListModel, shopWindowAnchorModel, "buy_now", linkedHashMap);
            String str = this.LJLJJLL.LIZ.productUnavailableText;
            Context context = this.LJLJL.getContext();
            o.LJIIIIZZ(context, "context");
            C71361RzZ.LJJJLIIL(context, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71318Rys(int i, AnchorPanelAdapter anchorPanelAdapter, ShopWindowAnchorModel shopWindowAnchorModel, SY4 sy4, String str) {
        super(700L);
        this.LJLJJI = i;
        this.LJLJJL = anchorPanelAdapter;
        this.LJLJJLL = shopWindowAnchorModel;
        this.LJLJL = sy4;
        this.LJLJLJ = str;
    }
}
