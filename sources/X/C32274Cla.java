package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.firstrecharge.FirstChargeData;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cla, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32274Cla extends AbstractC32474Coo {
    public final /* synthetic */ FirstChargeData LIZ;
    public final /* synthetic */ AbstractC32135CjL LIZIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        GiftsInfo giftsInfo;
        long j;
        FirstChargeData firstChargeData;
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        String str = c32313CmD.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkHasBoughtSucceed ");
        LIZ.append(C32313CmD.LJIILL(c32313CmD.LIZLLL));
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        String str2 = c32313CmD.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkHasBoughtSucceed ");
        LIZ2.append(C32313CmD.LJIILLIIL(c32313CmD.LJ));
        C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ2));
        if (list == null || list.isEmpty() || (giftsInfo = c32313CmD.LJ) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Gift gift : ((GiftPage) it.next()).gifts) {
                long j2 = gift.id;
                LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo;
                if (liveLimitedTimeDiscountGiftInfo != null) {
                    j = liveLimitedTimeDiscountGiftInfo.giftId;
                } else {
                    j = 0;
                }
                if (j2 == j) {
                    String str3 = c32313CmD.LIZIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("checkHasBoughtSucceed isDisplayedOnPanel(");
                    LIZ3.append(gift.isDisplayedOnPanel);
                    LIZ3.append(')');
                    C0NB.LIZIZ(str3, X1D.LIZIZ(LIZ3));
                    if (!gift.isDisplayedOnPanel) {
                        return;
                    }
                    C32313CmD c32313CmD2 = AbstractC32320CmK.LIZ;
                    FirstChargeData firstChargeData2 = this.LIZ;
                    String str4 = c32313CmD2.LIZIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("onBuySuccess pre(");
                    LIZ4.append(C32313CmD.LJIILL(firstChargeData2));
                    LIZ4.append(')');
                    C0NB.LIZIZ(str4, X1D.LIZIZ(LIZ4));
                    String str5 = c32313CmD2.LIZIZ;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("onBuySuccess cur(");
                    LIZ5.append(C32313CmD.LJIILL(c32313CmD2.LIZLLL));
                    LIZ5.append(')');
                    C0NB.LIZIZ(str5, X1D.LIZIZ(LIZ5));
                    C32282Cli.LIZLLL = Boolean.FALSE;
                    C32282Cli.LJII = true;
                    InterfaceC32301Cm1 interfaceC32301Cm1 = C32282Cli.LJ;
                    if (interfaceC32301Cm1 != null) {
                        interfaceC32301Cm1.LIZJ();
                    }
                    C0NB.LJIIIZ("LiveFastFirstRechargeHolder", " update first charge success");
                    if (firstChargeData2 != null && firstChargeData2.isFirstCharge && (firstChargeData = c32313CmD2.LIZLLL) != null && !firstChargeData.isFirstCharge) {
                        C0NB.LIZIZ(c32313CmD2.LIZIZ, "onFirstRechargeSuccess");
                        c32313CmD2.LJIIIIZZ = true;
                        C73943T0h.LIZ().LIZIZ(new C32305Cm5());
                    }
                    ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
                    BZI LIZIZ = C0N3.LIZIZ("welcome_gift_pack_buy_success", this.LIZIZ.LIZ(), "gift_enter_from");
                    LIZIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
                    LIZIZ.LJJIIJZLJL();
                    return;
                }
            }
        }
    }

    public C32274Cla(FirstChargeData firstChargeData, AbstractC32135CjL abstractC32135CjL) {
        this.LIZ = firstChargeData;
        this.LIZIZ = abstractC32135CjL;
    }
}
