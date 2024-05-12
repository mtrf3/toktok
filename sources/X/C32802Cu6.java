package X;

import android.text.TextUtils;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.dataChannel.MockGiftPollEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Cu6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32802Cu6 extends AbstractC32132CjI implements UVM {
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;

    public static final void LJIIL() {
        C73943T0h.LIZ().LIZIZ(new ZBR());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32802Cu6(InterfaceC32124CjA requireRef) {
        super(requireRef);
        o.LJIIIZ(requireRef, "requireRef");
        this.LIZLLL = "SendGiftFailureInterceptorBizHandler";
        this.LJ = "1";
        this.LJFF = "2";
        this.LJI = "3";
        this.LJII = "8";
        this.LJIIIIZZ = "9";
        this.LJIIIZ = "11";
        this.LJIIJ = 1001;
    }

    public static final void LJIILIIL(C32804Cu8 c32804Cu8) {
        C32823CuR c32823CuR;
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        GiftsBoxInfoForSend giftsBoxInfoForSend = null;
        if ((c32804Cu8 instanceof C32823CuR) && (c32823CuR = (C32823CuR) c32804Cu8) != null) {
            giftsBoxInfoForSend = c32823CuR.LJJIIZI;
        }
        c32785Ctp.getClass();
        C32785Ctp.LJJIII(giftsBoxInfoForSend);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(C32816CuK c32816CuK) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        String str3;
        long j;
        ZBU zbu;
        C32825CuT c32825CuT;
        C32843Cul c32843Cul;
        C32823CuR c32823CuR;
        C32823CuR c32823CuR2;
        boolean z3 = true;
        if (GiftManager.inst().canSendGiftFree()) {
            c32816CuK.LJI = true;
            UVW.LJI.LIZIZ(c32816CuK);
            return;
        }
        C30868C9o.LIZJ(R.string.ln3);
        long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        C32804Cu8 LJJII = V16.LJJII(c32816CuK);
        if (LJJII != 0) {
            long LJJLIL = V16.LJJLIL(c32816CuK) - LIZ;
            boolean z4 = LJJII instanceof C32823CuR;
            if (z4 && (c32823CuR2 = (C32823CuR) LJJII) != null && c32823CuR2.LJJIIZI != null) {
                z = true;
            } else {
                z = false;
            }
            String str4 = LJJII.LJIIL;
            long j2 = LJJII.LIZ;
            if (z) {
                str = "gift_box";
            } else if (GiftManager.inst().isPollGift(j2)) {
                str = "quick_poll";
            } else {
                str = "wishlist";
                if (!TextUtils.equals(str4, "wishlist")) {
                    if (TextUtils.equals(str4, "convenient_icon")) {
                        str = "shortcut_gift";
                    } else {
                        str = "gift";
                    }
                }
            }
            C15960jw c15960jw = new C15960jw(str, LJJLIL, "normal", LJJII.LJIIL, null);
            if (z4 && (c32823CuR = (C32823CuR) LJJII) != null && c32823CuR.LJJIIZI != null) {
                str2 = "giftbox";
            } else if (C32850Cus.LIZ(LJJII.LIZ)) {
                str2 = "combo_click_gift";
            } else {
                str2 = "single_gift";
            }
            c15960jw.LJII = str2;
            c15960jw.LJIIIIZZ = LJJII.LIZ;
            c15960jw.LJIIIZ = V16.LJJLIL(c32816CuK);
            if ((LJJII instanceof C32843Cul) && (c32843Cul = (C32843Cul) LJJII) != null) {
                z2 = c32843Cul.LJJIII;
            } else {
                z2 = false;
            }
            c15960jw.LJIIJ = z2;
            c15960jw.LJFF = true;
            Object obj = LJJII.LJIILL.LJLILLLLZI;
            if (obj != EnumC32737Ct3.GIFT_PANEL_PORTRAIT && obj != EnumC32737Ct3.GIFT_PANEL_LANDSCAPE) {
                z3 = false;
            }
            c15960jw.LJI = z3;
            DataChannel LJI = LJI();
            if (LJI != null) {
                LJI.qv0(ShowRechargeDialogEvent.class, c15960jw);
            }
            LJIIL();
            if (!(LJJII instanceof C32825CuT) || (c32825CuT = (C32825CuT) LJJII) == null || (str3 = c32825CuT.LJJIII) == null) {
                str3 = "click_icon";
            }
            C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
            long j3 = LJJII.LIZ;
            if ((LJJII instanceof ZBU) && (zbu = (ZBU) LJJII) != null) {
                j = zbu.LJIIIIZZ();
            } else {
                j = 0;
            }
            String str5 = this.LJI;
            String str6 = LJJII.LJIIL;
            c32785Ctp.getClass();
            C32785Ctp.LJJIIJZLJL(str5, "money", str6, str3, j3, j);
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C32811CuF(c32816CuK, this, null), 3);
        LJIIIZ(c32816CuK, new C53759L7z());
    }

    public final boolean LJIILJJIL(C32816CuK c32816CuK) {
        C0NB.LIZIZ(this.LIZLLL, "shouldHandleExchangeBeforeLiveGiftSend");
        C32804Cu8 LJJII = V16.LJJII(c32816CuK);
        if (LJJII == null) {
            return false;
        }
        ActivityC45651qj LJFF = LJFF();
        if (!(LJFF instanceof C29S) || LJFF == null) {
            return false;
        }
        IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
        return ((WalletExchange) walletExchange).LJIL(LJFF, new C77453UaX(V16.LJJLIL(c32816CuK), LJJII.LIZ, LJI(), LJJII.LJIIL), new C32808CuC(this, c32816CuK));
    }

    public final void LJIIIZ(C32816CuK c32816CuK, Throwable th) {
        C32279Clf c32279Clf;
        DataChannel LJI;
        C32825CuT c32825CuT;
        InterfaceC32497CpB interfaceC32497CpB;
        C32280Clg c32280Clg;
        InterfaceC32497CpB interfaceC32497CpB2;
        C32823CuR c32823CuR;
        InterfaceC32497CpB interfaceC32497CpB3;
        C32804Cu8 LJJII = V16.LJJII(c32816CuK);
        if (LJJII instanceof C32823CuR) {
            Iterator<UVP> it = c32816CuK.LIZ.iterator();
            while (it.hasNext()) {
                UV2 uv2 = it.next().LIZ;
                if ((uv2 instanceof C32823CuR) && (c32823CuR = (C32823CuR) uv2) != null && (interfaceC32497CpB3 = c32823CuR.LJJIII) != null) {
                    interfaceC32497CpB3.LIZIZ(th);
                }
            }
            return;
        }
        if (LJJII instanceof C32280Clg) {
            Iterator<UVP> it2 = c32816CuK.LIZ.iterator();
            while (it2.hasNext()) {
                UV2 uv22 = it2.next().LIZ;
                if ((uv22 instanceof C32280Clg) && (c32280Clg = (C32280Clg) uv22) != null && (interfaceC32497CpB2 = c32280Clg.LJJIII) != null) {
                    interfaceC32497CpB2.LIZIZ(th);
                }
            }
            return;
        }
        if (LJJII instanceof C32825CuT) {
            Iterator<UVP> it3 = c32816CuK.LIZ.iterator();
            while (it3.hasNext()) {
                UV2 uv23 = it3.next().LIZ;
                if ((uv23 instanceof C32825CuT) && (c32825CuT = (C32825CuT) uv23) != null && (interfaceC32497CpB = c32825CuT.LJJIIJ) != null) {
                    interfaceC32497CpB.LIZIZ(th);
                }
            }
            return;
        }
        if (LJJII instanceof C32279Clf) {
            Iterator<UVP> it4 = c32816CuK.LIZ.iterator();
            while (it4.hasNext()) {
                UV2 uv24 = it4.next().LIZ;
                if ((uv24 instanceof C32279Clf) && (c32279Clf = (C32279Clf) uv24) != null) {
                    try {
                        Z8D z8d = c32279Clf.LJJIII;
                        if (z8d != null) {
                            z8d.onFailed(th);
                        } else if (GiftManager.inst().isPollGift(c32279Clf.LIZ) && (LJI = LJI()) != null) {
                            LJI.qv0(MockGiftPollEvent.class, new CCW(true, new Throwable("ignore"), GiftManager.inst().getPollGiftIndex(c32279Clf.LIZ)));
                        }
                    } catch (Exception e) {
                        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                        String th2 = e.toString();
                        c32785Ctp.getClass();
                        C32785Ctp.LJIJJLI("error_callback_poll", th2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0466 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // X.UVM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C32816CuK r26, X.UV8 r27, X.InterfaceC67352kd<? super X.C76800UCe> r28) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32802Cu6.LIZJ(X.CuK, X.UV8, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0170 -> B:19:0x0121). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C32816CuK r11, com.bytedance.android.livesdk.gift.model.SendGiftResult r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32802Cu6.LJIIJ(X.CuK, com.bytedance.android.livesdk.gift.model.SendGiftResult, X.2kd):java.lang.Object");
    }
}
