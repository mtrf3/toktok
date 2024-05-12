package X;

import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Cli, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32282Cli {
    public static Long LIZ;
    public static Long LIZIZ;
    public static Long LIZJ;
    public static Boolean LIZLLL;
    public static InterfaceC32301Cm1 LJ;
    public static C73318Sq2 LJFF;
    public static boolean LJI;
    public static boolean LJII;

    public static boolean LIZJ() {
        if (CanRechargeSetting.INSTANCE.getValue()) {
            C15490jB.LJIJ(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_normal_1"), "ttlive_fast_welcome_pack_icon.png");
            C15490jB.LJIJ(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_demand_1"), "ttlive_welcome_pack_refresh.webp");
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r1 == true) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "button_type"
            java.util.HashMap r4 = X.C03660Ck.LIZJ(r0, r11)
            java.lang.String r5 = "0"
            java.lang.String r3 = "1"
            if (r12 == 0) goto La8
        Lc:
            r1 = r3
        Ld:
            java.lang.String r0 = "is_first_recharge"
            r4.put(r0, r1)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            if (r0 == 0) goto La5
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            if (r0 == 0) goto La5
            com.bytedance.android.live.wallet.WalletCenter r0 = (com.bytedance.android.live.wallet.WalletCenter) r0
            com.bytedance.android.live.wallet.model.WalletStruct r9 = r0.LJLIL
            if (r9 == 0) goto La6
            com.bytedance.android.live.wallet.model.RevenueExchange r0 = r9.revenue
            if (r0 == 0) goto La6
            boolean r1 = r0.getEnableExchange()
            r0 = 1
            if (r1 != r0) goto La6
        L33:
            java.lang.String r6 = "can_exchange"
            r7 = 0
            if (r0 == 0) goto L9c
            com.bytedance.android.live.wallet.model.RevenueExchange r0 = r9.revenue
            if (r0 == 0) goto L9c
            long r1 = r0.getBalance()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L9c
            r4.put(r6, r3)
        L48:
            long r1 = r9.diamond
        L4a:
            java.lang.String r6 = "has_coin"
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L98
            r4.put(r6, r3)
        L53:
            java.lang.String r0 = "click"
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r0)
            if (r0 == 0) goto L95
            java.lang.String r2 = "convenient_gift_click_v2"
        L5d:
            X.Byw<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.O1
            java.lang.Object r1 = r0.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r0)
            java.lang.String r0 = "fetch_success"
            if (r1 == 0) goto L91
            r4.put(r0, r3)
        L70:
            X.BZI r2 = X.C28787BRn.LIZ(r2)
            r2.LJJIFFI(r4)
            com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting r1 = com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting.INSTANCE
            java.lang.String r0 = r2.LJIILL()
            boolean r0 = r1.isBuriedField(r0)
            if (r0 != 0) goto L8a
            r2.LJIIZILJ()
            r2.LJJIIJZLJL()
        L89:
            return
        L8a:
            r2.LJJIJ()
            r2.LJJIIZI()
            goto L89
        L91:
            r4.put(r0, r5)
            goto L70
        L95:
            java.lang.String r2 = "convenient_gift_show_v2"
            goto L5d
        L98:
            r4.put(r6, r5)
            goto L53
        L9c:
            r4.put(r6, r5)
            if (r9 == 0) goto La2
            goto L48
        La2:
            r1 = 0
            goto L4a
        La5:
            r9 = 0
        La6:
            r0 = 0
            goto L33
        La8:
            java.lang.Boolean r1 = X.C32282Cli.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lb4
            goto Lc
        Lb4:
            r1 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32282Cli.LIZIZ(java.lang.String, java.lang.String, boolean):void");
    }

    public static void LIZ(Boolean bool, Long l, Long l2, Long l3) {
        boolean z;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isFirstCharge ");
        LIZ2.append(bool);
        LIZ2.append(", coin is ");
        LIZ2.append(l);
        LIZ2.append(", balance is ");
        LIZ2.append(l2);
        LIZ2.append(", liveBalance is ");
        LIZ2.append(l3);
        C0NB.LJIIIZ("LiveFastFirstRechargeHolder", X1D.LIZIZ(LIZ2));
        if (LIZLLL != null && LIZIZ != null && LIZ != null && LIZJ != null) {
            if (!o.LJ(bool, Boolean.TRUE) || l == null || l.longValue() != 0 || l2 == null || l2.longValue() != 0 || l3 == null || l3.longValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            InterfaceC30442Bx8.O1.LIZJ(Boolean.valueOf(z));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("call back fast welcome status is ");
            LIZ3.append(z);
            C0NB.LJIIIZ("LiveFastFirstRechargeHolder", X1D.LIZIZ(LIZ3));
            InterfaceC32301Cm1 interfaceC32301Cm1 = LJ;
            if (interfaceC32301Cm1 != null) {
                interfaceC32301Cm1.LIZIZ(z);
            }
        }
    }
}
