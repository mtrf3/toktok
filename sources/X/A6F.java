package X;

import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class A6F implements InterfaceC77772Ufg {
    public final /* synthetic */ PaidContentDetailPaymentViewModel LJLIL;

    @Override // X.InterfaceC77772Ufg
    public final void LJIJ() {
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJII() {
        this.LJLIL.setState(A6D.LJLIL);
    }

    public A6F(PaidContentDetailPaymentViewModel paidContentDetailPaymentViewModel) {
        this.LJLIL = paidContentDetailPaymentViewModel;
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIIJ(IapProductGetResult iapProductGetResult) {
        this.LJLIL.setState(A6E.LJLIL);
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIILIIL(IapProductGetResult iapProductGetResult) {
        this.LJLIL.setState(new AqS170S0100000_4(iapProductGetResult, 513));
    }
}
