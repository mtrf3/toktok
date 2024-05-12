package Y;

import X.BZI;
import X.C28787BRn;
import X.C68322mC;
import X.C74736TUu;
import X.C74746TVe;
import X.C74748TVg;
import X.C74751TVj;
import X.C74838TYs;
import X.C75024TcS;
import X.C75159Ted;
import X.C75192TfA;
import X.C76002TsE;
import X.C77443UaN;
import X.C8E;
import X.CN1;
import X.EnumC29309Ber;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.InterfaceC75441TjB;
import X.InterfaceC77442UaM;
import X.TQM;
import X.TQV;
import X.TT1;
import X.TT2;
import X.TYQ;
import X.UDJ;
import X.X1D;
import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.api.LinkMicAudienceCancelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatGoLiveFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3CancelApplyOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDCListenerS164S0100000_13 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            case 8:
                onClick$8(this, dialogInterface, i);
                return;
            case 9:
                onClick$9(this, dialogInterface, i);
                return;
            case 10:
                onClick$10(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, dialogInterface, i);
                return;
            case 12:
                onClick$12(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS164S0100000_13(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public IDCListenerS164S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialog, int i) {
        TQM tqm;
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        WeakReference<TQM> weakReference = ((MultiGuestUserInfoFragment) iDCListenerS164S0100000_13.l0).LLI;
        if (weakReference != null && (tqm = weakReference.get()) != null) {
            tqm.cancel("leave_source_user_click_cancel");
        }
        ((MultiGuestUserInfoFragment) iDCListenerS164S0100000_13.l0).Nl(0L, "click", false);
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((MultiGuestUserInfoFragment) iDCListenerS164S0100000_13.l0).Hl().LJJIJLIJ = -1;
        }
    }

    public static final void onClick$1(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialog, int i) {
        TQM tqm;
        o.LJIIIZ(dialog, "dialog");
        C74736TUu.LJIJ(1);
        dialog.dismiss();
        MultiGuestUserInfoFragment multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) iDCListenerS164S0100000_13.l0;
        multiGuestUserInfoFragment.getClass();
        multiGuestUserInfoFragment.LLILZ = "disconnect_icon";
        WeakReference<TQM> weakReference = ((MultiGuestUserInfoFragment) iDCListenerS164S0100000_13.l0).LLI;
        if (weakReference != null && (tqm = weakReference.get()) != null) {
            tqm.exitInteractInNormalWay("leave_normally", false, 10002);
        }
    }

    public static final void onClick$10(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialogInterface, int i) {
        InterfaceC77442UaM interfaceC77442UaM = (InterfaceC77442UaM) iDCListenerS164S0100000_13.l0;
        if (interfaceC77442UaM != null) {
            C77443UaN c77443UaN = (C77443UaN) interfaceC77442UaM;
            ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
            int i2 = c77443UaN.LIZIZ.source;
            if (i2 == 10 || i2 == 15) {
                BZI LIZ = C28787BRn.LIZ("livesdk_withdraw_exchange_cancel");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(c77443UaN.LIZIZ.exchangeLevel, "exchange_level");
                LIZ.LJIJJ(c77443UaN.LIZLLL.chargeReason(c77443UaN.LIZIZ), "charge_reason");
                LIZ.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
                LIZ.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
                LIZ.LJJIFFI(c77443UaN.LIZIZ.eventParams);
                LIZ.LJJIIJZLJL();
            } else {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_exchange_cancel");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(c77443UaN.LIZIZ.exchangeLevel, "exchange_level");
                LIZ2.LJIJJ(Long.valueOf(c77443UaN.LIZIZ.coinsCount), "exchange_coins");
                LIZ2.LJIJJ(c77443UaN.LIZLLL.requestPage(c77443UaN.LIZIZ), "request_page");
                LIZ2.LJIJJ(c77443UaN.LIZLLL.chargeReason(c77443UaN.LIZIZ), "charge_reason");
                LIZ2.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
                LIZ2.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
                LIZ2.LJJIFFI(c77443UaN.LIZIZ.eventParams);
                if (c77443UaN.LIZIZ.source == 0) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    if (dataChannelGlobal.mv0(BroadcastPageChannel.class) != null) {
                        LIZ2.LJIJJ(Integer.valueOf(!((EnumC29309Ber) dataChannelGlobal.mv0(BroadcastPageChannel.class)).isAudience() ? 1 : 0), "is_anchor");
                    }
                }
                LIZ2.LJJIIJZLJL();
            }
            c77443UaN.LIZLLL.finishResult(2);
        }
    }

    public static final void onClick$11(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialogInterface, int i) {
        InterfaceC30442Bx8.LLIILZL.LIZ(((C68322mC) iDCListenerS164S0100000_13.l0).element);
    }

    public static final void onClick$12(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialogInterface, int i) {
        TT2 tt2;
        TT1 tt1;
        GameLinkPreviewFragment gameLinkPreviewFragment = (GameLinkPreviewFragment) iDCListenerS164S0100000_13.l0;
        gameLinkPreviewFragment.getClass();
        dialogInterface.dismiss();
        C74748TVg c74748TVg = gameLinkPreviewFragment.LLIL;
        if (c74748TVg != null) {
            if (c74748TVg.LJI && (tt1 = c74748TVg.LJ) != null) {
                tt1.LIZIZ(10043, "leave_source_user_click_cancel_in_preview");
            } else if (c74748TVg.LJII && (tt2 = c74748TVg.LJFF) != null) {
                tt2.LIZIZ(10044, "leave_source_user_click_cancel_in_preview");
            }
            gameLinkPreviewFragment.LLIIIZ = true;
            gameLinkPreviewFragment.vl();
        }
        C74746TVe.LIZIZ("click", "end_now");
        LiveDialogFragment liveDialogFragment = gameLinkPreviewFragment.LJZI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
    }

    public static final void onClick$2(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialog, int i) {
        TQV tqv;
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        WeakReference<TQV> weakReference = ((VoiceChatUserInfoFragment) iDCListenerS164S0100000_13.l0).LJLLLLLL;
        if (weakReference != null && (tqv = weakReference.get()) != null && !tqv.LJLLLL && tqv.mView != 0) {
            tqv.LJLLLL = true;
            if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
                C74838TYs.LJ().LJJIIZ = true;
            }
            C75159Ted.LIZ.getClass();
            C75159Ted.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("position:cancel; roomId:");
            LIZ.append(tqv.LJLIL.getId());
            TYQ.LIZLLL("LinkIn_leave", X1D.LIZIZ(LIZ));
            C75192TfA.LJIILL(false);
            BizCancelApplyParams bizCancelApplyParams = new BizCancelApplyParams(tqv.LJLIL.getOwner().getId());
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null) {
                R6.LJJJJIZL(new C76002TsE(0L, 0L, bizCancelApplyParams, 23), new IDo0S413S0100000_13(tqv, 16));
            }
        }
        VoiceChatUserInfoFragment.Dl((VoiceChatUserInfoFragment) iDCListenerS164S0100000_13.l0, "click");
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((VoiceChatUserInfoFragment) iDCListenerS164S0100000_13.l0).xl().LJJIJLIJ = -1;
        }
    }

    public static final void onClick$3(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialog, int i) {
        TQV tqv;
        o.LJIIIZ(dialog, "dialog");
        C74736TUu.LJIJ(1);
        dialog.dismiss();
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = (VoiceChatUserInfoFragment) iDCListenerS164S0100000_13.l0;
        voiceChatUserInfoFragment.getClass();
        voiceChatUserInfoFragment.LLFFF = "disconnect_icon";
        WeakReference<TQV> weakReference = ((VoiceChatUserInfoFragment) iDCListenerS164S0100000_13.l0).LJLLLLLL;
        if (weakReference != null && (tqv = weakReference.get()) != null) {
            tqv.exitInteractInNormalWay("leave_normally", false, 10002);
        }
    }

    public static final void onClick$4(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDCListenerS164S0100000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onClick$5(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialogInterface, int i) {
        int i2;
        dialogInterface.dismiss();
        VoiceChatGoLiveFragment voiceChatGoLiveFragment = (VoiceChatGoLiveFragment) iDCListenerS164S0100000_13.l0;
        voiceChatGoLiveFragment.LJLJJL = false;
        TQV tqv = voiceChatGoLiveFragment.LJLJJI;
        if (tqv != null) {
            Integer num = voiceChatGoLiveFragment.LJLJI;
            if (num == null || num.intValue() != 1) {
                i2 = 10044;
            } else {
                i2 = 10043;
            }
            tqv.exitInteractInNormalWay("leave_source_user_click_cancel_in_preview", false, i2);
        }
        C74751TVj.LIZIZ("voice", "click", "end_now");
    }

    public static final void onClick$6(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDCListenerS164S0100000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onClick$7(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialog, int i) {
        MultiGuestDataHolder LIZ;
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        DataChannel dataChannel = ((C75024TcS) iDCListenerS164S0100000_13.l0).LJLJJI;
        if (dataChannel != null) {
            dataChannel.qv0(LinkMicAudienceCancelEvent.class, Boolean.TRUE);
        }
        ((C75024TcS) iDCListenerS164S0100000_13.l0).LIZIZ(0L, "click", false);
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue() && (LIZ = ((C75024TcS) iDCListenerS164S0100000_13.l0).LIZ()) != null) {
            LIZ.LJJIJLIJ = -1;
        }
    }

    public static final void onClick$8(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialogInterface, int i) {
        ((UDJ) iDCListenerS164S0100000_13.l0).execute();
    }

    public static final void onClick$9(IDCListenerS164S0100000_13 iDCListenerS164S0100000_13, DialogInterface dialogInterface, int i) {
        InterfaceC77442UaM interfaceC77442UaM = (InterfaceC77442UaM) iDCListenerS164S0100000_13.l0;
        if (interfaceC77442UaM != null) {
            ((C77443UaN) interfaceC77442UaM).LIZ();
        }
    }
}
