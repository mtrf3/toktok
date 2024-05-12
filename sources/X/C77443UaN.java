package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenExchangeCoinsDialog;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.UaN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77443UaN implements InterfaceC77442UaM {
    public boolean LIZ = true;
    public final /* synthetic */ ExchangeParams LIZIZ;
    public final /* synthetic */ C38131Exr LIZJ;
    public final /* synthetic */ LiveOpenExchangeCoinsDialog LIZLLL;

    public final void LIZ() {
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_click_exchange_second_confrim");
        LIZ.LJIJJ(this.LIZLLL.exchangeEntrance, "exchange_entrance");
        LIZ.LJIJJ(this.LIZLLL.chargeReason(this.LIZIZ), "charge_reason");
        LIZ.LJJIIJZLJL();
        ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
        int i = this.LIZIZ.source;
        if (i == 10 || i == 15) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_withdraw_exchange_confirm");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(this.LIZIZ.exchangeLevel, "exchange_level");
            LIZ2.LJIJJ(this.LIZLLL.chargeReason(this.LIZIZ), "charge_reason");
            LIZ2.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
            LIZ2.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
            LIZ2.LJJIFFI(this.LIZIZ.eventParams);
            LIZ2.LJJIIJZLJL();
        } else {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_recharge_exchange_confirm");
            LIZ3.LJIIZILJ();
            LIZ3.LJIJJ(this.LIZIZ.exchangeLevel, "exchange_level");
            LIZ3.LJIJJ(this.LIZLLL.requestPage(this.LIZIZ), "request_page");
            LIZ3.LJIJJ(this.LIZLLL.chargeReason(this.LIZIZ), "charge_reason");
            LIZ3.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
            LIZ3.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
            LIZ3.LJJIFFI(this.LIZIZ.eventParams);
            if (this.LIZIZ.source == 0) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                if (dataChannelGlobal.mv0(BroadcastPageChannel.class) != null) {
                    LIZ3.LJIJJ(Integer.valueOf(!((EnumC29309Ber) dataChannelGlobal.mv0(BroadcastPageChannel.class)).isAudience() ? 1 : 0), "is_anchor");
                }
            }
            LIZ3.LJJIIJZLJL();
        }
        if (!this.LIZ) {
            InterfaceC30442Bx8.LLLIIII.LIZ(Boolean.FALSE);
        }
        this.LIZLLL.goExchangeToCoins(this.LIZJ.LIZ, this.LIZIZ);
    }

    public C77443UaN(LiveOpenExchangeCoinsDialog liveOpenExchangeCoinsDialog, ExchangeParams exchangeParams, C38131Exr c38131Exr) {
        this.LIZLLL = liveOpenExchangeCoinsDialog;
        this.LIZIZ = exchangeParams;
        this.LIZJ = c38131Exr;
    }
}
