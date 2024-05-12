package X;

import Y.ARunnableS11S1200000_12;
import android.os.Handler;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SA8 implements InterfaceC63764P0u {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ SA3 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ List<String> LJLJLJ;

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        C76542zS.LIZJ("rd_tiktokec_ecommerce_envoke_app", new SAA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        if (o.LJ(this.LJLJI, "ordersubmit")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invokeTime: appSwitch1 ");
            LIZ.append(System.currentTimeMillis());
            C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
            if (!this.LJLJJL || !C19N.LJ("ec_deeplink_order_detail_fix", false)) {
                PaymentResultProcess.payResultProcess$openOrderDetail(this.LJLJL, this.LJLJLJ, this.LJLILLLLZI);
                return;
            }
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS11S1200000_12(this.LJLJL, this.LJLJLJ, this.LJLILLLLZI, 0), 500L);
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ActivityStack.removeAppBackGroundListener(this);
        PaymentResultProcess.listener = null;
    }

    public SA8(SA3 sa3, String str, String str2, List list, long j, boolean z, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = sa3;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC65784Pro2;
        this.LJLJL = str2;
        this.LJLJLJ = list;
    }
}
