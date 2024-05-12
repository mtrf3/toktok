package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter$configNavBar$1$1$1", f = "AnchorPanelAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ryu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71320Ryu extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ AnchorPanelAdapter LJLJI;
    public final /* synthetic */ ShopWindowAnchorModel LJLJJI;
    public final /* synthetic */ LinearLayout LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71320Ryu(int i, AnchorPanelAdapter anchorPanelAdapter, ShopWindowAnchorModel shopWindowAnchorModel, LinearLayout linearLayout, String str, InterfaceC67352kd<? super C71320Ryu> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = anchorPanelAdapter;
        this.LJLJJI = shopWindowAnchorModel;
        this.LJLJJL = linearLayout;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        int i = this.LJLILLLLZI;
        int panelStyle = this.LJLJI.LJLJLJ.getPanelStyle();
        ProductListModel productListModel = this.LJLJI.LJLIL;
        ShopWindowAnchorModel shopWindowAnchorModel = this.LJLJJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorPanelAdapter anchorPanelAdapter = this.LJLJI;
        ShopWindowAnchorModel shopWindowAnchorModel2 = this.LJLJJI;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        java.util.Map<String, List<PromotionLogo>> map = anchorPanelAdapter.LJLLILLLL;
        if (map != null) {
            list = (List) ((LinkedHashMap) map).get(String.valueOf(shopWindowAnchorModel2.LIZ.productId));
        } else {
            list = null;
        }
        c71361RzZ.getClass();
        java.util.Map LJJIJIIJIL = C71361RzZ.LJJIJIIJIL(list);
        if (LJJIJIIJIL != null) {
            linkedHashMap.putAll(LJJIJIIJIL);
        }
        C71366Rze.LIZJ(String.valueOf(shopWindowAnchorModel2.LIZ.productId), linkedHashMap);
        C71363Rzb.LJFF(i, panelStyle, productListModel, shopWindowAnchorModel, "contact_seller", linkedHashMap);
        ShopWindowAnchorModel shopWindowAnchorModel3 = this.LJLJJI;
        Context context = this.LJLJJL.getContext();
        o.LJIIIIZZ(context, "context");
        if (!C71361RzZ.LJIIIIZZ(context, shopWindowAnchorModel3)) {
            return C76800UCe.LIZ;
        }
        Context context2 = view.getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJLL);
        LIZ.append("&in_window=chat_im");
        SmartRouter.buildRoute(context2, X1D.LIZIZ(LIZ)).open();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C71320Ryu c71320Ryu = new C71320Ryu(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c71320Ryu.LJLIL = view;
        return c71320Ryu.invokeSuspend(C76800UCe.LIZ);
    }
}
