package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
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
import java.util.List;

/* loaded from: classes14.dex */
public interface U62 {
    void LIZ(SurfaceView surfaceView, String str);

    void LJ(long j, int i);

    void LJII(InterfaceC75941TrF interfaceC75941TrF);

    void LJIIIIZZ(List<LinkUser> list, List<LinkUser> list2);

    void LJIIIZ(List<LinkUser> list, List<LinkUser> list2);

    void LJIIJJI(InterfaceC75441TjB interfaceC75441TjB, LeaveMessage leaveMessage);

    void LJIIL(long j, long j2);

    void LJIILIIL(String str);

    void LJIILL(U65 u65, LeaveGroupMessage leaveGroupMessage);

    void LJIILLIIL(String str, boolean z);

    void LJIIZILJ(String str, float f, float f2);

    void LJIJ(U65 u65, JoinChannelMessage joinChannelMessage);

    void LJIJI(String str, String str2);

    void LJIJJ(java.util.Map<String, String> map);

    void LJIJJLI(String str);

    void LJJIFFI();

    void LJJII(InterfaceC75441TjB interfaceC75441TjB, CancelInviteMessage cancelInviteMessage);

    InterfaceC76688U7w LJJIII(U65 u65);

    void LJJIIZI(String str, long j);

    void LJJIJIIJIL();

    void LJJIJIL(String str, boolean z, boolean z2);

    void LJJIZ(String[] strArr, boolean[] zArr, int[] iArr);

    void LJJJI(InterfaceC75441TjB interfaceC75441TjB, DestroyChannelMessage destroyChannelMessage);

    void LJJJIL(InterfaceC75441TjB interfaceC75441TjB, KickOutMessage kickOutMessage);

    void LJJJJ(U65 u65, DirectJoinMessage directJoinMessage);

    void LJJJJIZL(InterfaceC75441TjB interfaceC75441TjB, int i, int i2);

    void LJJJJL(U65 u65, PermitApplyMessage permitApplyMessage);

    void LJJJJZI(U65 u65, String str);

    void LJJJLL(U65 u65, LinkCoreError linkCoreError);

    void LJJL(U65 u65, CancelInviteGroupMessage cancelInviteGroupMessage);

    void LJJLIIIJL(InterfaceC75441TjB interfaceC75441TjB, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason);

    void LJJLIIIJLJLI(InterfaceC75441TjB interfaceC75441TjB, C75745To5 c75745To5);

    void LJJLIIJ(U65 u65, InviteGroupMessage inviteGroupMessage);

    void LJJLIL(U65 u65, InviteMessage inviteMessage);

    void LJJLJ(U65 u65, ReplyInviteGroupMessage replyInviteGroupMessage);

    void LJJLL(InterfaceC75441TjB interfaceC75441TjB, InviteMessage inviteMessage);

    void LJLI(U65 u65, LinkUser linkUser, CustomLinkMessage customLinkMessage);

    void LJLIIIL(U65 u65, GroupChangeMessage groupChangeMessage);

    void LJLILLLLZI(InterfaceC75441TjB interfaceC75441TjB, int i);

    void LJLJJI(LinkLayerRTCMessage linkLayerRTCMessage);

    void LJLJLLL(U65 u65, String str, String str2);

    void LJLLI(InterfaceC75441TjB interfaceC75441TjB, String str, String str2);

    void LJLLILLLL(InterfaceC75441TjB interfaceC75441TjB, PermitApplyMessage permitApplyMessage);

    void LJLLLL(U65 u65, ApplyGroupMessage applyGroupMessage);

    void LJLZ(InterfaceC75441TjB interfaceC75441TjB, CreateChannelMessage createChannelMessage);

    void LJZ(InterfaceC75441TjB interfaceC75441TjB, CancelApplyMessage cancelApplyMessage);

    void LJZL(InterfaceC75441TjB interfaceC75441TjB, List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3, List<LinkUser> list4, List<LinkUser> list5, List<LinkUser> list6, List<LinkUser> list7, String str, CustomLinkMessage customLinkMessage);

    void LL(InterfaceC75441TjB interfaceC75441TjB, String str);

    void LLD(U65 u65);

    void LLFF(U65 u65, PermitApplyGroupMessage permitApplyGroupMessage);

    void LLFII(U65 u65);

    void LLIIIJ(U65 u65, RtcStartResultMessage rtcStartResultMessage);

    void LLIIJI(U65 u65, CancelApplyGroupMessage cancelApplyGroupMessage);

    void LLIILII(C28272B7s c28272B7s);

    void LLIIZ(U65 u65, boolean z, LinkCoreError linkCoreError);

    UB4 LLIL(InterfaceC75441TjB interfaceC75441TjB);

    void LLILII(InterfaceC75441TjB interfaceC75441TjB, ReplyInviteMessage replyInviteMessage);

    void LLILIL(U65 u65, P2PGroupChangeMessage p2PGroupChangeMessage);

    void LLILLJJLI(InterfaceC75441TjB interfaceC75441TjB, ApplyMessage applyMessage);

    void LLILZ(U65 u65);

    void LLJIJIL(U65 u65, ReplyInviteMessage replyInviteMessage);
}
