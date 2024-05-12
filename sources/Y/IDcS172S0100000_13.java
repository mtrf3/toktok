package Y;

import X.AbstractC73638SvC;
import X.AbstractC74727TUl;
import X.ActivityC45651qj;
import X.B83;
import X.C03880Dg;
import X.C0H1;
import X.C0K7;
import X.C16880lQ;
import X.C276516r;
import X.C28268B7o;
import X.C28467BFf;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C30554Byw;
import X.C34K;
import X.C41051jJ;
import X.C48459J0d;
import X.C62819Ol5;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C74631TQt;
import X.C74746TVe;
import X.C74824TYe;
import X.C74830TYk;
import X.C74890TaI;
import X.C74913Taf;
import X.C74947TbD;
import X.C74960TbQ;
import X.C74979Tbj;
import X.C74987Tbr;
import X.C75103Tdj;
import X.C75177Tev;
import X.C75285Tgf;
import X.C75642TmQ;
import X.C75849Tpl;
import X.C75969Trh;
import X.C76548U2m;
import X.C76549U2n;
import X.C76553U2r;
import X.C76800UCe;
import X.C76912UGm;
import X.C77520Ubc;
import X.C77541Ubx;
import X.C77591Ucl;
import X.C78857UxB;
import X.C8E;
import X.DialogC31813Ce9;
import X.EnumC74929Tav;
import X.InterfaceC30442Bx8;
import X.InterfaceC31805Ce1;
import X.InterfaceC65784Pro;
import X.InterfaceC75441TjB;
import X.InterfaceC76555U2t;
import X.InterfaceC77524Ubg;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OSZ;
import X.T28;
import X.T4W;
import X.TQA;
import X.TQV;
import X.TTK;
import X.TTV;
import X.TVD;
import X.TWL;
import X.TZ8;
import X.TZJ;
import X.U2L;
import X.U35;
import X.U3K;
import X.UF8;
import X.UHX;
import X.UI8;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.liveinteract.api.LinkMicAudienceCancelEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestV3GuestShowReviewDialogEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.opencamera.MultiLiveAnchorOpenCameraDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.ModeratorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.linked.MultiGuestLinkedPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.linked.MultiGuestLinkedPreviewViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3CancelApplyOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.settings.customtab.KevaDebugFragment;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public class IDcS172S0100000_13 implements C0K7 {
    public final int $t;
    public Object l0;

    public static final void LJIILLIIL$12(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        GuestMediaManageFragment.xl((GuestMediaManageFragment) iDcS172S0100000_13.l0, liveDialog);
    }

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
            default:
                return;
        }
    }

    public IDcS172S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILLIIL$0(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        C74987Tbr.LIZJ("shared_bg", "show switch layout tips dialog, click switch btn");
        C75285Tgf.LJ("change_to_floating", "confirm");
        liveDialog.dismiss();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDcS172S0100000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LJIILLIIL$1(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((MultiGuestV3GuestPresenter) iDcS172S0100000_13.l0).getMultiGuestDataHolder().LIZLLL = true;
        DataChannel dataChannel = ((MultiGuestV3GuestPresenter) iDcS172S0100000_13.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(((MultiGuestV3GuestPresenter) iDcS172S0100000_13.l0).getMultiGuestDataHolder().LIZLLL, "business_mute_ad_play"));
        }
        TTK.LIZIZ("turn_on");
    }

    public static final void LJIILLIIL$10(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        TQV tqv = ((VoiceChatWatchWidget) iDcS172S0100000_13.l0).LJLILLLLZI;
        if (tqv != null) {
            tqv.exitInteractInNormalWay("others", false, 10002);
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$11(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        C74824TYe.LJJJ(false, ((C34K) iDcS172S0100000_13.l0).element);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$13(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        AbstractC74727TUl LIZ;
        List LJJI;
        ActivityC45651qj LJIILL;
        liveDialog.dismiss();
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) iDcS172S0100000_13.l0;
        DialogC31813Ce9 LJJJI = multiLiveAsAnchorListDialogV2.LJJJI();
        String string = multiLiveAsAnchorListDialogV2.getContext().getString(R.string.su1);
        LJJJI.LJLILLLLZI = string;
        T4W t4w = LJJJI.LJLJI;
        if (t4w != null) {
            t4w.setMessage(string);
        }
        if (!multiLiveAsAnchorListDialogV2.LJJJI().isShowing()) {
            DialogC31813Ce9 LJJJI2 = multiLiveAsAnchorListDialogV2.LJJJI();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveLoadingDialog", "show", LJJJI2, new Object[0], "void", new C65300Pk0(false, "()V", "-7513378268399745173")).LIZ) {
                LJJJI2.show();
            }
        }
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = (MultiLiveAsAnchorListDialogV2) iDcS172S0100000_13.l0;
        if (!multiLiveAsAnchorListDialogV22.LJJIZ().LJ && (LJIILL = g0.LJIILL(multiLiveAsAnchorListDialogV22.getContext())) != null) {
            Context context = multiLiveAsAnchorListDialogV22.getContext();
            o.LJIIIIZZ(context, "context");
            MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = new MultiLiveAnchorOpenCameraDialog(context, multiLiveAsAnchorListDialogV22.LJLJI, LJIILL, "close_link");
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/anchor/opencamera/MultiLiveAnchorOpenCameraDialog", "show", multiLiveAnchorOpenCameraDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-7513378268399745173")).LIZ) {
                multiLiveAnchorOpenCameraDialog.show();
            }
        }
        InterfaceC31805Ce1 LJJJJJL = ((MultiLiveAsAnchorListDialogV2) iDcS172S0100000_13.l0).LJJJJJL();
        if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
            Iterator it = LJJI.iterator();
            while (it.hasNext()) {
                C74830TYk.LJIIIIZZ(((LinkPlayerInfo) it.next()).mUser.getId(), "go_live_panel");
            }
        }
        TZ8 tz8 = ((MultiLiveAsAnchorListDialogV2) iDcS172S0100000_13.l0).LJLJJI;
        if (tz8 != null) {
            tz8.LJJJJL(TZJ.USER_CLICK, C78857UxB.LJJIIJ(1476788483, "bpea-1227"));
        }
        if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
            C74979Tbj.LJIILIIL = "guest_mode_off";
            C74979Tbj.LJII();
        }
    }

    public static final void LJIILLIIL$14(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        HashMap hashMap = new HashMap();
        C74824TYe.LIZ(hashMap);
        C74824TYe.LJLL("livesdk_anchor_guest_kickoff_all_click_success", hashMap);
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) iDcS172S0100000_13.l0;
        multiLiveAsAnchorListDialogV2.getClass();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJJIJ(new C62819Ol5(), new IDo0S413S0100000_13(multiLiveAsAnchorListDialogV2, 17));
        }
    }

    public static final void LJIILLIIL$15(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        C75642TmQ.LIZ.LJJJJL("go_back", ((C34K) iDcS172S0100000_13.l0).element);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$16(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C75849Tpl) iDcS172S0100000_13.l0).LIZIZ.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$17(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        C75642TmQ.LJJJJJL(((C75849Tpl) iDcS172S0100000_13.l0).LIZIZ.LIZIZ.getLabel(), "");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C75849Tpl) iDcS172S0100000_13.l0).LIZIZ.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$18(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C75969Trh) iDcS172S0100000_13.l0).LIZIZ.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$19(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C75969Trh) iDcS172S0100000_13.l0).LIZIZ.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$2(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        DataChannel dataChannel = ((MultiGuestV3GuestWidget) iDcS172S0100000_13.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GuestDisconnectByWindowEvent.class, new OSZ("leave_normally", 10002));
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$20(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        MultiGuestLinkedPreviewFragment multiGuestLinkedPreviewFragment = (MultiGuestLinkedPreviewFragment) iDcS172S0100000_13.l0;
        multiGuestLinkedPreviewFragment.LLIIZ = liveDialog;
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = multiGuestLinkedPreviewFragment.LLILII;
        if (multiGuestLinkedPreviewViewModel != null) {
            boolean z = multiGuestLinkedPreviewFragment.LLIL;
            C74913Taf.LIZ("Zoom/MultiGuestLinkedPreviewFragment", multiGuestLinkedPreviewViewModel.nv0(), multiGuestLinkedPreviewViewModel.mv0());
            C74824TYe.LIZ.LJJIJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            if (multiGuestLinkedPreviewViewModel.nv0() != null && C29306Beo.LJIJJLI(multiGuestLinkedPreviewViewModel.mv0())) {
                ZoomService nv0 = multiGuestLinkedPreviewViewModel.nv0();
                if (nv0 != null) {
                    nv0.LJ(multiGuestLinkedPreviewViewModel.mv0(), new C74960TbQ(multiGuestLinkedPreviewViewModel), z, false, EnumC74929Tav.FROM_MULTI_GUEST_LINKED_PREVIEW_FRAGMENT);
                    return;
                }
                return;
            }
            ((LiveData) multiGuestLinkedPreviewViewModel.LJLLL.getValue()).setValue(C76800UCe.LIZ);
        }
    }

    public static final void LJIILLIIL$21(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) iDcS172S0100000_13.l0;
        linkControlWidget.getClass();
        liveDialog.dismiss();
        if (LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting.INSTANCE.isEnabled()) {
            linkControlWidget.dataChannel.qv0(MultiGuestV3GuestShowReviewDialogEvent.class, "connection_end");
        }
    }

    public static final void LJIILLIIL$22(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        String str;
        Gift gift = ((U2L) iDcS172S0100000_13.l0).LJLLJ;
        if (gift == null || (str = Long.valueOf(gift.id).toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        U2L u2l = (U2L) iDcS172S0100000_13.l0;
        C74824TYe.LJLJI(str, String.valueOf(u2l.LJLJJI - u2l.LJLJI), "cancel", "second");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$23(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        User user = ((C75103Tdj) iDcS172S0100000_13.l0).LLD;
        if (user != null) {
            C74830TYk.LJIIIIZZ(user.getId(), "gift_panel");
            User user2 = ((C75103Tdj) iDcS172S0100000_13.l0).LJLL;
            if (user2 != null) {
                if (C74947TbD.LJIILLIIL(user2)) {
                    C75103Tdj c75103Tdj = (C75103Tdj) iDcS172S0100000_13.l0;
                    DataChannel dataChannel = c75103Tdj.LJLJLJ;
                    User user3 = c75103Tdj.LLD;
                    if (user3 != null) {
                        dataChannel.qv0(AnchorKickOutGuestByWindowEvent.class, user3);
                    } else {
                        o.LJIJI("oTargetUser");
                        throw null;
                    }
                } else {
                    C75103Tdj c75103Tdj2 = (C75103Tdj) iDcS172S0100000_13.l0;
                    DataChannel dataChannel2 = c75103Tdj2.LJLJLJ;
                    User user4 = c75103Tdj2.LLD;
                    if (user4 != null) {
                        dataChannel2.qv0(ModeratorKickOutGuestByWindowEvent.class, user4);
                    } else {
                        o.LJIJI("oTargetUser");
                        throw null;
                    }
                }
                ((C75103Tdj) iDcS172S0100000_13.l0).LJLJLLL.run();
                liveDialog.dismiss();
                return;
            }
            o.LJIJI("me");
            throw null;
        }
        o.LJIJI("oTargetUser");
        throw null;
    }

    public static final void LJIILLIIL$24(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        C76912UGm.LIZ("cancel", (UI8) iDcS172S0100000_13.l0);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$25(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        ((UHX) iDcS172S0100000_13.l0).LIZJ().nv0();
        LiveDialog liveDialog2 = ((UHX) iDcS172S0100000_13.l0).LIZJ;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
        }
    }

    public static final void LJIILLIIL$26(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        ((UHX) iDcS172S0100000_13.l0).LIZJ().mv0();
        LiveDialog liveDialog2 = ((UHX) iDcS172S0100000_13.l0).LIZJ;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
        }
    }

    public static final void LJIILLIIL$27(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = (MultiLiveAnchorSettingDialog) iDcS172S0100000_13.l0;
        Boolean bool = Boolean.TRUE;
        multiLiveAnchorSettingDialog.getClass();
        MultiLiveAnchorSettingDialog.Wl(bool, "by_coins");
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog2 = (MultiLiveAnchorSettingDialog) iDcS172S0100000_13.l0;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiLiveAnchorSettingDialog2.LLJLLL;
        if (multiLiveAnchorPanelSettings != null) {
            multiLiveAnchorPanelSettings.applierSortSetting = 1;
        }
        multiLiveAnchorSettingDialog2.xl(4);
        ((MultiLiveAnchorSettingDialog) iDcS172S0100000_13.l0).Jl();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$28(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        C74746TVe.LJ("click", "cancel");
        C41051jJ c41051jJ = ((GameLinkGuestBeInvitedDialog) iDcS172S0100000_13.l0).LJLLI;
        if (c41051jJ != null) {
            c41051jJ.setChecked(false);
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$29(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        DataChannel dataChannel = ((C75177Tev) iDcS172S0100000_13.l0).LIZ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkMicAudienceCancelEvent.class, Boolean.TRUE);
        }
        ((C75177Tev) iDcS172S0100000_13.l0).LJIIIIZZ("click");
    }

    public static final void LJIILLIIL$3(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        Integer num;
        C28268B7o c28268B7o = (C28268B7o) iDcS172S0100000_13.l0;
        if (c28268B7o != null) {
            num = Integer.valueOf(c28268B7o.LIZ);
        } else {
            num = null;
        }
        C74824TYe.LJJJI(true, false, num);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$30(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((InterfaceC88472Yns) iDcS172S0100000_13.l0).invoke(1);
    }

    public static final void LJIILLIIL$31(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((InterfaceC88472Yns) iDcS172S0100000_13.l0).invoke(1);
    }

    public static final void LJIILLIIL$32(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS172S0100000_13.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$33(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS172S0100000_13.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$34(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS172S0100000_13.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$35(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS172S0100000_13.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$36(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        UI8 ui8;
        Runnable runnable;
        C77520Ubc c77520Ubc = (C77520Ubc) iDcS172S0100000_13.l0;
        int i = c77520Ubc.LJIIJ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (runnable = c77520Ubc.LJIIJJI) != null) {
                    runnable.run();
                }
            } else {
                Runnable runnable2 = c77520Ubc.LJIIL;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        } else {
            Runnable runnable3 = c77520Ubc.LJIIL;
            if (runnable3 != null) {
                runnable3.run();
            }
            C77520Ubc c77520Ubc2 = (C77520Ubc) iDcS172S0100000_13.l0;
            String str = c77520Ubc2.LJII;
            if (str != null) {
                c77520Ubc2.LIZIZ(str, "primary_cta");
            }
        }
        C77520Ubc c77520Ubc3 = (C77520Ubc) iDcS172S0100000_13.l0;
        if (c77520Ubc3.LJII == null && (ui8 = c77520Ubc3.LJIILIIL) != null) {
            C77541Ubx.LJIJJ(ui8, "dismiss", "primary_cta");
        }
        InterfaceC77524Ubg interfaceC77524Ubg = c77520Ubc3.LIZIZ;
        if (interfaceC77524Ubg != null) {
            interfaceC77524Ubg.LIZ();
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$37(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        Exception exc;
        C77520Ubc c77520Ubc = (C77520Ubc) iDcS172S0100000_13.l0;
        UI8 ui8 = c77520Ubc.LJIILIIL;
        if (ui8 != null) {
            C77541Ubx.LJIJJ(ui8, "dismiss", "dismiss");
        }
        InterfaceC77524Ubg interfaceC77524Ubg = c77520Ubc.LIZIZ;
        if (interfaceC77524Ubg != null) {
            interfaceC77524Ubg.LIZIZ();
        }
        C77520Ubc c77520Ubc2 = (C77520Ubc) iDcS172S0100000_13.l0;
        int i = c77520Ubc2.LJIIIZ;
        if (i == 1) {
            Runnable runnable = c77520Ubc2.LJIIL;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i == 2) {
            Runnable runnable2 = c77520Ubc2.LJIIJJI;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else if (i == CustomErrorExtra.DISMISS_ACTION_OPEN_RECHARGE) {
            Bundle LIZ = C0H1.LIZ("key_charge_reason", "custom_error");
            C77591Ucl c77591Ucl = new C77591Ucl();
            UI8 ui82 = c77520Ubc2.LJIILIIL;
            Exception exc2 = null;
            if (ui82 != null) {
                exc = ui82.LIZLLL;
            } else {
                exc = null;
            }
            if (exc instanceof C29401Dk) {
                if (ui82 != null) {
                    exc2 = ui82.LIZLLL;
                }
                o.LJII(exc2, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
                Map<String, String> map = c77591Ucl.LIZIZ;
                String num = Integer.valueOf(((C276516r) exc2).getErrorCode()).toString();
                if (num == null) {
                    num = "";
                }
                map.put("error_code", num);
            }
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS24S0300000_13(c77520Ubc2, LIZ, c77591Ucl, 38), 500L);
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$38(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        DataChannel dataChannel = ((C74890TaI) iDcS172S0100000_13.l0).LJLJLJ;
        if (dataChannel != null) {
            TTV.LIZ().LIZIZ = 2;
            dataChannel.pv0(OrientationChangeEvent.class);
            dataChannel.pv0(ResetSilentTimerEvent.class);
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$39(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        long j;
        ShowListUser showListUser;
        ShowListUser showListUser2;
        liveDialog.dismiss();
        C76549U2n c76549U2n = (C76549U2n) iDcS172S0100000_13.l0;
        C76553U2r c76553U2r = c76549U2n.LJLJI;
        if (c76553U2r != null && (showListUser2 = c76553U2r.LJLIL) != null) {
            long j2 = showListUser2.userId;
            InterfaceC76555U2t interfaceC76555U2t = c76549U2n.LJLIL;
            if (interfaceC76555U2t != null) {
                interfaceC76555U2t.LIZ(j2);
            }
        }
        C76553U2r c76553U2r2 = ((C76549U2n) iDcS172S0100000_13.l0).LJLJI;
        if (c76553U2r2 != null && (showListUser = c76553U2r2.LJLIL) != null) {
            j = showListUser.userId;
        } else {
            j = 0;
        }
        Map LIZIZ = C76548U2m.LIZIZ();
        LIZIZ.put("guest_id", String.valueOf(j));
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_guest_finish_confirm", LIZIZ);
    }

    public static final void LJIILLIIL$4(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        liveDialog.dismiss();
        if (LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting.INSTANCE.isEnabled()) {
            ((MultiGuestV3GuestWidget) iDcS172S0100000_13.l0).dataChannel.qv0(MultiGuestV3GuestShowReviewDialogEvent.class, "anchor_kick_out_guest");
        }
    }

    public static final void LJIILLIIL$40(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        ShowListUser showListUser;
        liveDialog.dismiss();
        C76549U2n c76549U2n = (C76549U2n) iDcS172S0100000_13.l0;
        C76553U2r c76553U2r = c76549U2n.LJLJI;
        if (c76553U2r != null && (showListUser = c76553U2r.LJLIL) != null) {
            long j = showListUser.userId;
            InterfaceC76555U2t interfaceC76555U2t = c76549U2n.LJLIL;
            if (interfaceC76555U2t != null) {
                interfaceC76555U2t.LIZ(j);
            }
        }
        C76548U2m.LJIIZILJ("livesdk_guest_liveshow_finished_confirmed", C76548U2m.LIZLLL());
    }

    public static final void LJIILLIIL$5(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        AbstractC73638SvC<C28467BFf<EndShowResponse.ResponseData>> endShow;
        liveDialog.dismiss();
        LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) iDcS172S0100000_13.l0;
        BaseLiveShowViewModel baseLiveShowViewModel = liveShowAnchorWidget.LJLILLLLZI;
        if (baseLiveShowViewModel != null) {
            U3K u3k = new U3K(liveShowAnchorWidget);
            EndShowParams endShowParams = new EndShowParams();
            endShowParams.roomId = baseLiveShowViewModel.LJLJL;
            endShowParams.channelId = baseLiveShowViewModel.LJJLI();
            endShowParams.showId = BaseLiveShowViewModel.ov0();
            U35 LIZ = TQA.LIZ();
            if (LIZ != null && (endShow = LIZ.endShow(endShowParams)) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(endShow).LJJII(new AfS65S0100000_13(u3k, 218), new AfS65S0100000_13(u3k, 219));
                C73318Sq2 cb = baseLiveShowViewModel.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
    }

    public static final void LJIILLIIL$6(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        Integer num;
        C28268B7o c28268B7o = (C28268B7o) iDcS172S0100000_13.l0;
        if (c28268B7o != null) {
            num = Integer.valueOf(c28268B7o.LIZ);
        } else {
            num = null;
        }
        C74824TYe.LJJJI(true, false, num);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$7(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        TVD wl;
        GameLinkGuestPresenter gameLinkGuestPresenter;
        liveDialog.dismiss();
        WeakReference<GameLinkGuestPresenter> weakReference = ((GameLinkUserInfoFragment) iDcS172S0100000_13.l0).LJLLL;
        if (weakReference != null && (gameLinkGuestPresenter = weakReference.get()) != null) {
            gameLinkGuestPresenter.cancel("leave_source_user_click_cancel");
        }
        ((GameLinkUserInfoFragment) iDcS172S0100000_13.l0).xl("click");
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue() && (wl = ((GameLinkUserInfoFragment) iDcS172S0100000_13.l0).wl()) != null) {
            wl.LJIIZILJ = -1;
        }
    }

    public static final void LJIILLIIL$8(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        Integer num;
        C28268B7o c28268B7o = (C28268B7o) iDcS172S0100000_13.l0;
        if (c28268B7o != null) {
            num = Integer.valueOf(c28268B7o.LIZ);
        } else {
            num = null;
        }
        TWL.LJIIL(true, false, num);
        liveDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILLIIL$9(IDcS172S0100000_13 iDcS172S0100000_13, LiveDialog liveDialog) {
        Editable editable;
        KevaDebugFragment kevaDebugFragment = (KevaDebugFragment) iDcS172S0100000_13.l0;
        kevaDebugFragment.getClass();
        ArrayList arrayList = new ArrayList();
        Field[] fs = InterfaceC30442Bx8.class.getDeclaredFields();
        o.LJIIIIZZ(fs, "fs");
        for (Field field : fs) {
            field.setAccessible(true);
            Object obj = field.get(InterfaceC30442Bx8.class);
            if (obj instanceof C48459J0d) {
                C48459J0d c48459J0d = (C48459J0d) obj;
                c48459J0d.LIZ(c48459J0d.LJFF);
                String str = c48459J0d.LIZJ;
                o.LJIIIIZZ(str, "fieldObj.name");
                Object LIZJ = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ, "fieldObj.value");
                T t = c48459J0d.LJFF;
                o.LJIIIIZZ(t, "fieldObj.defaultValue");
                arrayList.add(new UF8(LIZJ, t, str));
            }
            if (obj instanceof C30554Byw) {
                C48459J0d<HashMap<String, V>> c48459J0d2 = ((C30554Byw) obj).LIZ;
                c48459J0d2.LIZ(c48459J0d2.LJFF);
                String str2 = c48459J0d2.LIZJ;
                o.LJIIIIZZ(str2, "pluginProperty.name");
                Object LIZJ2 = c48459J0d2.LIZJ();
                o.LJIIIIZZ(LIZJ2, "pluginProperty.value");
                T t2 = c48459J0d2.LJFF;
                o.LJIIIIZZ(t2, "pluginProperty.defaultValue");
                arrayList.add(new UF8(LIZJ2, t2, str2));
            }
        }
        ((ArrayList) kevaDebugFragment.LJLJJL).clear();
        ((ArrayList) kevaDebugFragment.LJLJJL).addAll(arrayList);
        LiveEditText liveEditText = kevaDebugFragment.LJLILLLLZI;
        if (liveEditText != null) {
            editable = liveEditText.getEditableText();
        } else {
            editable = null;
        }
        kevaDebugFragment.vl(editable);
        liveDialog.dismiss();
    }
}
