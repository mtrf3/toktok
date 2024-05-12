package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.viewmodel.exchange.ABLiveIncomeExchangeDialogVM;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Uc1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77545Uc1 extends UHX implements InterfaceC77552Uc8 {
    public final InterfaceC77468Uam LJII;
    public final int LJIIIIZZ;
    public final C5H3 LJIIIZ;

    @Override // X.UHX
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final ABLiveIncomeExchangeDialogVM LIZJ() {
        return (ABLiveIncomeExchangeDialogVM) this.LJIIIZ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (r3.LL != false) goto L16;
     */
    @Override // X.UHX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r11 = this;
            com.bytedance.android.live.wallet.viewmodel.exchange.ABLiveIncomeExchangeDialogVM r2 = r11.LIZJ()
            long r0 = X.C30725C4b.LIZ()
            r2.LJLJJI = r0
            com.bytedance.android.live.wallet.viewmodel.exchange.ABLiveIncomeExchangeDialogVM r3 = r11.LIZJ()
            r3.getClass()
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            com.bytedance.android.live.wallet.WalletCenter r0 = (com.bytedance.android.live.wallet.WalletCenter) r0
            com.bytedance.android.live.wallet.model.WalletStruct r10 = r0.LJLIL
            com.bytedance.android.live.wallet.model.RevenueExchange r2 = r10.revenue
            X.UaX r0 = r3.LJLLI
            int r0 = r0.LIZIZ
            long r4 = (long) r0
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            com.bytedance.android.live.wallet.WalletCenter r0 = (com.bytedance.android.live.wallet.WalletCenter) r0
            long r0 = r0.LIZ()
            long r4 = r4 - r0
            r9 = 0
            r8 = 1
            if (r2 == 0) goto Ldd
            boolean r0 = r2.getEnableExchange()
            if (r0 == 0) goto Ldd
            long r1 = r2.getBalance()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto Ldd
            com.bytedance.android.live.wallet.model.BalanceStructExtra r0 = r10.LIZ
            if (r0 == 0) goto Ldd
            com.bytedance.android.live.wallet.model.BasePackage r0 = r0.getBasePackage()
            if (r0 == 0) goto Ldd
            com.bytedance.android.live.wallet.model.BalanceStructExtra r0 = r10.LIZ
            long r1 = r0.getCoins()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto Ldd
            com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment r0 = com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment.INSTANCE
            boolean r0 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C77551Uc7.LJFF(r0)
            if (r0 == 0) goto Lbf
        L73:
            X.UaX r0 = r3.LJLLI
            long r1 = r0.LIZJ
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L8a
            android.content.Context r0 = r3.LJLL
            if (r0 == 0) goto L8a
            java.lang.String r2 = r3.LJLJI
            boolean r1 = r3.gv0()
            java.lang.String r0 = "anchor_income"
            X.C77410UZq.LIZ(r2, r0, r1)
        L8a:
            android.content.Context r0 = r11.LIZ
            if (r0 == 0) goto Lba
            r11.LJII()
            com.bytedance.android.live.wallet.viewmodel.exchange.ABLiveIncomeExchangeDialogVM r5 = r11.LIZJ()
            r5.getClass()
            r1 = 0
            r5.LJZI = r1
            com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxEnableSetting r0 = com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxEnableSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto Lbb
            android.content.Context r0 = r5.LJLL
            if (r0 == 0) goto Lbb
            com.bytedance.android.live.wallet.WalletExchange r4 = com.bytedance.android.live.wallet.WalletExchange.LJLIL
            boolean r3 = r5.LL
            java.lang.String r2 = r5.LJLLLLLL
            java.lang.String r1 = r5.LJLZ
            X.Uc3 r0 = new X.Uc3
            r0.<init>(r5)
            r4.getClass()
            com.bytedance.android.live.wallet.WalletExchange.LIZLLL(r0, r2, r1, r3)
        Lba:
            return r8
        Lbb:
            r5.qv0(r1)
            goto Lba
        Lbf:
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLLIIL
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_GIFTS_EXCHANGE_CLICK_CANCEL_COUNT.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit r0 = com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit.INSTANCE
            int r0 = r0.getValue()
            if (r1 >= r0) goto Ld9
            goto L73
        Ld9:
            boolean r0 = r3.LL
            if (r0 != 0) goto L73
        Ldd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77545Uc1.LJI():boolean");
    }

    @Override // X.InterfaceC77552Uc8
    public final Context context() {
        return this.LIZ;
    }

    @Override // X.InterfaceC77552Uc8
    public final void LIZ(C77554UcA c77554UcA) {
        String title;
        boolean z;
        boolean z2;
        C77566UcM c77566UcM;
        int i;
        String str;
        Context context = this.LIZ;
        if (context != null) {
            RevenueExchange revenueExchange = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.revenue;
            String LJ = UHX.LJ(this.LIZIZ.LIZLLL);
            if (revenueExchange != null && revenueExchange.isRevenue()) {
                if (UHX.LJFF()) {
                    title = C15380j0.LJIILL(R.string.l1q, LJ);
                } else {
                    title = C15380j0.LJIILL(R.string.l5y, LJ);
                }
            } else if (UHX.LJFF()) {
                title = C15380j0.LJIILL(R.string.l2f, LJ);
            } else {
                title = C15380j0.LJIILL(R.string.l5x, LJ);
            }
            boolean value = LiveExchangeCancelExperiment.INSTANCE.getValue();
            int LJ2 = C77551Uc7.LJ(Boolean.valueOf(value));
            if (C77551Uc7.LJFF(Boolean.valueOf(value))) {
                this.LIZLLL = true;
                ABLiveIncomeExchangeDialogVM LIZJ = LIZJ();
                LIZJ.getClass();
                BZI LIZ = C28787BRn.LIZ("livesdk_balance_exchange_window_dont_show_again");
                LIZ.LJIJJ(Long.valueOf(C29306Beo.LJJIZ(LIZJ.LJLLI.LIZ)), "room_id");
                LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
                LIZ.LJJIIJZLJL();
                z = true;
            } else {
                z = false;
            }
            o.LJIIIIZZ(title, "title");
            String LJIILL = C15380j0.LJIILL(R.string.l5s, Long.valueOf(LIZJ().LJZ), ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIIZILJ(LIZJ().LJZ, false), LJ);
            o.LJIIIIZZ(LJIILL, "getString(\n             …argeReason,\n            )");
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLILZLLLI;
            Integer LIZJ2 = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_HAS_EXCHANGE_GIFT_S…UNT_FOR_LIVE_INCOME.value");
            if (LIZJ2.intValue() > 1 && !LIZJ().LL) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJ = new UHY(title, LJIILL, LJ2, R.string.l4c, R.string.l4e, z2, z, 448);
            if (this.LIZJ == null) {
                LIZLLL();
                C77566UcM c77566UcM2 = new C77566UcM(context, LIZJ());
                c77566UcM2.setId(this.LJIIIIZZ);
                c77566UcM2.LIZ(LIZLLL().LIZIZ, (C77568UcO) c77554UcA.LIZIZ);
                LIZLLL().LIZIZ = "";
                LIZLLL().LJII = c77566UcM2;
                ABLiveIncomeExchangeDialogVM LIZJ3 = LIZJ();
                LIZJ3.getClass();
                Integer LIZJ4 = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ4, "LIVE_HAS_EXCHANGE_GIFT_S…UNT_FOR_LIVE_INCOME.value");
                if (LIZJ4.intValue() > 1 && !LIZJ3.LL) {
                    i = 1;
                } else {
                    i = 0;
                }
                C77453UaX c77453UaX = LIZJ3.LJLLI;
                DataChannel dataChannel = c77453UaX.LIZ;
                long j = c77453UaX.LIZJ;
                if (LIZJ3.LJZL) {
                    str = "over_threshold_anchor_first";
                } else {
                    str = "not_auto_anchor_first";
                }
                C77448UaS.LJ(dataChannel, j, str, "anchor_income", c77453UaX.LIZLLL, 1, i, 0);
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

    public C77545Uc1(Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam) {
        super(context, c77453UaX);
        this.LJII = interfaceC77468Uam;
        this.LJIIIIZZ = View.generateViewId();
        this.LJIIIZ = C78996UzQ.LJJIJIIJI(new AqS102S0300000_13(this, context, c77453UaX, 9));
    }
}
