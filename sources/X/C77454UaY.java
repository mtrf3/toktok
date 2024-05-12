package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ConfirmExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UaY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77454UaY extends UHX {
    public final String LJII;
    public final ConfirmExchangeDialogVM LJIIIIZZ;

    @Override // X.UHX
    public final boolean LJI() {
        int i;
        String LJIILL;
        boolean z;
        int i2;
        WalletStruct walletStruct;
        this.LJIIIIZZ.LJLJJI = C30725C4b.LIZ();
        long LIZ = this.LIZIZ.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        RevenueExchange revenue = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.revenue;
        String str = this.LJII;
        int hashCode = str.hashCode();
        if (hashCode != 3730) {
            if (hashCode != 3322092) {
                if (hashCode == 184289364 && str.equals("live_ab")) {
                    o.LJIIIIZZ(revenue, "revenue");
                    String LJ = UHX.LJ(this.LIZIZ.LIZLLL);
                    if (this.LJIIIIZZ.LJLILLLLZI) {
                        LJIILL = C15380j0.LJIILJJIL(R.string.kbv);
                        o.LJIIIIZZ(LJIILL, "{\n            ResUtil.ge…m_modal_title2)\n        }");
                    } else {
                        LJIILL = C15380j0.LJIILL(R.string.l5t, LJ);
                        o.LJIIIIZZ(LJIILL, "{\n            ResUtil.ge…, chargeReason)\n        }");
                    }
                    IWalletCenter walletCenter = ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
                    if (walletCenter != null && (walletStruct = ((WalletCenter) walletCenter).LJLIL) != null && walletStruct.isPeriodicPayout) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (revenue.isRevenue()) {
                        if (z) {
                            i2 = R.string.l1j;
                        } else {
                            i2 = R.string.l3p;
                        }
                    } else if (z) {
                        i2 = R.string.l29;
                    } else {
                        i2 = R.string.l3o;
                    }
                    String LJIILL2 = C15380j0.LJIILL(i2, ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIIZILJ(LIZ, false));
                    o.LJIIIIZZ(LJIILL2, "getString(\n             …ns, false),\n            )");
                    this.LJ = new UHY(LJIILL, LJIILL2, R.string.l3z, R.string.l4p, 0, false, false, 896);
                }
            } else if (str.equals("live")) {
                o.LJIIIIZZ(revenue, "revenue");
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l4s);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_exchange_gift_popup3_title)");
                if (revenue.isRevenue()) {
                    i = R.string.lo5;
                } else {
                    i = R.string.lo4;
                }
                String LJIILL3 = C15380j0.LJIILL(i, ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIIZILJ(LIZ, false));
                o.LJIIIIZZ(LJIILL3, "getString(\n             …ns, false),\n            )");
                this.LJ = new UHY(LJIILJJIL, LJIILL3, R.string.l3z, R.string.l4p, 0, false, false, 896);
            }
        } else if (str.equals("ug")) {
            String LJIILL4 = C15380j0.LJIILL(R.string.l5t, UHX.LJ(this.LIZIZ.LIZLLL));
            o.LJIIIIZZ(LJIILL4, "getString(R.string.pm_ex…le_confirm, chargeReason)");
            String LJIILL5 = C15380j0.LJIILL(R.string.l41, ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJ(LIZ));
            o.LJIIIIZZ(LJIILL5, "getString(\n             …needCoins),\n            )");
            this.LJ = new UHY(LJIILL4, LJIILL5, R.string.l3z, R.string.l4p, 0, false, false, 896);
        }
        LIZIZ();
        return true;
    }

    @Override // X.UHX
    public final /* bridge */ /* synthetic */ ExchangeDialogVM LIZJ() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77454UaY(Context context, InterfaceC77468Uam interfaceC77468Uam, C77453UaX liveExchangeParam, String str, boolean z, boolean z2) {
        super(context, liveExchangeParam);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        this.LJII = str;
        this.LJIIIIZZ = new ConfirmExchangeDialogVM(context, interfaceC77468Uam, liveExchangeParam, str, z, z2);
    }
}
