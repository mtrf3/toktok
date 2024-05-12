package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;

/* renamed from: X.QlV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC67941QlV extends BinderC67946Qla {
    public final C67649Qgn LJLIL;

    public BinderC67941QlV(C67649Qgn c67649Qgn) {
        this.LJLIL = c67649Qgn;
    }

    @Override // X.BinderC67946Qla, X.InterfaceC68717Qy1
    public final void LLIILZL(Status status, PaymentData paymentData) {
        C67649Qgn c67649Qgn = this.LJLIL;
        if (status.LJJJJL()) {
            c67649Qgn.LIZIZ(paymentData);
        } else {
            c67649Qgn.LIZ(C1GE.LIZJ(status));
        }
    }
}
