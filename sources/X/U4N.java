package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class U4N implements U87 {
    public final /* synthetic */ C75410Tig LJLIL;

    @Override // X.U87
    public final void LJJIZ(List<LinkUser> list) {
    }

    @Override // X.U87
    public final void LJJL(java.util.Map<Long, ? extends List<GroupChannelUser>> groupChannelMap) {
        o.LJIIIZ(groupChannelMap, "groupChannelMap");
    }

    @Override // X.U87
    public final void LJLLJ(List<LinkUser> willJoinLinkedList) {
        o.LJIIIZ(willJoinLinkedList, "willJoinLinkedList");
    }

    public U4N(C75410Tig c75410Tig) {
        this.LJLIL = c75410Tig;
    }

    @Override // X.U87
    public final void LJJJJLL(LinkUser linkUser) {
        o.LJIIIZ(linkUser, "linkUser");
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
    public final void LJJLJLI(List list, String str) {
        ArrayList LJ = AnonymousClass391.LJ(list, "linkedUsers");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String linkMicId = ((LinkUser) it.next()).getLinkMicId();
            if (linkMicId != null && linkMicId.length() != 0) {
                LJ.add(linkMicId);
            }
        }
        ((C75395TiR) this.LJLIL.LJLJJLL.getValue()).LIZIZ(LJ);
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
