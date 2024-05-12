package Y;

import X.AbstractC74727TUl;
import X.C0NB;
import X.C73318Sq2;
import X.C73411SrX;
import X.C74824TYe;
import X.C74838TYs;
import X.C75060Td2;
import X.C75457TjR;
import X.C76548U2m;
import X.C77900Uhk;
import X.DialogC78134UlW;
import X.InterfaceC31805Ce1;
import X.InterfaceC65784Pro;
import X.InterfaceC74834TYo;
import X.OCX;
import X.U3D;
import X.UHX;
import X.ViewOnClickListenerC75104Tdk;
import android.content.DialogInterface;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest.LiveShowGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.live.liveinteract.voicechat.main.anchor.VoiceChatAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.interceptor.FansRequiredInterceptor;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDDListenerS152S0100000_13 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            case 6:
                onDismiss$6(this, dialogInterface);
                return;
            case 7:
                onDismiss$7(this, dialogInterface);
                return;
            case 8:
                onDismiss$8(this, dialogInterface);
                return;
            case 9:
                onDismiss$9(this, dialogInterface);
                return;
            case 10:
                onDismiss$10(this, dialogInterface);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onDismiss$11(this, dialogInterface);
                return;
            case 12:
                onDismiss$12(this, dialogInterface);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onDismiss$13(this, dialogInterface);
                return;
            case 14:
                onDismiss$14(this, dialogInterface);
                return;
            case 15:
                onDismiss$15(this, dialogInterface);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onDismiss$16(this, dialogInterface);
                return;
            case 17:
                onDismiss$17(this, dialogInterface);
                return;
            case 18:
                onDismiss$18(this, dialogInterface);
                return;
            case 19:
                onDismiss$19(this, dialogInterface);
                return;
            case 20:
                onDismiss$20(this, dialogInterface);
                return;
            case 21:
                onDismiss$21(this, dialogInterface);
                return;
            case 22:
                onDismiss$22(this, dialogInterface);
                return;
            case 23:
                onDismiss$23(this, dialogInterface);
                return;
            case 24:
                onDismiss$24(this, dialogInterface);
                return;
            case 25:
                onDismiss$25(this, dialogInterface);
                return;
            case 26:
                onDismiss$26(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS152S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((MultiGuestV3AnchorWidget) iDDListenerS152S0100000_13.l0).LJLL = null;
    }

    public static final void onDismiss$1(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((MultiGuestV3GuestPresenter) iDDListenerS152S0100000_13.l0).guestBeInvitedDialog = null;
    }

    public static final void onDismiss$10(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((VoiceChatWatchWidget) iDDListenerS152S0100000_13.l0).LJLLLLLL = null;
    }

    public static final void onDismiss$11(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        InterfaceC74834TYo interfaceC74834TYo = ((FansRequiredInterceptor) iDDListenerS152S0100000_13.l0).LIZ;
        if (interfaceC74834TYo != null) {
            interfaceC74834TYo.Vi0(true);
        }
    }

    public static final void onDismiss$12(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDDListenerS152S0100000_13.l0).invoke();
    }

    public static final void onDismiss$13(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDDListenerS152S0100000_13.l0).invoke();
    }

    public static final void onDismiss$14(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((ViewOnClickListenerC75104Tdk) iDDListenerS152S0100000_13.l0).LJLZ = null;
    }

    public static final void onDismiss$15(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((DialogC78134UlW) iDDListenerS152S0100000_13.l0).LJZI.invoke();
    }

    public static final void onDismiss$16(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        MultiGuestV3AnchorWidget multiGuestV3AnchorWidget = (MultiGuestV3AnchorWidget) iDDListenerS152S0100000_13.l0;
        multiGuestV3AnchorWidget.LJLJI = null;
        DataChannel dataChannel = multiGuestV3AnchorWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(ResetRedDotNumEvent.class);
        }
    }

    public static final void onDismiss$17(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((C73318Sq2) ((UHX) iDDListenerS152S0100000_13.l0).LIZJ().LJLIL.LIZ.getValue()).dispose();
    }

    public static final void onDismiss$18(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((MultiLiveAnchorSettingDialog) iDDListenerS152S0100000_13.l0).LLILL = null;
    }

    public static final void onDismiss$19(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDDListenerS152S0100000_13.l0).invoke();
    }

    public static final void onDismiss$2(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((MultiGuestV3GuestWidget) iDDListenerS152S0100000_13.l0).gifterThresholdDialog = null;
    }

    public static final void onDismiss$20(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        DataChannel dataChannel = (DataChannel) iDDListenerS152S0100000_13.l0;
        if (dataChannel != null) {
            dataChannel.rv0(FastGiftVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void onDismiss$21(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((U3D) iDDListenerS152S0100000_13.l0).LLFII = null;
    }

    public static final void onDismiss$22(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((LiveShowAnchorWidget) iDDListenerS152S0100000_13.l0).LJLLL = null;
    }

    public static final void onDismiss$23(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((LiveShowAnchorWidget) iDDListenerS152S0100000_13.l0).LJLLLL = null;
    }

    public static final void onDismiss$24(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((LiveShowAudienceWidget) iDDListenerS152S0100000_13.l0).LJLLL = null;
    }

    public static final void onDismiss$25(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        VoiceChatAnchorWidget voiceChatAnchorWidget = (VoiceChatAnchorWidget) iDDListenerS152S0100000_13.l0;
        MultiGuestDataHolder multiGuestDataHolder = voiceChatAnchorWidget.dataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJIIZI = -1;
            voiceChatAnchorWidget.LJLJI = null;
            DataChannel dataChannel = voiceChatAnchorWidget.dataChannel;
            if (dataChannel != null) {
                dataChannel.pv0(ResetRedDotNumEvent.class);
                return;
            }
            return;
        }
        o.LJIJI("dataHolder");
        throw null;
    }

    public static final void onDismiss$26(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        C77900Uhk c77900Uhk = (C77900Uhk) iDDListenerS152S0100000_13.l0;
        c77900Uhk.LJJIIJ = false;
        OCX ocx = c77900Uhk.LJIILIIL;
        C73411SrX c73411SrX = ocx.LIZIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        ocx.LIZIZ = null;
        C73411SrX c73411SrX2 = ocx.LIZ;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        ocx.LIZ = null;
        C73411SrX c73411SrX3 = ocx.LIZJ;
        if (c73411SrX3 != null) {
            c73411SrX3.dispose();
        }
        ocx.LIZJ = null;
    }

    public static final void onDismiss$3(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((MultiGuestV3GuestWidget) iDDListenerS152S0100000_13.l0).newGoLivePreviewDialog = null;
    }

    public static final void onDismiss$4(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        InterfaceC74834TYo interfaceC74834TYo = ((com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor.FansRequiredInterceptor) iDDListenerS152S0100000_13.l0).LIZ;
        if (interfaceC74834TYo != null) {
            interfaceC74834TYo.Vi0(true);
        }
    }

    public static final void onDismiss$5(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((LiveShowAnchorWidget) iDDListenerS152S0100000_13.l0).LJLLLLLL = null;
        C76548U2m.LJFF = null;
        C76548U2m.LJI = new ArrayList();
    }

    public static final void onDismiss$6(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        ((LiveShowGuestWidget) iDDListenerS152S0100000_13.l0).LJLLL = null;
        C76548U2m.LIZIZ = false;
    }

    public static final void onDismiss$7(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = ((MultiLiveAsAnchorListDialogV2) iDDListenerS152S0100000_13.l0).LLJ.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$8(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        AbstractC74727TUl abstractC74727TUl;
        String LJ;
        String str;
        AbstractC74727TUl LIZ;
        Long LJIILIIL;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) iDDListenerS152S0100000_13.l0;
        multiLiveAsAnchorListDialogV2.getClass();
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "dialog onDismiss");
        String LJJJJ = multiLiveAsAnchorListDialogV2.LJJJJ();
        String str2 = multiLiveAsAnchorListDialogV2.LLILIL;
        InterfaceC31805Ce1 LJJJJJL = multiLiveAsAnchorListDialogV2.LJJJJJL();
        if (LJJJJJL != null) {
            abstractC74727TUl = LJJJJJL.LIZ();
        } else {
            abstractC74727TUl = null;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiLiveAsAnchorListDialogV2.LJJIZ().LJIIJ;
        if (multiLiveAsAnchorListDialogV2.LJJJJZ()) {
            LJ = "cohost";
        } else {
            LJ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        }
        C75060Td2 c75060Td2 = multiLiveAsAnchorListDialogV2.LLJIJIL;
        if (c75060Td2 == null || (str = Long.valueOf(c75060Td2.LJLILLLLZI).toString()) == null) {
            InterfaceC31805Ce1 LJJJJJL2 = multiLiveAsAnchorListDialogV2.LJJJJJL();
            if (LJJJJJL2 != null && (LIZ = LJJJJJL2.LIZ()) != null && (LJIILIIL = LIZ.LJIILIIL()) != null) {
                str = LJIILIIL.toString();
            } else {
                str = null;
            }
        }
        C74824TYe.LJIJ(LJJJJ, str2, abstractC74727TUl, multiLiveAnchorPanelSettings, LJ, 0, 0, str, 1, 0L, 0, multiLiveAsAnchorListDialogV2.LLILLIZIL, 1632);
        C73411SrX c73411SrX = multiLiveAsAnchorListDialogV2.LLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = multiLiveAsAnchorListDialogV2.LLJILLL;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        multiLiveAsAnchorListDialogV2.LLJI = null;
        multiLiveAsAnchorListDialogV2.LLJILLL = null;
    }

    public static final void onDismiss$9(IDDListenerS152S0100000_13 iDDListenerS152S0100000_13, DialogInterface dialogInterface) {
        VoiceChatAnchorWidget voiceChatAnchorWidget = (VoiceChatAnchorWidget) iDDListenerS152S0100000_13.l0;
        voiceChatAnchorWidget.LJLJI = null;
        DataChannel dataChannel = voiceChatAnchorWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(ResetRedDotNumEvent.class);
        }
    }
}
