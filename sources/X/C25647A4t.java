package X;

import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;

/* renamed from: X.A4t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25647A4t implements InterfaceC77771Uff {
    public final /* synthetic */ PaidContentDetailPaymentViewModel LJLIL;

    @Override // X.InterfaceC77771Uff
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLJLJLL() {
        this.LJLIL.setState(C25646A4s.LJLIL);
    }

    public C25647A4t(PaidContentDetailPaymentViewModel paidContentDetailPaymentViewModel) {
        this.LJLIL = paidContentDetailPaymentViewModel;
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLJIL(IapProductBuyResult iapProductBuyResult) {
        this.LJLIL.setState(new AqS170S0100000_4(iapProductBuyResult, 514));
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLL(IapProductBuyResult iapProductBuyResult) {
        this.LJLIL.setState(new AqS170S0100000_4(iapProductBuyResult, 515));
    }
}
