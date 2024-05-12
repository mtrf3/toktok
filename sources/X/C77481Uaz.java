package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeDialogNew;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Uaz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77481Uaz {
    public static final /* synthetic */ int LIZ = 0;

    public static SharedPreferences LIZJ() {
        SharedPreferences LIZIZ = F9J.LIZIZ(C15380j0.LIZLLL(), 0, "js_kv_methods_20191113");
        o.LJIIIIZZ(LIZIZ, "getContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        return LIZIZ;
    }

    public static final void LIZ(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
        BalanceStruct balanceStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL;
        BalanceStructExtra balanceStructExtra = walletStruct.LIZ;
        BalanceStructExtra exchangeInfo = balanceStruct.getExchangeInfo();
        UserBalance userBalance = balanceStruct.getUserBalance();
        RevenueExchange revenueExchange = walletStruct.revenue;
        if (revenueExchange != null && revenueExchange.getEnableExchange() && balanceStructExtra != null) {
            if (revenueExchange.getBalance() > 0) {
                bundle.putInt("key_bundle_show_balance", -2);
                if (balanceStructExtra.getCoins() > 0) {
                    bundle.putInt("key_bundle_can_exchange", 2);
                    return;
                } else {
                    bundle.putInt("key_bundle_can_exchange", 1);
                    return;
                }
            }
            if (balanceStruct.getValidUser() && exchangeInfo != null && userBalance != null && userBalance.getBalance() > 0) {
                bundle.putInt("key_bundle_show_balance", -1);
                if (exchangeInfo.getCoins() > 0) {
                    bundle.putInt("key_bundle_can_exchange", 2);
                    return;
                } else {
                    if (userBalance.getBalance() <= 0) {
                        return;
                    }
                    bundle.putInt("key_bundle_can_exchange", 1);
                    return;
                }
            }
            bundle.putInt("key_bundle_show_balance", -2);
            if (balanceStructExtra.getCoins() > 0) {
                bundle.putInt("key_bundle_can_exchange", 2);
                return;
            } else {
                if (revenueExchange.getBalance() <= 0) {
                    return;
                }
                bundle.putInt("key_bundle_can_exchange", 1);
                return;
            }
        }
        if (!balanceStruct.getValidUser() || exchangeInfo == null || userBalance == null) {
            return;
        }
        bundle.putInt("key_bundle_show_balance", -1);
        if (exchangeInfo.getCoins() > 0) {
            bundle.putInt("key_bundle_can_exchange", 2);
        } else {
            if (userBalance.getBalance() <= 0) {
                return;
            }
            bundle.putInt("key_bundle_can_exchange", 1);
        }
    }

    public static final boolean LIZLLL(Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam) {
        if (LiveExchangeDialogNew.INSTANCE.getValue()) {
            UHX LIZ2 = C77482Ub0.LIZ(EnumC77490Ub8.LIVE_INCOME, context, c77453UaX, interfaceC77468Uam, WalletExchange.LJLIL.LJII(11));
            if (LIZ2 == null) {
                return false;
            }
            return LIZ2.LJI();
        }
        Boolean LIZ3 = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.LIZ();
        o.LJIIIIZZ(LIZ3, "walletStruct.getLiveAutoExchangeEnable()");
        if (LIZ3.booleanValue()) {
            UHX LIZ4 = C77482Ub0.LIZ(EnumC77490Ub8.LIVE_INCOME, context, c77453UaX, interfaceC77468Uam, WalletExchange.LJLIL.LJII(11));
            if (LIZ4 == null) {
                return false;
            }
            return LIZ4.LJI();
        }
        return true;
    }

    public static final boolean LJ(Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam) {
        if (LiveExchangeDialogNew.INSTANCE.getValue()) {
            UHX LIZ2 = C77482Ub0.LIZ(EnumC77490Ub8.UG_INCOME, context, c77453UaX, interfaceC77468Uam, WalletExchange.LJLIL.LJII(11));
            if (LIZ2 != null) {
                return LIZ2.LJI();
            }
            return false;
        }
        return true;
    }

    public static void LIZIZ(long j, Context context, InterfaceC77468Uam interfaceC77468Uam, ExchangeParams exchangeParam, DataChannel dataChannel, String giftSource, InterfaceC65784Pro onSuccessLogging, InterfaceC88472Yns onFailureLogging) {
        o.LJIIIZ(exchangeParam, "exchangeParam");
        o.LJIIIZ(giftSource, "giftSource");
        o.LJIIIZ(onSuccessLogging, "onSuccessLogging");
        o.LJIIIZ(onFailureLogging, "onFailureLogging");
        WalletExchange.LJLIL.LJI(exchangeParam, new C77485Ub3(j, context, interfaceC77468Uam, exchangeParam, dataChannel, giftSource, onSuccessLogging, onFailureLogging));
    }
}
