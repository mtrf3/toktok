package Y;

import X.B83;
import X.B84;
import X.BPP;
import X.C0NB;
import X.C29556Biq;
import X.C32014ChO;
import X.C74776TWi;
import X.C74830TYk;
import X.C74838TYs;
import X.C74982Tbm;
import X.C74983Tbn;
import X.C76003TsF;
import X.C76917UGr;
import X.C8E;
import X.EnumC74991Tbv;
import X.InterfaceC75414Tik;
import X.InterfaceC75441TjB;
import X.InterfaceC75706TnS;
import X.InterfaceC75973Trl;
import X.OLS;
import X.OLT;
import X.OLU;
import X.OLV;
import X.TQ7;
import X.TQV;
import X.TRK;
import X.TSV;
import X.TV2;
import X.TYP;
import X.TYQ;
import X.TZX;
import X.U8H;
import X.X1D;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplyFailEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplySucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostResumeEvent;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3CancelApplyOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDo0S413S0100000_13 implements InterfaceC75414Tik {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError linkCoreError, Throwable th) {
        switch (this.$t) {
            case 0:
                LJ$0(this, linkCoreError, th);
                return;
            case 1:
                LJ$1(this, linkCoreError, th);
                return;
            case 2:
                LJ$2(this, linkCoreError, th);
                return;
            case 3:
                LJ$3(this, linkCoreError, th);
                return;
            case 4:
                LJ$4(this, linkCoreError, th);
                return;
            case 5:
                LJ$5(this, linkCoreError, th);
                return;
            case 6:
                LJ$6(this, linkCoreError, th);
                return;
            case 7:
                LJ$7(this, linkCoreError, th);
                return;
            case 8:
                LJ$8(this, linkCoreError, th);
                return;
            case 9:
                LJ$9(this, linkCoreError, th);
                return;
            case 10:
                LJ$10(this, linkCoreError, th);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJ$11(this, linkCoreError, th);
                return;
            case 12:
                LJ$12(this, linkCoreError, th);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJ$13(this, linkCoreError, th);
                return;
            case 14:
                LJ$14(this, linkCoreError, th);
                return;
            case 15:
                LJ$15(this, linkCoreError, th);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJ$16(this, linkCoreError, th);
                return;
            case 17:
                LJ$17(this, linkCoreError, th);
                return;
            case 18:
                o.LJIIIZ(linkCoreError, "error");
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                return;
            case 1:
                onSuccess$1(this, obj);
                return;
            case 2:
                onSuccess$2(this, obj);
                return;
            case 3:
                onSuccess$3(this, obj);
                return;
            case 4:
                onSuccess$4(this, obj);
                return;
            case 5:
                onSuccess$5(this, obj);
                return;
            case 6:
                onSuccess$6(this, obj);
                return;
            case 7:
                onSuccess$7(this, obj);
                return;
            case 8:
                onSuccess$8(this, obj);
                return;
            case 9:
                onSuccess$9(this, obj);
                return;
            case 10:
                onSuccess$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onSuccess$11(this, obj);
                return;
            case 12:
                onSuccess$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onSuccess$13(this, obj);
                return;
            case 14:
                onSuccess$14(this, obj);
                return;
            case 15:
                onSuccess$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onSuccess$16(this, obj);
                return;
            case 17:
                onSuccess$17(this, obj);
                return;
            case 18:
                onSuccess$18(this, obj);
                return;
            default:
                return;
        }
    }

    public IDo0S413S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onSuccess$0(IDo0S413S0100000_13 iDo0S413S0100000_13, Object value) {
        o.LJIIIZ(value, "value");
        TYQ.LIZLLL("LinkIn_leave_Success", "position:cancel");
        ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).isCanceling = false;
        if (MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).getMultiGuestDataHolder().LJJIJLIJ = -1;
        }
        ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).linkPlayerState.LJI(0);
        C74776TWi.LJIIIZ(((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).dataChannel);
        DataChannel dataChannel = ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(LinkInRoomAudienceCancelApplySucceedEvent.class);
        }
        C74838TYs.LJ().LJJIIZ = true;
        TQ7 tq7 = ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).dialogView;
        if (tq7 == null) {
            return;
        }
        tq7.onCancelSuccess();
    }

    public static final void onSuccess$1(IDo0S413S0100000_13 iDo0S413S0100000_13, Object value) {
        o.LJIIIZ(value, "value");
        C76917UGr.LJJJJL((TZX) iDo0S413S0100000_13.l0, B83.LIZ().LIZIZ().getCurrentUserId());
        C0NB.LIZIZ("MultiGuestV3GuestPresenter", "leave channel succ for leave_source_when_enter_room");
    }

    public static final void onSuccess$10(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        CancelInviteResult value = (CancelInviteResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LJFF(new OLT(0, value.logId, 4));
        }
    }

    public static final void onSuccess$11(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        ReplyResult value = (ReplyResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LJFF(new OLU(0, value.logId, 4));
        }
    }

    public static final void onSuccess$12(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        LeaveChannelResult value = (LeaveChannelResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LJFF(new OLS(value.logId, value.getFeedbackShowReason(), 4));
        }
    }

    public static final void onSuccess$13(IDo0S413S0100000_13 iDo0S413S0100000_13, Object value) {
        int i;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        InterfaceC75973Trl LLIIJI2;
        List<LinkUser> LJJIIZI2;
        o.LJIIIZ(value, "value");
        InterfaceC75441TjB interfaceC75441TjB = ((MultiHostMultiAdapterImpl) iDo0S413S0100000_13.l0).LJLJI;
        if (interfaceC75441TjB != null && (LLIIJI2 = interfaceC75441TjB.LLIIJI()) != null && (LJJIIZI2 = LLIIJI2.LJJIIZI()) != null) {
            i = LJJIIZI2.size();
        } else {
            i = 0;
        }
        ((MultiHostMultiAdapterImpl) iDo0S413S0100000_13.l0).LJLLLLLL();
        InterfaceC75441TjB interfaceC75441TjB2 = ((MultiHostMultiAdapterImpl) iDo0S413S0100000_13.l0).LJLJI;
        if (interfaceC75441TjB2 != null && (LLIIJI = interfaceC75441TjB2.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null && LJJIIZI.size() == i) {
            DataChannel dataChannel = ((MultiHostMultiAdapterImpl) iDo0S413S0100000_13.l0).LJLJLJ;
            if (dataChannel != null) {
                dataChannel.pv0(CoHostResumeEvent.class);
            }
            ((MultiHostMultiAdapterImpl) iDo0S413S0100000_13.l0).LJLZ = true;
            return;
        }
        ((MultiHostMultiAdapterImpl) iDo0S413S0100000_13.l0).LLJJ("resume");
    }

    public static final void onSuccess$14(IDo0S413S0100000_13 iDo0S413S0100000_13, Object value) {
        o.LJIIIZ(value, "value");
        C76917UGr.LJJJJL((TZX) iDo0S413S0100000_13.l0, B83.LIZ().LIZIZ().getCurrentUserId());
        C0NB.LIZIZ("VoiceChatWatchPresenter", "leave channel succ for leave_source_when_enter_room");
    }

    public static final void onSuccess$15(IDo0S413S0100000_13 iDo0S413S0100000_13, Object value) {
        o.LJIIIZ(value, "value");
        TYP.LIZ("GameLinkGuestPresenter", "cancel apply request succeed", false);
        ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).isCanceling = false;
        if (MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).getMultiGuestDataHolder().LJIIZILJ = -1;
        }
        ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).linkPlayerState.LJI(0);
        DataChannel dataChannel = ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).dataChannel;
        if (!TV2.LJIILIIL(TV2.LJI())) {
            TV2.LJIIIIZZ(dataChannel);
        }
        C74838TYs.LJ().LJJIIZ = true;
        TSV tsv = ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).dialogView;
        if (tsv == null) {
            return;
        }
        tsv.onCancelSuccess();
    }

    public static final void onSuccess$16(IDo0S413S0100000_13 iDo0S413S0100000_13, Object value) {
        LiveDialogFragment liveDialogFragment;
        o.LJIIIZ(value, "value");
        TYQ.LIZLLL("LinkIn_leave_Success", "position:cancel");
        ((TQV) iDo0S413S0100000_13.l0).LJLLLL = false;
        if (MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((TQV) iDo0S413S0100000_13.l0).getMultiGuestDataHolder().LJJIJLIJ = -1;
        }
        ((TQV) iDo0S413S0100000_13.l0).LJLLI.LJI(0);
        C74776TWi.LJIIIZ(((TQV) iDo0S413S0100000_13.l0).dataChannel);
        C74838TYs.LJ().LJJIIZ = true;
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = ((TQV) iDo0S413S0100000_13.l0).LJLJJLL;
        if (voiceChatUserInfoFragment == null || (liveDialogFragment = voiceChatUserInfoFragment.LJLJI) == null) {
            return;
        }
        liveDialogFragment.dismiss();
    }

    public static final void onSuccess$17(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        KickOutAllResult value = (KickOutAllResult) obj;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiLiveAsAnchorListDialogV2_kickOutAll onSuccess value:");
        LIZ.append(value);
        C0NB.LIZIZ("kick_out_all", X1D.LIZIZ(LIZ));
        ((MultiLiveAsAnchorListDialogV2) iDo0S413S0100000_13.l0).dismiss();
        List<Long> list = value.removeUidList;
        if (list != null) {
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                C74830TYk.LJIIIIZZ(longValue, "kickoff_all");
                C29556Biq.LIZ().getClass();
                C74830TYk.LIZIZ(longValue, -1L, C74983Tbn.LIZJ());
            }
        }
    }

    public static final void onSuccess$18(IDo0S413S0100000_13 iDo0S413S0100000_13, Object value) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        U8H LJJZZI;
        o.LJIIIZ(value, "value");
        EnumC74991Tbv layoutName = ((B84) iDo0S413S0100000_13.l0).LIZ;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJJI(layoutName.getBusinessType(), false);
        }
        C29556Biq.LIZ().getClass();
        o.LJIIIZ(layoutName, "layoutName");
        MultiGuestDataHolder LIZ = TRK.LIZ();
        if (LIZ != null && (multiLiveAnchorPanelSettings2 = LIZ.LJIIJ) != null) {
            multiLiveAnchorPanelSettings = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings2);
        } else {
            multiLiveAnchorPanelSettings = null;
        }
        int i = C74982Tbm.LIZ[layoutName.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && multiLiveAnchorPanelSettings != null) {
                        multiLiveAnchorPanelSettings.layoutType = 0;
                        multiLiveAnchorPanelSettings.fixMicNumAction = 1;
                    }
                } else if (multiLiveAnchorPanelSettings != null) {
                    multiLiveAnchorPanelSettings.layoutType = 0;
                    multiLiveAnchorPanelSettings.fixMicNumAction = 0;
                }
            } else if (multiLiveAnchorPanelSettings != null) {
                multiLiveAnchorPanelSettings.layoutType = 1;
                multiLiveAnchorPanelSettings.fixMicNumAction = 1;
            }
        } else if (multiLiveAnchorPanelSettings != null) {
            multiLiveAnchorPanelSettings.layoutType = 1;
            multiLiveAnchorPanelSettings.fixMicNumAction = 0;
        }
        MultiGuestDataHolder LIZ2 = TRK.LIZ();
        if (LIZ2 == null) {
            return;
        }
        LIZ2.LJIIJ = multiLiveAnchorPanelSettings;
    }

    public static final void onSuccess$2(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        CancelApplyJoinGroupResult value = (CancelApplyJoinGroupResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            String logId = value.getLogId();
            if (logId == null) {
                logId = "";
            }
            interfaceC75706TnS.LJFF(new OLT(1, logId, 4));
        }
    }

    public static final void onSuccess$3(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        PermitApplyGroupResult value = (PermitApplyGroupResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            String logId = value.getLogId();
            if (logId == null) {
                logId = "";
            }
            interfaceC75706TnS.LJFF(new OLU(1, logId, 4));
        }
    }

    public static final void onSuccess$4(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        CancelInviteJoinGroupResult value = (CancelInviteJoinGroupResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            String logId = value.getLogId();
            if (logId == null) {
                logId = "";
            }
            interfaceC75706TnS.LJFF(new OLT(0, logId, 4));
        }
    }

    public static final void onSuccess$5(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        ReplyInviteGroupResult value = (ReplyInviteGroupResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            String logId = value.getLogId();
            if (logId == null) {
                logId = "";
            }
            interfaceC75706TnS.LJFF(new OLU(0, logId, 4));
        }
    }

    public static final void onSuccess$6(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        ApplyResult value = (ApplyResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LJFF(new OLV(1, value.logId, 4));
        }
    }

    public static final void onSuccess$7(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        CancelApplyResult value = (CancelApplyResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LJFF(new OLT(1, value.logId, 4));
        }
    }

    public static final void onSuccess$8(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        PermitResult value = (PermitResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LJFF(new OLU(1, value.logId, 4));
        }
    }

    public static final void onSuccess$9(IDo0S413S0100000_13 iDo0S413S0100000_13, Object obj) {
        InviteResult value = (InviteResult) obj;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LJFF(new OLV(0, value.logId, 4));
        }
    }

    public static final void LJ$0(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th != null) {
            ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:cancel; throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_leave_Failed", X1D.LIZIZ(LIZ));
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = (MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0;
        multiGuestV3GuestPresenter.isCanceling = false;
        DataChannel dataChannel = multiGuestV3GuestPresenter.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomAudienceCancelApplyFailEvent.class, th);
        }
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).linkPlayerState.LJI(0);
            C74838TYs.LJ().LJJIIZ = false;
        }
        TQ7 tq7 = ((MultiGuestV3GuestPresenter) iDo0S413S0100000_13.l0).dialogView;
        if (tq7 == null) {
            return;
        }
        tq7.LLJJIII(th);
    }

    public static final void LJ$1(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C32014ChO.LIZJ("MultiGuestV3GuestPresenter", "leave channel failed for leave_source_when_enter_room,", str);
    }

    public static final void LJ$10(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$11(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$12(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$13(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resume");
        LIZ.append(", errorCode = ");
        LIZ.append(error.getErrorCode());
        LIZ.append(", errorMsg = ");
        LIZ.append(error.getErrorMsg());
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        ((MultiHostMultiAdapterImpl) iDo0S413S0100000_13.l0).LLJJ("resume");
    }

    public static final void LJ$14(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C32014ChO.LIZJ("VoiceChatWatchPresenter", "leave channel failed for leave_source_when_enter_room,", str);
    }

    public static final void LJ$15(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel apply request failed, ");
        LIZ.append(((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).getThrowableMsg(th));
        TYP.LIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ), false);
        if (th != null) {
            ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).logThrowable(th);
        }
        ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).isCanceling = false;
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).linkPlayerState.LJI(0);
            C74838TYs.LJ().LJJIIZ = false;
        }
        TSV tsv = ((GameLinkGuestPresenter) iDo0S413S0100000_13.l0).dialogView;
        if (tsv == null) {
            return;
        }
        tsv.LLJJIII(th);
    }

    public static final void LJ$16(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th != null) {
            ((TQV) iDo0S413S0100000_13.l0).logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:cancel; throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_leave_Failed", X1D.LIZIZ(LIZ));
        ((TQV) iDo0S413S0100000_13.l0).LJLLLL = false;
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            ((TQV) iDo0S413S0100000_13.l0).LJLLI.LJI(0);
            C74838TYs.LJ().LJJIIZ = false;
        }
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = ((TQV) iDo0S413S0100000_13.l0).LJLJJLL;
        if (voiceChatUserInfoFragment == null) {
            return;
        }
        BPP.LIZLLL(voiceChatUserInfoFragment.getContext(), th, R.string.sud);
    }

    public static final void LJ$17(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiLiveAsAnchorListDialogV2_kickOutAll onFail error:");
        LIZ.append(error);
        C0NB.LIZIZ("kick_out_all", X1D.LIZIZ(LIZ));
    }

    public static final void LJ$2(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$3(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$4(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$5(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$6(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$7(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$8(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public static final void LJ$9(IDo0S413S0100000_13 iDo0S413S0100000_13, LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) iDo0S413S0100000_13.l0;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }
}
