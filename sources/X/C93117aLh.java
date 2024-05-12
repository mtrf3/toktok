package X;

import android.content.Intent;
import com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel$presentCheckout$1$4", f = "RepaymentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLh, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93117aLh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RepaymentViewModel LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93117aLh(RepaymentViewModel repaymentViewModel, long j, InterfaceC67352kd<? super C93117aLh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = repaymentViewModel;
        this.LJLILLLLZI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93117aLh(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        RepaymentViewModel repaymentViewModel = this.LJLIL;
        final C91832a0y c91832a0y = repaymentViewModel.LJLJJI;
        if (c91832a0y != null) {
            C92324a8u c92324a8u = repaymentViewModel.LJLJL;
            if (c92324a8u != null) {
                String LIZJ = C91894a1y.LIZJ();
                C93180aMi c93180aMi = new C93180aMi(repaymentViewModel);
                C92842aHG c92842aHG = new C92842aHG(repaymentViewModel);
                Boolean bool = Boolean.TRUE;
                C92106a5O c92106a5O = new C92106a5O(LIZJ, c93180aMi, c92842aHG, bool, bool, bool);
                C92105a5N.LIZ = c92324a8u;
                C92105a5N.LIZIZ = c92106a5O;
                C92046a4Q.LIZJ = c92324a8u.LJLILLLLZI;
                C92046a4Q.LIZIZ = c92324a8u.LJLIL;
                final C29S c29s = c91832a0y.LIZJ;
                if (c29s != null) {
                    c29s.runOnUiThread(new Runnable() { // from class: X.a0w
                        @Override // java.lang.Runnable
                        public final void run() {
                            C91832a0y this$0 = C91832a0y.this;
                            ActivityC45651qj it = c29s;
                            o.LJIIIZ(this$0, "this$0");
                            o.LJIIIZ(it, "$it");
                            if (this$0.LIZLLL == null) {
                                try {
                                    C92053a4X c92053a4X = new C92053a4X(it);
                                    this$0.LIZLLL = c92053a4X;
                                    c92053a4X.LIZ(C91970a3C.LIZ);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    });
                }
                C29S c29s2 = c91832a0y.LIZJ;
                if (c29s2 == null) {
                    c29s2 = null;
                }
                Intent intent = new Intent(c29s2, (Class<?>) CheckoutActivity.class);
                C29S c29s3 = c91832a0y.LIZJ;
                if (c29s3 != null) {
                    C16880lQ.LJI(c29s3, intent, c91832a0y.LIZIZ);
                }
            } else {
                o.LJIJI("orderInfo");
                throw null;
            }
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "rd_pipo_bnpl_repayment_checkout_open", "bnpl_start_repayment", this.LJLIL.LJLLILLLL, C113554cx.LJJL(new OSZ("error_code", CardStruct.IStatusCode.DEFAULT), new OSZ("biz_type", "BNPL"), new OSZ("duration", String.valueOf(System.currentTimeMillis() - this.LJLILLLLZI))), 8);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
