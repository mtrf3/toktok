package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TS9 implements U62 {
    public final /* synthetic */ GameLinkGuestPresenter LJLIL;

    @Override // X.U62
    public final void LJ(long j, int i) {
    }

    @Override // X.U62
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
    }

    @Override // X.U62
    public final void LJIIL(long j, long j2) {
    }

    @Override // X.U62
    public final void LJIJI(String str, String str2) {
    }

    @Override // X.U62
    public final void LJIJJ(java.util.Map<String, String> map) {
    }

    @Override // X.U62
    public final void LJJIJIIJIL() {
    }

    @Override // X.U62
    public final void LJLJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    @Override // X.U62
    public final void LJJIFFI() {
        this.LJLIL.handleRtcChannelJoined();
    }

    public TS9(GameLinkGuestPresenter gameLinkGuestPresenter) {
        this.LJLIL = gameLinkGuestPresenter;
    }

    @Override // X.U62
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.U62
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
        TYP.LIZ("GameLinkGuestPresenter", "receive rtc turnOffEngine msg", false);
        this.LJLIL.onTurnOffEngine(source);
    }

    @Override // X.U62
    public final InterfaceC76688U7w LJJIII(U65 session) {
        o.LJIIIZ(session, "session");
        return null;
    }

    @Override // X.U62
    public final void LLD(U65 session) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLFII(U65 session) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLIILII(C28272B7s sei) {
        o.LJIIIZ(sei, "sei");
    }

    @Override // X.U62
    public final UB4 LLIL(InterfaceC75441TjB session) {
        o.LJIIIZ(session, "session");
        return null;
    }

    @Override // X.U62
    public final void LLILZ(U65 session) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJIIIIZZ(List<LinkUser> list, List<LinkUser> list2) {
        TRA.LJIJI(list, list2);
    }

    @Override // X.U62
    public final void LJIIIZ(List<LinkUser> list, List<LinkUser> list2) {
        TRA.LJIJ(list, list2);
    }

    @Override // X.U62
    public final void LJIIJJI(InterfaceC75441TjB session, LeaveMessage leaveMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Receive use(");
        LIZ.append(leaveMessage.getLeftUser().getUserId());
        LIZ.append(") leave message, isGuestLeavingOrLeft(");
        LIZ.append(C74838TYs.LJ().LJJIIZ);
        LIZ.append(')');
        TYP.LIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ), false);
        Long userId = leaveMessage.getLeftUser().getUserId();
        long userId2 = this.LJLIL.getUserId();
        if (userId == null || userId.longValue() != userId2 || C74838TYs.LJ().LJJIIZ) {
            return;
        }
        this.LJLIL.handleLeaveMessage(leaveMessage);
        TYP.LIZ("GameLinkGuestPresenter", "current use leave message", false);
    }

    @Override // X.U62
    public final void LJIILL(U65 u65, LeaveGroupMessage leaveGroupMessage) {
        TRA.LJIILLIIL(u65, leaveGroupMessage);
    }

    @Override // X.U62
    public final void LJIILLIIL(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJIJ(U65 session, JoinChannelMessage joinChannelMessage) {
        o.LJIIIZ(session, "session");
        boolean joinChannelSucceed = joinChannelMessage.getJoinChannelSucceed();
        if (joinChannelSucceed) {
            this.LJLIL.handleJoinChannelSucceed(joinChannelMessage.getLinker().LLZL().getLinkMicId());
        } else {
            if (joinChannelSucceed) {
                return;
            }
            this.LJLIL.handleJoinChannelFailed(joinChannelMessage.getThrowable());
        }
    }

    @Override // X.U62
    public final void LJJII(InterfaceC75441TjB session, CancelInviteMessage cancelInviteMessage) {
        o.LJIIIZ(session, "session");
        this.LJLIL.handleCancelMessage(cancelInviteMessage);
    }

    @Override // X.U62
    public final void LJJIIZI(String linkMicId, long j) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJLIL.onUserLeft(linkMicId, j);
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB interfaceC75441TjB, DestroyChannelMessage destroyChannelMessage) {
        TRA.LJIIIZ(interfaceC75441TjB, destroyChannelMessage);
    }

    @Override // X.U62
    public final void LJJJIL(InterfaceC75441TjB session, KickOutMessage kickOutMessage) {
        o.LJIIIZ(session, "session");
        Long userId = kickOutMessage.getOwner().getUserId();
        long userId2 = this.LJLIL.getUserId();
        if (userId == null || userId.longValue() != userId2) {
            return;
        }
        this.LJLIL.handleKickOutMessage(kickOutMessage);
        TYP.LIZ("GameLinkGuestPresenter", "kick out by host", false);
    }

    @Override // X.U62
    public final void LJJJJ(U65 u65, DirectJoinMessage directJoinMessage) {
        TRA.LJIILJJIL(u65, directJoinMessage);
    }

    @Override // X.U62
    public final void LJJJJL(U65 u65, PermitApplyMessage permitApplyMessage) {
        TRA.LIZIZ(u65, permitApplyMessage);
    }

    @Override // X.U62
    public final void LJJJJZI(U65 u65, String str) {
        TRA.LJJIIZ(u65, str);
    }

    @Override // X.U62
    public final void LJJJLL(U65 session, LinkCoreError error) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(error, "error");
        TYP.LIZ("GameLinkGuestPresenter", "receive rtcError msg", false);
        this.LJLIL.onError(error.getErrorCode(), error.getErrorMsg());
    }

    @Override // X.U62
    public final void LJJL(U65 u65, CancelInviteGroupMessage cancelInviteGroupMessage) {
        TRA.LJI(u65, cancelInviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLIIIJLJLI(InterfaceC75441TjB session, C75745To5 c75745To5) {
        o.LJIIIZ(session, "session");
        this.LJLIL.handleRTCInitMessage(c75745To5);
    }

    @Override // X.U62
    public final void LJJLIIJ(U65 u65, InviteGroupMessage inviteGroupMessage) {
        TRA.LJIIJJI(u65, inviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLIL(U65 u65, InviteMessage inviteMessage) {
        TRA.LIZ(u65, inviteMessage);
    }

    @Override // X.U62
    public final void LJJLJ(U65 u65, ReplyInviteGroupMessage replyInviteGroupMessage) {
        TRA.LJJIFFI(u65, replyInviteGroupMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.U62
    public final void LJJLL(InterfaceC75441TjB session, InviteMessage inviteMessage) {
        String str;
        String str2;
        BusinessContent bizContent;
        MultiLiveContent multiLiveContent;
        InviteBizContent inviteBizContent;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive InviteMessage, current link state:");
        LIZ.append(this.LJLIL.linkPlayerState.LIZIZ);
        TYP.LIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ), false);
        TSX tsx = (TSX) this.LJLIL.mView;
        if (tsx != null) {
            tsx.forceDismissApplyDialog();
        }
        Integer num = (Integer) this.LJLIL.linkPlayerState.LIZIZ;
        if (num == null || num.intValue() != 0) {
            return;
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLIL;
        RtcUserInfo LLLLLJIL = session.LLLLLJIL();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = null;
        if (LLLLLJIL != null) {
            str = LLLLLJIL.getLinkMicId();
        } else {
            str = null;
        }
        Long channelId = inviteMessage.getInviter().getChannelId();
        if (channelId == null || (str2 = channelId.toString()) == null) {
            str2 = "";
        }
        BizContentWrapper bizContentWrapper = inviteMessage.getCustomMessage().getBizContentWrapper();
        if (bizContentWrapper != null && (bizContent = bizContentWrapper.getBizContent()) != null && (multiLiveContent = bizContent.multiLiveContent) != null && (inviteBizContent = multiLiveContent.inviteIMContent) != null) {
            multiLiveAnchorPanelSettings = inviteBizContent.multiLiveAnchorPanelSettings;
        }
        gameLinkGuestPresenter.tryToShowInvitedDialog(new C74629TQr(str, str2, multiLiveAnchorPanelSettings, 56));
        this.LJLIL.guestInviteType = "anchor_invite_guest";
        C74696TTg.LIZIZ = "anchor_invite_guest";
    }

    @Override // X.U62
    public final void LJLIIIL(U65 u65, GroupChangeMessage groupChangeMessage) {
        TRA.LJIIJ(u65, groupChangeMessage);
    }

    @Override // X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB session, int i) {
        o.LJIIIZ(session, "session");
        TYP.LIZ("GameLinkGuestPresenter", "receive linkMicStateChange", false);
        if (i != 0 && i != 1) {
            return;
        }
        this.LJLIL.getMultiGuestDataHolder().LJJ = null;
    }

    @Override // X.U62
    public final void LJLLILLLL(InterfaceC75441TjB session, PermitApplyMessage permitApplyMessage) {
        int i;
        TU4 LIZ;
        TU4 LIZ2;
        o.LJIIIZ(session, "session");
        if (permitApplyMessage.getPermitStatus() == 1) {
            TT0 LJ = this.LJLIL.getGamelinkManager().LJ();
            if (LJ != null && (LIZ2 = LJ.LIZ()) != null) {
                i = C60903NvH.LJIILLIIL(LIZ2);
            } else {
                i = 0;
            }
            String interactId = this.LJLIL.getInteractId();
            if (interactId == null) {
                interactId = "";
            }
            GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLIL;
            String str = gameLinkGuestPresenter.anchorInvitationPosition;
            if (str == null) {
                str = "others";
            }
            String str2 = gameLinkGuestPresenter.beInvitedSharePlatform;
            if (str2 == null) {
                str2 = "room";
            }
            TT0 LJ2 = gameLinkGuestPresenter.getGamelinkManager().LJ();
            if (LJ2 == null || (LIZ = LJ2.LIZ()) == null || !C60903NvH.LJIJJ(LIZ)) {
                i++;
            }
            DataChannel dataChannel = this.LJLIL.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            TWL.LJIILIIL("guest_apply_anchor", interactId, str, str2, i, dataChannel, null, 384);
            this.LJLIL.handlePermitMessage(permitApplyMessage);
            TTV.LIZ().LJJ = "apply";
            return;
        }
        if (permitApplyMessage.getPermitStatus() == 2) {
            TYP.LIZ("GameLinkGuestPresenter", "receive host refuse apply", false);
            this.LJLIL.handleRejectMessage(permitApplyMessage);
        } else {
            TYP.LIZ("GameLinkGuestPresenter", "unknow status", false);
        }
    }

    @Override // X.U62
    public final void LJLLLL(U65 u65, ApplyGroupMessage applyGroupMessage) {
        TRA.LIZJ(u65, applyGroupMessage);
    }

    @Override // X.U62
    public final void LJLZ(InterfaceC75441TjB interfaceC75441TjB, CreateChannelMessage createChannelMessage) {
        TRA.LJIIIIZZ(interfaceC75441TjB, createChannelMessage);
    }

    @Override // X.U62
    public final void LJZ(InterfaceC75441TjB interfaceC75441TjB, CancelApplyMessage cancelApplyMessage) {
        TRA.LJFF(interfaceC75441TjB, cancelApplyMessage);
    }

    @Override // X.U62
    public final void LL(InterfaceC75441TjB session, String linkMicId) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        TYP.LIZ("GameLinkGuestPresenter", "receive guest receive firstRemoteVideoOrAudioFrame", false);
        this.LJLIL.onFirstRemoteVideoFrameRender(linkMicId);
    }

    @Override // X.U62
    public final void LLFF(U65 u65, PermitApplyGroupMessage permitApplyGroupMessage) {
        TRA.LJIL(u65, permitApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLIIIJ(U65 session, RtcStartResultMessage rtcStartResultMessage) {
        LinkCoreError error;
        o.LJIIIZ(session, "session");
        boolean startSuccess = rtcStartResultMessage.getStartSuccess();
        if (startSuccess) {
            this.LJLIL.onStartSuccess();
        } else {
            if (startSuccess || (error = rtcStartResultMessage.getError()) == null) {
                return;
            }
            this.LJLIL.onStartFailed(error.getErrorCode(), error.getErrorMsg());
        }
    }

    @Override // X.U62
    public final void LLIIJI(U65 u65, CancelApplyGroupMessage cancelApplyGroupMessage) {
        TRA.LJ(u65, cancelApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLILII(InterfaceC75441TjB interfaceC75441TjB, ReplyInviteMessage replyInviteMessage) {
        TRA.LJJII(interfaceC75441TjB, replyInviteMessage);
    }

    @Override // X.U62
    public final void LLILIL(U65 u65, P2PGroupChangeMessage p2PGroupChangeMessage) {
        TRA.LJIJJLI(u65, p2PGroupChangeMessage);
    }

    @Override // X.U62
    public final void LLILLJJLI(InterfaceC75441TjB interfaceC75441TjB, ApplyMessage applyMessage) {
        TRA.LIZLLL(interfaceC75441TjB, applyMessage);
    }

    @Override // X.U62
    public final void LLJIJIL(U65 u65, ReplyInviteMessage replyInviteMessage) {
        TRA.LJIJJ(u65, replyInviteMessage);
    }

    @Override // X.U62
    public final void LJIIZILJ(String linkMicId, float f, float f2) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJJIJIL(String linkMicId, boolean z, boolean z2) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJJIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        List<String> list;
        List<Boolean> list2;
        GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLIL;
        List<Integer> list3 = null;
        if (strArr != null) {
            list = ORY.LJJZZIII(strArr);
        } else {
            list = null;
        }
        if (zArr != null) {
            list2 = ORY.LJL(zArr);
        } else {
            list2 = null;
        }
        if (iArr != null) {
            list3 = ORY.LJJZ(iArr);
        }
        gameLinkGuestPresenter.handleUserTalkStateUpdated(list, list2, list3);
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        o.LJIIIZ(session, "session");
        this.LJLIL.changeNetworkState(i);
    }

    @Override // X.U62
    public final void LJLI(U65 session, LinkUser joinedUser, CustomLinkMessage customLinkMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(joinedUser, "joinedUser");
        GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLIL;
        String linkMicId = joinedUser.getLinkMicId();
        if (linkMicId == null) {
            linkMicId = "";
        }
        gameLinkGuestPresenter.onUserJoined(linkMicId);
    }

    @Override // X.U62
    public final void LJLJLLL(U65 u65, String str, String str2) {
        TRA.LJJIJIIJIL(u65, str, str2);
    }

    @Override // X.U62
    public final void LJLLI(InterfaceC75441TjB session, String linkMicId, String messageContent) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(messageContent, "messageContent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive RTC RoomMsg received [");
        LIZ.append(messageContent);
        LIZ.append(']');
        TYP.LIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ), false);
        this.LJLIL.onRoomMsgReceived(linkMicId, messageContent);
    }

    @Override // X.U62
    public final void LLIIZ(U65 session, boolean z, LinkCoreError linkCoreError) {
        o.LJIIIZ(session, "session");
        TYP.LIZ("GameLinkGuestPresenter", "receive RTC engine end msg", false);
        if (z) {
            this.LJLIL.onEndSuccess();
        } else {
            if (z || linkCoreError == null) {
                return;
            }
            this.LJLIL.onEndFailed(linkCoreError.getErrorCode(), linkCoreError.getErrorMsg());
        }
    }

    @Override // X.U62
    public final void LJJLIIIJL(InterfaceC75441TjB session, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJZL(InterfaceC75441TjB interfaceC75441TjB, List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3, List<LinkUser> list4, List<LinkUser> list5, List<LinkUser> list6, List<LinkUser> list7, String str, CustomLinkMessage customLinkMessage) {
        TRA.LJJIJ(interfaceC75441TjB, list, list2, list3, list4, list5, list6, list7);
    }
}
