package X;

import android.content.Context;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.viewmodel.exchange.AutoExchangeConfirmExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.GiftGuideExchangeDialogVM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Uan, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77469Uan implements InterfaceC77498UbG {
    public final /* synthetic */ GiftGuideExchangeDialogVM LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ long LIZJ;

    public C77469Uan(GiftGuideExchangeDialogVM giftGuideExchangeDialogVM, Context context, long j) {
        this.LIZ = giftGuideExchangeDialogVM;
        this.LIZIZ = context;
        this.LIZJ = j;
    }

    @Override // X.InterfaceC77498UbG
    public final void LIZ(boolean z, boolean z2, TaxDialogParams taxDialogParams, Throwable th) {
        String str;
        this.LIZ.hv0("tax_info_status_duration");
        if (z) {
            if (z2) {
                GiftGuideExchangeDialogVM giftGuideExchangeDialogVM = this.LIZ;
                if (giftGuideExchangeDialogVM.LJLILLLLZI && giftGuideExchangeDialogVM.tv0()) {
                    GiftGuideExchangeDialogVM giftGuideExchangeDialogVM2 = this.LIZ;
                    C77410UZq.LIZLLL(giftGuideExchangeDialogVM2.LJLJI, giftGuideExchangeDialogVM2.qv0(), true, false);
                    Context context = this.LIZIZ;
                    GiftGuideExchangeDialogVM giftGuideExchangeDialogVM3 = this.LIZ;
                    UIR uir = new UIR(context, giftGuideExchangeDialogVM3.LJLLI, giftGuideExchangeDialogVM3.LJLL, giftGuideExchangeDialogVM3.LJLLILLLL);
                    AutoExchangeConfirmExchangeDialogVM autoExchangeConfirmExchangeDialogVM = uir.LJIIIIZZ;
                    String str2 = this.LIZ.LJLJI;
                    autoExchangeConfirmExchangeDialogVM.getClass();
                    o.LJIIIZ(str2, "<set-?>");
                    autoExchangeConfirmExchangeDialogVM.LJLJI = str2;
                    AutoExchangeConfirmExchangeDialogVM autoExchangeConfirmExchangeDialogVM2 = uir.LJIIIIZZ;
                    autoExchangeConfirmExchangeDialogVM2.getClass();
                    C77453UaX c77453UaX = autoExchangeConfirmExchangeDialogVM2.LJLJJLL;
                    DataChannel dataChannel = c77453UaX.LIZ;
                    long j = c77453UaX.LIZJ;
                    OSZ<Integer, String> osz = autoExchangeConfirmExchangeDialogVM2.LJLLI.get(autoExchangeConfirmExchangeDialogVM2.LJLL);
                    if (osz == null || (str = osz.getSecond()) == null) {
                        str = "";
                    }
                    C77448UaS.LJ(dataChannel, j, "second_confirm_page", str, autoExchangeConfirmExchangeDialogVM2.LJLJJLL.LIZLLL, 2, 0, 1);
                    uir.LJI();
                    this.LIZ.hv0("loading_duration");
                    GiftGuideExchangeDialogVM giftGuideExchangeDialogVM4 = this.LIZ;
                    giftGuideExchangeDialogVM4.lv0(2, giftGuideExchangeDialogVM4.qv0(), null);
                } else {
                    GiftGuideExchangeDialogVM giftGuideExchangeDialogVM5 = this.LIZ;
                    C77410UZq.LIZLLL(giftGuideExchangeDialogVM5.LJLJI, giftGuideExchangeDialogVM5.qv0(), false, false);
                    this.LIZ.sv0();
                    GiftGuideExchangeDialogVM giftGuideExchangeDialogVM6 = this.LIZ;
                    InterfaceC77468Uam interfaceC77468Uam = giftGuideExchangeDialogVM6.LJLLI;
                    if (interfaceC77468Uam != null) {
                        interfaceC77468Uam.LIZLLL(giftGuideExchangeDialogVM6.LJLLLL, this.LIZJ, giftGuideExchangeDialogVM6.LJLLJ, false);
                    }
                    C77410UZq.LJ();
                }
            }
        } else {
            Integer LIZJ = InterfaceC30442Bx8.LLLIL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_GIFTS_GUIDE_EXCHANGE_CLICK_CANCEL_COUNT.value");
            if (LIZJ.intValue() >= 0) {
                this.LIZ.sv0();
            }
            InterfaceC77468Uam interfaceC77468Uam2 = this.LIZ.LJLLI;
            if (interfaceC77468Uam2 != null) {
                interfaceC77468Uam2.LIZJ();
            }
            this.LIZ.hv0("loading_duration");
            GiftGuideExchangeDialogVM giftGuideExchangeDialogVM7 = this.LIZ;
            giftGuideExchangeDialogVM7.lv0(2, giftGuideExchangeDialogVM7.qv0(), th);
            GiftGuideExchangeDialogVM giftGuideExchangeDialogVM8 = this.LIZ;
            giftGuideExchangeDialogVM8.kv0(giftGuideExchangeDialogVM8.LJLJI, giftGuideExchangeDialogVM8.qv0(), th, false);
        }
        if (taxDialogParams != null) {
            WalletExchange.LJLIL.LJJIIZ(this.LIZ.LJLJLLL, null, taxDialogParams);
            this.LIZ.hv0("loading_duration");
            GiftGuideExchangeDialogVM giftGuideExchangeDialogVM9 = this.LIZ;
            giftGuideExchangeDialogVM9.lv0(1, giftGuideExchangeDialogVM9.qv0(), null);
        }
    }
}
