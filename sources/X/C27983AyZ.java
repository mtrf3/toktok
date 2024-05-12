package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel", f = "OrderSubmitViewModel.kt", l = {2132, 2142}, m = "processGPSelect")
/* renamed from: X.AyZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27983AyZ extends C3CS {
    public OrderSubmitViewModel LJLIL;
    public PaymentMethod LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ OrderSubmitViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27983AyZ(OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C27983AyZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.Kw0(false, this);
    }
}
