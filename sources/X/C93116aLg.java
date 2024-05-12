package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel$presentCheckout$1$2", f = "RepaymentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLg, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93116aLg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RepaymentViewModel LJLIL;
    public final /* synthetic */ C29S LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93116aLg(RepaymentViewModel repaymentViewModel, C29S c29s, long j, InterfaceC67352kd<? super C93116aLg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = repaymentViewModel;
        this.LJLILLLLZI = c29s;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93116aLg(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        String str2 = this.LJLIL.getState().LJLLLLLL;
        C29S c29s = this.LJLILLLLZI;
        if (str2.length() == 0) {
            str = c29s.getString(R.string.gqr);
            o.LJIIIIZZ(str, "activity.getString(R.str…client_servererror_toast)");
        } else {
            str = str2;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
        C91924a2S.LIZ(C91924a2S.LIZ, "rd_pipo_bnpl_repayment_checkout_open", "bnpl_start_repayment", this.LJLIL.LJLLILLLL, C113554cx.LJJL(new OSZ("error_code", "1"), new OSZ("error_message", str2), new OSZ("biz_type", "BNPL"), new OSZ("duration", String.valueOf(System.currentTimeMillis() - this.LJLJI))), 8);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
