package com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest;

import X.AbstractC74727TUl;
import X.C00F;
import X.C0NE;
import X.C221108m2;
import X.C28733BPl;
import X.C47261Igj;
import X.C62822Ol8;
import X.C74659TRv;
import X.C74751TVj;
import X.C74838TYs;
import X.C76917UGr;
import X.InterfaceC75560Tl6;
import X.TQ8;
import X.TS8;
import X.TUH;
import X.TUI;
import X.TUJ;
import X.TUK;
import X.TUU;
import X.TV3;
import X.TYR;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
/* loaded from: classes14.dex */
public final class GuestBusinessUserManager extends TUU implements TQ8 {
    public final Room LJLLL;
    public int LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;

    @Override // X.InterfaceC75402TiY
    public final void LJJJJI() {
    }

    @Override // X.InterfaceC75402TiY
    public final Class<Object> LLIIJI() {
        return TQ8.class;
    }

    @Override // X.TUU
    public final AbstractC74727TUl LJIIJ() {
        return (AbstractC74727TUl) this.LJLZ.getValue();
    }

    public final TUH LJIJI() {
        return (TUH) this.LJZ.getValue();
    }

    public final AbstractC74727TUl<LinkListUser, LinkMessage> LJIJJ() {
        return (AbstractC74727TUl) this.LJLLLLLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    @Override // X.TUU, X.TRS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager.init():void");
    }

    @Override // X.TQ8
    public final AbstractC74727TUl LIZ() {
        return LJIJJ();
    }

    @Override // X.TUU, X.TRS
    public final void release() {
        super.release();
        LJIJI().dispose();
    }

    @Override // X.TRS
    public final void LJIIIIZZ(int i) {
        LJIL(i);
    }

    @Override // X.TUU
    public final void LJIILL(LinkMessage linkMessage) {
        boolean z;
        long j;
        ((AbstractC74727TUl) this.LJLZ.getValue()).LJJIIJZLJL();
        LJIJJ().LJJIIJ(linkMessage);
        C74838TYs LJ = C74838TYs.LJ();
        if (C76917UGr.LJJIII(LJIJJ()) > 0) {
            z = true;
        } else {
            z = false;
        }
        LJ.LJIIIIZZ(z);
        C74838TYs.LJ().LJJ = C76917UGr.LJJIII(LJIJJ());
        MultiGuestDataHolder multiGuestDataHolder = this.LJLLILLLL;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIJ(C76917UGr.LJJIII(LJIJJ()));
        }
        if (this.LJLLILLLL != null) {
            C76917UGr.LJJIII(LJIJJ());
        }
        for (LinkListUser linkListUser : LJIJJ().LJIJI()) {
            TYR tyr = TS8.LIZ;
            User user = linkListUser.user;
            if (user != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            tyr.LJ(j, linkListUser.linkMicId);
            if (linkListUser.roleType == 1) {
                C74838TYs.LJ().LJIILIIL = linkListUser.linkMicId;
            }
        }
        LJIJJLI(false);
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("LinkUserInfoCenter", "guest and audience handleListChangeMessage");
        LJIJI().LIZ(linkMessage);
        LJIL(2);
    }

    @Override // X.TUU
    public final List<Integer> LJIIZILJ(String str) {
        return C47261Igj.LJJIJIIJI(1, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(boolean r8) {
        /*
            r7 = this;
            X.TUl r0 = r7.LJIJJ()
            int r6 = X.C76917UGr.LJJIII(r0)
            X.TUl r0 = r7.LJIJJ()
            java.util.List r1 = r0.LJJI()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lba
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lba
        L1a:
            int r0 = r7.LJLLLL
            r4 = 0
            if (r0 <= 0) goto L78
            if (r6 != 0) goto L59
        L22:
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L66
        L2a:
            java.lang.String r0 = "connection_over"
            X.C74751TVj.LJIIL(r0)
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting.INSTANCE
            boolean r0 = r0.getValue()
            r3 = 5
            if (r0 == 0) goto L5c
            androidx.lifecycle.LifecycleOwner r0 = r7.LJLJJI
            if (r0 == 0) goto L50
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            if (r2 == 0) goto L50
            kotlin.jvm.internal.AqS160S0200000_13 r1 = new kotlin.jvm.internal.AqS160S0200000_13
            r0 = 16
            r1.<init>(r2, r7, r0)
            X.C29306Beo.LJJJ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L59
        L50:
            int r0 = r7.LJLLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C74751TVj.LIZLLL(r4, r0, r4, r3)
        L59:
            r7.LJLLLL = r6
            return
        L5c:
            int r0 = r7.LJLLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C74751TVj.LIZLLL(r4, r0, r4, r3)
            goto L59
        L66:
            X.C88207Yjb.LJIILLIIL()
            boolean r0 = X.C88207Yjb.LJII
            if (r0 == 0) goto L75
            java.lang.String r0 = "broadcast_period"
        L6f:
            X.C88207Yjb.LJI = r0
            X.C88207Yjb.LJIIJ()
            goto L2a
        L75:
            java.lang.String r0 = "watch_period"
            goto L6f
        L78:
            if (r6 <= 0) goto L59
        L7b:
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto Lab
        L83:
            if (r8 != 0) goto L59
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting.INSTANCE
            boolean r0 = r0.getValue()
            java.lang.String r3 = "connection_start"
            if (r0 == 0) goto Lb6
            androidx.lifecycle.LifecycleOwner r0 = r7.LJLJJI
            if (r0 == 0) goto La7
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            if (r2 == 0) goto La7
            kotlin.jvm.internal.AqS163S0100000_13 r1 = new kotlin.jvm.internal.AqS163S0100000_13
            r0 = 117(0x75, float:1.64E-43)
            r1.<init>(r2, r0)
            X.C29306Beo.LJJJ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L59
        La7:
            X.C74751TVj.LJ(r3)
            goto L59
        Lab:
            X.C88207Yjb.LJIILLIIL()
            java.lang.String r0 = "audience_link_period"
            X.C88207Yjb.LJI = r0
            X.C88207Yjb.LJIIJ()
            goto L83
        Lb6:
            X.C74751TVj.LJ(r3)
            goto L59
        Lba:
            java.util.Iterator r5 = r1.iterator()
        Lbe:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r5.next()
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = (com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.user
            if (r0 == 0) goto Lbe
            long r3 = r0.getId()
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbe
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager.LJIJJLI(boolean):void");
    }

    public final void LJIL(int i) {
        LJIJI().LIZIZ();
        Iterator<TUI> it = LJIIJJI().iterator();
        while (it.hasNext()) {
            it.next().V(LJIJJ());
        }
        LJIJI().dispose();
    }

    @Override // X.TUU
    public final void LJIILIIL(MultiLiveGuestInfoList multiLiveGuestInfoList, String source) {
        o.LJIIIZ(source, "source");
        LJIJJ().LJJIIJZLJL();
        LinkMessage linkMessage = new LinkMessage();
        LinkerListChangeContent linkerListChangeContent = new LinkerListChangeContent();
        linkMessage.mListChangeContent = linkerListChangeContent;
        ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList.onLineUsers;
        if (arrayList != null) {
            Iterator<LinkPlayerInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                LinkPlayerInfo it2 = it.next();
                List<LinkListUser> list = linkerListChangeContent.onLineUsers;
                o.LJIIIIZZ(it2, "it");
                list.add(TV3.LIZIZ(it2));
            }
        }
        ArrayList<LinkPlayerInfo> arrayList2 = multiLiveGuestInfoList.waitingUsers;
        if (arrayList2 != null) {
            Iterator<LinkPlayerInfo> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                LinkPlayerInfo it4 = it3.next();
                List<LinkListUser> list2 = linkerListChangeContent.waitingUsers;
                o.LJIIIIZZ(it4, "it");
                list2.add(TV3.LIZIZ(it4));
            }
        }
        LJIJJ().LJJIIJ(linkMessage);
        super.LJIILIIL(multiLiveGuestInfoList, source);
        boolean equals = TextUtils.equals(source, "enter_room");
        if (equals && C74838TYs.LJ().LJJ > 0) {
            C74751TVj.LJ("live_play");
        }
        LJIJJLI(equals);
    }

    @Override // X.TUU
    public final void LJIILJJIL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        C00F.LJ(list, "linkedUsers", list2, "applicants", list3, "invitees");
        ((AbstractC74727TUl) this.LJLZ.getValue()).LJJIIJZLJL();
        LJIJI().LIZJ(list, list2, list3);
        LJIL(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBusinessUserManager(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, iMessageManager, lifecycleOwner);
        o.LJIIIZ(room, "room");
        this.LJLLL = room;
        this.LJLLLLLL = C221108m2.LIZIZ(TUK.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(TUJ.LJLIL);
        this.LJZ = C221108m2.LIZIZ(C74659TRv.LJLIL);
    }
}
