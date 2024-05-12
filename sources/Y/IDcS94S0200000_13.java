package Y;

import X.BZI;
import X.C0K7;
import X.C31803Cdz;
import X.C34K;
import X.C74736TUu;
import X.C74824TYe;
import X.C74830TYk;
import X.C75954TrS;
import X.C75955TrT;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.TZ8;
import X.U2L;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest.MultiGuestV3GuestReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.guest.VoiceChatGuestUserInfoDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.CustomizedPerksCardWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubGoalCardWidget;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDcS94S0200000_13 implements C0K7 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 8:
                LJIILLIIL$8(this, liveDialog);
                return;
            case 9:
                LJIILLIIL$9(this, liveDialog);
                return;
            case 10:
                LJIILLIIL$10(this, liveDialog);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILLIIL$11(this, liveDialog);
                return;
            default:
                return;
        }
    }

    public static final void LJIILLIIL$0(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        C74736TUu.LJIIZILJ(1);
        liveDialog.dismiss();
        DataChannel dataChannel = ((MultiGuestAsGuestModeratorManageDialog) iDcS94S0200000_13.l0).LJLJI;
        if (dataChannel != null) {
            dataChannel.qv0(MultiGuestModeratorKickOutGuestEvent.class, new C31803Cdz((User) iDcS94S0200000_13.l1, "kickout_with_popup_confirm_for_admin"));
        }
    }

    public static final void LJIILLIIL$1(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        C74736TUu.LJIIZILJ(1);
        liveDialog.dismiss();
        C74830TYk.LJIIIIZZ(((User) iDcS94S0200000_13.l0).getId(), "go_live_panel");
        TZ8 tz8 = ((MultiLiveAsAnchorListDialogV2) iDcS94S0200000_13.l1).LJLJJI;
        if (tz8 != null) {
            long id = ((User) iDcS94S0200000_13.l0).getId();
            String secUid = ((User) iDcS94S0200000_13.l0).getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            tz8.LJJJJJL(id, secUid, "kickout_with_popup_confirm");
        }
    }

    public static final void LJIILLIIL$10(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C75954TrS) iDcS94S0200000_13.l0).LIZIZ.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        InterfaceC30442Bx8.LLJI.LIZ(Boolean.valueOf(((C34K) iDcS94S0200000_13.l1).element));
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$11(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C75955TrT) iDcS94S0200000_13.l0).LIZIZ.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        InterfaceC30442Bx8.LLJ.LIZ(Boolean.valueOf(((C34K) iDcS94S0200000_13.l1).element));
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$2(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((GameLinkWidget) iDcS94S0200000_13.l0).exitInteractNormal((Runnable) iDcS94S0200000_13.l1, false);
    }

    public static final void LJIILLIIL$3(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        if (((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).zt()) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Tc0(new AqS179S0100000_13((CustomizedPerksCardWidget) iDcS94S0200000_13.l0, 327));
        } else {
            ((CustomizedPerksCardWidget) iDcS94S0200000_13.l0).LL(true);
        }
        liveDialog.dismiss();
        BZI bzi = (BZI) iDcS94S0200000_13.l1;
        String lowerCase = ((CustomizedPerksCardWidget) iDcS94S0200000_13.l0).LJLJJLL.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        bzi.LJIJJ(lowerCase, "original_card_type");
        bzi.LJIJJ("confirm", "click_type");
        bzi.LJJIIJZLJL();
    }

    public static final void LJIILLIIL$4(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        ((CustomizedPerksCardWidget) iDcS94S0200000_13.l0).LL(false);
        liveDialog.dismiss();
        BZI bzi = (BZI) iDcS94S0200000_13.l1;
        bzi.LJIJJ("cancel", "click_type");
        bzi.LJJIIJZLJL();
    }

    public static final void LJIILLIIL$5(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        if (((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).zt()) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Tc0(new AqS179S0100000_13((SubGoalCardWidget) iDcS94S0200000_13.l0, 328));
        } else {
            ((SubGoalCardWidget) iDcS94S0200000_13.l0).LL(true);
        }
        liveDialog.dismiss();
        BZI bzi = (BZI) iDcS94S0200000_13.l1;
        String lowerCase = ((SubGoalCardWidget) iDcS94S0200000_13.l0).LJLJJLL.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        bzi.LJIJJ(lowerCase, "original_card_type");
        bzi.LJIJJ("confirm", "click_type");
        bzi.LJJIIJZLJL();
    }

    public static final void LJIILLIIL$6(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        ((SubGoalCardWidget) iDcS94S0200000_13.l0).LL(false);
        liveDialog.dismiss();
        BZI bzi = (BZI) iDcS94S0200000_13.l1;
        bzi.LJIJJ("cancel", "click_type");
        bzi.LJJIIJZLJL();
    }

    public static final void LJIILLIIL$7(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        C74824TYe.LJJJ(true, ((C34K) iDcS94S0200000_13.l0).element);
        InterfaceC30442Bx8.A0.LIZ(Boolean.valueOf(((C34K) iDcS94S0200000_13.l0).element));
        VoiceChatWatchWidget voiceChatWatchWidget = (VoiceChatWatchWidget) iDcS94S0200000_13.l1;
        if (voiceChatWatchWidget.LJLJLLL == null) {
            voiceChatWatchWidget.buildDialog();
        }
        VoiceChatWatchWidget voiceChatWatchWidget2 = (VoiceChatWatchWidget) iDcS94S0200000_13.l1;
        if (voiceChatWatchWidget2.LJLJLLL != null && voiceChatWatchWidget2.getContext() != null) {
            VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog = ((VoiceChatWatchWidget) iDcS94S0200000_13.l1).LJLJLLL;
            VoiceChatUserInfoFragment voiceChatUserInfoFragment = null;
            if (voiceChatGuestUserInfoDialog != null) {
                voiceChatUserInfoFragment = voiceChatGuestUserInfoDialog.vl();
            }
            if ((voiceChatUserInfoFragment instanceof VoiceChatUserInfoFragment) && voiceChatUserInfoFragment != null) {
                Context context = ((VoiceChatWatchWidget) iDcS94S0200000_13.l1).getContext();
                o.LJIIIIZZ(context, "getContext()");
                voiceChatUserInfoFragment.Al(context);
            }
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$8(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        String str;
        if (((C34K) iDcS94S0200000_13.l0).element) {
            InterfaceC30442Bx8.LLZLLIL.LIZ(Boolean.FALSE);
        }
        Gift gift = ((U2L) iDcS94S0200000_13.l1).LJLLJ;
        if (gift == null || (str = Long.valueOf(gift.id).toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        U2L u2l = (U2L) iDcS94S0200000_13.l1;
        C74824TYe.LJLJI(str, String.valueOf(u2l.LJLJJI - u2l.LJLJI), "send", "second");
        ((U2L) iDcS94S0200000_13.l1).LJJIIJZLJL();
        liveDialog.dismiss();
        ((U2L) iDcS94S0200000_13.l1).dismiss();
    }

    public static final void LJIILLIIL$9(IDcS94S0200000_13 iDcS94S0200000_13, LiveDialog liveDialog) {
        MultiGuestUserInfoFragment multiGuestUserInfoFragment;
        InterfaceC30442Bx8.A0.LIZ(Boolean.valueOf(((C34K) iDcS94S0200000_13.l0).element));
        MultiGuestV3GuestReservationWidget multiGuestV3GuestReservationWidget = (MultiGuestV3GuestReservationWidget) iDcS94S0200000_13.l1;
        if (multiGuestV3GuestReservationWidget.LJLJI == null) {
            multiGuestV3GuestReservationWidget.buildDialog();
        }
        MultiGuestV3GuestReservationWidget multiGuestV3GuestReservationWidget2 = (MultiGuestV3GuestReservationWidget) iDcS94S0200000_13.l1;
        if (multiGuestV3GuestReservationWidget2.LJLJI != null && multiGuestV3GuestReservationWidget2.getContext() != null) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = ((MultiGuestV3GuestReservationWidget) iDcS94S0200000_13.l1).LJLJI;
            Fragment fragment = null;
            if (multiLiveGuestUserInfoDialog != null) {
                fragment = multiLiveGuestUserInfoDialog.wl();
            }
            if ((fragment instanceof MultiGuestUserInfoFragment) && (multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) fragment) != null) {
                Context context = ((MultiGuestV3GuestReservationWidget) iDcS94S0200000_13.l1).getContext();
                o.LJIIIIZZ(context, "getContext()");
                multiGuestUserInfoFragment.Il(context);
            }
        }
        liveDialog.dismiss();
    }

    public IDcS94S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
