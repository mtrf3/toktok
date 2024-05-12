package X;

import Y.ARunnableS24S0300000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.common.GroupPlayer;
import webcast.im.LeaveJoinGroupContent;

/* renamed from: X.U7b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76667U7b extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ IMessage LJLIL;
    public final /* synthetic */ U7T LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76667U7b(U7T u7t, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LJLIL = linkLayerMessage;
        this.LJLILLLLZI = u7t;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Long l;
        long j;
        String str;
        List<LinkLayerListUser> list;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleLeaveJoinGroupMessage dealing messageId=");
        LIZ.append(((CR6) this.LJLIL).getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        IMessage iMessage = this.LJLIL;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
        LeaveJoinGroupContent leaveJoinGroupContent = linkLayerMessage.leaveGroupContent;
        if (leaveJoinGroupContent != null) {
            U7T u7t = this.LJLILLLLZI;
            GroupPlayer groupPlayer = leaveJoinGroupContent.operator;
            if (groupPlayer != null) {
                long j2 = leaveJoinGroupContent.groupChannelId;
                java.util.Map<Long, ? extends List<GroupChannelUser>> groupChannelMap = u7t.LJIIJJI.LJ;
                long LIZIZ = C31012CFc.LIZIZ();
                long currentTimeMillis = System.currentTimeMillis();
                long messageId = linkLayerMessage.getMessageId();
                String leaveReason = leaveJoinGroupContent.leaveSource;
                o.LJIIIZ(groupChannelMap, "groupChannelMap");
                o.LJIIIZ(leaveReason, "leaveReason");
                UC0.LJJLIIIIJ(new UAE(j2, LIZIZ, currentTimeMillis, messageId, u7t, leaveReason, groupChannelMap));
                U7W u7w = u7t.LJJIII;
                Player player = groupPlayer.user;
                if (player != null) {
                    l = Long.valueOf(player.uid);
                } else {
                    l = null;
                }
                J7I.LJIIJ(u7w, "leave_message", u7t, linkLayerMessage, "", String.valueOf(l), new OSZ("leave_reason", leaveJoinGroupContent.leaveSource), false, null, 192);
                U7W u7w2 = u7t.LJJIII;
                U7Z u7z = u7t.LJIIJJI;
                Player player2 = groupPlayer.user;
                if (player2 != null) {
                    j = player2.uid;
                } else {
                    j = 0;
                }
                LinkUser LJIJI = u7z.LJIJI(j);
                if (LJIJI != null) {
                    str = LJIJI.getLinkMicId();
                } else {
                    str = null;
                }
                u7w2.LJIIJ(String.valueOf(str), u7t, false, -1L, -1L, leaveJoinGroupContent.leaveSource);
                C76677U7l c76677U7l = u7t.LJJLIIIJ;
                if (c76677U7l != null) {
                    c76677U7l.LIZJ(U7T.LJJJI(u7t.LJIIJJI.LJ.get(Long.valueOf(leaveJoinGroupContent.groupChannelId))));
                }
                U7Z u7z2 = u7t.LJIIJJI;
                u7z2.getClass();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIL(u7z2.LJ)).entrySet()) {
                    for (GroupChannelUser groupChannelUser : (Iterable) entry.getValue()) {
                        AllListUser allListUser = groupChannelUser.allUser;
                        if (allListUser != null && (list = allListUser.linkedList) != null) {
                            Iterator<LinkLayerListUser> it = list.iterator();
                            while (it.hasNext()) {
                                Player player3 = it.next().linkUser;
                                if (player3 != null && player3.uid == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && groupChannelUser.status == 3) {
                                    arrayList.add(entry.getKey());
                                }
                            }
                        }
                    }
                }
                if (arrayList.contains(Long.valueOf(leaveJoinGroupContent.groupChannelId))) {
                    List<Long> LJ = u7t.LJIIJJI.LJ();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = ((ArrayList) LJ).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((Number) next).longValue() != leaveJoinGroupContent.groupChannelId) {
                            arrayList2.add(next);
                        }
                    }
                    u7t.LJJIIZ("leave_with_kicked_out", "leave_with_kicked_out", true, null, arrayList2);
                }
                Iterator<InterfaceC76675U7j> it3 = u7t.LJIIIIZZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LJJIZ(u7t, groupPlayer, leaveJoinGroupContent.groupChannelId, linkLayerMessage.getMessageId(), linkLayerMessage.baseMessage.createTime);
                }
                C15610jN.LIZ().post(new ARunnableS24S0300000_13(u7t, iMessage, groupPlayer, 18));
            }
        }
        return C76800UCe.LIZ;
    }
}
