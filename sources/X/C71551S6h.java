package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel$setLastTabIndex$1", f = "BillboardGlobalViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.S6h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71551S6h extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BillboardGlobalViewModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71551S6h(BillboardGlobalViewModel billboardGlobalViewModel, int i, InterfaceC67352kd<? super C71551S6h> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = billboardGlobalViewModel;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71551S6h(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C71554S6k c71554S6k = this.LJLIL.LJLIL.LIZ;
        int i = this.LJLILLLLZI;
        c71554S6k.getClass();
        C71569S6z.LIZ().storeInt("key_last_tab_index", i);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
