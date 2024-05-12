package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailViewModel$onClickPrepareRepayment$1$2$1$3", f = "DetailViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aL0, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93074aL0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<BillRepaymentPrepareInfo, String, C76800UCe> LJLIL;
    public final /* synthetic */ C64797Pbt<BaseResponse<BillRepaymentPrepareInfo>> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93074aL0(InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe> interfaceC88471Ynr, C64797Pbt<BaseResponse<BillRepaymentPrepareInfo>> c64797Pbt, InterfaceC67352kd<? super C93074aL0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = c64797Pbt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93074aL0(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88471Ynr<BillRepaymentPrepareInfo, String, C76800UCe> interfaceC88471Ynr = this.LJLIL;
        BaseResponse<BillRepaymentPrepareInfo> baseResponse = this.LJLILLLLZI.LIZIZ;
        interfaceC88471Ynr.invoke(baseResponse.data, baseResponse.errorMsg);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
