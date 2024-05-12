package Y;

import X.AbstractC73672Svk;
import X.B5O;
import X.B5P;
import X.B83;
import X.BA8;
import X.BAF;
import X.BAI;
import X.BFC;
import X.BHT;
import X.BTJ;
import X.BZI;
import X.C011602u;
import X.C03660Ck;
import X.C06490Nh;
import X.C0GA;
import X.C0K7;
import X.C0N7;
import X.C0NB;
import X.C10V;
import X.C1A;
import X.C1EW;
import X.C1I;
import X.C28400BCq;
import X.C28787BRn;
import X.C28857BUf;
import X.C29156BcO;
import X.C29182Bco;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29448Bh6;
import X.C30337BvR;
import X.C30922CBq;
import X.C31540CZk;
import X.C31803Cdz;
import X.C31804Ce0;
import X.C32289Clp;
import X.C32537Cpp;
import X.C41071jL;
import X.C48459J0d;
import X.C51029K0z;
import X.C65814PsI;
import X.C68322mC;
import X.C74751TVj;
import X.C74830TYk;
import X.C76800UCe;
import X.CC3;
import X.CC4;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.Q7L;
import android.text.TextUtils;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCancelWhenNotStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell;
import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestDisconnectByWindowEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.android.livesdk.dataChannel.DoSendMessageChannelEvent;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;
import com.bytedance.android.livesdk.qa.CloseQuestionEvent;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.userservice.BlockApi;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDcS170S0100000_5 implements C0K7 {
    public final int $t;
    public Object l0;

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
            case 12:
                LJIILLIIL$12(this, liveDialog);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILLIIL$13(this, liveDialog);
                return;
            case 14:
                LJIILLIIL$14(this, liveDialog);
                return;
            case 15:
                LJIILLIIL$15(this, liveDialog);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJIILLIIL$16(this, liveDialog);
                return;
            case 17:
                LJIILLIIL$17(this, liveDialog);
                return;
            case 18:
                LJIILLIIL$18(this, liveDialog);
                return;
            case 19:
                LJIILLIIL$19(this, liveDialog);
                return;
            case 20:
                LJIILLIIL$20(this, liveDialog);
                return;
            case 21:
                LJIILLIIL$21(this, liveDialog);
                return;
            case 22:
                LJIILLIIL$22(this, liveDialog);
                return;
            case 23:
                LJIILLIIL$23(this, liveDialog);
                return;
            case 24:
                LJIILLIIL$24(this, liveDialog);
                return;
            case 25:
                LJIILLIIL$25(this, liveDialog);
                return;
            case 26:
                LJIILLIIL$26(this, liveDialog);
                return;
            case 27:
                LJIILLIIL$27(this, liveDialog);
                return;
            case 28:
                LJIILLIIL$28(this, liveDialog);
                return;
            case 29:
                LJIILLIIL$29(this, liveDialog);
                return;
            case 30:
                LJIILLIIL$30(this, liveDialog);
                return;
            case 31:
                LJIILLIIL$31(this, liveDialog);
                return;
            case 32:
                LJIILLIIL$32(this, liveDialog);
                return;
            case 33:
                LJIILLIIL$33(this, liveDialog);
                return;
            case 34:
                LJIILLIIL$34(this, liveDialog);
                return;
            case 35:
                LJIILLIIL$35(this, liveDialog);
                return;
            case 36:
                LJIILLIIL$36(this, liveDialog);
                return;
            case 37:
                LJIILLIIL$37(this, liveDialog);
                return;
            case 38:
                LJIILLIIL$38(this, liveDialog);
                return;
            case 39:
                LJIILLIIL$39(this, liveDialog);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                LJIILLIIL$40(this, liveDialog);
                return;
            case 41:
                LJIILLIIL$41(this, liveDialog);
                return;
            case 42:
                LJIILLIIL$42(this, liveDialog);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                LJIILLIIL$43(this, liveDialog);
                return;
            case 44:
                LJIILLIIL$44(this, liveDialog);
                return;
            case 45:
                LJIILLIIL$45(this, liveDialog);
                return;
            case 46:
                LJIILLIIL$46(this, liveDialog);
                return;
            default:
                return;
        }
    }

    public IDcS170S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILLIIL$0(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) iDcS170S0100000_5.l0;
        liveBroadcastEndFragment.vl("click", "suggest_tab", liveBroadcastEndFragment.LJLJLJ, liveBroadcastEndFragment.LJLJL);
        LiveBroadcastEndFragment liveBroadcastEndFragment2 = (LiveBroadcastEndFragment) iDcS170S0100000_5.l0;
        PerceptionDialogInfo perceptionDialogInfo = liveBroadcastEndFragment2.LJLJL;
        if (perceptionDialogInfo == null || (str = perceptionDialogInfo.violationDetailUrl) == null || liveBroadcastEndFragment2.getContext() == null || str.length() <= 0) {
            str = null;
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((LiveBroadcastEndFragment) iDcS170S0100000_5.l0).getContext(), str);
    }

    public static final void LJIILLIIL$1(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) iDcS170S0100000_5.l0;
        liveBroadcastEndFragment.vl("click", "default_tab", liveBroadcastEndFragment.LJLJLJ, liveBroadcastEndFragment.LJLJL);
    }

    public static final void LJIILLIIL$10(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((GamePreparationFragment) iDcS170S0100000_5.l0).Jl();
    }

    public static final void LJIILLIIL$11(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        DataChannel dataChannel = ((GameLinkWidget) iDcS170S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GuestDisconnectByWindowEvent.class, new OSZ("others", 10002));
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$12(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = ((GameLinkWidget) iDcS170S0100000_5.l0).getMtDefaultLowAgeReportUrl();
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((GameLinkWidget) iDcS170S0100000_5.l0).context, value);
        if (B83.LIZ().LIZIZ() != null) {
            HashMap hashMap = new HashMap();
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "user_id");
            BZI LIZ = C28787BRn.LIZ("livesdk_user_click_contact_us");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIILLIIL(((GameLinkWidget) iDcS170S0100000_5.l0).dataChannel);
            LIZ.LJJIIJZLJL();
        }
        HashMap LIZJ = C03660Ck.LIZJ("choose_type", "contact_us");
        BZI LIZ2 = C28787BRn.LIZ("guest_connection_underage_popup");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(LIZJ);
        LIZ2.LIZJ("click");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIILLIIL$13(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        AbsPollWidget absPollWidget = (AbsPollWidget) iDcS170S0100000_5.l0;
        DataChannel dataChannel = absPollWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(CloseQuestionEvent.class, new AqS171S0100000_5(absPollWidget, 454));
        }
        ((AbsPollWidget) iDcS170S0100000_5.l0).LLF("confirm");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$14(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((AbsPollWidget) iDcS170S0100000_5.l0).LLF("cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$15(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((ModeratorHostIModeratorListFragment) iDcS170S0100000_5.l0).vl("cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$16(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDcS170S0100000_5.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LJIILLIIL$17(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        MultiGuestUserCardCell multiGuestUserCardCell = (MultiGuestUserCardCell) iDcS170S0100000_5.l0;
        User user = multiGuestUserCardCell.LJLL;
        if (user == null) {
            return;
        }
        C74830TYk.LJIIIIZZ(user.getId(), "user_profile");
        if (multiGuestUserCardCell.LJLIL.LIZJ.LIZ()) {
            multiGuestUserCardCell.LJLILLLLZI.qv0(LinkInRoomAnchorKickOutGuestEvent.class, new C31804Ce0(user));
        } else {
            multiGuestUserCardCell.LJLILLLLZI.qv0(MultiGuestModeratorKickOutGuestEvent.class, new C31803Cdz(user, "kickout_with_profile_for_admin"));
        }
        multiGuestUserCardCell.LJLIL.LIZLLL.dismiss();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Integer, O] */
    public static final void LJIILLIIL$18(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        long j;
        Long LJJ = BAF.LJJ(((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel);
        if (LJJ != null) {
            j = LJJ.longValue();
        } else {
            j = 0;
        }
        if (j > 0 || C0GA.LIZIZ(((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel)) {
            if (C0GA.LIZIZ(((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel)) {
                Fragment fragment = ((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).LJLIL;
                BA8 callback = BA8.LJLIL;
                o.LJIIIZ(callback, "callback");
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(fragment);
                if (LJIILIIL == null) {
                    callback.invoke(Boolean.FALSE);
                } else {
                    Long LJJ2 = BAF.LJJ(LJIILIIL);
                    if (LJJ2 != null) {
                        long longValue = LJJ2.longValue();
                        C1EW.LIZ(((DrawGuessApi) C1A.LIZJ(DrawGuessApi.class)).exitDrawGuessGame(C29306Beo.LJJIZ(LJIILIIL), longValue, longValue, "")).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new AfS54S0200000_5(callback, LJIILIIL, 31), new AfS57S0100000_5(callback, 207));
                    } else {
                        callback.invoke(Boolean.FALSE);
                    }
                }
            } else {
                DataChannel dataChannel = ((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel;
                if (dataChannel != null) {
                    ((C32537Cpp) dataChannel.gv0(C28400BCq.class)).LIZ = 4;
                }
                BAF.LJIL(((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel);
            }
        } else {
            ((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel.rv0(DrawGuessIsCountingDownRoundStart.class, Boolean.FALSE);
            ((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel.pv0(DrawGuessCancelWhenNotStartEvent.class);
            BAF.LJIILJJIL(((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel, "", true);
        }
        BAI.LIZJ(((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel, "confirm");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$19(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        BAI.LIZJ(((DrawGuessToolbarWidget) iDcS170S0100000_5.l0).dataChannel, "cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$2(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) iDcS170S0100000_5.l0;
        liveBroadcastEndFragment.vl("click", "default_tab", liveBroadcastEndFragment.LJLJLJ, liveBroadcastEndFragment.LJLJL);
    }

    public static final void LJIILLIIL$20(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS170S0100000_5.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$21(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS170S0100000_5.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$22(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Runnable) iDcS170S0100000_5.l0).run();
    }

    public static final void LJIILLIIL$23(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Runnable) iDcS170S0100000_5.l0).run();
    }

    public static final void LJIILLIIL$24(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((LiveMicRoomInfoDialog) iDcS170S0100000_5.l0).LJLZ = false;
        liveDialog.dismiss();
        LiveMicRoomInfoDialog liveMicRoomInfoDialog = (LiveMicRoomInfoDialog) iDcS170S0100000_5.l0;
        User user = liveMicRoomInfoDialog.LJZ;
        if (user != null) {
            liveMicRoomInfoDialog.Dl(user);
        }
        ((LiveMicRoomInfoDialog) iDcS170S0100000_5.l0).LJLZ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILLIIL$25(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C74751TVj.LIZIZ((String) ((C68322mC) iDcS170S0100000_5.l0).element, "click", "cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$26(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        AskQuestionDialog askQuestionDialog = (AskQuestionDialog) iDcS170S0100000_5.l0;
        askQuestionDialog.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_qa_deny_popup_click");
        LIZ.LJIILLIIL(askQuestionDialog.dataChannel);
        LIZ.LJIJJ("cancel", "choose_type");
        LIZ.LJJIFFI(askQuestionDialog.vl());
        LIZ.LJJIIJZLJL();
        liveDialog.dismiss();
        askQuestionDialog._$_findCachedViewById(R.id.ijh).postDelayed(new ARunnableS41S0100000_5(askQuestionDialog, 259), 200L);
    }

    public static final void LJIILLIIL$27(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        AskQuestionDialog askQuestionDialog = (AskQuestionDialog) iDcS170S0100000_5.l0;
        askQuestionDialog.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_qa_deny_popup_click");
        LIZ.LJIILLIIL(askQuestionDialog.dataChannel);
        LIZ.LJIJJ("to_comment", "choose_type");
        LIZ.LJJIFFI(askQuestionDialog.vl());
        LIZ.LJJIIJZLJL();
        DataChannel dataChannel = askQuestionDialog.dataChannel;
        if (dataChannel != null) {
            C28857BUf c28857BUf = new C28857BUf(askQuestionDialog.wl());
            c28857BUf.LIZIZ = ISendCommentEvent.Sender.QA;
            dataChannel.qv0(DoSendMessageChannelEvent.class, c28857BUf);
        }
        liveDialog.dismiss();
        askQuestionDialog.dismiss();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = askQuestionDialog.LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LJIILLIIL$28(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C41071jL c41071jL = ((SubOnlyLiveSettingFragment) iDcS170S0100000_5.l0).LJLL;
        if (c41071jL != null) {
            c41071jL.setChecked(true);
        }
        liveDialog.dismiss();
        InterfaceC30442Bx8.I3.LIZJ(Boolean.TRUE);
    }

    public static final void LJIILLIIL$29(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C41071jL c41071jL = ((SubOnlyLiveSettingFragment) iDcS170S0100000_5.l0).LJLJLJ;
        if (c41071jL != null) {
            c41071jL.setChecked(true);
        }
        InterfaceC30442Bx8.U2.LIZJ(Boolean.TRUE);
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_longer_preview_popup_click");
        LIZ.LJIJJ(((SubOnlyLiveSettingFragment) iDcS170S0100000_5.l0).vl(), "anchor_id");
        C06490Nh.LIZLLL(LIZ, ((SubOnlyLiveSettingFragment) iDcS170S0100000_5.l0).LJLLJ, "click_position", "confirm", "click_type");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$3(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C1I.LIZ.LIZ(1, new AqS167S0100000_1((InterfaceC65784Pro) iDcS170S0100000_5.l0, (InterfaceC65784Pro<C76800UCe>) 7));
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$30(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C41071jL c41071jL = ((SubOnlyLiveSettingFragment) iDcS170S0100000_5.l0).LJLJLJ;
        if (c41071jL != null) {
            c41071jL.setChecked(false);
        }
        InterfaceC30442Bx8.U2.LIZJ(Boolean.FALSE);
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_longer_preview_popup_click");
        LIZ.LJIJJ(((SubOnlyLiveSettingFragment) iDcS170S0100000_5.l0).vl(), "anchor_id");
        C06490Nh.LIZLLL(LIZ, ((SubOnlyLiveSettingFragment) iDcS170S0100000_5.l0).LJLLJ, "click_position", "opt_out", "click_type");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$31(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ModeratorPermissionEditFragment moderatorPermissionEditFragment = (ModeratorPermissionEditFragment) iDcS170S0100000_5.l0;
        if (moderatorPermissionEditFragment.isAdded()) {
            AdminApi adminApi = (AdminApi) C1A.LIZJ(AdminApi.class);
            BFC bfc = moderatorPermissionEditFragment.LJLIL;
            if (bfc != null) {
                C1EW.LIZ(adminApi.updateAdmin(2, bfc.LIZ, moderatorPermissionEditFragment.LJLJI, ((Number) moderatorPermissionEditFragment.LJLJJL.getValue()).longValue()).LJII(BTJ.LIZIZ(moderatorPermissionEditFragment))).LJJJLIIL(new AfS57S0100000_5(moderatorPermissionEditFragment, 276), B5P.LJLIL);
            } else {
                o.LJIJI("targetUser");
                throw null;
            }
        }
        ((ModeratorPermissionEditFragment) iDcS170S0100000_5.l0).Il("click_remove");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$32(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((ModeratorPermissionEditFragment) iDcS170S0100000_5.l0).Il("click_cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$33(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet = (ModeratorPermissionEditFragmentSheet) iDcS170S0100000_5.l0;
        if (moderatorPermissionEditFragmentSheet.isAdded()) {
            AdminApi adminApi = (AdminApi) C1A.LIZJ(AdminApi.class);
            BFC bfc = moderatorPermissionEditFragmentSheet.LLD;
            if (bfc != null) {
                C1EW.LIZ(adminApi.updateAdmin(2, bfc.LIZ, moderatorPermissionEditFragmentSheet.LLFF, ((Number) moderatorPermissionEditFragmentSheet.LLFII.getValue()).longValue()).LJII(BTJ.LIZIZ(moderatorPermissionEditFragmentSheet))).LJJJLIIL(new AfS57S0100000_5(moderatorPermissionEditFragmentSheet, 274), B5O.LJLIL);
            } else {
                o.LJIJI("targetUser");
                throw null;
            }
        }
        ((ModeratorPermissionEditFragmentSheet) iDcS170S0100000_5.l0).Sl("click_remove");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$34(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((ModeratorPermissionEditFragmentSheet) iDcS170S0100000_5.l0).Sl("click_cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$35(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C1I.LIZ.LIZ(1, new AqS167S0100000_1((InterfaceC65784Pro) iDcS170S0100000_5.l0, (InterfaceC65784Pro<C76800UCe>) 367));
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$36(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        CC3.LIZIZ(((AbsPollWidget) iDcS170S0100000_5.l0).dataChannel, CC4.LIZ, 0);
    }

    public static final void LJIILLIIL$37(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        ((IActionHandlerService) ((C32289Clp) iDcS170S0100000_5.l0).LIZJ.getValue()).handle(((C32289Clp) iDcS170S0100000_5.l0).LIZ, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ffe_tiktok_common%2Ffaq%2Ffeedback%2F%3Fhide_nav_bar%3D1%26feedback_id%3D13012%26error_code%3D4005192&hide_nav_bar=1&use_forest=1&trans_status_bar=0");
    }

    public static final void LJIILLIIL$38(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        String str;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.k1;
        c48459J0d.LIZ(Boolean.FALSE);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_caption_off_popup");
        LIZ.LJIIZILJ();
        Map<String, String> vl = ((BasePreviewSettingMainFragment) iDcS170S0100000_5.l0).vl();
        ((HashMap) vl).put("action_type", "turn_off");
        LIZ.LJJIFFI(vl);
        LIZ.LJJIIJZLJL();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_caption_icon_change");
        LIZ2.LJIIZILJ();
        Map<String, String> vl2 = ((BasePreviewSettingMainFragment) iDcS170S0100000_5.l0).vl();
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
        if (LIZJ.booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        ((HashMap) vl2).put("to_status", str);
        LIZ2.LJJIFFI(vl2);
        LIZ2.LIZJ("show");
        LIZ2.LJJIIJZLJL();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$39(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) iDcS170S0100000_5.l0;
        basePreviewSettingMainFragment.LJLJL = true;
        C011602u c011602u = (C011602u) basePreviewSettingMainFragment._$_findCachedViewById(R.id.b54);
        Boolean LIZJ = InterfaceC30442Bx8.k1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
        c011602u.setChecked(LIZJ.booleanValue());
        liveDialog.dismiss();
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_caption_off_popup");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(((BasePreviewSettingMainFragment) iDcS170S0100000_5.l0).vl());
        LIZ.LIZJ("cancel");
        LIZ.LJJIIJZLJL();
    }

    public static final void LJIILLIIL$4(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C29182Bco.LIZ().LIZLLL();
        C30337BvR.LIZ((DataChannel) iDcS170S0100000_5.l0, "confirm");
    }

    public static final void LJIILLIIL$40(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        String str;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.k1;
        c48459J0d.LIZ(Boolean.FALSE);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_caption_off_popup");
        LIZ.LJIIZILJ();
        Map<String, String> Nl = ((BasePreviewSettingMainFragmentSheet) iDcS170S0100000_5.l0).Nl();
        ((HashMap) Nl).put("action_type", "turn_off");
        LIZ.LJJIFFI(Nl);
        LIZ.LJJIIJZLJL();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_caption_icon_change");
        LIZ2.LJIIZILJ();
        Map<String, String> Nl2 = ((BasePreviewSettingMainFragmentSheet) iDcS170S0100000_5.l0).Nl();
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
        if (LIZJ.booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        ((HashMap) Nl2).put("to_status", str);
        LIZ2.LJJIFFI(Nl2);
        LIZ2.LIZJ("show");
        LIZ2.LJJIIJZLJL();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$41(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = (BasePreviewSettingMainFragmentSheet) iDcS170S0100000_5.l0;
        basePreviewSettingMainFragmentSheet.LLFZ = true;
        C011602u c011602u = (C011602u) basePreviewSettingMainFragmentSheet._$_findCachedViewById(R.id.b54);
        Boolean LIZJ = InterfaceC30442Bx8.k1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
        c011602u.setChecked(LIZJ.booleanValue());
        liveDialog.dismiss();
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_caption_off_popup");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(((BasePreviewSettingMainFragmentSheet) iDcS170S0100000_5.l0).Nl());
        LIZ.LIZJ("cancel");
        LIZ.LJJIIJZLJL();
    }

    public static final void LJIILLIIL$42(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        long j;
        long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        StarCommentPaymentDialog starCommentPaymentDialog = (StarCommentPaymentDialog) iDcS170S0100000_5.l0;
        C31540CZk c31540CZk = starCommentPaymentDialog.LJLJJI;
        long j2 = 0;
        if (c31540CZk != null) {
            j = c31540CZk.LIZ;
        } else {
            j = 0;
        }
        long j3 = j - LIZ;
        if (c31540CZk != null) {
            j2 = c31540CZk.LIZ;
        }
        if (starCommentPaymentDialog.Ll(j3, j2)) {
            liveDialog.dismiss();
        } else {
            ((StarCommentPaymentDialog) iDcS170S0100000_5.l0).Dl(0);
            liveDialog.dismiss();
        }
    }

    public static final void LJIILLIIL$43(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        TimerDetail timerDetail;
        Long l;
        long j;
        User owner;
        SubscribeInfo subscribeInfo;
        TimerDetail timerDetail2;
        User owner2;
        User owner3;
        SubscribeInfo subscribeInfo2;
        SubscribeTimeStickerWidget subscribeTimeStickerWidget = (SubscribeTimeStickerWidget) iDcS170S0100000_5.l0;
        Room room = subscribeTimeStickerWidget.LJLJJL;
        Long l2 = null;
        if (room != null && (owner3 = room.getOwner()) != null && (subscribeInfo2 = owner3.getSubscribeInfo()) != null) {
            timerDetail = subscribeInfo2.timerDetail;
        } else {
            timerDetail = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subathon_indicator_delete_confirm");
        Room room2 = subscribeTimeStickerWidget.LJLJJL;
        if (room2 != null && (owner2 = room2.getOwner()) != null) {
            l = Long.valueOf(owner2.getId());
        } else {
            l = null;
        }
        LIZ.LJ(l);
        subscribeTimeStickerWidget.LLFZ(LIZ, timerDetail);
        if (timerDetail != null) {
            l2 = Long.valueOf(timerDetail.timeIncreasePerSubS);
        }
        LIZ.LJIJJ(l2, "subathon_rules");
        int i = 0;
        if (timerDetail != null && timerDetail.subCount > 0) {
            i = 1;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "is_new_subscribers");
        subscribeTimeStickerWidget.LLFII(LIZ, timerDetail);
        LIZ.LJJIIJZLJL();
        C65814PsI.LIZ().getClass();
        SubscribeApi subscribeApi = (SubscribeApi) C65814PsI.LIZJ(SubscribeApi.class);
        Room room3 = ((SubscribeTimeStickerWidget) iDcS170S0100000_5.l0).LJLJJL;
        long j2 = 0;
        if (room3 != null && (owner = room3.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && (timerDetail2 = subscribeInfo.timerDetail) != null) {
            j = timerDetail2.timerId;
        } else {
            j = 0;
        }
        Room room4 = ((SubscribeTimeStickerWidget) iDcS170S0100000_5.l0).LJLJJL;
        if (room4 != null) {
            j2 = room4.getId();
        }
        C1EW.LIZ(subscribeApi.updateSubathonTimerStatus(2, j, 3, Long.valueOf(j2))).LJJJLIIL(new AfS57S0100000_5((SubscribeTimeStickerWidget) iDcS170S0100000_5.l0, 340), new InterfaceC64592gB() { // from class: X.2jQ
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onStickerDelete api error: ");
                LIZ2.append(((Throwable) obj).getMessage());
                C0NB.LJ("SubscribeTimeStickerWidget", X1D.LIZIZ(LIZ2));
            }
        });
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$44(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C29156BcO.LIZ((DataChannel) iDcS170S0100000_5.l0, "not_now");
    }

    public static final void LJIILLIIL$45(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        BlockApi blockApi = (BlockApi) Q7L.LIZIZ(BlockApi.class);
        long id = ((C29448Bh6) iDcS170S0100000_5.l0).LIZIZ.getId();
        String secUid = ((C29448Bh6) iDcS170S0100000_5.l0).LIZIZ.getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        AbstractC73672Svk LIZ = C1EW.LIZ(blockApi.unblock(4, id, secUid));
        C29448Bh6 c29448Bh6 = (C29448Bh6) iDcS170S0100000_5.l0;
        LIZ.LJJJLIIL(new AfS57S0100000_5(c29448Bh6, LiveChatShowDelayForHotLiveSetting.DEFAULT), new AfS57S0100000_5(c29448Bh6, 401));
        liveDialog.dismiss();
        ((C29448Bh6) iDcS170S0100000_5.l0).LIZLLL("unblock");
    }

    public static final void LJIILLIIL$46(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C29448Bh6) iDcS170S0100000_5.l0).LIZLLL("cancel");
    }

    public static final void LJIILLIIL$5(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C0N7.LJIILIIL((DataChannel) iDcS170S0100000_5.l0, "cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$6(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        C0N7.LJIL((DataChannel) iDcS170S0100000_5.l0, "cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$7(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) iDcS170S0100000_5.l0;
        liveRoomUserInfoWidget.LLJILJIL = false;
        liveDialog.dismiss();
        liveRoomUserInfoWidget.LLILLIZIL();
        liveRoomUserInfoWidget.LLJILJIL = true;
    }

    public static final void LJIILLIIL$8(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        boolean z;
        boolean z2;
        IBcToggleService LIZ = BHT.LIZ();
        CommercialContentToggle commercialContentToggle = new CommercialContentToggle();
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet = (LiveCommercialContentToggleFragmentSheet) iDcS170S0100000_5.l0;
        CompoundButton compoundButton = (CompoundButton) liveCommercialContentToggleFragmentSheet._$_findCachedViewById(R.id.boy);
        boolean z3 = false;
        if (compoundButton != null) {
            z = compoundButton.isChecked();
        } else {
            z = false;
        }
        commercialContentToggle.openCommercialContentToggle = z;
        CompoundButton compoundButton2 = (CompoundButton) liveCommercialContentToggleFragmentSheet._$_findCachedViewById(R.id.asl);
        if (compoundButton2 != null) {
            z2 = compoundButton2.isChecked();
        } else {
            z2 = false;
        }
        commercialContentToggle.promoteMyself = z2;
        CompoundButton compoundButton3 = (CompoundButton) liveCommercialContentToggleFragmentSheet._$_findCachedViewById(R.id.asc);
        if (compoundButton3 != null) {
            z3 = compoundButton3.isChecked();
        }
        commercialContentToggle.promoteThirdParty = z3;
        LIZ.DL(commercialContentToggle);
        liveDialog.dismiss();
        ((LiveCommercialContentToggleFragmentSheet) iDcS170S0100000_5.l0).close();
    }

    public static final void LJIILLIIL$9(IDcS170S0100000_5 iDcS170S0100000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((GamePreparationFragment) iDcS170S0100000_5.l0).Gl("confirm");
        GamePreparationFragment gamePreparationFragment = (GamePreparationFragment) iDcS170S0100000_5.l0;
        gamePreparationFragment.getClass();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationFragmentTag", "cancel all countdown.");
        }
        gamePreparationFragment.LJLLILLLL = false;
        gamePreparationFragment.LJLLI.LIZLLL();
        C10V c10v = ((GamePreparationFragment) iDcS170S0100000_5.l0).LJLLL;
        if (c10v != null) {
            c10v.c6(true);
        } else {
            o.LJIJI("gameBroadcastFragment");
            throw null;
        }
    }
}
