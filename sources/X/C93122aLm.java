package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel;
import fjb.a;
import kotlin.jvm.internal.IDqS463S0100000_31;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel$load$1", f = "ReapymentRetViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLm, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93122aLm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RepaymentViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93122aLm(RepaymentViewModel repaymentViewModel, InterfaceC67352kd<? super C93122aLm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = repaymentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93122aLm(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        RepaymentViewModel repaymentViewModel = this.LJLIL;
        IDqS463S0100000_31 iDqS463S0100000_31 = new IDqS463S0100000_31(repaymentViewModel, 0);
        repaymentViewModel.getClass();
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = 1;
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(repaymentViewModel), null, null, new C93126aLq(repaymentViewModel, c76732zl, c72242sW, iDqS463S0100000_31, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
