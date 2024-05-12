package Y;

import X.B5G;
import X.C0K7;
import X.C15380j0;
import X.C28268B7o;
import X.C30868C9o;
import X.C34K;
import X.C74674TSk;
import X.C74824TYe;
import X.C74987Tbr;
import X.C75093TdZ;
import X.C75285Tgf;
import X.C75642TmQ;
import X.C75848Tpk;
import X.C76800UCe;
import X.C76912UGm;
import X.CN1;
import X.InterfaceC88472Yns;
import X.TWL;
import X.UI8;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class IDcS17S0300000_13 implements C0K7 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LJIILLIIL$0(this, liveDialog);
                return;
            case 1:
                LJIILLIIL$1(this, liveDialog);
                return;
            case 2:
                LJIILLIIL$2(this, liveDialog);
                return;
            case 3:
                LJIILLIIL$3(this, liveDialog);
                return;
            case 4:
                LJIILLIIL$4(this, liveDialog);
                return;
            case 5:
                LJIILLIIL$5(this, liveDialog);
                return;
            case 6:
                LJIILLIIL$6(this, liveDialog);
                return;
            case 7:
                LJIILLIIL$7(this, liveDialog);
                return;
            default:
                return;
        }
    }

    public static final void LJIILLIIL$0(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        Integer num;
        C28268B7o c28268B7o = (C28268B7o) iDcS17S0300000_13.l0;
        if (c28268B7o != null) {
            num = Integer.valueOf(c28268B7o.LIZ);
        } else {
            num = null;
        }
        C74824TYe.LJJJI(true, true, num);
        liveDialog.dismiss();
        ((MultiGuestV3GuestWidget) iDcS17S0300000_13.l1).exitInteractNormal((Runnable) iDcS17S0300000_13.l2, false);
    }

    public static final void LJIILLIIL$1(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        Integer num;
        C28268B7o c28268B7o = (C28268B7o) iDcS17S0300000_13.l0;
        if (c28268B7o != null) {
            num = Integer.valueOf(c28268B7o.LIZ);
        } else {
            num = null;
        }
        C74824TYe.LJJJI(true, true, num);
        liveDialog.dismiss();
        ((VoiceChatWatchWidget) iDcS17S0300000_13.l1).LL((Runnable) iDcS17S0300000_13.l2, false, "live_end", true);
    }

    public static final void LJIILLIIL$2(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        if (!((GameLinkGuestPresenter) iDcS17S0300000_13.l0).getMultiGuestDataHolder().LJIIIIZZ) {
            ((GameLinkGuestPresenter) iDcS17S0300000_13.l0).getMultiGuestDataHolder().LJIIIIZZ = true;
            DataChannel dataChannel = ((GameLinkGuestPresenter) iDcS17S0300000_13.l0).dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(GameLinkGuestMuteAudioEvent.class, new C74674TSk(((GameLinkGuestPresenter) iDcS17S0300000_13.l0).getMultiGuestDataHolder().LJIIIIZZ, "business_mute_guest_confirm_host_invite"));
            }
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.n9w));
            TWL twl = TWL.LIZ;
            String str2 = ((GameLinkGuestPresenter) iDcS17S0300000_13.l0).getMultiGuestDataHolder().LJJ;
            ((GameLinkGuestPresenter) iDcS17S0300000_13.l0).getMultiGuestDataHolder().getClass();
            twl.LJIIJ(0, str2, "anchor_manage", false);
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = (GameLinkGuestPresenter) iDcS17S0300000_13.l0;
        LinkListUser linkListUser = (LinkListUser) iDcS17S0300000_13.l1;
        boolean z = ((C34K) iDcS17S0300000_13.l2).element;
        if (z) {
            str = "check_click";
        } else {
            str = "click";
        }
        gameLinkGuestPresenter.reportLog(linkListUser, z, str, false);
    }

    public static final void LJIILLIIL$3(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        Integer num;
        C28268B7o c28268B7o = (C28268B7o) iDcS17S0300000_13.l0;
        if (c28268B7o != null) {
            num = Integer.valueOf(c28268B7o.LIZ);
        } else {
            num = null;
        }
        TWL.LJIIL(true, true, num);
        liveDialog.dismiss();
        ((GameLinkWidget) iDcS17S0300000_13.l1).exitInteractNormal((Runnable) iDcS17S0300000_13.l2, false);
    }

    public static final void LJIILLIIL$4(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        C74987Tbr.LIZJ("anchor_shared_bg", "show quick apply dialog, click cancel btn");
        liveDialog.dismiss();
        ((MultiGuestSharedBgAnchorViewModel) iDcS17S0300000_13.l0).kv0((Context) iDcS17S0300000_13.l1, (DataChannel) iDcS17S0300000_13.l2);
        C75285Tgf.LJ("grid_shared_panel_used", "cancel");
    }

    public static final void LJIILLIIL$5(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        C75642TmQ.LIZ.LJJJJL("disconnect", ((C34K) iDcS17S0300000_13.l0).element);
        B5G.LIZIZ().LJJIJL = true;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = ((C75848Tpk) iDcS17S0300000_13.l1).LIZIZ.LIZLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(((C34K) iDcS17S0300000_13.l2).element));
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$6(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C75093TdZ) iDcS17S0300000_13.l0).h0(((ZoomService) iDcS17S0300000_13.l1).LJIIIZ(), (LinkPlayerInfo) iDcS17S0300000_13.l2);
    }

    public static final void LJIILLIIL$7(IDcS17S0300000_13 iDcS17S0300000_13, LiveDialog liveDialog) {
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) iDcS17S0300000_13.l0, (Uri) iDcS17S0300000_13.l1);
        C76912UGm.LIZ("contact_us", (UI8) iDcS17S0300000_13.l2);
        liveDialog.dismiss();
    }

    public IDcS17S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
