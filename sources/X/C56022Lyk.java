package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$sendTabClickEventWhenPageShow$1", f = "ShopMainViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Lyk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56022Lyk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ShopMainViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56022Lyk(ShopMainViewModel shopMainViewModel, InterfaceC67352kd<? super C56022Lyk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = shopMainViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56022Lyk(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        this.LJLIL.getClass();
        if (ShopMainViewModel.kv0() != null) {
            z = true;
        } else {
            z = false;
        }
        String str = this.LJLIL.lv0().LJZ;
        c56045Lz7.getClass();
        C76542zS.LIZJ("rd_tiktokec_mall_entrance_click", new C56025Lyn(z, str));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
