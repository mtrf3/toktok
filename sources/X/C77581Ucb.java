package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.live.wallet.IWalletException;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.KYCExtra;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.Ucb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77581Ucb implements InterfaceC77737Uf7 {
    public final /* synthetic */ C77603Ucx LJLIL;

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
    public final void LJJ(int i, C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final InterfaceC77748UfI LIZJ() {
        return this.LJLIL.LJLLI;
    }

    public C77581Ucb(C77603Ucx c77603Ucx) {
        this.LJLIL = c77603Ucx;
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIJJI(C31556Ca0 c31556Ca0) {
        C77612Ud6 c77612Ud6 = c31556Ca0.LJLJI;
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
            ((InterfaceC31557Ca1) this.LJLIL.LJLJLLL.getValue()).LIZJ(str2, str, i, this);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILLIIL(C31556Ca0 c31556Ca0) {
        String str;
        long uptimeMillis = SystemClock.uptimeMillis();
        C77603Ucx c77603Ucx = this.LJLIL;
        Diamond diamond = c77603Ucx.LJLJLJ;
        if (diamond != null) {
            ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJJI(new C77602Ucw(c77603Ucx, uptimeMillis));
            C77613Ud7 c77613Ud7 = c31556Ca0.LJLJJI;
            C77612Ud6 c77612Ud6 = new C77612Ud6(c77613Ud7.LIZ, c77613Ud7.LIZIZ, c77613Ud7.LIZJ, 8);
            int i = diamond.count;
            String valueOf = String.valueOf(c77612Ud6.LIZIZ);
            String valueOf2 = String.valueOf(c77612Ud6.LIZJ);
            HashMap<String, String> LIZJ = C03660Ck.LIZJ("charge_style", "window");
            if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ.put("is_anchor", str);
            LIZJ.put("request_page", "live_detail");
            C116484hg.LIZIZ(LIZJ, "pay_method", C77608Ud2.LIZ(), i, "recharge_package");
            LIZJ.put("order_id", valueOf);
            LIZJ.put("package_quantity", valueOf2);
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            LIZJ.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
            LIZJ.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            LIZJ.putAll(BJB.LIZ());
            c77603Ucx.LJII(LIZJ);
            BZI LIZ = C28787BRn.LIZ("livesdk_recharge_success");
            LIZ.LJIIZILJ();
            LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
            LIZ.LJJIFFI(LIZJ);
            LIZ.LJJIIJZLJL();
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "tt_live_wallet_event_recharge_success"));
            InterfaceC77606Ud0 interfaceC77606Ud0 = (InterfaceC77606Ud0) ED5.LIZJ(InterfaceC77606Ud0.class, null);
            interfaceC77606Ud0.setStatus(1);
            CompletionBlock<InterfaceC77606Ud0> completionBlock = c77603Ucx.LJLJJL;
            if (completionBlock != null) {
                completionBlock.onSuccess(interfaceC77606Ud0, "onPaySuccess");
            }
            ((IWalletService) CN1.LIZ(IWalletService.class)).getPayManager().LIZLLL();
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZIZ(int i, C77623UdH c77623UdH) {
        int valueOf;
        Activity LIZLLL;
        KYCExtra kYCExtra;
        C77603Ucx c77603Ucx = this.LJLIL;
        int errorCode = c77623UdH.getErrorCode();
        Exception exception = c77623UdH.getException();
        c77623UdH.getOrderId();
        c77603Ucx.getClass();
        InterfaceC77606Ud0 interfaceC77606Ud0 = (InterfaceC77606Ud0) ED5.LIZJ(InterfaceC77606Ud0.class, null);
        interfaceC77606Ud0.setStatus(0);
        boolean z = exception instanceof C29401Dk;
        if (z && errorCode == 31) {
            valueOf = Integer.valueOf(((C276516r) exception).getErrorCode());
        } else if (i == 3 && errorCode == 41) {
            valueOf = 1;
        } else {
            valueOf = Integer.valueOf(errorCode);
        }
        interfaceC77606Ud0.setChargeErrorCode(valueOf);
        if (errorCode == 31) {
            interfaceC77606Ud0.setSource(1);
        } else {
            interfaceC77606Ud0.setSource(Integer.valueOf(i));
        }
        if (z && (kYCExtra = KYCExtra.getKYCExtra(exception)) != null) {
            interfaceC77606Ud0.setUserType(kYCExtra.getUserType());
            interfaceC77606Ud0.setWithinPeriod(Boolean.valueOf(kYCExtra.isWithinPeriod()));
            interfaceC77606Ud0.setAmountLimit(kYCExtra.getAmountLimit());
        }
        CompletionBlock<InterfaceC77606Ud0> completionBlock = c77603Ucx.LJLJJL;
        if (completionBlock != null) {
            String message = exception.getMessage();
            if (message == null) {
                message = "";
            }
            completionBlock.onSuccess(interfaceC77606Ud0, message);
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
            IWalletException walletException = ((IWalletService) CN1.LIZ(IWalletService.class)).walletException();
            UI8 ui8 = new UI8(i, c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), c77623UdH.getException(), true, "first_recharge", 0, false);
            walletException.getClass();
            C77518Uba LIZ = C77622UdG.LIZ(c77623UdH);
            LIZ.LJ = ui8;
            LIZ.LJFF.put("request_page", "live_detail");
            InterfaceC77501UbJ LIZ2 = C77607Ud1.LIZ().LIZ(LIZLLL, "recharge_pay_fail", LIZ);
            new UI4(LIZ2.LIZ(), LIZ2.LIZIZ());
        }
    }
}
