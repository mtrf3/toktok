package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment$onNodeShow$1", f = "ShopMainFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M01 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ShopMainFragment LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M01(ShopMainFragment shopMainFragment, Bundle bundle, InterfaceC67352kd<? super M01> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = shopMainFragment;
        this.LJLILLLLZI = bundle;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new M01(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopMainLifeCycle onNodeShow enterFrom = ");
        ShopMainFragment.LJZ.getClass();
        LIZ.append(ShopMainFragment.LJZI);
        LIZ.append(" enterMethod = ");
        LIZ.append(ShopMainFragment.LL);
        LIZ.append(" openFrom = ");
        CK3.LIZIZ(LIZ, ShopMainFragment.LLF, LIZ, 3);
        ShopMainFragment shopMainFragment = this.LJLIL;
        if (shopMainFragment.LJLLLL) {
            shopMainFragment.LJLLLL = false;
        }
        if (C54741Le5.LIZIZ()) {
            C12460eI.LJIIL(this.LJLIL, false);
        } else {
            C12460eI.LJIIIIZZ(this.LJLIL, null);
        }
        this.LJLIL.Il(EnumC56032Lyu.TAB_SWITCH);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
