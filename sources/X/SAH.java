package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayErrorToast;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.PipoService;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class SAH extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ SA3 LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAH(ActivityC45651qj activityC45651qj, String str, String str2, String str3, String str4, String str5, String str6, SA3 sa3) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = str6;
        this.LJLJLJ = sa3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            IPipoService LJ = PipoService.LJ();
            ActivityC45651qj activityC45651qj = this.LJLIL;
            if (activityC45651qj != null) {
                LJ.LIZ(activityC45651qj, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, PaymentResultProcess.INSTANCE.sourceToPageName(this.LJLJJL), this.LJLJJLL, this.LJLJL, APL.HALF_PAGE, C85990Xow.LIZ(), new AqS178S0100000_12(this.LJLJLJ, 122));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            NewPayInfo newPayInfo = new NewPayInfo(null, PayResult.ERROR, new PayErrorToast(null, "", null), null, null);
            PaymentResultProcess paymentResultProcess = PaymentResultProcess.INSTANCE;
            SA3 sa3 = this.LJLJLJ;
            sa3.LIZLLL = newPayInfo;
            paymentResultProcess.payResultProcess(sa3);
        }
        return C76800UCe.LIZ;
    }
}
