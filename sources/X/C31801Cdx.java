package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.shop.ShopCell$onBind$16", f = "ShopProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cdx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31801Cdx extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ Y5J LJLILLLLZI;
    public final /* synthetic */ EcommerceEntrance LJLJI;
    public final /* synthetic */ EcommerceEntrance.ShopEntranceInfo LJLJJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31801Cdx(Y5J y5j, EcommerceEntrance ecommerceEntrance, EcommerceEntrance.ShopEntranceInfo shopEntranceInfo, java.util.Map<String, Object> map, InterfaceC67352kd<? super C31801Cdx> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = y5j;
        this.LJLJI = ecommerceEntrance;
        this.LJLJJI = shopEntranceInfo;
        this.LJLJJL = map;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        this.LJLILLLLZI.LJLIL.LIZLLL.dismiss();
        IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        String str = this.LJLJI.schema;
        o.LJIIIIZZ(str, "entrance.schema");
        LJIIIZ.LJI(context, str, this.LJLJJI.shopId, this.LJLILLLLZI.LJLIL.LIZJ.LIZLLL(), "live_half_screen_profile", null, null, this.LJLJJL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C31801Cdx c31801Cdx = new C31801Cdx(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c31801Cdx.LJLIL = view;
        return c31801Cdx.invokeSuspend(C76800UCe.LIZ);
    }
}
