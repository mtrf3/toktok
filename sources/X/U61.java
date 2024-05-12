package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class U61 implements U87 {
    public final /* synthetic */ U65 LJLIL;

    public U61(U65 u65) {
        this.LJLIL = u65;
    }

    @Override // X.U87
    public final void LJJIZ(List<LinkUser> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLiveUsersChanged start currentLiveUsers=");
        LIZ.append(list);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U65 u65 = this.LJLIL;
            if (u65.LJLILLLLZI == 2) {
                List<LinkUser> LJJIIZI = u65.LJLJJL.LLZZ().LJJIIZI();
                List<LinkUser> K9 = this.LJLIL.LJLJJL.LLZZ().K9();
                List<LinkUser> LJJJ = this.LJLIL.LJLJJL.LLZZ().LJJJ();
                List<LinkUser> LJJIZ = this.LJLIL.LJLJJL.LLZZ().LJJIZ();
                List<LinkUser> LJFF = this.LJLIL.LJLJJL.LLZZ().LJFF();
                List<LinkUser> LJJJJZ = this.LJLIL.LJLJJL.LLZZ().LJJJJZ();
                List<LinkUser> LJJIJLIJ = this.LJLIL.LJLJJL.LLZZ().LJJIJLIJ();
                U65 u652 = this.LJLIL;
                Iterator<U62> it = u652.LJLJJLL.iterator();
                while (it.hasNext()) {
                    U62 it2 = it.next();
                    o.LJIIIIZZ(it2, "it");
                    TRA.LJJIJIIJI(it2, u652, LJJIIZI, LJJJ, K9, LJJIZ, LJFF, LJJJJZ, LJJIJLIJ, null, 768);
                }
            }
        }
    }

    @Override // X.U87
    public final void LJJJJLL(LinkUser linkUser) {
        o.LJIIIZ(linkUser, "linkUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReadyUserJoined start linkUser=");
        LIZ.append(linkUser);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U6E LJJI = this.LJLIL.LJFF().LJJI();
        LJJI.LIZJ.invoke(Boolean.TRUE);
        LJJI.LJI.invoke("onPermittedUserJoined");
        this.LJLIL.LJFF().LJJZZI(EnumC75419Tip.StateJoined, linkUser);
    }

    @Override // X.U87
    public final void LJJL(java.util.Map<Long, ? extends List<GroupChannelUser>> groupChannelMap) {
        o.LJIIIZ(groupChannelMap, "groupChannelMap");
    }

    @Override // X.U87
    public final void LJLLJ(List<LinkUser> willJoinLinkedList) {
        o.LJIIIZ(willJoinLinkedList, "willJoinLinkedList");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWillJoinLinkedListChanged start willJoinLinkedList=");
        LIZ.append(willJoinLinkedList);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            List<LinkUser> LJJIIZI = this.LJLIL.LJLJJL.LLZZ().LJJIIZI();
            List<LinkUser> K9 = this.LJLIL.LJLJJL.LLZZ().K9();
            List<LinkUser> LJJJ = this.LJLIL.LJLJJL.LLZZ().LJJJ();
            List<LinkUser> LJJIZ = this.LJLIL.LJLJJL.LLZZ().LJJIZ();
            List<LinkUser> LJFF = this.LJLIL.LJLJJL.LLZZ().LJFF();
            List<LinkUser> LJJJJZ = this.LJLIL.LJLJJL.LLZZ().LJJJJZ();
            List<LinkUser> LJJIJLIJ = this.LJLIL.LJLJJL.LLZZ().LJJIJLIJ();
            U65 u65 = this.LJLIL;
            Iterator<U62> it = u65.LJLJJLL.iterator();
            while (it.hasNext()) {
                U62 it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                TRA.LJJIJIIJI(it2, u65, LJJIIZI, LJJJ, K9, LJJIZ, LJFF, LJJJJZ, LJJIJLIJ, null, 768);
            }
        }
    }

    @Override // X.U87
    public final void LJIIIIZZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        U4R.LIZLLL("LiveLinkMicSession", "onLocalLinkedListWillChange");
        ArrayList arrayList = new ArrayList();
        Iterator<LinkUser> it = newLinkedList.iterator();
        while (it.hasNext()) {
            String linkMicId = it.next().getLinkMicId();
            if (linkMicId != null) {
                arrayList.add(linkMicId);
            }
        }
        this.LJLIL.LJFF().LJJJJLI(arrayList);
        this.LJLIL.LJII().LJJIIZ("LiveLinkMicSession onLocalLinkedListWillChange");
        Iterator<U62> it2 = this.LJLIL.LJLJJLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(oldLinkedList, newLinkedList);
        }
    }

    @Override // X.U87
    public final void LJIIIZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        U4R.LIZLLL("LiveLinkMicSession", "onLocalLinkedListDidChange");
        this.LJLIL.LJFF().LJJJJLI(null);
        this.LJLIL.LJII().LJJIIZ("LiveLinkMicSession onLocalLinkedListDidChange");
        Iterator<U62> it = this.LJLIL.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(oldLinkedList, newLinkedList);
        }
    }

    @Override // X.U87
    public final void LJJLJLI(List linkedUsers, String str) {
        o.LJIIIZ(linkedUsers, "linkedUsers");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkedUsersChanged start linkedUsers=");
        LIZ.append(linkedUsers);
        LIZ.append(" from=");
        LIZ.append(str);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        this.LJLIL.LJFF().LJJJJ();
        List<LinkUser> K9 = this.LJLIL.LJLJJL.LLZZ().K9();
        List<LinkUser> LJJJ = this.LJLIL.LJLJJL.LLZZ().LJJJ();
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U65 u65 = this.LJLIL;
            if (u65.LJLILLLLZI == 2) {
                List<LinkUser> LJJIZ = u65.LJLJJL.LLZZ().LJJIZ();
                List<LinkUser> LJFF = this.LJLIL.LJLJJL.LLZZ().LJFF();
                List<LinkUser> LJJJJZ = this.LJLIL.LJLJJL.LLZZ().LJJJJZ();
                List<LinkUser> LJJIJLIJ = this.LJLIL.LJLJJL.LLZZ().LJJIJLIJ();
                U65 u652 = this.LJLIL;
                Iterator<U62> it = u652.LJLJJLL.iterator();
                while (it.hasNext()) {
                    U62 it2 = it.next();
                    o.LJIIIIZZ(it2, "it");
                    TRA.LJJIJIIJI(it2, u652, linkedUsers, LJJJ, K9, LJJIZ, LJFF, LJJJJZ, LJJIJLIJ, null, 768);
                }
                return;
            }
        }
        U65 u653 = this.LJLIL;
        Iterator<U62> it3 = u653.LJLJJLL.iterator();
        while (it3.hasNext()) {
            U62 it4 = it3.next();
            o.LJIIIIZZ(it4, "it");
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            TRA.LJJIJIIJI(it4, u653, linkedUsers, LJJJ, K9, c61878OQg, c61878OQg, c61878OQg, c61878OQg, null, 768);
        }
    }

    @Override // X.U87
    public final void LJLLLL(List applicants, String str) {
        o.LJIIIZ(applicants, "applicants");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplicantsChanged start applicants=");
        LIZ.append(applicants);
        LIZ.append(" from=");
        LIZ.append(str);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            List<LinkUser> K9 = this.LJLIL.LJLJJL.LLZZ().K9();
            List<LinkUser> LJJIIZI = this.LJLIL.LJLJJL.LLZZ().LJJIIZI();
            List<LinkUser> LJJIZ = this.LJLIL.LJLJJL.LLZZ().LJJIZ();
            List<LinkUser> LJFF = this.LJLIL.LJLJJL.LLZZ().LJFF();
            List<LinkUser> LJJJJZ = this.LJLIL.LJLJJL.LLZZ().LJJJJZ();
            List<LinkUser> LJJIJLIJ = this.LJLIL.LJLJJL.LLZZ().LJJIJLIJ();
            U65 u65 = this.LJLIL;
            Iterator<U62> it = u65.LJLJJLL.iterator();
            while (it.hasNext()) {
                U62 it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                TRA.LJJIJIIJI(it2, u65, LJJIIZI, applicants, K9, LJJIZ, LJFF, LJJJJZ, LJJIJLIJ, null, 768);
            }
            return;
        }
        List<LinkUser> K92 = this.LJLIL.LJLJJL.LLZZ().K9();
        List<LinkUser> LJJIIZI2 = this.LJLIL.LJLJJL.LLZZ().LJJIIZI();
        U65 u652 = this.LJLIL;
        Iterator<U62> it3 = u652.LJLJJLL.iterator();
        while (it3.hasNext()) {
            U62 it4 = it3.next();
            o.LJIIIIZZ(it4, "it");
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            TRA.LJJIJIIJI(it4, u652, LJJIIZI2, applicants, K92, c61878OQg, c61878OQg, c61878OQg, c61878OQg, null, 768);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        X.C29306Beo.LJJJ(new kotlin.jvm.internal.AqS160S0200000_13(r4, r6, 62));
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
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting.isEnable()
            if (r0 == 0) goto L5e
            X.U65 r2 = r7.LJLIL
            int r1 = r2.LJLILLLLZI
            r0 = 2
            if (r1 != r0) goto L5e
            X.U66 r0 = r2.LJLJJL
            X.U6m r0 = r0.c()
            r0.LJJJI()
            X.U65 r6 = r7.LJLIL
            java.util.Iterator r5 = r9.iterator()
        L26:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r4 = r5.next()
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r4 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r4
            java.util.Iterator r3 = r8.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.Long r1 = r0.getUserId()
            java.lang.Long r0 = r4.getUserId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L36
            if (r2 != 0) goto L26
        L53:
            kotlin.jvm.internal.AqS160S0200000_13 r1 = new kotlin.jvm.internal.AqS160S0200000_13
            r0 = 62
            r1.<init>(r4, r6, r0)
            X.C29306Beo.LJJJ(r1)
            goto L26
        L5e:
            X.U65 r2 = r7.LJLIL
            int r1 = r2.LJLILLLLZI
            r0 = 4
            if (r1 != r0) goto Lb5
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r2.LJLJJI
            long r3 = r0.getOwnerUserId()
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb5
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting.INSTANCE
            java.lang.String r0 = "is_enable_linkmic_enter_and_leave_room_opt"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 == 0) goto Lb5
            X.U65 r0 = r7.LJLIL
            X.Ol8 r0 = r0.LJLLILLLL
            java.lang.Object r3 = r0.getValue()
            X.U6l r3 = (X.C76651U6l) r3
            X.U65 r0 = r7.LJLIL
            X.U8H r0 = r0.LJFF()
            com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r0 = r0.y1()
            r2 = 1
            if (r0 == 0) goto Lbc
            boolean r0 = r0.isFloatType()
            if (r0 != r2) goto Lbc
            r1 = 1
        La5:
            r3.getClass()
            int r0 = r9.size()
            if (r0 <= r2) goto Lb6
            X.StC r0 = r3.LJ
            if (r0 == 0) goto Lb5
            r0.dispose()
        Lb5:
            return
        Lb6:
            if (r1 == 0) goto Lb5
            r3.LJJJJJ()
            goto Lb5
        Lbc:
            r1 = 0
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U61.LLIIL(java.util.List, java.util.List):void");
    }

    @Override // X.U87
    public final void LLILII(List invitees, String str) {
        o.LJIIIZ(invitees, "invitees");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteesChanged start invitees=");
        LIZ.append(invitees);
        LIZ.append(" from=");
        LIZ.append(str);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            List<LinkUser> LJJJ = this.LJLIL.LJLJJL.LLZZ().LJJJ();
            List<LinkUser> LJJIIZI = this.LJLIL.LJLJJL.LLZZ().LJJIIZI();
            List<LinkUser> LJJIZ = this.LJLIL.LJLJJL.LLZZ().LJJIZ();
            List<LinkUser> LJFF = this.LJLIL.LJLJJL.LLZZ().LJFF();
            List<LinkUser> LJJJJZ = this.LJLIL.LJLJJL.LLZZ().LJJJJZ();
            List<LinkUser> LJJIJLIJ = this.LJLIL.LJLJJL.LLZZ().LJJIJLIJ();
            U65 u65 = this.LJLIL;
            Iterator<U62> it = u65.LJLJJLL.iterator();
            while (it.hasNext()) {
                U62 it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                TRA.LJJIJIIJI(it2, u65, LJJIIZI, LJJJ, invitees, LJJIZ, LJFF, LJJJJZ, LJJIJLIJ, null, 768);
            }
            return;
        }
        List<LinkUser> LJJJ2 = this.LJLIL.LJLJJL.LLZZ().LJJJ();
        List<LinkUser> LJJIIZI2 = this.LJLIL.LJLJJL.LLZZ().LJJIIZI();
        U65 u652 = this.LJLIL;
        Iterator<U62> it3 = u652.LJLJJLL.iterator();
        while (it3.hasNext()) {
            U62 it4 = it3.next();
            o.LJIIIIZZ(it4, "it");
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            TRA.LJJIJIIJI(it4, u652, LJJIIZI2, LJJJ2, invitees, c61878OQg, c61878OQg, c61878OQg, c61878OQg, null, 768);
        }
    }
}
