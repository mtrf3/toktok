package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel", f = "RepaymentViewModel.kt", l = {499}, m = "getNonce")
/* renamed from: X.aCZ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92551aCZ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ RepaymentViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92551aCZ(RepaymentViewModel repaymentViewModel, InterfaceC67352kd<? super C92551aCZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = repaymentViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(this);
    }
}
