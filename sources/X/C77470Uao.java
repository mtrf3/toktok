package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.GiftGuideExchangeDialogVM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uao, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77470Uao extends UHX {
    public final C77453UaX LJII;
    public final InterfaceC77468Uam LJIIIIZZ;
    public final String LJIIIZ;
    public final GiftGuideExchangeDialogVM LJIIJ;
    public final long LJIIJJI;

    @Override // X.UHX
    public final boolean LJI() {
        long j;
        String str;
        String LJIILJJIL;
        int i;
        BalanceStructExtra balanceStructExtra;
        this.LJIIJ.LJLJJI = C30725C4b.LIZ();
        GiftGuideExchangeDialogVM giftGuideExchangeDialogVM = this.LJIIJ;
        giftGuideExchangeDialogVM.getClass();
        WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
        RevenueExchange revenueExchange = walletStruct.revenue;
        long LIZ = giftGuideExchangeDialogVM.LJLL.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        BalanceStruct balanceStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL;
        BalanceStructExtra exchangeInfo = balanceStruct.getExchangeInfo();
        if (exchangeInfo != null) {
            j = exchangeInfo.getCoins();
        } else {
            j = 0;
        }
        if ((o.LJ(giftGuideExchangeDialogVM.LJLLILLLL, "live") && (revenueExchange == null || !revenueExchange.getEnableExchange() || revenueExchange.getBalance() <= 0 || (balanceStructExtra = walletStruct.LIZ) == null || balanceStructExtra.getBasePackage() == null || LIZ > walletStruct.LIZ.getCoins())) || (o.LJ(giftGuideExchangeDialogVM.LJLLILLLL, "ug") && (balanceStruct.getExchangeInfo() == null || !balanceStruct.getValidUser() || LIZ > j))) {
            return false;
        }
        if (giftGuideExchangeDialogVM.LJLL.LIZJ != 0 && giftGuideExchangeDialogVM.LJLJLLL != null) {
            C77410UZq.LIZ(giftGuideExchangeDialogVM.LJLJI, giftGuideExchangeDialogVM.qv0(), giftGuideExchangeDialogVM.gv0());
        }
        if (this.LIZ != null) {
            if (this.LJIIJ.gv0()) {
                if (o.LJ(this.LJIIIZ, "live")) {
                    i = 2;
                } else {
                    i = 1;
                }
                InterfaceC77468Uam interfaceC77468Uam = this.LJIIIIZZ;
                if (interfaceC77468Uam != null) {
                    interfaceC77468Uam.LIZLLL(i, this.LJIIJJI, true, false);
                }
                C77410UZq.LJ();
                return true;
            }
            C0NB.LIZIZ("exchangeParam", "setDialogParam");
            GiftGuideExchangeDialogVM giftGuideExchangeDialogVM2 = this.LJIIJ;
            boolean tv0 = giftGuideExchangeDialogVM2.tv0();
            C77453UaX c77453UaX = giftGuideExchangeDialogVM2.LJLL;
            DataChannel dataChannel = c77453UaX.LIZ;
            long j2 = c77453UaX.LIZJ;
            String rv0 = giftGuideExchangeDialogVM2.rv0(true);
            OSZ<Integer, String> osz = giftGuideExchangeDialogVM2.LJLLL.get(giftGuideExchangeDialogVM2.LJLLILLLL);
            if (osz == null || (str = osz.getSecond()) == null) {
                str = "";
            }
            C77448UaS.LJ(dataChannel, j2, rv0, str, giftGuideExchangeDialogVM2.LJLL.LIZLLL, 1, tv0 ? 1 : 0, 0);
            String str2 = this.LJIIIZ;
            if (o.LJ(str2, "live")) {
                long LIZ2 = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
                String LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.ky, (int) LIZ2, Long.valueOf(LIZ2));
                o.LJIIIIZZ(LJIIIIZZ, "getQuantityString(\n     …currentBalance,\n        )");
                String LJII = C15380j0.LJII(R.plurals.kz, (int) this.LJIIJJI);
                o.LJIIIIZZ(LJII, "getQuantityString(\n     …dCoins.toInt(),\n        )");
                String LJIIZILJ = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIIZILJ(this.LJIIJJI, false);
                o.LJIIIIZZ(LJIIZILJ, "getService(IWalletServic…Balance(needCoins, false)");
                String LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(LJII, "%@", LJIIZILJ, false), "%d", String.valueOf(this.LJIIJJI), false);
                if (UHX.LJFF()) {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.l2j);
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.l4t);
                }
                o.LJIIIIZZ(LJIILJJIL, "if (isPeriodicPayout()) …gift_title)\n            }");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LJIIIIZZ);
                LIZ3.append(LJJJJZ);
                this.LJ = new UHY(LJIILJJIL, X1D.LIZIZ(LIZ3), R.string.kbm, R.string.l4c, R.string.kbn, this.LJIIJ.tv0(), false, 960);
            } else if (o.LJ(str2, "ug")) {
                long LIZ4 = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
                long LIZ5 = this.LJII.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
                String LJIIIIZZ2 = C15380j0.LJIIIIZZ(R.plurals.ky, (int) LIZ4, Long.valueOf(LIZ4));
                o.LJIIIIZZ(LJIIIIZZ2, "getQuantityString(\n     …currentBalance,\n        )");
                String LJII2 = C15380j0.LJII(R.plurals.kz, (int) LIZ5);
                o.LJIIIIZZ(LJII2, "getQuantityString(\n     …dCoins.toInt(),\n        )");
                String LJIJ = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJ(LIZ5);
                o.LJIIIIZZ(LJIJ, "getService(IWalletServic…tNeedUgBalance(needCoins)");
                String LJJJJZ2 = ujb.o.LJJJJZ(ujb.o.LJJJJZ(LJII2, "%@", LJIJ, false), "%d", String.valueOf(LIZ5), false);
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.l58);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_exchange_reward_title)");
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(LJIIIIZZ2);
                LIZ6.append(LJJJJZ2);
                this.LJ = new UHY(LJIILJJIL2, X1D.LIZIZ(LIZ6), R.string.kbm, R.string.l4c, R.string.kbn, this.LJIIJ.tv0(), false, 960);
            }
            LIZIZ();
        }
        return true;
    }

    @Override // X.UHX
    public final /* bridge */ /* synthetic */ ExchangeDialogVM LIZJ() {
        return this.LJIIJ;
    }

    public C77470Uao(Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam, String str) {
        super(context, c77453UaX);
        this.LJII = c77453UaX;
        this.LJIIIIZZ = interfaceC77468Uam;
        this.LJIIIZ = str;
        this.LJIIJ = new GiftGuideExchangeDialogVM(context, this, c77453UaX, interfaceC77468Uam, str);
        this.LJIIJJI = c77453UaX.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
    }
}
