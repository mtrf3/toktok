package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;

/* loaded from: classes13.dex */
public final class SAF extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final SAF LJLIL = new SAF();

    public SAF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ActivityC45651qj topWebContainerActivity = PaymentResultProcess.INSTANCE.getTopWebContainerActivity();
        if (topWebContainerActivity != null) {
            topWebContainerActivity.finish();
        }
        return C76800UCe.LIZ;
    }
}
