package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$refreshHomepageData$1", f = "ShopMainViewModel.kt", l = {301}, m = "invokeSuspend")
/* renamed from: X.Ly0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55976Ly0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShopMainViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55976Ly0(ShopMainViewModel shopMainViewModel, InterfaceC67352kd<? super C55976Ly0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = shopMainViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55976Ly0(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI.lv0().LJLJJI) {
                ShopMainViewModel shopMainViewModel = this.LJLILLLLZI;
                EnumC56007LyV enumC56007LyV = EnumC56007LyV.REFRESH;
                this.LJLIL = 1;
                shopMainViewModel.getClass();
                Object LJI = C48841JEv.LJI(new C56011LyZ(enumC56007LyV, shopMainViewModel, null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
                if (LJI == obj2) {
                    return obj2;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
