package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.PipoService;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SAI extends AbstractC65781Prl implements InterfaceC88474Ynu<String, String, String, String, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ SA3 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAI(ActivityC45651qj activityC45651qj, String str, String str2, SA3 sa3) {
        super(4);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = sa3;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(String str, String str2, String str3, String str4) {
        String token = str;
        String host = str2;
        String merchantId = str3;
        String merchantUserId = str4;
        o.LJIIIZ(token, "token");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(merchantId, "merchantId");
        o.LJIIIZ(merchantUserId, "merchantUserId");
        if (PipoService.LJ().LIZJ()) {
            IPipoService LJ = PipoService.LJ();
            ActivityC45651qj activityC45651qj = this.LJLIL;
            if (activityC45651qj != null) {
                LJ.LIZ(activityC45651qj, this.LJLILLLLZI, token, host, PaymentResultProcess.INSTANCE.sourceToPageName(this.LJLJI), merchantId, merchantUserId, APL.HALF_PAGE, C85990Xow.LIZ(), new AqS178S0100000_12(this.LJLJJI, 121));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            PipoService.LJ().LIZIZ(new SAH(this.LJLIL, this.LJLILLLLZI, token, host, this.LJLJI, merchantId, merchantUserId, this.LJLJJI));
        }
        return C76800UCe.LIZ;
    }
}
