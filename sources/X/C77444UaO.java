package X;

import Y.ARunnableS16S0400000_13;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletException;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletException;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenExchangeCoinsDialog;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxEnableSetting;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.UaO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77444UaO implements InterfaceC77500UbI {
    public final /* synthetic */ ExchangeParams LIZ;
    public final /* synthetic */ Long LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ LiveOpenExchangeCoinsDialog LIZLLL;

    @Override // X.InterfaceC77500UbI
    public final void LIZ(String str) {
        boolean z;
        boolean z2;
        WalletCenter walletCenter = (WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
        ExchangeDisplayInfo exchangeDisplayInfo = walletCenter.LJLJI;
        boolean z3 = false;
        if (!((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI.LIZ() && LiveExchangeTaxEnableSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool = Boolean.TRUE;
        ExchangeParams exchangeParams = this.LIZ;
        int i = (int) exchangeParams.coinsCount;
        if (exchangeParams.isFromInsufficient > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C77446UaQ c77446UaQ = new C77446UaQ(bool, i, bool, Boolean.valueOf(z2));
        Boolean valueOf2 = Boolean.valueOf(((IGiftService) CN1.LIZ(IGiftService.class)).shouldShowPostRechargeRetentionSheet(c77446UaQ, this.LIZ.gift_id, (int) (walletCenter.LIZ() + this.LIZ.coinsCount)));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("giftRetentionPopup");
        LIZ.append(valueOf2);
        LIZ.append(" giftId:");
        LIZ.append(this.LIZ.gift_id);
        C0NB.LIZIZ("increaseExposure", X1D.LIZIZ(LIZ));
        if (valueOf.booleanValue() && !valueOf2.booleanValue()) {
            z3 = true;
        }
        Boolean valueOf3 = Boolean.valueOf(z3);
        if (this.LIZ.source == 0 && !valueOf3.booleanValue()) {
            C30868C9o.LIZJ(R.string.l43);
        }
        int i2 = this.LIZ.source;
        if (i2 == 10 || i2 == 15) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_withdraw_exchange_success");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(this.LIZ.exchangeLevel, "exchange_level");
            LIZ2.LJIJJ(this.LIZLLL.chargeReason(this.LIZ), "charge_reason");
            LIZ2.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
            LIZ2.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
            LIZ2.LJJIFFI(this.LIZ.eventParams);
            LIZ2.LJJIIJZLJL();
        } else {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_recharge_exchange_success");
            LIZ3.LJIIZILJ();
            LIZ3.LJIJJ(Integer.valueOf(this.LIZ.isFirstRecharge ? 1 : 0), "is_first_recharge");
            LIZ3.LJIJJ(this.LIZ.exchangeLevel, "exchange_level");
            LIZ3.LJIJJ(this.LIZLLL.requestPage(this.LIZ), "request_page");
            LIZ3.LJIJJ(this.LIZLLL.chargeReason(this.LIZ), "charge_reason");
            LIZ3.LJIJJ(Long.valueOf(this.LIZ.coinsCount), "exchange_coins");
            LIZ3.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
            LIZ3.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
            LIZ3.LJJIFFI(this.LIZ.eventParams);
            if (this.LIZ.source == 0) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                if (dataChannelGlobal.mv0(BroadcastPageChannel.class) != null) {
                    LIZ3.LJIJJ(Integer.valueOf(!((EnumC29309Ber) dataChannelGlobal.mv0(BroadcastPageChannel.class)).isAudience() ? 1 : 0), "is_anchor");
                }
            }
            LIZ3.LJJIIJZLJL();
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_recharge_exchange_result_return");
        LIZ4.LJIIZILJ();
        LIZ4.LJIJJ("success", "status");
        LIZ4.LJIJJ("", "error_code");
        LIZ4.LJIJJ(Long.valueOf(C30725C4b.LIZ() - this.LIZIZ.longValue()), "loading_duration");
        LIZ4.LJIJJ(this.LIZLLL.exchangeEntrance, "exchange_entrance");
        LIZ4.LJIJJ(this.LIZLLL.chargeReason(this.LIZ), "charge_reason");
        LIZ4.LJJIIJZLJL();
        C73943T0h.LIZ().LIZIZ(new C77445UaP());
        C73943T0h.LIZ().LIZIZ(c77446UaQ);
        this.LIZLLL.finishResultWithOrderId(1, str, valueOf3);
    }

    @Override // X.InterfaceC77500UbI
    public final void LIZIZ(Throwable th) {
        int i;
        CustomErrorExtra customErrorExtra;
        ARunnableS16S0400000_13 aRunnableS16S0400000_13;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l44);
        boolean z = th instanceof C29401Dk;
        if (z) {
            C29401Dk c29401Dk = (C29401Dk) th;
            i = c29401Dk.getErrorCode();
            LJIILJJIL = c29401Dk.getPrompt();
        } else if (th instanceof C0TL) {
            i = ((C0TL) th).statusCode;
        } else if (th instanceof C64799Pbv) {
            i = ((C64799Pbv) th).getStatusCode();
        } else {
            i = -1;
        }
        if (this.LIZJ != null) {
            IDRunnableS6S0101000 iDRunnableS6S0101000 = null;
            if (z) {
                customErrorExtra = CustomErrorExtra.getCustomErrorExtra((Exception) th);
            } else {
                customErrorExtra = null;
            }
            IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
            if (((WalletException) iWalletService.walletException()).LIZLLL(customErrorExtra, i).booleanValue()) {
                aRunnableS16S0400000_13 = new ARunnableS16S0400000_13(this, this.LIZ, customErrorExtra, this.LIZJ, 0);
                iDRunnableS6S0101000 = new IDRunnableS6S0101000(2, this, 34);
            } else {
                aRunnableS16S0400000_13 = null;
            }
            IWalletException walletException = iWalletService.walletException();
            Context context = this.LIZJ;
            ExchangeParams exchangeParams = this.LIZ;
            if (!((WalletException) walletException).LIZ(context, th, aRunnableS16S0400000_13, iDRunnableS6S0101000, exchangeParams.source, exchangeParams.way, false, null).LJLIL) {
                C30868C9o.LJI(LJIILJJIL);
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_exchange_failed");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Integer.valueOf(i), "error_code");
        LIZ.LJIJJ(this.LIZLLL.requestPage(this.LIZ), "request_page");
        LIZ.LJJIFFI(this.LIZ.eventParams);
        LIZ.LJJIIJZLJL();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_exchange_result_return");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ("failed", "status");
        LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
        LIZ2.LJIJJ(Long.valueOf(C30725C4b.LIZ() - this.LIZIZ.longValue()), "loading_duration");
        LIZ2.LJIJJ(this.LIZLLL.exchangeEntrance, "exchange_entrance");
        LIZ2.LJIJJ(this.LIZLLL.chargeReason(this.LIZ), "charge_reason");
        LIZ2.LJJIIJZLJL();
    }

    public C77444UaO(LiveOpenExchangeCoinsDialog liveOpenExchangeCoinsDialog, ExchangeParams exchangeParams, Long l, Context context) {
        this.LIZLLL = liveOpenExchangeCoinsDialog;
        this.LIZ = exchangeParams;
        this.LIZIZ = l;
        this.LIZJ = context;
    }
}
