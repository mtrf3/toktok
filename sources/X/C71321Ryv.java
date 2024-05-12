package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter$configNavBar$3$1$1", f = "AnchorPanelAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ryv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71321Ryv extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AnchorPanelAdapter LJLIL;
    public final /* synthetic */ ShopWindowAnchorModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ LinearLayout LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71321Ryv(AnchorPanelAdapter anchorPanelAdapter, ShopWindowAnchorModel shopWindowAnchorModel, String str, LinearLayout linearLayout, InterfaceC67352kd<? super C71321Ryv> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = anchorPanelAdapter;
        this.LJLILLLLZI = shopWindowAnchorModel;
        this.LJLJI = str;
        this.LJLJJI = linearLayout;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ProductListModel model = this.LJLIL.LJLIL;
        ShopWindowAnchorModel shopWindowAnchorModel = this.LJLILLLLZI;
        String str = this.LJLJI;
        o.LJIIIZ(model, "model");
        C71363Rzb.LJIIZILJ("tiktokec_shop_entrance_click", model, shopWindowAnchorModel, str);
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        ShopWindowAnchorModel shopWindowAnchorModel2 = this.LJLILLLLZI;
        Context context = this.LJLJJI.getContext();
        o.LJIIIIZZ(context, "context");
        c71361RzZ.getClass();
        if (!C71361RzZ.LJIIIIZZ(context, shopWindowAnchorModel2)) {
            return C76800UCe.LIZ;
        }
        SmartRouter.buildRoute(this.LJLJJI.getContext(), this.LJLJI).open();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C71321Ryv(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
