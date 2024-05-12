package X;

import Y.AObjectS42S0101000_5;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Ctr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32787Ctr {
    public DataChannel LIZJ;
    public ActivityC45651qj LIZLLL;
    public C32805Cu9 LJ;
    public GiftWidget LJFF;
    public final LinkedList<C32805Cu9> LIZ = new LinkedList<>();
    public boolean LIZIZ = false;
    public final C73849Syb<Boolean> LJI = C73849Syb.LJJZZI(Boolean.TRUE);
    public final AObjectS42S0101000_5 LJII = new AObjectS42S0101000_5(4, this, 48);
    public final C29581BjF LJIIIIZZ = new C29581BjF();

    public final void LIZ() {
        LinkedList<C32805Cu9> linkedList = this.LIZ;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        C32805Cu9 pollFirst = this.LIZ.pollFirst();
        if (C2NU.LIZ.LIZIZ()) {
            if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
                InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                ActivityC45651qj activityC45651qj = this.LIZLLL;
                C29356Bfc c29356Bfc = new C29356Bfc();
                c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.syk);
                c29356Bfc.LIZJ = 1001;
                c29356Bfc.LJ = "live_detail";
                c29356Bfc.LJFF = "gift_send";
                c29356Bfc.LIZLLL = "enableGift";
                ((C29374Bfu) LIZIZ).LIZLLL(activityC45651qj, new C29377Bfx(c29356Bfc)).LIZ(this.LJIIIIZZ);
                LIZLLL();
                C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                long j = pollFirst.LJ;
                long j2 = pollFirst.LJJ;
                String str = pollFirst.LJIILJJIL;
                String str2 = pollFirst.LJJJJJ;
                c32785Ctp.getClass();
                C32785Ctp.LJJIIJZLJL("2", "unlogin", str, str2, j, j2);
                return;
            }
            if (((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ(EnumC31098CIk.GIFT)) {
                LIZLLL();
                C32785Ctp c32785Ctp2 = C32785Ctp.LJIILIIL;
                long j3 = pollFirst.LJ;
                long j4 = pollFirst.LJJ;
                String str3 = pollFirst.LJIILJJIL;
                String str4 = pollFirst.LJJJJJ;
                c32785Ctp2.getClass();
                C32785Ctp.LJJIIJZLJL("9", "intercept", str3, str4, j3, j4);
                return;
            }
            if (C31593Cab.LIZIZ(this.LIZJ)) {
                C31593Cab.LIZLLL(this.LIZLLL, this.LIZJ);
                C32785Ctp c32785Ctp3 = C32785Ctp.LJIILIIL;
                long j5 = pollFirst.LJ;
                long j6 = pollFirst.LJJ;
                String str5 = pollFirst.LJIILJJIL;
                String str6 = pollFirst.LJJJJJ;
                c32785Ctp3.getClass();
                C32785Ctp.LJJIIJZLJL("11", "suspension", str5, str6, j5, j6);
                return;
            }
            if (((IHostUser) CN1.LIZ(IHostUser.class)).isNeedProtectMinor()) {
                C30868C9o.LIZJ(R.string.sw3);
                LIZLLL();
                C32785Ctp.LJIILIIL.getClass();
                C32785Ctp.LJJIIJ(pollFirst);
                C32785Ctp.LJJIIJZLJL("1", "forbidden", pollFirst.LJIILJJIL, pollFirst.LJJJJJ, pollFirst.LJ, pollFirst.LJJ);
                return;
            }
            if (pollFirst.LJJJI) {
                C32659Crn c32659Crn = EnumC32660Cro.Companion;
                long j7 = pollFirst.LJ;
                c32659Crn.getClass();
                if (C32659Crn.LIZIZ(j7)) {
                    C0NB.LJIIIZ("NewGifter", "Send fast gift with new flow.");
                    C76906UGg.LIZJ((C29S) this.LIZLLL, true, new C32834Cuc(this, pollFirst, true), this.LIZJ);
                    return;
                }
            }
            if (LJII(pollFirst, false)) {
                return;
            }
            this.LIZJ.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
            LJFF(pollFirst);
            return;
        }
        C32785Ctp c32785Ctp4 = C32785Ctp.LJIILIIL;
        String str7 = pollFirst.LJIILJJIL;
        String str8 = pollFirst.LJJJJJ;
        c32785Ctp4.getClass();
        C32785Ctp.LJJIIZ(str7, str8);
        C32785Ctp.LJJIIJZLJL("8", "network_error", pollFirst.LJIILJJIL, pollFirst.LJJJJJ, pollFirst.LJ, pollFirst.LJJ);
        C30868C9o.LIZLLL(R.string.n0o, this.LIZLLL);
        LIZLLL();
        C32785Ctp.LJJIIJ(pollFirst);
    }

    public final void LIZLLL() {
        this.LIZ.clear();
        this.LIZIZ = false;
        C73943T0h.LIZ().LIZIZ(new ZBR());
    }

    public static String LIZIZ(SendGiftResult sendGiftResult) {
        try {
            return C32465Cof.LIZIZ(sendGiftResult.monitorExtra);
        } catch (Exception unused) {
            C0NB.LIZLLL("Error parsing SendGiftResult");
            return "";
        }
    }

    public final void LJFF(C32805Cu9 c32805Cu9) {
        boolean z;
        if (c32805Cu9.LJJJI) {
            if (C76906UGg.LIZIZ(c32805Cu9.LJ)) {
                EnumC32660Cro.Companion.getClass();
                if (C32659Crn.LIZJ() && C32659Crn.LIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                C76906UGg.LIZJ((C29S) this.LIZLLL, z, new C32834Cuc(this, c32805Cu9, z), this.LIZJ);
                return;
            }
            LJI(c32805Cu9);
            return;
        }
        LJI(c32805Cu9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0267, code lost:
    
        if (r12 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02db, code lost:
    
        if (X.C32796Cu0.LIZ(r61, r5, r0, r9, "global", r11, r8.globalBlockAny(), r8.globalBlockCheckAnchor()) != false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(final X.C32805Cu9 r61) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32787Ctr.LJI(X.Cu9):void");
    }

    public final void LIZJ(C32805Cu9 c32805Cu9, boolean z) {
        String str;
        String str2;
        if (GiftManager.inst().canSendGiftFree()) {
            if (z) {
                LJI(c32805Cu9);
                return;
            } else {
                LJFF(c32805Cu9);
                return;
            }
        }
        C30868C9o.LIZJ(R.string.ln3);
        long LIZ = c32805Cu9.LIZ() - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        String str3 = c32805Cu9.LJIILJJIL;
        long j = c32805Cu9.LJ;
        if (c32805Cu9.LJJJJ != null) {
            str = "gift_box";
        } else if (GiftManager.inst().isPollGift(j)) {
            str = "quick_poll";
        } else {
            str = "wishlist";
            if (!TextUtils.equals(str3, "wishlist")) {
                if (TextUtils.equals(str3, "convenient_icon")) {
                    str = "shortcut_gift";
                } else {
                    str = "gift";
                }
            }
        }
        C15960jw c15960jw = new C15960jw(str, LIZ, "normal", c32805Cu9.LJIILJJIL, null);
        if (C32850Cus.LIZ(c32805Cu9.LJ)) {
            str2 = "combo_click_gift";
        } else {
            str2 = "single_gift";
        }
        c15960jw.LJII = str2;
        c15960jw.LJIIIIZZ = c32805Cu9.LJ;
        c15960jw.LJIIIZ = c32805Cu9.LIZ();
        c15960jw.LJIIJ = c32805Cu9.LJJIIJ;
        boolean z2 = true;
        c15960jw.LJFF = true;
        Object obj = c32805Cu9.LJJJJIZL.LJLILLLLZI;
        if (obj != EnumC32737Ct3.GIFT_PANEL_PORTRAIT && obj != EnumC32737Ct3.GIFT_PANEL_LANDSCAPE) {
            z2 = false;
        }
        c15960jw.LJI = z2;
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.qv0(ShowRechargeDialogEvent.class, c15960jw);
        }
        LIZLLL();
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        long j2 = c32805Cu9.LJ;
        long j3 = c32805Cu9.LJJ;
        String str4 = c32805Cu9.LJIILJJIL;
        String str5 = c32805Cu9.LJJJJJ;
        c32785Ctp.getClass();
        C32785Ctp.LJJIIJZLJL("3", "money", str4, str5, j2, j3);
        InterfaceC32497CpB interfaceC32497CpB = c32805Cu9.LJJJ;
        if (interfaceC32497CpB == null) {
            return;
        }
        interfaceC32497CpB.LIZIZ(new C53759L7z());
    }

    public final boolean LJII(C32805Cu9 c32805Cu9, boolean z) {
        IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
        return ((WalletExchange) walletExchange).LJIL(this.LIZLLL, new C77453UaX(c32805Cu9.LIZ(), c32805Cu9.LJ, this.LIZJ, c32805Cu9.LJIILJJIL), new C32821CuP(this, c32805Cu9, z));
    }

    public final void LJ(SendGiftResult sendGiftResult, C32805Cu9 c32805Cu9, boolean z) {
        int i;
        ActivityC45651qj activityC45651qj;
        GiftsBoxInfoForSend giftsBoxInfoForSend;
        List<GiftInfoInBox> list;
        GiftInfoInBox giftInfoInBox;
        long j = sendGiftResult.mGiftId;
        if (z && (giftsBoxInfoForSend = c32805Cu9.LJJJJ) != null && (list = giftsBoxInfoForSend.gifts) != null && !list.isEmpty() && (giftInfoInBox = (GiftInfoInBox) C64504PTg.LIZIZ(list, -1, list)) != null) {
            j = giftInfoInBox.giftId;
        }
        if (j > 0) {
            C0NB.LIZIZ("GiftPanelSwipe", "set default item");
            ActivityC45651qj activityC45651qj2 = this.LIZLLL;
            if (activityC45651qj2 != null) {
                SharedPreferences.Editor edit = F9J.LIZIZ(activityC45651qj2, 0, "gift_dialog_storage").edit();
                edit.putLong("default_dialog_item", j);
                edit.commit();
            }
        }
        C32805Cu9 c32805Cu92 = this.LJ;
        if (c32805Cu92 == null || (i = c32805Cu92.LJIJ) == -1 || (activityC45651qj = this.LIZLLL) == null) {
            return;
        }
        SharedPreferences.Editor edit2 = F9J.LIZIZ(activityC45651qj, 0, "gift_dialog_storage").edit();
        edit2.putInt("sp_gift_page_type", i);
        edit2.commit();
    }
}
