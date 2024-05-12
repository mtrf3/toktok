package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel$presentCheckout$1$5", f = "RepaymentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLi, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93118aLi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C29S LJLIL;
    public final /* synthetic */ RepaymentViewModel LJLILLLLZI;
    public final /* synthetic */ Throwable LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93118aLi(C29S c29s, RepaymentViewModel repaymentViewModel, Throwable th, long j, InterfaceC67352kd<? super C93118aLi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c29s;
        this.LJLILLLLZI = repaymentViewModel;
        this.LJLJI = th;
        this.LJLJJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93118aLi(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIIZZ(R.string.gqr);
        c26045AKb.LJIIJ();
        C91924a2S c91924a2S = C91924a2S.LIZ;
        String str = this.LJLILLLLZI.LJLLILLLL;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("error_code", "1");
        String message = this.LJLJI.getMessage();
        if (message == null) {
            message = "exception error";
        }
        oszArr[1] = new OSZ("error_message", message);
        oszArr[2] = new OSZ("biz_type", "BNPL");
        oszArr[3] = new OSZ("duration", String.valueOf(System.currentTimeMillis() - this.LJLJJI));
        C91924a2S.LIZ(c91924a2S, "rd_pipo_bnpl_repayment_checkout_open", "bnpl_start_repayment", str, C113554cx.LJJL(oszArr), 8);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
