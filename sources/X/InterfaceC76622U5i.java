package X;

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
import java.util.List;

/* renamed from: X.U5i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC76622U5i {
    void LJII(InterfaceC75941TrF interfaceC75941TrF);

    void LJIILIIL(String str);

    void LJIILJJIL(U7T u7t, KickOutMessage kickOutMessage);

    void LJIJJ(U66 u66, LeaveMessage leaveMessage);

    void LJIL(ApplyGroupMessage applyGroupMessage);

    void LJJ(U7T u7t, JoinChannelMessage joinChannelMessage);

    void LJJIIZ(U6D u6d, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason);

    void LJJJ(ReplyInviteGroupMessage replyInviteGroupMessage);

    void LJJJJJ(U6D u6d, InviteMessage inviteMessage);

    void LJJJJLI(LinkUser linkUser);

    void LJJJJZ(CancelInviteGroupMessage cancelInviteGroupMessage);

    void LJJJZ(GroupChangeMessage groupChangeMessage);

    void LJJLIIIIJ(U7T u7t, InviteMessage inviteMessage);

    boolean LJJLIIIJILLIZJL();

    void LJJLIIIJJI(U6D u6d, CancelInviteMessage cancelInviteMessage);

    List LJJLIIIJLJLI(U7F u7f);

    void LJJLJ(U6D u6d, ReplyInviteMessage replyInviteMessage);

    void LJJLL(U7T u7t, PermitApplyMessage permitApplyMessage);

    void LJJZZIII(U7T u7t, DirectJoinMessage directJoinMessage);

    void LJLIL(LeaveGroupMessage leaveGroupMessage);

    void LJLILLLLZI(U6D u6d, DestroyChannelMessage destroyChannelMessage);

    void LJLLILLLL(U6D u6d, ApplyMessage applyMessage);

    void LJLLL(long j);

    void LL(PermitApplyGroupMessage permitApplyGroupMessage);

    void LLD(U6D u6d, PermitApplyMessage permitApplyMessage);

    boolean LLFFF();

    List<U62> LLFII();

    void LLI(int i, U6D u6d);

    void LLII(CancelApplyGroupMessage cancelApplyGroupMessage);

    void LLIILZL(InviteGroupMessage inviteGroupMessage);

    List LLIIZ(U7T u7t);

    void LLIL(U6D u6d, CreateChannelMessage createChannelMessage);

    void LLILIL(U7T u7t, ReplyInviteMessage replyInviteMessage);

    void LLILLIZIL(U6D u6d, CancelApplyMessage cancelApplyMessage);

    void LLILLJJLI(P2PGroupChangeMessage p2PGroupChangeMessage, boolean z);
}
