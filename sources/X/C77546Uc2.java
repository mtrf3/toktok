package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeDialogVMV2;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS73S0400000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Uc2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77546Uc2 extends UHX implements InterfaceC77552Uc8 {
    public final C5H3 LJII;
    public final int LJIIIIZZ;

    @Override // X.UHX
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final LiveIncomeExchangeDialogVMV2 LIZJ() {
        return (LiveIncomeExchangeDialogVMV2) this.LJII.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (r1.intValue() < com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit.INSTANCE.getValue()) goto L16;
     */
    @Override // X.UHX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r11 = this;
            com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeDialogVMV2 r2 = r11.LIZJ()
            long r0 = X.C30725C4b.LIZ()
            r2.LJLJJI = r0
            com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeDialogVMV2 r5 = r11.LIZJ()
            r5.getClass()
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            com.bytedance.android.live.wallet.WalletCenter r0 = (com.bytedance.android.live.wallet.WalletCenter) r0
            com.bytedance.android.live.wallet.model.WalletStruct r1 = r0.LJLIL
            com.bytedance.android.live.wallet.model.RevenueExchange r4 = r1.revenue
            X.UaX r0 = r5.LJLLI
            int r0 = r0.LIZIZ
            long r6 = (long) r0
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            com.bytedance.android.live.wallet.WalletCenter r0 = (com.bytedance.android.live.wallet.WalletCenter) r0
            long r2 = r0.LIZ()
            long r6 = r6 - r2
            r10 = 1
            r2 = 0
            if (r4 == 0) goto Le1
            boolean r0 = r4.getEnableExchange()
            if (r0 == 0) goto Le1
            long r3 = r4.getBalance()
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto Le1
            com.bytedance.android.live.wallet.model.BalanceStructExtra r0 = r1.LIZ
            if (r0 == 0) goto Le1
            com.bytedance.android.live.wallet.model.BasePackage r0 = r0.getBasePackage()
            if (r0 == 0) goto Le1
            com.bytedance.android.live.wallet.model.BalanceStructExtra r0 = r1.LIZ
            long r3 = r0.getCoins()
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto Le1
            com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment r0 = com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment.INSTANCE
            boolean r0 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C77551Uc7.LJFF(r0)
            if (r0 == 0) goto Lc7
        L73:
            X.UaX r0 = r5.LJLLI
            long r3 = r0.LIZJ
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L86
            android.content.Context r0 = r5.LJLL
            if (r0 == 0) goto L86
            java.lang.String r1 = r5.LJLJI
            java.lang.String r0 = "anchor_income"
            X.C77410UZq.LIZ(r1, r0, r2)
        L86:
            android.content.Context r0 = r11.LIZ
            if (r0 == 0) goto Lc6
            com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeDialogVMV2 r4 = r11.LIZJ()
            X.Uc8 r0 = r4.LJLJLLL
            r0.LJII()
            X.UaX r0 = r4.LJLLI
            int r0 = r0.LIZIZ
            X.SvF r2 = X.C77476Uau.LIZIZ(r0, r2, r2)
            Y.IDhS106S0100000_13 r1 = new Y.IDhS106S0100000_13
            r0 = 14
            r1.<init>(r4, r0)
            X.Sv8 r1 = r2.LJIJI(r1)
            X.OjF r0 = new X.OjF
            r0.<init>()
            X.SvC r3 = r1.LJFF(r0)
            Y.AfS65S0100000_13 r2 = new Y.AfS65S0100000_13
            r0 = 193(0xc1, float:2.7E-43)
            r2.<init>(r4, r0)
            Y.AfS65S0100000_13 r1 = new Y.AfS65S0100000_13
            r0 = 194(0xc2, float:2.72E-43)
            r1.<init>(r4, r0)
            X.3kP r1 = r3.LJJII(r2, r1)
            X.Sq2 r0 = r4.LJLLJ
            r0.LIZ(r1)
        Lc6:
            return r10
        Lc7:
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLLIIL
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_GIFTS_EXCHANGE_CLICK_CANCEL_COUNT.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit r0 = com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit.INSTANCE
            int r0 = r0.getValue()
            if (r1 >= r0) goto Le1
            goto L73
        Le1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77546Uc2.LJI():boolean");
    }

    @Override // X.InterfaceC77552Uc8
    public final Context context() {
        return this.LIZ;
    }

    @Override // X.InterfaceC77552Uc8
    public final void LIZ(C77554UcA c77554UcA) {
        String title;
        int i;
        boolean z;
        C77566UcM c77566UcM;
        LIZJ().LJLLLL = !c77554UcA.LIZ;
        Context context = this.LIZ;
        if (context != null) {
            long LIZ = this.LIZIZ.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
            RevenueExchange revenueExchange = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.revenue;
            UHX.LJ(this.LIZIZ.LIZLLL);
            boolean z2 = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.isPeriodicPayout;
            if (revenueExchange != null && revenueExchange.isRevenue()) {
                if (z2) {
                    title = C15380j0.LJIILJJIL(R.string.l22);
                } else {
                    title = C15380j0.LJIILJJIL(R.string.lof);
                }
            } else if (z2) {
                title = C15380j0.LJIILJJIL(R.string.l2r);
            } else {
                title = C15380j0.LJIILJJIL(R.string.loe);
            }
            boolean value = LiveExchangeCancelExperiment.INSTANCE.getValue();
            if (C77551Uc7.LJFF(Boolean.valueOf(value))) {
                this.LIZLLL = true;
                i = C77551Uc7.LJ(Boolean.valueOf(value));
                z = true;
            } else {
                i = R.string.l2v;
                z = false;
            }
            o.LJIIIIZZ(title, "title");
            String LJIILL = C15380j0.LJIILL(R.string.l4f, Long.valueOf(LIZ), ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIIZILJ(LIZ, false), Long.valueOf(LIZ));
            o.LJIIIIZZ(LJIILL, "getString(\n             … needCoins,\n            )");
            this.LJ = new UHY(title, LJIILL, i, R.string.l4c, R.string.l4e, false, z, 448);
            if (this.LIZJ == null) {
                LIZLLL();
                C77566UcM c77566UcM2 = new C77566UcM(context, LIZJ());
                c77566UcM2.setId(this.LJIIIIZZ);
                c77566UcM2.LIZ(LIZLLL().LIZIZ, (C77568UcO) c77554UcA.LIZIZ);
                LIZLLL().LIZIZ = "";
                LIZLLL().LJII = c77566UcM2;
                LiveIncomeExchangeDialogVMV2 LIZJ = LIZJ();
                LIZJ.getClass();
                C77453UaX c77453UaX = LIZJ.LJLLI;
                C77448UaS.LJ(c77453UaX.LIZ, c77453UaX.LIZJ, "first_show_page", "anchor_income", c77453UaX.LIZLLL, 1, 0, 0);
                LIZIZ();
                return;
            }
            LIZLLL();
            LiveDialog liveDialog = this.LIZJ;
            if (liveDialog == null || (c77566UcM = (C77566UcM) liveDialog.findViewById(this.LJIIIIZZ)) == null) {
                return;
            }
            c77566UcM.LIZ(LIZLLL().LIZIZ, (C77568UcO) c77554UcA.LIZIZ);
        }
    }

    public C77546Uc2(Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam) {
        super(context, c77453UaX);
        this.LJII = C78996UzQ.LJJIJIIJI(new AqS73S0400000_13(this, context, c77453UaX, interfaceC77468Uam, 0));
        this.LJIIIIZZ = View.generateViewId();
    }
}
