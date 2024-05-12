package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.WalletStruct;

/* renamed from: X.Clj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32283Clj<T> implements InterfaceC64592gB {
    public static final C32283Clj<T> LJLIL = new C32283Clj<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long j;
        C32282Cli.LIZIZ = (Long) obj;
        WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
        if (walletStruct.revenue.getEnableExchange()) {
            j = Long.valueOf(walletStruct.revenue.getBalance());
        } else {
            j = 0L;
        }
        C32282Cli.LIZJ = j;
        C32282Cli.LIZ(C32282Cli.LIZLLL, C32282Cli.LIZIZ, C32282Cli.LIZ, C32282Cli.LIZJ);
    }
}
