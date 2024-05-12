package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class U4Q implements U87 {
    public final /* synthetic */ C76662U6w LJLIL;

    @Override // X.U87
    public final void LJJIZ(List<LinkUser> list) {
    }

    public U4Q(C76662U6w c76662U6w) {
        this.LJLIL = c76662U6w;
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
    }

    @Override // X.U87
    public final void LJLLLL(List applicants, String str) {
        o.LJIIIZ(applicants, "applicants");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r3.dispose();
        r6.LIZIZ.remove(r4);
     */
    @Override // X.U87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIL(java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r8, java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "previousLinkUsers"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "currentLinkedUsers"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            X.U6w r0 = r7.LJLIL
            r0.LIZ(r9)
            X.U6w r6 = r7.LJLIL
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3kP> r0 = r6.LIZIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L1b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            X.3kP r3 = (X.InterfaceC92693kP) r3
            java.util.Iterator r2 = r9.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.String r0 = r0.getLinkMicId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L35
            if (r1 != 0) goto L1b
        L4e:
            r3.dispose()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3kP> r0 = r6.LIZIZ
            r0.remove(r4)
            goto L1b
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U4Q.LLIIL(java.util.List, java.util.List):void");
    }

    @Override // X.U87
    public final void LLILII(List invitees, String str) {
        o.LJIIIZ(invitees, "invitees");
    }
}
