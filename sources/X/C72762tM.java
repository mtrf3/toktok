package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$renderCache$1$2", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2tM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72762tM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PdpViewModel LJLIL;
    public final /* synthetic */ OSZ<ProductPackStruct, String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72762tM(PdpViewModel pdpViewModel, OSZ<ProductPackStruct, String> osz, InterfaceC67352kd<? super C72762tM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpViewModel;
        this.LJLILLLLZI = osz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72762tM(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PdpViewModel.yx0(this.LJLIL, this.LJLILLLLZI.getFirst(), null, false, false, false, false, 124);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
