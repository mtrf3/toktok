package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel", f = "RepaymentViewModel.kt", l = {399}, m = "initPayment")
/* renamed from: X.aCa, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92552aCa extends C3CS {
    public Object LJLIL;
    public C29S LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ RepaymentViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92552aCa(RepaymentViewModel repaymentViewModel, InterfaceC67352kd<? super C92552aCa> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = repaymentViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.hv0(null, this);
    }
}
