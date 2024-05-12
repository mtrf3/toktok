package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class U4O implements U87 {
    public int LJLIL;
    public final /* synthetic */ MultiGuestV3AnchorWidget LJLILLLLZI;

    @Override // X.U87
    public final void LJJIZ(List<LinkUser> list) {
    }

    public U4O(MultiGuestV3AnchorWidget multiGuestV3AnchorWidget) {
        this.LJLILLLLZI = multiGuestV3AnchorWidget;
    }

    @Override // X.U87
    public final void LJJJJLL(LinkUser linkUser) {
        o.LJIIIZ(linkUser, "linkUser");
    }

    @Override // X.U87
    public final void LJJL(java.util.Map<Long, ? extends List<GroupChannelUser>> groupChannelMap) {
        o.LJIIIZ(groupChannelMap, "groupChannelMap");
    }

    @Override // X.U87
    public final void LJLLJ(List<LinkUser> willJoinLinkedList) {
        o.LJIIIZ(willJoinLinkedList, "willJoinLinkedList");
    }

    @Override // X.U87
    public final void LJIIIIZZ(List<LinkUser> list, List<LinkUser> list2) {
        U4P.LIZJ(list, list2);
    }

    @Override // X.U87
    public final void LJIIIZ(List<LinkUser> list, List<LinkUser> list2) {
        U4P.LIZIZ(list, list2);
    }

    @Override // X.U87
    public final void LJJLJLI(List linkedUsers, String str) {
        o.LJIIIZ(linkedUsers, "linkedUsers");
        int size = linkedUsers.size() - 1;
        int i = this.LJLIL;
        if (i == size) {
            return;
        }
        if (i == 0) {
            if (size > 0) {
                this.LJLILLLLZI.LL();
            }
        } else if (i > 0 && size == 0) {
            this.LJLILLLLZI.LJZ();
        }
        this.LJLIL = size;
    }

    @Override // X.U87
    public final void LJLLLL(List applicants, String str) {
        o.LJIIIZ(applicants, "applicants");
    }

    @Override // X.U87
    public final void LLIIL(List<LinkUser> list, List<LinkUser> list2) {
        U4P.LIZ(list, list2);
    }

    @Override // X.U87
    public final void LLILII(List invitees, String str) {
        o.LJIIIZ(invitees, "invitees");
    }
}
