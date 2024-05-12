package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel", f = "OrderSubmitViewModel.kt", l = {1552}, m = "updateBillInfoData")
/* renamed from: X.AyK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27968AyK extends C3CS {
    public OrderSubmitViewModel LJLIL;
    public BillInfoRequest LJLILLLLZI;
    public BillInfoData LJLJI;
    public C27941Axt LJLJJI;
    public PaymentMethod LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public /* synthetic */ Object LJLJLLL;
    public final /* synthetic */ OrderSubmitViewModel LJLL;
    public int LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27968AyK(OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C27968AyK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLL = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLLL = obj;
        this.LJLLI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLL.Ww0(null, null, false, false, this);
    }
}
