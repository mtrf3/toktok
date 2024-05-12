package Y;

import X.B4M;
import X.BKY;
import X.C0NA;
import X.C0NB;
import X.C1P;
import X.C29182Bco;
import X.C29917Bof;
import X.C29919Boh;
import X.C30401BwT;
import X.C30402BwU;
import X.C65352Pkq;
import X.C73521StJ;
import X.C87277YNd;
import X.CN1;
import X.DialogC29865Bnp;
import X.InterfaceC30359Bvn;
import X.InterfaceC30405BwX;
import X.X1D;
import android.content.DialogInterface;
import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor.MultiGuestV3AnchorReservationWidget;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestResetIconRedDotNumInReservationEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.livesdk.PaidRoomChannel;
import com.bytedance.android.livesdk.broadcast.PerceptionDialogDismissedChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideDialogWidget;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.RemindFollowDialogVisibilityChannel;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestReservationRedDotFixSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public class IDDListenerS145S0100000_5 implements DialogInterface.OnDismissListener {
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
            default:
                return;
        }
    }

    public IDDListenerS145S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        C29182Bco.LIZ().LIZLLL();
        C30401BwT c30401BwT = (C30401BwT) iDDListenerS145S0100000_5.l0;
        InterfaceC30405BwX interfaceC30405BwX = c30401BwT.LIZJ;
        if (interfaceC30405BwX != null) {
            c30401BwT.LIZ.getLifecycle().removeObserver(interfaceC30405BwX);
        }
        C30401BwT c30401BwT2 = (C30401BwT) iDDListenerS145S0100000_5.l0;
        c30401BwT2.LIZJ = null;
        c30401BwT2.LIZLLL = false;
    }

    public static final void onDismiss$1(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        C29182Bco.LIZ().LIZLLL();
        C30402BwU c30402BwU = (C30402BwU) iDDListenerS145S0100000_5.l0;
        InterfaceC30405BwX interfaceC30405BwX = c30402BwU.LIZJ;
        if (interfaceC30405BwX != null) {
            c30402BwU.LIZ.getLifecycle().removeObserver(interfaceC30405BwX);
        }
        C30402BwU c30402BwU2 = (C30402BwU) iDDListenerS145S0100000_5.l0;
        c30402BwU2.LIZJ = null;
        c30402BwU2.LIZLLL = false;
    }

    public static final void onDismiss$10(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        DialogC29865Bnp dialogC29865Bnp = (DialogC29865Bnp) iDDListenerS145S0100000_5.l0;
        dialogC29865Bnp.getClass();
        BKY.LIZIZ().LJ();
        DialogInterface.OnDismissListener onDismissListener = dialogC29865Bnp.LJLJJI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogC29865Bnp);
        }
    }

    public static final void onDismiss$11(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRedEnvelopeDialogDismiss,datachannel==>");
        LIZ.append(((RedEnvelopeWidget) iDDListenerS145S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("RedEnvelopeWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((RedEnvelopeWidget) iDDListenerS145S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public static final void onDismiss$12(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        ((MultiGuestV3AnchorReservationWidget) iDDListenerS145S0100000_5.l0).LJLJI = null;
        if (MultiGuestReservationRedDotFixSetting.INSTANCE.isFix()) {
            DataChannel dataChannel = ((MultiGuestV3AnchorReservationWidget) iDDListenerS145S0100000_5.l0).dataChannel;
            if (dataChannel != null) {
                dataChannel.pv0(MultiGuestResetIconRedDotNumInReservationEvent.class);
                return;
            }
            return;
        }
        DataChannel dataChannel2 = ((MultiGuestV3AnchorReservationWidget) iDDListenerS145S0100000_5.l0).dataChannel;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.pv0(ResetRedDotNumEvent.class);
    }

    public static final void onDismiss$13(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        ((C73521StJ) iDDListenerS145S0100000_5.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$14(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        ((C73521StJ) iDDListenerS145S0100000_5.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$2(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        DataChannel dataChannel = ((MultiGuestV3GuestWidget) iDDListenerS145S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(MultiGuestVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void onDismiss$3(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        DataChannel dataChannel = ((FollowGuideDialogWidget) iDDListenerS145S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(RemindFollowDialogVisibilityChannel.class, Boolean.FALSE);
        }
        C29919Boh LIZ = C29917Bof.LIZ();
        LIZ.LIZIZ = false;
        LIZ.LIZLLL = null;
        LIZ.LIZIZ();
    }

    public static final void onDismiss$4(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        ((DataChannel) iDDListenerS145S0100000_5.l0).rv0(PaidRoomChannel.class, new B4M());
    }

    public static final void onDismiss$5(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        LIZ.append(((GoodyBagWidget) iDDListenerS145S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((GoodyBagWidget) iDDListenerS145S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public static final void onDismiss$6(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        LIZ.append(((GoodyBagWidget) iDDListenerS145S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((GoodyBagWidget) iDDListenerS145S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public static final void onDismiss$7(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        LIZ.append(((GoodyBagWidget) iDDListenerS145S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((GoodyBagWidget) iDDListenerS145S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public static final void onDismiss$8(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        DataChannel dataChannel = ((C1P) iDDListenerS145S0100000_5.l0).LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(PerceptionDialogDismissedChannel.class, Boolean.TRUE);
        }
    }

    public static final void onDismiss$9(IDDListenerS145S0100000_5 iDDListenerS145S0100000_5, DialogInterface dialogInterface) {
        InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(((PreviewBeautyWidget) iDDListenerS145S0100000_5.l0).dataChannel);
        if (LJIILIIL != null) {
            LJIILIIL.LIZ("beauty");
        }
        C0NA.LIZJ(C65352Pkq.LIZ(EffectDialogShowChannel.class));
    }
}
