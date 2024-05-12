package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel$loopForResult$1$3", f = "ReapymentRetViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLp, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93125aLp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ InterfaceC88475Ynv<Integer, Long, EnumC91916a2K, EnumC91995a3b, RepaymentResultInfo, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C64797Pbt<BaseResponse<RepaymentResultInfo>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93125aLp(C72242sW c72242sW, InterfaceC88475Ynv<? super Integer, ? super Long, ? super EnumC91916a2K, ? super EnumC91995a3b, ? super RepaymentResultInfo, C76800UCe> interfaceC88475Ynv, C76732zl c76732zl, C64797Pbt<BaseResponse<RepaymentResultInfo>> c64797Pbt, InterfaceC67352kd<? super C93125aLp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = interfaceC88475Ynv;
        this.LJLJI = c76732zl;
        this.LJLJJI = c64797Pbt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93125aLp(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.invoke(new Integer(this.LJLJI.element), new Long(System.currentTimeMillis() - this.LJLIL.element), EnumC91916a2K.SUCCESS, EnumC91995a3b.PENDING, this.LJLJJI.LIZIZ.data);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
