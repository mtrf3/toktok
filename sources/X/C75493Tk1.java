package X;

import Y.AfS36S0101000_5;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStartEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.log.CoHostLogger;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStreamStatsEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorPanelSettingChangeFromIMEvent;
import com.bytedance.android.live.liveinteract.platform.common.monitor.MultiGuestSeiAbnormalDetector;
import com.bytedance.android.live.liveinteract.platform.core.LinkerManager;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStateApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicSessionStatus;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAckMessageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestPlayAdSwitch;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.message.CohostReserveMessage;
import com.bytedance.android.livesdk.model.message.CohostTopicMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAdMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkmicUserToastContent;
import com.bytedance.android.livesdk.model.message.ReserveContent;
import com.bytedance.android.livesdk.model.message.TopicSetContent;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linker.enter_message.LinkerEnterContent;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.ListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.common.StateReqCommon;
import tikcast.linkmic.controller.AckStateReq;
import webcast.im.LinkStateMessage;

/* renamed from: X.Tk1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75493Tk1 extends C75446TjG {
    public final /* synthetic */ C75492Tk0 LJLIL;

    public C75493Tk1(C75492Tk0 c75492Tk0) {
        this.LJLIL = c75492Tk0;
    }

    @Override // X.C75446TjG, X.InterfaceC75448TjI
    public final void Ac(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        C75883TqJ LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive anchor guide message, messageType = ");
        b1.LJ(LIZ, linkMicAnchorGuideMessage.guideType, LIZ, "LinkControlPresenter");
        C75492Tk0 c75492Tk0 = this.LJLIL;
        if (c75492Tk0.mView == 0 || c75492Tk0.dataChannel == null || linkMicAnchorGuideMessage.user == null || C8E.LIZLLL().LLII() == EnumC75620Tm4.Linked) {
            return;
        }
        long id = linkMicAnchorGuideMessage.user.getId();
        if (this.LJLIL.LJLJJI.getOwnerUserId() == id || (LJI = C8E.LIZLLL().LJI(id)) == null || LJI.LJII.isEmpty()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("reconnecting cohost uid: ");
        LIZ2.append(LJI.LIZ);
        LIZ2.append(" linkmicId: ");
        JBR.LJIIJ(LIZ2, LJI.LJII, LIZ2, "LinkControlPresenter");
        this.LJLIL.dataChannel.qv0(MultiCoHostStreamStatsEvent.class, new C75589TlZ(EnumC75775ToZ.RECONNECTING, LJI.LJII));
    }

    @Override // X.C75446TjG, X.InterfaceC75449TjJ
    public final void LJJZZIII(LinkMessage linkMessage) {
        LinkerEnterContent linkerEnterContent;
        boolean z;
        List<ListUser> list;
        C75492Tk0 c75492Tk0 = this.LJLIL;
        if (c75492Tk0.mView == 0 || c75492Tk0.LJLJJL) {
            return;
        }
        if (linkMessage.LIZJ() == EnumC74706TTq.ANCHOR_LINKMIC) {
            if (C8E.LIZLLL().LLIFFJFJJ()) {
                return;
            }
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_anchor_link_mic_audience_monitor", 0.2d)) {
                JSONObject jSONObject = new JSONObject();
                C75194TfC.LIZ.LJIIJJI(jSONObject);
                C05630Jz.LJFF(jSONObject, "msgId", linkMessage.getMessageId());
                C05630Jz.LJI(jSONObject, "event_id", "link_mic_message");
                C0K2.LJIIIIZZ("ttlive_client_anchor_link_mic_audience_monitor", 1, jSONObject);
            }
            LinkerEnterContent linkerEnterContent2 = linkMessage.enterContent;
            C75550Tkw c75550Tkw = null;
            if (linkerEnterContent2 == null || (list = linkerEnterContent2.listUsers) == null || list.size() < 2) {
                return;
            }
            boolean z2 = false;
            for (ListUser listUser : list) {
                if (listUser.user.getId() == this.LJLIL.LJLJJI.getOwnerUserId()) {
                    z2 = true;
                } else {
                    this.LJLIL.LJLILLLLZI.LJI = listUser.user.getId();
                    this.LJLIL.LJLILLLLZI.LJIIIIZZ = listUser.user.getLiveRoomId();
                }
            }
            if (!z2) {
                return;
            }
            LinkerManager linkerManager = this.LJLIL.linkerManager;
            if (!(linkerManager.LIZLLL.get(linkerManager.LJ) instanceof C75550Tkw)) {
                C75492Tk0 c75492Tk02 = this.LJLIL;
                c75492Tk02.getClass();
                C75559Tl5.LIZIZ.LJI(new CoHostLogger(), null);
                new C75488Tjw();
                LinkerManager linkerManager2 = c75492Tk02.linkerManager;
                if (linkerManager2 != null) {
                    long ownerUserId = c75492Tk02.LJLJJI.getOwnerUserId();
                    EnumC75465TjZ scene = EnumC75465TjZ.COHOST;
                    DataChannel dataChannel = c75492Tk02.dataChannel;
                    o.LJIIIZ(scene, "scene");
                    if (!linkerManager2.LIZLLL.containsKey(scene) || linkerManager2.LIZLLL.get(scene) == null) {
                        HashMap<EnumC75465TjZ, AbstractC75469Tjd> hashMap = linkerManager2.LIZLLL;
                        if (C75498Tk6.LIZ[scene.ordinal()] == 1) {
                            c75550Tkw = new C75550Tkw(ownerUserId, dataChannel);
                        }
                        hashMap.put(scene, c75550Tkw);
                    }
                    AbstractC75469Tjd abstractC75469Tjd = linkerManager2.LIZLLL.get(scene);
                    if (abstractC75469Tjd != null) {
                        ((ArrayList) linkerManager2.LIZJ).clear();
                        ((ArrayList) linkerManager2.LIZJ).add(abstractC75469Tjd);
                    }
                    linkerManager2.LJ = scene;
                }
            }
            B5G.LIZIZ().LJIIIIZZ(true);
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLIL.LJLILLLLZI;
            linkCrossRoomDataHolder.LJIIL(linkCrossRoomDataHolder.LJFF, EnumC75524TkW.LINK_ENTER);
            ((InterfaceC75495Tk3) this.LJLIL.mView).EQ(false);
            return;
        }
        if (linkMessage.LIZJ() != EnumC74706TTq.AUDIENCE_LINKMIC || (linkerEnterContent = linkMessage.enterContent) == null) {
            return;
        }
        List<ListUser> list2 = linkerEnterContent.listUsers;
        if (list2.size() != 1 || ((ListUser) ListProtector.get(list2, 0)).user.getId() != this.LJLIL.LJLJJI.getOwnerUserId()) {
            return;
        }
        long j = linkMessage.enterContent.MultiLiveType;
        C44878HjO.LIZJ("link_finish_message layoutType= ", j, "LinkControlPresenter");
        C75492Tk0 c75492Tk03 = this.LJLIL;
        if (j == 1) {
            z = true;
        } else {
            z = false;
        }
        c75492Tk03.LJLJL = z;
        if (!z) {
            Throwable th = new Throwable();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("not new multiguestV3+multilive, just skip ");
            LIZ.append(j);
            C0K2.LIZ(X1D.LIZIZ(LIZ), th);
            return;
        }
        C74838TYs.LJ().LJIILIIL = ((ListUser) ListProtector.get(list2, 0)).linkmicIdStr;
        C74751TVj.LIZJ = "others";
        ((InterfaceC75495Tk3) this.LJLIL.mView).nJ(EnumC74990Tbu.AUDIENCE_OPEN);
        MultiGuestSeiAbnormalDetector LIZ2 = C74803TXj.LIZ();
        if (LIZ2 == null) {
            return;
        }
        LIZ2.LIZ = true;
        LIZ2.LIZIZ = false;
    }

    @Override // X.C75446TjG, X.InterfaceC75447TjH
    public final void LJLILLLLZI(LinkMessage linkMessage) {
        LinkmicUserToastContent linkmicUserToastContent = linkMessage.userToastContent;
        if (linkmicUserToastContent == null) {
            return;
        }
        Spannable LJFF = CXJ.LJFF(linkmicUserToastContent.displayText, "");
        if (!TextUtils.isEmpty(LJFF)) {
            C30868C9o.LJI(LJFF.toString());
        }
    }

    @Override // X.C75446TjG, X.InterfaceC75454TjO
    public final void LLFFF(LinkStateMessage linkStateMessage) {
        if (linkStateMessage.needAck == 1 && MultiGuestAckMessageSetting.INSTANCE.isEnable()) {
            C75492Tk0 c75492Tk0 = this.LJLIL;
            c75492Tk0.getClass();
            AckStateReq ackStateReq = new AckStateReq();
            StateReqCommon stateReqCommon = new StateReqCommon();
            stateReqCommon.scene = linkStateMessage.scene;
            stateReqCommon.channelId = linkStateMessage.channelId;
            stateReqCommon.appId = C8E.LIZIZ().appId();
            stateReqCommon.liveId = C8E.LIZIZ().liveId();
            stateReqCommon.myself = new Player(c75492Tk0.LJLJJI.getId(), ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            ackStateReq.common = stateReqCommon;
            ackStateReq.msgId = linkStateMessage.getMessageId();
            ackStateReq.msgType = 1;
            ackStateReq.clientReceiveTime = C30725C4b.LIZ();
            ((InterfaceC29205BdB) ((LinkStateApi) Q7L.LIZIZ(LinkStateApi.class)).sendMessageAckRx(ackStateReq).LIZLLL(c75492Tk0.autoDisposeWithTransformer())).LIZJ(new AfS36S0101000_5(0, linkStateMessage, 43), new AfS36S0101000_5(0, linkStateMessage, 44));
        }
    }

    @Override // X.C75446TjG, X.InterfaceC75447TjH
    public final void LLLLIIL(LinkMessage message) {
        T t;
        o.LJIIIZ(message, "message");
        MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
        if (C74776TWi.LJIILL(LJI)) {
            if (C74776TWi.LJIILIIL(LJI) || (t = this.LJLIL.mView) == 0) {
                return;
            }
            ((InterfaceC75495Tk3) t).C8();
            return;
        }
        T t2 = this.LJLIL.mView;
        if (t2 == 0) {
            return;
        }
        ((InterfaceC75495Tk3) t2).G9(true);
    }

    @Override // X.C75446TjG, X.InterfaceC75447TjH
    public final void LLLLLLLLLL(LinkMessage linkMessage) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("link_finish_message = ");
        LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZJ, linkMessage));
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        T t = this.LJLIL.mView;
        if (t == 0) {
            return;
        }
        ((InterfaceC75495Tk3) t).R5(linkMessage);
    }

    @Override // X.C75446TjG, X.InterfaceC75449TjJ
    public final void LLZILL(LinkMessage message) {
        T t;
        MultiGuestDataHolder multiGuestDataHolder;
        if (!this.LJLIL.LJLJL) {
            return;
        }
        o.LJIIIZ(message, "message");
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent = message.multiLiveUpdateUserSettingContent;
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        if (c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER") != null && (multiGuestDataHolder = (MultiGuestDataHolder) c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER")) != null) {
            multiGuestDataHolder.LJIIJ = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings;
        }
        C74838TYs LJ = C74838TYs.LJ();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings;
        LJ.LJJI = multiLiveAnchorPanelSettings;
        if (C74776TWi.LJIILL(multiLiveAnchorPanelSettings)) {
            if (C74776TWi.LJIILIIL(multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings)) {
                T t2 = this.LJLIL.mView;
                if (t2 != 0) {
                    ((InterfaceC75495Tk3) t2).C8();
                }
            } else {
                T t3 = this.LJLIL.mView;
                if (t3 != 0) {
                    ((InterfaceC75495Tk3) t3).C8();
                }
            }
        } else if (C74776TWi.LJIIL() && (t = this.LJLIL.mView) != 0) {
            ((InterfaceC75495Tk3) t).G9(false);
        }
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(MultiGuestAnchorPanelSettingChangeFromIMEvent.class);
        }
    }

    @Override // X.C75446TjG, X.InterfaceC75452TjM
    public final void Ld(LinkMicAdMessage linkMicAdMessage) {
        if (!MultiGuestPlayAdSwitch.INSTANCE.getValue()) {
            return;
        }
        String tag = C75492Tk0.LJJJJL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAdStart message: ");
        LIZ.append(linkMicAdMessage);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C32014ChO.LJFF(tag, msg);
        if (linkMicAdMessage.linkAdContents.isEmpty()) {
            C32014ChO.LJIIIZ(C75492Tk0.LJJJJL(), "linkAdContents is empty");
        } else {
            this.LJLIL.dataChannel.qv0(MultiGuestAdStartEvent.class, ListProtector.get(linkMicAdMessage.linkAdContents, 0));
        }
    }

    @Override // X.C75446TjG, X.InterfaceC75448TjI
    public final void M8(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        C75492Tk0 c75492Tk0;
        T t;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive anchor guide message, messageType = ");
        LIZ.append(linkMicAnchorGuideMessage.guideType);
        LIZ.append(", message: ");
        LIZ.append(linkMicAnchorGuideMessage);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        if (C75492Tk0.LJLLLL || (t = (c75492Tk0 = this.LJLIL).mView) == 0 || !c75492Tk0.LJLJJL) {
            return;
        }
        ((InterfaceC75495Tk3) t).M8(linkMicAnchorGuideMessage);
    }

    @Override // X.C75446TjG, X.InterfaceC75450TjK
    public final void V5(CohostReserveMessage cohostReserveMessage) {
        ((InterfaceC75495Tk3) this.LJLIL.mView).V5(cohostReserveMessage);
    }

    @Override // X.C75446TjG, X.InterfaceC75448TjI
    public final void W(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        C75492Tk0 c75492Tk0;
        T t;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive anchor guide message, messageType = ");
        LIZ.append(linkMicAnchorGuideMessage.guideType);
        LIZ.append(", message: ");
        LIZ.append(linkMicAnchorGuideMessage);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        if (C75492Tk0.LJLLLL || (t = (c75492Tk0 = this.LJLIL).mView) == 0 || !c75492Tk0.LJLJJL) {
            return;
        }
        ((InterfaceC75495Tk3) t).W(linkMicAnchorGuideMessage);
    }

    @Override // X.C75446TjG, X.InterfaceC75448TjI
    public final void h8(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive anchor guide message, messageType = ");
        LIZ.append(linkMicAnchorGuideMessage.guideType);
        LIZ.append(", message: ");
        LIZ.append(linkMicAnchorGuideMessage);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        if (C75492Tk0.LJLLLL) {
            return;
        }
        C75492Tk0 c75492Tk0 = this.LJLIL;
        if (c75492Tk0.mView == 0 || !c75492Tk0.LJLJJL || C75650TmY.LIZJ()) {
            return;
        }
        ((InterfaceC75495Tk3) this.LJLIL.mView).h8(linkMicAnchorGuideMessage);
    }

    @Override // X.C75446TjG, X.InterfaceC75450TjK
    public final void mk(CohostReserveMessage cohostReserveMessage) {
        boolean ta0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive cohost reserve message, message: ");
        LIZ.append(cohostReserveMessage);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        if (C75492Tk0.LJLLLL) {
            return;
        }
        C75492Tk0 c75492Tk0 = this.LJLIL;
        if (c75492Tk0.mView == 0 || !c75492Tk0.LJLJJL || !(ta0 = ((IInteractService) CN1.LIZ(IInteractService.class)).ta0())) {
            return;
        }
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null && dataChannel.kv0(C75503TkB.class) != null && Boolean.TRUE.equals(this.LJLIL.dataChannel.kv0(C75503TkB.class))) {
            return;
        }
        long j = cohostReserveMessage.baseMessage.createTime;
        if (j < C75893TqT.LIZ || j < C75893TqT.LJ) {
            return;
        }
        C75893TqT.LIZ = System.currentTimeMillis();
        ReserveContent reserveContent = cohostReserveMessage.reserveContent;
        if (reserveContent != null) {
            C75893TqT.LIZLLL = reserveContent.redDotNum;
            User user = reserveContent.reserver;
            if (user != null) {
                C75642TmQ.LJJIJLIJ(user.getIdStr(), this.LJLIL.LJLJJI, String.valueOf(cohostReserveMessage.reservationId), ta0);
            }
        }
        DataChannel dataChannel2 = this.LJLIL.dataChannel;
        if (dataChannel2 != null && dataChannel2.kv0(C74968TbY.class) != null && Boolean.TRUE.equals(this.LJLIL.dataChannel.kv0(C74968TbY.class))) {
            return;
        }
        ((InterfaceC75495Tk3) this.LJLIL.mView).Yu(cohostReserveMessage);
    }

    @Override // X.C75446TjG, X.InterfaceC75448TjI
    public final void q2(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        C75492Tk0 c75492Tk0;
        T t;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive anchor guide message, messageType = ");
        LIZ.append(linkMicAnchorGuideMessage.guideType);
        LIZ.append(", message: ");
        LIZ.append(linkMicAnchorGuideMessage);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        if (C75492Tk0.LJLLLL || (t = (c75492Tk0 = this.LJLIL).mView) == 0 || !c75492Tk0.LJLJJL) {
            return;
        }
        ((InterfaceC75495Tk3) t).q2(linkMicAnchorGuideMessage);
    }

    @Override // X.C75446TjG, X.InterfaceC75451TjL
    public final void r8(CohostTopicMessage cohostTopicMessage) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (this.LJLIL.LJLJJL || C8E.LIZLLL().LLII() == EnumC75620Tm4.Linked) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveTopicSetMessage at audience side, channelId = ");
        LIZ.append(C8E.LIZLLL().LJJLI());
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        TopicSetContent topicSetContent = cohostTopicMessage.topicSetContent;
        long j6 = 0;
        if (topicSetContent != null) {
            j = topicSetContent.setSuccTime;
        } else {
            j = 0;
        }
        if (j < C75633TmH.LIZIZ || (!C75633TmH.LIZ.isEmpty())) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init topic info, channelId = ");
        LIZ2.append(C8E.LIZLLL().LJJLI());
        LIZ2.append(", topic = ");
        LIZ2.append(cohostTopicMessage.topic);
        C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        C75633TmH.LJIIJ = false;
        C75633TmH.LIZ.put(U26.LIZ(), cohostTopicMessage.topic);
        TopicSetContent topicSetContent2 = cohostTopicMessage.topicSetContent;
        if (topicSetContent2 != null) {
            j2 = topicSetContent2.setSuccTime;
        } else {
            j2 = 0;
        }
        C75633TmH.LIZIZ = j2;
        TopicSessionStatus topicSessionStatus = cohostTopicMessage.sessionStatus;
        if (topicSessionStatus != null) {
            j3 = topicSessionStatus.sessionId;
        } else {
            j3 = 0;
        }
        C75633TmH.LIZJ = j3;
        if (topicSessionStatus != null) {
            j4 = topicSessionStatus.sessionHeat;
        } else {
            j4 = 0;
        }
        C75633TmH.LJFF = j4;
        CohostTopic cohostTopic = cohostTopicMessage.topic;
        if (cohostTopic != null) {
            j5 = cohostTopic.totalHeat;
        } else {
            j5 = 0;
        }
        C75633TmH.LJIIIZ = j5;
        if (cohostTopic != null) {
            j6 = cohostTopic.totalRivals;
        }
        C75633TmH.LJII = j6;
    }

    @Override // X.C75446TjG, X.InterfaceC75452TjM
    public final void y(LinkMicAdMessage linkMicAdMessage) {
        if (!MultiGuestPlayAdSwitch.INSTANCE.getValue()) {
            return;
        }
        String tag = C75492Tk0.LJJJJL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAdStop message: ");
        LIZ.append(linkMicAdMessage);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C32014ChO.LJFF(tag, msg);
        this.LJLIL.dataChannel.pv0(MultiGuestAdStopEvent.class);
    }

    @Override // X.C75446TjG, X.InterfaceC75448TjI
    public final void y7(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        String str;
        User user = linkMicAnchorGuideMessage.user;
        if (user != null) {
            str = String.valueOf(user.getId());
        } else {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive anchor guide message, reminding userId = ");
        LIZ.append(str);
        LIZ.append(", message: ");
        LIZ.append(linkMicAnchorGuideMessage);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        if (C75492Tk0.LJLLLL) {
            return;
        }
        C75492Tk0 c75492Tk0 = this.LJLIL;
        if (c75492Tk0.mView == 0 || !c75492Tk0.LJLJJL || !InterfaceC30442Bx8.LLFFF.LIZJ().booleanValue() || RandomLinkMicManager.LJIIIIZZ() || RandomLinkMicManager.LJII() || C75650TmY.LIZJ() || C75650TmY.LIZIZ() || C76265TwT.LJ()) {
            return;
        }
        ((InterfaceC75495Tk3) this.LJLIL.mView).y7(linkMicAnchorGuideMessage);
    }
}
