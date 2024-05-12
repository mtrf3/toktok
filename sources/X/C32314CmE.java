package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;

/* renamed from: X.CmE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32314CmE {
    public static long LIZIZ() {
        IWalletCenter walletCenter;
        IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService != null && (walletCenter = iWalletService.walletCenter()) != null) {
            return ((WalletCenter) walletCenter).LIZ();
        }
        return 0L;
    }

    public static long LIZJ() {
        IWalletCenter walletCenter;
        WalletStruct walletStruct;
        RevenueExchange revenueExchange;
        IWalletService iWalletService;
        IWalletCenter walletCenter2;
        WalletStruct walletStruct2;
        BalanceStructExtra balanceStructExtra;
        IWalletService iWalletService2 = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService2 != null && (walletCenter = iWalletService2.walletCenter()) != null && (walletStruct = ((WalletCenter) walletCenter).LJLIL) != null && (revenueExchange = walletStruct.revenue) != null && revenueExchange.getEnableExchange() && (iWalletService = (IWalletService) CN1.LIZ(IWalletService.class)) != null && (walletCenter2 = iWalletService.walletCenter()) != null && (walletStruct2 = ((WalletCenter) walletCenter2).LJLIL) != null && (balanceStructExtra = walletStruct2.LIZ) != null) {
            return balanceStructExtra.getCoins();
        }
        return 0L;
    }

    public static long LIZLLL() {
        IWalletCenter walletCenter;
        BalanceStruct balanceStruct;
        IWalletService iWalletService;
        IWalletCenter walletCenter2;
        BalanceStruct balanceStruct2;
        BalanceStructExtra exchangeInfo;
        IWalletService iWalletService2 = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService2 != null && (walletCenter = iWalletService2.walletCenter()) != null && (balanceStruct = ((WalletCenter) walletCenter).LJLJJL) != null && balanceStruct.getValidUser() && (iWalletService = (IWalletService) CN1.LIZ(IWalletService.class)) != null && (walletCenter2 = iWalletService.walletCenter()) != null && (balanceStruct2 = ((WalletCenter) walletCenter2).LJLJJL) != null && (exchangeInfo = balanceStruct2.getExchangeInfo()) != null) {
            return exchangeInfo.getCoins();
        }
        return 0L;
    }

    public static boolean LIZ() {
        if (LIZJ() > 0 || LIZLLL() > 0) {
            return true;
        }
        return false;
    }
}
