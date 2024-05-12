package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$handleCreateOrderResult$5$1$1", f = "OrderSubmitViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Azg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28052Azg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OrderSubmitViewModel LJLIL;
    public final /* synthetic */ CreateOrderData LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28052Azg(OrderSubmitViewModel orderSubmitViewModel, CreateOrderData createOrderData, InterfaceC67352kd<? super C28052Azg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = orderSubmitViewModel;
        this.LJLILLLLZI = createOrderData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28052Azg(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.setState(new AqS170S0100000_4(this.LJLILLLLZI, 296));
        C28121B1x.LIZ.getClass();
        if (C28121B1x.LIZ()) {
            this.LJLIL.setState(C28054Azi.LJLIL);
        } else {
            this.LJLIL.setState(C28055Azj.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
