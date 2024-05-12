package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.data.api.IExchangeApi;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Uau, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77476Uau {
    public static final /* synthetic */ int LIZ = 0;

    public static C73477Ssb LIZ() {
        return ((IExchangeApi) Q7L.LIZIZ(IExchangeApi.class)).getDefaultLocation().LJIJI(C31073CHl.LJLJJL).LJIJJLI(C78588Usq.LJLIL);
    }

    public static void LIZJ(TaxDialogParams taxDialogParams, String str) {
        String str2;
        String str3 = taxDialogParams.exchangeSource;
        int hashCode = str3.hashCode();
        if (hashCode != 48) {
            if (hashCode != 57) {
                if (hashCode != 1567) {
                    if (hashCode != 1568 || !str3.equals("11")) {
                        return;
                    }
                    UFE.LIZIZ(taxDialogParams.isAutoExchange, C0N3.LIZIZ("livesdk_balance_exchange_tax_pop_up", str, "action_type"), "is_auto");
                    return;
                }
                if (!str3.equals("10")) {
                    return;
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_withdraw_exchange_tax_pop_up");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(str, "action_type");
                LIZ2.LJJIIJZLJL();
                return;
            }
            if (!str3.equals("9")) {
                return;
            }
        } else if (!str3.equals(CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        String str4 = taxDialogParams.exchangeSource;
        if (o.LJ(str4, "9")) {
            str2 = "my_profile";
        } else {
            o.LJ(str4, CardStruct.IStatusCode.DEFAULT);
            str2 = "live_detail";
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_recharge_exchange_tax_pop_up");
        LIZ3.LJIIZILJ();
        LIZ3.LJIJJ(str, "action_type");
        LIZ3.LJIJJ(str2, "request_page");
        LIZ3.LJJIIJZLJL();
    }

    public static C73641SvF LIZIZ(int i, boolean z, boolean z2) {
        long j;
        String str;
        int i2;
        BasePackage basePackage;
        BasePackage basePackage2;
        BasePackage basePackage3;
        WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
        RevenueExchange revenueExchange = walletStruct.revenue;
        long LIZ2 = i - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        BalanceStructExtra balanceStructExtra = walletStruct.LIZ;
        long j2 = 0;
        if (balanceStructExtra != null && (basePackage3 = balanceStructExtra.getBasePackage()) != null) {
            j = basePackage3.getId();
        } else {
            j = 0;
        }
        int i3 = (int) j;
        if (revenueExchange == null || (str = revenueExchange.getCurrency()) == null) {
            str = "";
        }
        BalanceStructExtra balanceStructExtra2 = walletStruct.LIZ;
        if (balanceStructExtra2 != null && (basePackage2 = balanceStructExtra2.getBasePackage()) != null) {
            j2 = basePackage2.getPrice();
        }
        long j3 = j2 * LIZ2;
        BalanceStructExtra balanceStructExtra3 = walletStruct.LIZ;
        if (balanceStructExtra3 != null && (basePackage = balanceStructExtra3.getBasePackage()) != null) {
            i2 = basePackage.getRealDot();
        } else {
            i2 = 0;
        }
        long j4 = i2;
        IExchangeApi iExchangeApi = (IExchangeApi) Q7L.LIZIZ(IExchangeApi.class);
        InterfaceC77477Uav.LIZ.getClass();
        return iExchangeApi.getExchangeThresholdInfo(0, i3, 1, str, 0, LIZ2, j3, j4, z, z2).LJIJI(C78915Uy7.LJLIL).LJIIJ(UIP.LJLIL);
    }
}
