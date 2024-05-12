package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel$onPrepareRepayment$1$2$2$2", f = "ReapymentRetViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLt, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93129aLt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<BillRepaymentPrepareInfo, String, C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93129aLt(InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C93129aLt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93129aLt(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke(null, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
