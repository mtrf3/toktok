package X;

import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import com.ss.android.ugc.aweme.service.PaidContentPaymentServiceImpl;

/* loaded from: classes5.dex */
public final class A6H implements InterfaceC77771Uff {
    public final /* synthetic */ PaidContentPaymentServiceImpl LJLIL;

    @Override // X.InterfaceC77771Uff
    public final void LLLLLILLIL() {
        this.LJLIL.LIZLLL.onNext(A6R.LIZ);
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLJLJLL() {
        this.LJLIL.LIZLLL.onNext(A6Q.LIZ);
    }

    public A6H(PaidContentPaymentServiceImpl paidContentPaymentServiceImpl) {
        this.LJLIL = paidContentPaymentServiceImpl;
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLJIL(IapProductBuyResult iapProductBuyResult) {
        this.LJLIL.LIZ.onNext(iapProductBuyResult);
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLL(IapProductBuyResult iapProductBuyResult) {
        this.LJLIL.LIZ.onNext(iapProductBuyResult);
    }
}
