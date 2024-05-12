package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.ShopProfileVH;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.ShopProfileVH$onBind$1", f = "ShopProfileVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Agb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26869Agb extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ShopProfileVH LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26869Agb(ShopProfileVH shopProfileVH, InterfaceC67352kd<? super C26869Agb> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = shopProfileVH;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.onClick("other");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C26869Agb(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
