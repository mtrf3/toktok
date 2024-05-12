package X;

import Y.ACallableS112S0100000_9;
import Y.AfS56S0100000_4;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentVoucherClaimViewModel;

/* renamed from: X.A2u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25596A2u implements InterfaceC78660Uu0 {
    public final /* synthetic */ PaidContentVoucherClaimViewModel LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    public C25596A2u(PaidContentVoucherClaimViewModel paidContentVoucherClaimViewModel) {
        this.LJLIL = paidContentVoucherClaimViewModel;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        PaidContentVoucherClaimViewModel paidContentVoucherClaimViewModel = this.LJLIL;
        paidContentVoucherClaimViewModel.getClass();
        paidContentVoucherClaimViewModel.disposeOnClear(AbstractC73672Svk.LJJIIJZLJL(new ACallableS112S0100000_9(bitmap, 13)).LJJL(T16.LIZIZ).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(paidContentVoucherClaimViewModel, 72), new InterfaceC64592gB() { // from class: X.9FL
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
    }
}
