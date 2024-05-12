package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.Biv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29561Biv extends C29355Bfb<InterfaceC05190Ih> {
    @Override // X.C29355Bfb, X.InterfaceC116954iR
    public final void onNext(Object user) {
        o.LJIIIZ(user, "user");
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
    }
}
