package X;

import Y.ARunnableS17S0101000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U67 implements InterfaceC76622U5i {
    public U7T LJLIL;
    public final long LJLILLLLZI = LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.INSTANCE.getValue().timeOUt;
    public C73411SrX LJLJI;
    public C18520o4 LJLJJI;

    @Override // X.InterfaceC76622U5i
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIL(ApplyGroupMessage applyGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJ(U7T u7t, JoinChannelMessage joinChannelMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJ(ReplyInviteGroupMessage replyInviteGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJZ(CancelInviteGroupMessage cancelInviteGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJZ(GroupChangeMessage groupChangeMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final boolean LJJLIIIJILLIZJL() {
        return false;
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLIL(LeaveGroupMessage leaveGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLLL(long j) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LL(PermitApplyGroupMessage permitApplyGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final boolean LLFFF() {
        return false;
    }

    @Override // X.InterfaceC76622U5i
    public final List<U62> LLFII() {
        return null;
    }

    @Override // X.InterfaceC76622U5i
    public final void LLII(CancelApplyGroupMessage cancelApplyGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LLIILZL(InviteGroupMessage inviteGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILLJJLI(P2PGroupChangeMessage p2PGroupChangeMessage, boolean z) {
    }

    public final void LIZIZ() {
        U4R.LIZLLL("FirstFrameNotReceiveExpMonitorForGuest", "detach");
        U7T u7t = this.LJLIL;
        if (u7t != null) {
            u7t.LJJJJLI(this);
        }
        if (LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.INSTANCE.getValue().reportWhenNotReachFrameLinked) {
            LIZLLL(20009, "detach");
        } else {
            LIZJ("detach");
        }
        this.LJLIL = null;
    }

    public final void LIZJ(String str) {
        UC7.LJ("disposeCountDown, source=", str, "FirstFrameNotReceiveExpMonitorForGuest");
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJJI = null;
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJLI(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76622U5i
    public final List LJJLIIIJLJLI(U7F linker) {
        o.LJIIIZ(linker, "linker");
        return null;
    }

    @Override // X.InterfaceC76622U5i
    public final List LLIIZ(U7T linker) {
        o.LJIIIZ(linker, "linker");
        return null;
    }

    public final void LIZ(U7T linker, long j) {
        Long l;
        o.LJIIIZ(linker, "linker");
        Room room = linker.LJ;
        if (room != null && room.getOwnerUserId() == j) {
            return;
        }
        StringBuilder LIZJ = V10.LIZJ("attach, userId=", j, ", roomId=");
        Room room2 = linker.LJ;
        Long l2 = null;
        if (room2 != null) {
            l = Long.valueOf(room2.getId());
        } else {
            l = null;
        }
        LIZJ.append(l);
        LIZJ.append(", roomUserId=");
        Room room3 = linker.LJ;
        if (room3 != null) {
            l2 = Long.valueOf(room3.getOwnerUserId());
        }
        LIZJ.append(l2);
        U4R.LIZLLL("FirstFrameNotReceiveExpMonitorForGuest", X1D.LIZIZ(LIZJ));
        this.LJLIL = linker;
        linker.LLLLLZ(this);
    }

    public final void LIZLLL(int i, String source) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryReportExceptionAndDisposeCountDown, source=");
        LIZ.append(source);
        LIZ.append(", exceptionType");
        LIZ.append(i);
        U4R.LIZLLL("FirstFrameNotReceiveExpMonitorForGuest", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tryReportException, source=");
        LIZ2.append(source);
        LIZ2.append(", exceptionType");
        LIZ2.append(i);
        U4R.LIZLLL("FirstFrameNotReceiveExpMonitorForGuest", X1D.LIZIZ(LIZ2));
        if (this.LJLJJI != null) {
            U7T u7t = this.LJLIL;
            o.LJIIIZ(source, "source");
            U4R.LIZLLL("FirstFrameNotReceiveExpMonitorForGuest", "monitorException");
            C75516TkO c75516TkO = C75516TkO.LIZ;
            StringBuilder LIZIZ = C25620zW.LIZIZ("source=", source, ", currentSate=");
            if (u7t != null) {
                num = Integer.valueOf(u7t.LJIILJJIL.LIZ);
            } else {
                num = null;
            }
            LIZIZ.append(num);
            c75516TkO.LIZ(i, X1D.LIZIZ(LIZIZ), null);
        }
        LIZJ(source);
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIILJJIL(U7T linker, KickOutMessage kickOutMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIJJ(U66 linker, LeaveMessage leaveMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJJ(U6D linker, InviteMessage inviteMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLIIIIJ(U7T linker, InviteMessage inviteMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLIIIJJI(U6D linker, CancelInviteMessage cancelInviteMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLJ(U6D linker, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLL(U7T linker, PermitApplyMessage permitApplyMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJZZIII(U7T linker, DirectJoinMessage directJoinMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLILLLLZI(U6D linker, DestroyChannelMessage destroyChannelMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLLILLLL(U6D linker, ApplyMessage applyMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LLD(U6D linker, PermitApplyMessage permitApplyMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LLI(int i, U6D linker) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkMicStateChanged, state=");
        LIZ.append(i);
        U4R.LIZLLL("FirstFrameNotReceiveExpMonitorForGuest", X1D.LIZIZ(LIZ));
        C76766UAw.LIZJ.LIZJ(new ARunnableS17S0101000_13(i, this, 24));
    }

    @Override // X.InterfaceC76622U5i
    public final void LLIL(U6D linker, CreateChannelMessage createChannelMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILIL(U7T linker, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILLIZIL(U6D linker, CancelApplyMessage cancelApplyMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJIIZ(U6D linker, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        o.LJIIIZ(linker, "linker");
    }
}
