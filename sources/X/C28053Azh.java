package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$handleCreateOrderResult$5$1$2", f = "OrderSubmitViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Azh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28053Azh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OrderSubmitViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28053Azh(OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C28053Azh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28053Azh(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.setState(C28056Azk.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
