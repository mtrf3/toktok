package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallShopCartAssem;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import fjb.a;
import kotlin.jvm.internal.AqS97S0101000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallShopCartAssem$onEvent$1", f = "MallShopCartAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LvX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55823LvX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ MallShopCartAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55823LvX(String str, MallShopCartAssem mallShopCartAssem, InterfaceC67352kd<? super C55823LvX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = mallShopCartAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55823LvX(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        CartRefreshEvent LIZ = C55824LvY.LIZ(this.LJLIL);
        int i = LIZ.refresh;
        if (i != 0) {
            if (i == 1) {
                ShopMainViewModel shopMainViewModel = (ShopMainViewModel) this.LJLILLLLZI.LJLIL.getValue();
                C78565UsT.LJJIJIIJI(shopMainViewModel, C78613UtF.LIZJ, new C55976Ly0(shopMainViewModel, null));
            }
        } else {
            Integer num = LIZ.count;
            if (num != null) {
                MallShopCartAssem mallShopCartAssem = this.LJLILLLLZI;
                int intValue = num.intValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CartRedBadge cart event ");
                LIZ2.append(intValue);
                C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
                ShopMainViewModel shopMainViewModel2 = (ShopMainViewModel) mallShopCartAssem.LJLIL.getValue();
                shopMainViewModel2.withState(new AqS97S0101000_9(intValue, shopMainViewModel2, 12));
                C78857UxB.LJIIL(num.intValue());
            } else {
                ShopMainViewModel shopMainViewModel3 = (ShopMainViewModel) this.LJLILLLLZI.LJLIL.getValue();
                C78565UsT.LJJIJIIJI(shopMainViewModel3, C78613UtF.LIZJ, new C55976Ly0(shopMainViewModel3, null));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
