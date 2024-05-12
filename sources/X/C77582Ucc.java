package X;

import Y.ARunnableS4S1110000_13;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77582Ucc implements InterfaceC77737Uf7 {
    public final /* synthetic */ C77583Ucd LJLIL;

    @Override // X.InterfaceC77737Uf7
    public final void LIZ(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZLLL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJFF(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJI(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIIZZ(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIZ(int i, C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIL(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILJJIL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIZILJ(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJI(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJ(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final InterfaceC77748UfI LIZJ() {
        return this.LJLIL.LJIIZILJ;
    }

    public C77582Ucc(C77583Ucd c77583Ucd) {
        this.LJLIL = c77583Ucd;
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIJJI(C31556Ca0 c31556Ca0) {
        C77583Ucd c77583Ucd = this.LJLIL;
        C77612Ud6 c77612Ud6 = c31556Ca0.LJLJI;
        c77583Ucd.LJIIIIZZ = c77612Ud6;
        String str = c77612Ud6.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c77612Ud6.LIZ;
        if (str3 != null) {
            str2 = str3;
        }
        int i = c77612Ud6.LIZJ;
        if (str.length() > 0 && str2.length() > 0) {
            this.LJLIL.LJFF().LIZJ(str2, str, i, this.LJLIL.LJIJ);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILLIIL(C31556Ca0 c31556Ca0) {
        String str;
        Object obj;
        String str2;
        long uptimeMillis = SystemClock.uptimeMillis();
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJJI(new C77600Ucu(this.LJLIL, uptimeMillis));
        C77583Ucd c77583Ucd = this.LJLIL;
        InterfaceC77677Ue9 interfaceC77677Ue9 = c77583Ucd.LJIILLIIL;
        if (interfaceC77677Ue9 != null) {
            interfaceC77677Ue9.LIZIZ(c77583Ucd.LJIIJ);
        }
        C77583Ucd c77583Ucd2 = this.LJLIL;
        if (c77583Ucd2.LJIIIZ) {
            return;
        }
        c77583Ucd2.LJIIIZ = true;
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
        OSZ[] oszArr = new OSZ[16];
        oszArr[0] = new OSZ("pay_method", "google_pay");
        oszArr[1] = new OSZ("charge_style", "window");
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str = "portal";
        } else {
            str = c77583Ucd2.LJIIL;
        }
        oszArr[2] = new OSZ("charge_reason", str);
        oszArr[3] = new OSZ("request_page", "live_detail");
        oszArr[4] = new OSZ("panel_type", "first_charge");
        oszArr[5] = new OSZ("recharge_package", String.valueOf(c77583Ucd2.LJIILL));
        String str3 = "1";
        oszArr[6] = new OSZ("is_first_recharge", "1");
        oszArr[7] = new OSZ("second_entrance", "other_recharge");
        oszArr[8] = new OSZ("timestamp", String.valueOf(C30725C4b.LIZ()));
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[9] = new OSZ("is_anchor", obj);
        oszArr[10] = new OSZ("poll_id", String.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).pz()));
        C77612Ud6 c77612Ud6 = c77583Ucd2.LJIIIIZZ;
        if (c77612Ud6 != null) {
            str2 = c77612Ud6.LIZIZ;
        } else {
            str2 = null;
        }
        oszArr[11] = new OSZ("order_id", String.valueOf(str2));
        if (!o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[12] = new OSZ("is_portal_user", str3);
        oszArr[13] = new OSZ("portal_id", String.valueOf(BJM.LJIIL()));
        oszArr[14] = new OSZ("gift_enter_from", C76828UDg.LIZ(c77583Ucd2.LJIILIIL));
        oszArr[15] = new OSZ("notification_type", c77583Ucd2.LJIILJJIL);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            String LIZLLL = C28594BKc.LIZJ().LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
            LJJLIIIIJ.put("enter_live_method", LIZLLL);
        }
        LJJLIIIIJ.putAll(BJB.LIZ());
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_success");
        if (!C38354F3m.LJ(BJM.LJII())) {
            LIZ.LJIJJ(BJM.LJII(), "enter_url_source");
        }
        if (BJM.LJI() != 0) {
            LIZ.LJIJJ(String.valueOf(BJM.LJI()), "enter_gift_id");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ.LJJIFFI(LJJLIIIIJ);
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZIZ(int i, C77623UdH c77623UdH) {
        Activity activity;
        C77518Uba LIZ = C77622UdG.LIZ(c77623UdH);
        LIZ.LJFF.put("request_page", "request_page");
        LIZ.LJ = new UI8(i, c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), c77623UdH.getException(), true, "first_recharge", 0, false);
        InterfaceC77510UbS LIZ2 = C77607Ud1.LIZ();
        WeakReference<Activity> weakReference = this.LJLIL.LIZIZ;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        LIZ2.LIZ(activity, "recharge_pay_fail", LIZ);
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJJ(int i, C31556Ca0 c31556Ca0) {
        C77583Ucd c77583Ucd = this.LJLIL;
        Diamond diamond = c77583Ucd.LJI;
        if (diamond == null) {
            c77583Ucd.LIZLLL();
            return;
        }
        List<? extends Diamond> list = c31556Ca0.LJLILLLLZI;
        if ((!list.isEmpty()) && TextUtils.equals(diamond.iapId, ((Diamond) ListProtector.get(list, 0)).iapId)) {
            Diamond diamond2 = (Diamond) ListProtector.get(list, 0);
            if (diamond2 != null && C38354F3m.LIZJ(diamond.iapId, diamond2.iapId)) {
                diamond.price = diamond2.price;
                diamond.LJLJI = diamond2.LJLJI;
                diamond.LJLILLLLZI = diamond2.LJLILLLLZI;
                diamond.LJLJJL = diamond2.LJLJJL;
            }
            ARunnableS4S1110000_13 aRunnableS4S1110000_13 = this.LJLIL.LJII;
            if (aRunnableS4S1110000_13 != null) {
                aRunnableS4S1110000_13.run();
            }
        }
    }
}
