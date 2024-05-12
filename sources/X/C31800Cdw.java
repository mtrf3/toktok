package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.shop.ShopCell$onBind$5", f = "ShopProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cdw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31800Cdw extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ Y5J LJLILLLLZI;
    public final /* synthetic */ EcommerceEntrance LJLJI;
    public final /* synthetic */ User LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31800Cdw(Y5J y5j, EcommerceEntrance ecommerceEntrance, User user, String str, String str2, java.util.Map<String, Object> map, InterfaceC67352kd<? super C31800Cdw> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = y5j;
        this.LJLJI = ecommerceEntrance;
        this.LJLJJI = user;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = map;
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
        String idStr = this.LJLJJI.getIdStr();
        C29484Bhg c29484Bhg = this.LJLILLLLZI.LJLIL;
        LJIIIZ.LJ(context, str, idStr, (String) c29484Bhg.LJII.LIZ, "live_half_screen_profile", null, c29484Bhg.LIZJ.LIZLLL(), new Integer((int) this.LJLJJI.getFollowInfo().getFollowStatus()), null, this.LJLJJL, this.LJLJJLL, this.LJLILLLLZI.LJLIL.LJFF.getIdStr(), this.LJLJL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C31800Cdw c31800Cdw = new C31800Cdw(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c31800Cdw.LJLIL = view;
        return c31800Cdw.invokeSuspend(C76800UCe.LIZ);
    }
}
