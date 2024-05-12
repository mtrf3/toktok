package X;

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
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TRA {
    public static void LIZ(InterfaceC75441TjB session, InviteMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LIZIZ(InterfaceC75441TjB session, PermitApplyMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LIZJ(InterfaceC75441TjB session, ApplyGroupMessage applyGroupMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(applyGroupMessage, "applyGroupMessage");
    }

    public static void LIZLLL(InterfaceC75441TjB session, ApplyMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJ(InterfaceC75441TjB session, CancelApplyGroupMessage cancelInviteGroupMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(cancelInviteGroupMessage, "cancelInviteGroupMessage");
    }

    public static void LJFF(InterfaceC75441TjB session, CancelApplyMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJI(InterfaceC75441TjB session, CancelInviteGroupMessage cancelInviteGroupMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(cancelInviteGroupMessage, "cancelInviteGroupMessage");
    }

    public static void LJII(InterfaceC75441TjB session, CancelInviteMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIIIIZZ(InterfaceC75441TjB session, CreateChannelMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIIIZ(InterfaceC75441TjB session, DestroyChannelMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIIJ(InterfaceC75441TjB session, GroupChangeMessage groupChangeMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(groupChangeMessage, "groupChangeMessage");
    }

    public static void LJIIJJI(InterfaceC75441TjB session, InviteGroupMessage inviteGroupMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(inviteGroupMessage, "inviteGroupMessage");
    }

    public static void LJIIL(InterfaceC75441TjB session, InviteMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIILIIL(InterfaceC75441TjB session, JoinChannelMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIILJJIL(InterfaceC75441TjB session, DirectJoinMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIILL(InterfaceC75441TjB session, KickOutMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIILLIIL(InterfaceC75441TjB session, LeaveGroupMessage leaveGroupMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(leaveGroupMessage, "leaveGroupMessage");
    }

    public static void LJIIZILJ(InterfaceC75441TjB session, LeaveMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIJ(List oldLinkedList, List newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
    }

    public static void LJIJI(List oldLinkedList, List newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
    }

    public static void LJIJJ(InterfaceC75441TjB session, ReplyInviteMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJIJJLI(InterfaceC75441TjB session, P2PGroupChangeMessage p2pGroupChangeMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(p2pGroupChangeMessage, "p2pGroupChangeMessage");
    }

    public static void LJIL(InterfaceC75441TjB session, PermitApplyGroupMessage permitApplyGroupMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(permitApplyGroupMessage, "permitApplyGroupMessage");
    }

    public static void LJJ(InterfaceC75441TjB session, PermitApplyMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJJI(InterfaceC75441TjB session, String linkMicId) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    public static void LJJIFFI(InterfaceC75441TjB session, ReplyInviteGroupMessage replyInviteGroupMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(replyInviteGroupMessage, "replyInviteGroupMessage");
    }

    public static void LJJII(InterfaceC75441TjB session, ReplyInviteMessage message) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
    }

    public static void LJJIII(InterfaceC75441TjB session, String linkMicId, String messageContent) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(messageContent, "messageContent");
    }

    public static void LJJIIJ(InterfaceC75441TjB session, LinkCoreError error) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(error, "error");
    }

    public static void LJJIIJZLJL(InterfaceC75441TjB session, RtcStartResultMessage resultMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(resultMessage, "resultMessage");
    }

    public static void LJJIIZ(InterfaceC75441TjB session, String msgStr) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(msgStr, "msgStr");
    }

    public static void LJJIIZI(InterfaceC75441TjB session, LinkUser joinedUser) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(joinedUser, "joinedUser");
    }

    public static void LJJIJ(InterfaceC75441TjB session, List linkedUsers, List applicants, List invitees, List willJoinGroupUsers, List liveUsers, List invitingList, List applyingList) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkedUsers, "linkedUsers");
        o.LJIIIZ(applicants, "applicants");
        o.LJIIIZ(invitees, "invitees");
        o.LJIIIZ(willJoinGroupUsers, "willJoinGroupUsers");
        o.LJIIIZ(liveUsers, "liveUsers");
        o.LJIIIZ(invitingList, "invitingList");
        o.LJIIIZ(applyingList, "applyingList");
    }

    public static void LJJIJIIJIL(InterfaceC75441TjB session, String linkMicId, String messageContent) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(messageContent, "messageContent");
    }

    public static /* synthetic */ void LJJIJIIJI(U62 u62, InterfaceC75441TjB interfaceC75441TjB, List list, List list2, List list3, List list4, List list5, List list6, List list7, String str, int i) {
        if ((i & 256) != 0) {
            str = null;
        }
        u62.LJZL(interfaceC75441TjB, list, list2, list3, list4, list5, list6, list7, str, null);
    }
}
