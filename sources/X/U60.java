package X;

import Y.ARunnableS16S0201000_13;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerformanceReportOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.CohostUserInfo;
import webcast.im.CohostContent;
import webcast.im.ListChangeBizContent;

/* loaded from: classes14.dex */
public final class U60 implements InterfaceC76622U5i {
    public final /* synthetic */ U65 LJLIL;
    public final /* synthetic */ C76765UAv LJLILLLLZI;

    @Override // X.InterfaceC76622U5i
    public final boolean LJJLIIIJILLIZJL() {
        return false;
    }

    @Override // X.InterfaceC76622U5i
    public final List<U62> LLFII() {
        return null;
    }

    @Override // X.InterfaceC76622U5i
    public final boolean LLFFF() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        C75745To5 c75745To5 = this.LJLIL.LJII().LIZ.LJLJL;
        if (c75745To5 != null && (interfaceC65784Pro = c75745To5.LJIIIIZZ) != null) {
            return interfaceC65784Pro.invoke().booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC76622U5i
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
        Iterator<U62> it = this.LJLIL.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJII(interfaceC75941TrF);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
        Iterator<U62> it = this.LJLIL.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJIILIIL(source);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIL(ApplyGroupMessage applyGroupMessage) {
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJLLLL(u65, applyGroupMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJ(ReplyInviteGroupMessage replyInviteGroupMessage) {
        String cohostLayoutId;
        if (replyInviteGroupMessage.getAgreeStatus() == 1) {
            U8H LJFF = this.LJLIL.LJFF();
            if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && this.LJLIL.LLIIJI().LJJIIZI().size() == 2) {
                cohostLayoutId = "2003";
            } else {
                cohostLayoutId = MultiCohostAreaExpandSetting.INSTANCE.getCohostLayoutId();
            }
            LJFF.A1(cohostLayoutId, true);
        }
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJLJ(u65, replyInviteGroupMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJLI(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJZ(CancelInviteGroupMessage cancelInviteGroupMessage) {
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJL(u65, cancelInviteGroupMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJZ(GroupChangeMessage groupChangeMessage) {
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJLIIIL(u65, groupChangeMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final List LJJLIIIJLJLI(U7F linker) {
        o.LJIIIZ(linker, "linker");
        return null;
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLIL(LeaveGroupMessage leaveGroupMessage) {
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJIILL(u65, leaveGroupMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLLL(long j) {
        this.LJLIL.LJFF().LJJLIIIJLJLI(j);
        this.LJLIL.LJIIJJI();
    }

    @Override // X.InterfaceC76622U5i
    public final void LL(PermitApplyGroupMessage permitApplyGroupMessage) {
        String cohostLayoutId;
        if (permitApplyGroupMessage.getAgreeStatus() == 1) {
            U8H LJFF = this.LJLIL.LJFF();
            if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && this.LJLIL.LLIIJI().LJJIIZI().size() == 2) {
                cohostLayoutId = "2003";
            } else {
                cohostLayoutId = MultiCohostAreaExpandSetting.INSTANCE.getCohostLayoutId();
            }
            LJFF.A1(cohostLayoutId, true);
        }
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLFF(u65, permitApplyGroupMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLII(CancelApplyGroupMessage cancelApplyGroupMessage) {
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLIIJI(u65, cancelApplyGroupMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLIILZL(InviteGroupMessage inviteGroupMessage) {
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJLIIJ(u65, inviteGroupMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final List LLIIZ(U7T linker) {
        o.LJIIIZ(linker, "linker");
        U65 u65 = this.LJLIL;
        CopyOnWriteArraySet<U62> copyOnWriteArraySet = u65.LJLJJLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(copyOnWriteArraySet, 10));
        Iterator<U62> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJJIII(u65));
        }
        return arrayList;
    }

    public U60(U65 u65, C76765UAv c76765UAv) {
        this.LJLIL = u65;
        this.LJLILLLLZI = c76765UAv;
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIILJJIL(U7T linker, KickOutMessage kickOutMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onKickOutMessageReceived linker=");
        LIZ.append(linker);
        LIZ.append(" kickOutMessage=");
        LIZ.append(kickOutMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJJIL(u65, kickOutMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIJJ(U66 linker, LeaveMessage leaveMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLeaveMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" leaveMessage=");
        LIZ.append(leaveMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJIIJJI(u65, leaveMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJ(U7T u7t, JoinChannelMessage joinChannelMessage) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onJoinChannelMessageReceived start linker=");
        LIZ.append(u7t);
        LIZ.append(" joinChannelMessage=");
        LIZ.append(joinChannelMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJIJ(u65, joinChannelMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJJ(U6D linker, InviteMessage inviteMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" inviteMessage=");
        LIZ.append(inviteMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJLL(u65, inviteMessage);
        }
        U8H.LJJLL(this.LJLIL.LJFF(), inviteMessage.getInviter(), null, linker.LLZILL(), 6);
        U6E LJJI = this.LJLIL.LJFF().LJJI();
        LJJI.getClass();
        LJJI.LJI.invoke("onInviteMessageReceived");
        LJJI.LJ.invoke(inviteMessage.getLayoutDSLConfig());
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLIIIIJ(U7T linker, InviteMessage inviteMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAnchorReceiveModeratorInviteMessage start linker=");
        LIZ.append(linker);
        LIZ.append(" inviteMessage=");
        LIZ.append(inviteMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        InviteMessage inviteMessage2 = new InviteMessage(inviteMessage.getInviter(), inviteMessage.getInviteeFixedMicInfo(), this.LJLIL.LJ(inviteMessage.getLayoutDSLConfig()), inviteMessage.getCustomMessage(), inviteMessage.getInviteSource(), inviteMessage.getInviteeUserInfo());
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJLIL(u65, inviteMessage2);
        }
        U6E LJJI = this.LJLIL.LJFF().LJJI();
        LJJI.getClass();
        LayoutDSLConfig layoutDSLConfig = inviteMessage2.getLayoutDSLConfig();
        LJJI.LJI.invoke("onAnchorReceiveModeratorInviteMessage");
        LJJI.LIZJ.invoke(Boolean.TRUE);
        LJJI.LJ.invoke(layoutDSLConfig);
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLIIIJJI(U6D linker, CancelInviteMessage cancelInviteMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelInviteMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" cancelInviteMessage=");
        LIZ.append(cancelInviteMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJII(u65, cancelInviteMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLJ(U6D linker, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReplyInviteMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" replyInviteMessage=");
        LIZ.append(replyInviteMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLILII(u65, replyInviteMessage);
        }
        if (replyInviteMessage.getReplyStatus() == 1) {
            this.LJLIL.LJFF().LJJI().LIZIZ();
            this.LJLIL.LJFF().LJJZZI(EnumC75419Tip.StateJoined, replyInviteMessage.getInvitee());
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLL(U7T linker, PermitApplyMessage permitApplyMessage) {
        Long l;
        String str;
        Long l2;
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAnchorReceivePermitApplyMessage start linker=");
        LIZ.append(linker);
        LIZ.append(" permitApplyMessage=");
        LIZ.append(permitApplyMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        LayoutDSLConfig LJ = this.LJLIL.LJ(permitApplyMessage.getLayoutDSLConfig());
        String str2 = null;
        if (linker.LLZILL()) {
            if (LJ != null) {
                U65 u65 = this.LJLIL;
                if (permitApplyMessage.getPermitStatus() == 1) {
                    U6E LJJI = u65.LJFF().LJJI();
                    LJJI.getClass();
                    LJJI.LIZ("onAnchorReceiveModeratorPermitApplyMessage", LJ);
                }
            }
        } else if (LJ != null) {
            U65 u652 = this.LJLIL;
            if (permitApplyMessage.getPermitStatus() == 1) {
                u652.LJFF().LJJI().LJ.invoke(LJ);
                InterfaceC75973Trl LLIIJI = u652.LLIIJI();
                LinkUser.Builder builder = new LinkUser.Builder();
                LinkUser applier = permitApplyMessage.getApplier();
                if (applier != null) {
                    l = applier.getUserId();
                } else {
                    l = null;
                }
                builder.setUserId(l);
                LinkUser applier2 = permitApplyMessage.getApplier();
                if (applier2 != null) {
                    str = applier2.getLinkMicId();
                } else {
                    str = null;
                }
                builder.setLinkMicId(str);
                LLIIJI.LJJJJLI(builder.build());
            }
        }
        if (permitApplyMessage.getPermitStatus() == 1) {
            InterfaceC75973Trl LLIIJI2 = this.LJLIL.LLIIJI();
            LinkUser.Builder builder2 = new LinkUser.Builder();
            LinkUser applier3 = permitApplyMessage.getApplier();
            if (applier3 != null) {
                l2 = applier3.getUserId();
            } else {
                l2 = null;
            }
            builder2.setUserId(l2);
            LinkUser applier4 = permitApplyMessage.getApplier();
            if (applier4 != null) {
                str2 = applier4.getLinkMicId();
            }
            builder2.setLinkMicId(str2);
            LLIIJI2.LJJJJ(builder2.build());
        }
        U65 u653 = this.LJLIL;
        Iterator<U62> it = u653.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJJJL(u653, permitApplyMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJZZIII(U7T linker, DirectJoinMessage directJoinMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onJoinDirectMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" message=");
        LIZ.append(directJoinMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJJJ(u65, directJoinMessage);
        }
        if (this.LJLIL.LJLJJI.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            this.LJLIL.LJFF().LJJI().LIZIZ();
            this.LJLIL.LJFF().LJJZZI(EnumC75419Tip.StateJoined, directJoinMessage.getJoiner());
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLILLLLZI(U6D linker, DestroyChannelMessage destroyChannelMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroyChannelMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" destroyMessage=");
        LIZ.append(destroyChannelMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        this.LJLIL.LJFF().destroy();
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJJI(u65, destroyChannelMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLLILLLL(U6D linker, ApplyMessage applyMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" applyMessage=");
        LIZ.append(applyMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLILLJJLI(u65, applyMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLD(U6D linker, PermitApplyMessage permitApplyMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReplyApplyMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" permitApplyMessage=");
        LIZ.append(permitApplyMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJLLILLLL(u65, permitApplyMessage);
        }
        U8H.LJJLL(this.LJLIL.LJFF(), permitApplyMessage.getApprover(), null, false, 6);
        if (permitApplyMessage.getPermitStatus() == 1) {
            if (linker.LLZILL()) {
                U6E LJJI = this.LJLIL.LJFF().LJJI();
                LJJI.getClass();
                LJJI.LJI.invoke("onReplyApplyMessageReceived");
                LinkUser applier = permitApplyMessage.getApplier();
                if (applier != null) {
                    LJJI.LIZIZ.LJIILJJIL(new C76701U8j(EnumC75419Tip.StateJoined, applier.getUserId(), applier.getLinkMicId(), null, null, null, 248), null);
                }
                LJJI.LIZJ.invoke(Boolean.TRUE);
                LJJI.LJ.invoke(permitApplyMessage.getLayoutDSLConfig());
                return;
            }
            LayoutDSLConfig layoutDSLConfig = permitApplyMessage.getLayoutDSLConfig();
            if (layoutDSLConfig == null) {
                return;
            }
            this.LJLIL.LJFF().LJJI().LJ.invoke(layoutDSLConfig);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLI(int i, U6D linker) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkMicStateChanged start linker=");
        LIZ.append(linker);
        LIZ.append(" state=");
        LIZ.append(i);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        RtcUserInfo LLZL = linker.LLZL();
        boolean z = false;
        if (i == 1 && this.LJLIL.LJLJJI.getOwnerUserId() == LLZL.getUserId()) {
            U8H LJFF = this.LJLIL.LJFF();
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setRoomId(Long.valueOf(LLZL.getRoomId()));
            builder.setUserId(Long.valueOf(LLZL.getUserId()));
            builder.setLinkMicId(LLZL.getLinkMicId());
            builder.setChannelId(Long.valueOf(LLZL.getChannelId()));
            U8H.LJJLL(LJFF, builder.build(), null, false, 14);
        }
        if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
            this.LJLILLLLZI.LIZIZ(new ARunnableS16S0201000_13(i, LLZL, this.LJLIL, 5));
        }
        U8H LJFF2 = this.LJLIL.LJFF();
        if (i >= 3) {
            z = true;
        }
        LJFF2.getClass();
        String LJJJ = U8H.LJJJ(1409);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJFF2.LJJIJ());
        LIZ2.append(":updateLinkState isInLinked:");
        LIZ2.append(z);
        C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ2), null);
        LJFF2.LJJLJ(z);
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJLILLLLZI(u65, i);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLIL(U6D linker, CreateChannelMessage createChannelMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreateChannelMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" createMessage=");
        LIZ.append(createChannelMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJLZ(u65, createChannelMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILIL(U7T linker, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onModeratorReceiveReplyInviteMessage start linker=");
        LIZ.append(linker);
        LIZ.append(" replyInviteMessage=");
        LIZ.append(replyInviteMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLJIJIL(u65, replyInviteMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILLIZIL(U6D linker, CancelApplyMessage cancelApplyMessage) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelApplyMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" cancelApplyMessage=");
        LIZ.append(cancelApplyMessage);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJZ(u65, cancelApplyMessage);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILLJJLI(P2PGroupChangeMessage p2PGroupChangeMessage, boolean z) {
        CohostContent cohostContent;
        ListChangeBizContent listChangeBizContent;
        java.util.Map<Long, CohostUserInfo> map;
        if (z) {
            U4R.LIZLLL("LiveLinkMicSession", "P2P group change message callback for business.");
            U65 u65 = this.LJLIL;
            Iterator<U62> it = u65.LJLJJLL.iterator();
            while (it.hasNext()) {
                it.next().LLILIL(u65, p2PGroupChangeMessage);
            }
        }
        List<LinkUser> K9 = this.LJLIL.LJLJJL.LLZZ().K9();
        List<LinkUser> LJJJ = this.LJLIL.LJLJJL.LLZZ().LJJJ();
        List<LinkUser> LJJIIZI = this.LJLIL.LJLJJL.LLZZ().LJJIIZI();
        List<LinkUser> LJJIZ = this.LJLIL.LJLJJL.LLZZ().LJJIZ();
        List<LinkUser> LJFF = this.LJLIL.LJLJJL.LLZZ().LJFF();
        List<LinkUser> LJJJJZ = this.LJLIL.LJLJJL.LLZZ().LJJJJZ();
        List<LinkUser> LJJIJLIJ = this.LJLIL.LJLJJL.LLZZ().LJJIJLIJ();
        U65 u652 = this.LJLIL;
        Iterator<U62> it2 = u652.LJLJJLL.iterator();
        while (it2.hasNext()) {
            U62 next = it2.next();
            int i = u652.LJLILLLLZI;
            BusinessContent businessContent = new BusinessContent(0L, null, null, 7, null);
            CohostContent cohostContent2 = new CohostContent();
            ListChangeBizContent listChangeBizContent2 = new ListChangeBizContent();
            BusinessContent businessContent2 = p2PGroupChangeMessage.getBusinessContent();
            if (businessContent2 != null && (cohostContent = businessContent2.cohostContent) != null && (listChangeBizContent = cohostContent.listChangeBizContent) != null && (map = listChangeBizContent.userInfos) != null) {
                listChangeBizContent2.userInfos = map;
            }
            cohostContent2.listChangeBizContent = listChangeBizContent2;
            businessContent.cohostContent = cohostContent2;
            next.LJZL(u652, LJJIIZI, LJJJ, K9, LJJIZ, LJFF, LJJJJZ, LJJIJLIJ, "p2pGroupIM", new CustomLinkMessage(i, new BizContentWrapper(businessContent), null));
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJIIZ(U6D linker, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        o.LJIIIZ(linker, "linker");
        U65 u65 = this.LJLIL;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJLIIIJL(u65, i, linkCoreError, abnormalDisconnectReason);
        }
    }
}
