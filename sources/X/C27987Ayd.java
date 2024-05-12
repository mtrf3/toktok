package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel", f = "OrderSubmitViewModel.kt", l = {4860}, m = "queryBillInfoSuspendForPaymentPage")
/* renamed from: X.Ayd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27987Ayd extends C3CS {
    public OrderSubmitViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ OrderSubmitViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27987Ayd(OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C27987Ayd> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.Mw0(this);
    }
}
