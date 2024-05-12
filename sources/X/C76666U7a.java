package X;

import Y.IDComparatorS34S0000000_6;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestZoomFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRejectChangeMapBugfixSetting;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkListChangeContent;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.common.GroupPlayer;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;

/* renamed from: X.U7a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76666U7a implements InterfaceC76675U7j {
    public long LIZ;
    public final /* synthetic */ U7Z LIZIZ;

    @Override // X.InterfaceC76675U7j
    public final void LIZIZ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJFF(U7T u7t) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIIZ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIILJJIL(U7T u7t) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJI(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJZ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJZI(U7T u7t, U7A u7a) {
    }

    public C76666U7a(U7Z u7z) {
        this.LIZIZ = u7z;
    }

    @Override // X.InterfaceC76675U7j
    public final void LJI(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    public final void LJIIJJI(long j) {
        List<LinkLayerListUser> list;
        long LIZ = C025908h.LIZ();
        java.util.Map<Long, ? extends List<GroupChannelUser>> LJJLIL = C113554cx.LJJLIL(this.LIZIZ.LJ);
        for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List<GroupChannelUser> LLJILJILJ = ORZ.LLJILJILJ((Collection) entry.getValue());
            C72242sW c72242sW = new C72242sW();
            c72242sW.element = -1L;
            int i = 0;
            int i2 = 0;
            for (GroupChannelUser groupChannelUser : LLJILJILJ) {
                AllListUser allListUser = groupChannelUser.allUser;
                if (allListUser != null && (list = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it = list.iterator();
                    while (it.hasNext()) {
                        Player player = it.next().linkUser;
                        if (player != null && player.uid == LIZ) {
                            i = groupChannelUser.status;
                        }
                        if (player != null && player.uid == j) {
                            i2 = groupChannelUser.status;
                            c72242sW.element = groupChannelUser.channelId;
                        }
                    }
                }
            }
            if (i == 1) {
                if (i2 == 3) {
                    LJJLIL.remove(Long.valueOf(longValue));
                }
            } else if (i == 3 && i2 == 1) {
                if (MtCoHostRejectChangeMapBugfixSetting.isEnable()) {
                    C29306Beo.LJJIJIIJI(new AqS179S0100000_13(c72242sW, 45), LLJILJILJ);
                    LJJLIL.put(Long.valueOf(longValue), LLJILJILJ);
                    if (((ArrayList) LLJILJILJ).size() < 2) {
                        LJJLIL.remove(Long.valueOf(longValue));
                    }
                } else if (((ArrayList) LLJILJILJ).size() == 2) {
                    LJJLIL.remove(Long.valueOf(longValue));
                }
            }
        }
        this.LIZIZ.LJIILJJIL(LJJLIL);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJ(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIL(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJIIJI(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJI(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJLL(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LIZJ(U7T linker, LinkLayerMessage message) {
        List<LinkLayerListUser> list;
        List<LinkLayerListUser> list2;
        AllListUser allListUser;
        AllListUser allListUser2;
        AllListUser allListUser3;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
        this.LIZIZ.LJIILLIIL = String.valueOf(message.getMessageId());
        long j = message.channelId;
        U7Z u7z = this.LIZIZ;
        LinkListChangeContent linkListChangeContent = message.listContent;
        List<LinkLayerListUser> list3 = null;
        if (linkListChangeContent != null && (allListUser3 = linkListChangeContent.userList) != null) {
            list = allListUser3.appliedList;
        } else {
            list = null;
        }
        u7z.getClass();
        u7z.LJIJ(U7Z.LIZJ(j, list));
        U7Z u7z2 = this.LIZIZ;
        LinkListChangeContent linkListChangeContent2 = message.listContent;
        if (linkListChangeContent2 != null && (allListUser2 = linkListChangeContent2.userList) != null) {
            list2 = allListUser2.invitedList;
        } else {
            list2 = null;
        }
        u7z2.getClass();
        u7z2.LJIJJ(U7Z.LIZJ(j, list2));
        U7Z u7z3 = this.LIZIZ;
        LinkListChangeContent linkListChangeContent3 = message.listContent;
        if (linkListChangeContent3 != null && (allListUser = linkListChangeContent3.userList) != null) {
            list3 = allListUser.linkedList;
        }
        u7z3.getClass();
        u7z3.LJIJJLI(U7Z.LIZJ(j, list3));
    }

    @Override // X.InterfaceC76675U7j
    public final void LIZLLL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJ(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
        if (C29306Beo.LJJIFFI(U4C.LIZ("listchange_optimize")) && LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            this.LIZIZ.LIZ(u7a);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJII(U7T linker, LinkUser inviteeUser) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviteeUser, "inviteeUser");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIJ(U7T u7t, U7A u7a) {
        if (C29306Beo.LJJIFFI(U4C.LIZ("listchange_optimize"))) {
            this.LIZIZ.LIZ(u7a);
        }
    }

    public final void LJIIL(List<GroupPlayer> list, GroupPlayer groupPlayer) {
        boolean z;
        List<LinkLayerListUser> list2;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        java.util.Map<Long, ? extends List<GroupChannelUser>> LJJLIL = C113554cx.LJJLIL(this.LIZIZ.LJ);
        for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list3 = (List) entry.getValue();
            boolean z2 = true;
            for (GroupPlayer groupPlayer2 : list) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((GroupChannelUser) next).channelId == groupPlayer2.channelId) {
                        if (next == null) {
                        }
                    }
                }
                z2 = false;
            }
            Iterator it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((GroupChannelUser) next2).channelId == groupPlayer.channelId) {
                    if (next2 != null) {
                        z = true;
                    }
                }
            }
            z = false;
            if (z2 && z) {
                List LLJILJILJ = ORZ.LLJILJILJ(list3);
                Iterator<GroupPlayer> it3 = list.iterator();
                while (it3.hasNext()) {
                    C29306Beo.LJJIJIIJI(new AqS179S0100000_13(it3.next(), 46), LLJILJILJ);
                }
                Iterator it4 = ((ArrayList) LLJILJILJ).iterator();
                boolean z3 = false;
                while (it4.hasNext()) {
                    AllListUser allListUser = ((GroupChannelUser) it4.next()).allUser;
                    if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                        Iterator<LinkLayerListUser> it5 = list2.iterator();
                        while (it5.hasNext()) {
                            Player player = it5.next().linkUser;
                            if (player != null && player.uid == currentUserId) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    LJJLIL.remove(Long.valueOf(longValue));
                }
            }
        }
        this.LIZIZ.LJIILJJIL(LJJLIL);
    }

    public final void LJIILL(GroupChannelAllUser groupChannelAllUser, long j) {
        long j2;
        List<LinkLayerListUser> list;
        List<LinkLayerListUser> list2;
        if (groupChannelAllUser.groupChannelId <= 0) {
            U4R.LIZLLL("UserManager", "updateGroupChannelMap groupChannelId<=0");
            return;
        }
        if (j < this.LIZ) {
            U4R.LIZLLL("UserManager", "ignore update createTimeStamp is smaller than latestCreateTimeStampForUpdateGroupMap");
            return;
        }
        this.LIZ = j;
        java.util.Map<Long, ? extends List<GroupChannelUser>> LJJLIL = C113554cx.LJJLIL(this.LIZIZ.LJ);
        Iterator<GroupChannelUser> it = groupChannelAllUser.user.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AllListUser allListUser = it.next().allUser;
            if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                Iterator<LinkLayerListUser> it2 = list2.iterator();
                while (it2.hasNext()) {
                    Player player = it2.next().linkUser;
                    if (player != null && player.uid == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            LJJLIL.put(Long.valueOf(groupChannelAllUser.groupChannelId), groupChannelAllUser.user);
            this.LIZIZ.LJFF.put(Long.valueOf(groupChannelAllUser.groupChannelId), Long.valueOf(j));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
                for (GroupChannelUser groupChannelUser : (Iterable) entry.getValue()) {
                    AllListUser allListUser2 = groupChannelUser.allUser;
                    if (allListUser2 != null && (list = allListUser2.linkedList) != null) {
                        Iterator<LinkLayerListUser> it3 = list.iterator();
                        while (it3.hasNext()) {
                            Player player2 = it3.next().linkUser;
                            if (player2 != null && player2.uid == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && groupChannelUser.status == 3) {
                                arrayList.add(new OSZ(entry.getKey(), Long.valueOf(groupChannelUser.linkedTime)));
                            }
                        }
                    }
                }
            }
            List LLILII = ORZ.LLILII(new IDComparatorS34S0000000_6(0), arrayList);
            U7Z u7z = this.LIZIZ;
            int i = 0;
            for (Object obj : LLILII) {
                int i2 = i + 1;
                if (i >= 0) {
                    OSZ osz = (OSZ) obj;
                    if (i != 0) {
                        U7T u7t = u7z.LIZ;
                        if (u7t != null) {
                            Room room = u7t.LJ;
                            if (room != null) {
                                j2 = room.getId();
                            } else {
                                j2 = 0;
                            }
                            u7t.LLZZJLIL(new C76684U7s(j2, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), u7t.LJI, new BizLeaveJoinGroupParams(), "link_mic_tree_conflict"), (Long) osz.getFirst(), ((Number) ((OSZ) ListProtector.get(LLILII, 0)).getFirst()).longValue(), true, null);
                        }
                        LJJLIL.remove(osz.getFirst());
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            LJJLIL.remove(Long.valueOf(groupChannelAllUser.groupChannelId));
        }
        this.LIZIZ.LJIILJJIL(LJJLIL);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIZILJ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJJ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
        LJIIJJI(j);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJ(U7T linker, U7A data) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(data, "data");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIFFI(U7T linker, LinkLayerMessage message) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJII(U7T linker, U7A u7a) {
        Long l;
        Long l2;
        Long l3;
        String str;
        o.LJIIIZ(linker, "linker");
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && linker.LJFF == 2) {
            RtcUserInfo rtcUserInfo = u7a.LIZ;
            OnLineMicInfo onLineMicInfo = null;
            Long l4 = null;
            if (rtcUserInfo != null) {
                l = Long.valueOf(rtcUserInfo.getRoomId());
            } else {
                l = null;
            }
            RtcUserInfo rtcUserInfo2 = u7a.LIZ;
            if (rtcUserInfo2 != null) {
                l2 = Long.valueOf(rtcUserInfo2.getUserId());
            } else {
                l2 = null;
            }
            RtcUserInfo rtcUserInfo3 = u7a.LIZ;
            if (rtcUserInfo3 != null) {
                l3 = Long.valueOf(rtcUserInfo3.getChannelId());
            } else {
                l3 = null;
            }
            RtcUserInfo rtcUserInfo4 = u7a.LIZ;
            if (rtcUserInfo4 != null) {
                str = rtcUserInfo4.getLinkMicId();
            } else {
                str = null;
            }
            java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
            if (map != null) {
                RtcUserInfo rtcUserInfo5 = u7a.LIZ;
                if (rtcUserInfo5 != null) {
                    l4 = Long.valueOf(rtcUserInfo5.getUserId());
                }
                onLineMicInfo = map.get(l4);
            }
            LinkUser linkUser = new LinkUser(l, l2, l3, str, onLineMicInfo, null, null, null, null, null, null, null, 4032, null);
            this.LIZIZ.LIZLLL = linkUser;
            U7Z u7z = this.LIZIZ;
            List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(u7z.LJIIIIZZ);
            ((ArrayList) LLJILJILJ).add(linkUser);
            u7z.LJIJJLI(LLJILJILJ);
            return;
        }
        this.LIZIZ.LIZ(u7a);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIZ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
        LJIIJJI(j);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIZI(U7T u7t, C65767PrX<Long> c65767PrX) {
        U7Z u7z = this.LIZIZ;
        Iterator<Long> it = c65767PrX.iterator();
        while (it.hasNext()) {
            u7z.LJIIIZ(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    @Override // X.InterfaceC76675U7j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(X.U7T r32, tikcast.linkmic.common.GroupChannelAllUser r33) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76666U7a.LJJIJIIJIL(X.U7T, tikcast.linkmic.common.GroupChannelAllUser):void");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJIL(U7T linker, U7A u7a) {
        java.util.Map<Long, OnLineMicInfo> map;
        o.LJIIIZ(linker, "linker");
        if (LinkMicMultiGuestZoomFixSetting.INSTANCE.getValue() && (map = u7a.LIZJ) != null) {
            U7Z u7z = this.LIZIZ;
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                u7z.LJIIIZ(it.next().getKey());
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJLIJ(U7T u7t, U7A u7a) {
        if (C29306Beo.LJJIFFI(U4C.LIZ("listchange_optimize"))) {
            this.LIZIZ.LIZ(u7a);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIL(U7T linker, U7A data) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(data, "data");
        if (C29306Beo.LJJIFFI(U4C.LIZ("listchange_optimize"))) {
            this.LIZIZ.LIZ(data);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJIL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
        if (C29306Beo.LJJIFFI(U4C.LIZ("listchange_optimize"))) {
            this.LIZIZ.LIZ(u7a);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJ(U7T u7t, U7A u7a) {
        java.util.Map<Long, OnLineMicInfo> map;
        if (LinkMicMultiGuestZoomFixSetting.INSTANCE.getValue() && (map = u7a.LIZJ) != null) {
            U7Z u7z = this.LIZIZ;
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                u7z.LJIIIZ(it.next().getKey());
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJL(U7T u7t, U7A u7a) {
        Long l;
        Long l2;
        Long l3;
        String str;
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            U7Z u7z = this.LIZIZ;
            u7z.getClass();
            RtcUserInfo rtcUserInfo = u7a.LIZ;
            OnLineMicInfo onLineMicInfo = null;
            Long l4 = null;
            if (rtcUserInfo != null) {
                l = Long.valueOf(rtcUserInfo.getRoomId());
            } else {
                l = null;
            }
            RtcUserInfo rtcUserInfo2 = u7a.LIZ;
            if (rtcUserInfo2 != null) {
                l2 = Long.valueOf(rtcUserInfo2.getUserId());
            } else {
                l2 = null;
            }
            RtcUserInfo rtcUserInfo3 = u7a.LIZ;
            if (rtcUserInfo3 != null) {
                l3 = Long.valueOf(rtcUserInfo3.getChannelId());
            } else {
                l3 = null;
            }
            RtcUserInfo rtcUserInfo4 = u7a.LIZ;
            if (rtcUserInfo4 != null) {
                str = rtcUserInfo4.getLinkMicId();
            } else {
                str = null;
            }
            java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
            if (map != null) {
                RtcUserInfo rtcUserInfo5 = u7a.LIZ;
                if (rtcUserInfo5 != null) {
                    l4 = Long.valueOf(rtcUserInfo5.getUserId());
                }
                onLineMicInfo = map.get(l4);
            }
            LinkUser linkUser = new LinkUser(l, l2, l3, str, onLineMicInfo, null, null, null, null, null, null, null, 4032, null);
            List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(u7z.LJII);
            ((ArrayList) LLJILJILJ).add(linkUser);
            u7z.LJIJJ(LLJILJILJ);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJLL(U7T u7t, U7A u7a) {
        U73.LIZ(u7t, u7a);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJLZIJ(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJZ(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIIIZZ(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
        if (groupChannelAllUser != null) {
            LJIILL(groupChannelAllUser, j);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIILIIL(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
        if (groupChannelAllUser != null) {
            LJIILL(groupChannelAllUser, j);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJJLI(U7T u7t, List list, GroupPlayer groupPlayer) {
        if (list != null) {
            LJIIL(list, groupPlayer);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIII(U7T linker, GroupChannelAllUser groupChannelAllUser, long j) {
        o.LJIIIZ(linker, "linker");
        if (groupChannelAllUser != null) {
            LJIILL(groupChannelAllUser, j);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIJ(U7T u7t, List list, GroupPlayer groupPlayer) {
        if (list != null) {
            LJIIL(list, groupPlayer);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIJZLJL(U7T linker, GroupChannelAllUser groupChannelAllUser, long j) {
        o.LJIIIZ(linker, "linker");
        if (groupChannelAllUser != null) {
            LJIILL(groupChannelAllUser, j);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJL(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
        if (groupChannelAllUser != null) {
            LJIILL(groupChannelAllUser, j);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJI(U7T u7t, long j, AllListUser allListUser) {
        List<LinkLayerListUser> list;
        List<LinkLayerListUser> list2;
        U7Z u7z = this.LIZIZ;
        List<LinkLayerListUser> list3 = null;
        if (allListUser != null) {
            list = allListUser.appliedList;
        } else {
            list = null;
        }
        u7z.getClass();
        u7z.LJIJ(U7Z.LIZJ(j, list));
        U7Z u7z2 = this.LIZIZ;
        if (allListUser != null) {
            list2 = allListUser.invitedList;
        } else {
            list2 = null;
        }
        u7z2.getClass();
        u7z2.LJIJJ(U7Z.LIZJ(j, list2));
        U7Z u7z3 = this.LIZIZ;
        if (allListUser != null) {
            list3 = allListUser.linkedList;
        }
        u7z3.getClass();
        u7z3.LJIJJLI(U7Z.LIZJ(j, list3));
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJL(U7T u7t, LinkLayerListUser linkLayerListUser, U7A u7a) {
        Long l;
        if (linkLayerListUser == null) {
            return;
        }
        long j = u7t.LJI;
        U7Z u7z = this.LIZIZ;
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(u7z.LJIIIIZZ);
        LinkUser.Builder builder = new LinkUser.Builder();
        Player player = linkLayerListUser.linkUser;
        Long l2 = null;
        if (player != null) {
            l = Long.valueOf(player.roomId);
        } else {
            l = null;
        }
        builder.setRoomId(l);
        Player player2 = linkLayerListUser.linkUser;
        if (player2 != null) {
            l2 = Long.valueOf(player2.uid);
        }
        builder.setUserId(l2);
        builder.setChannelId(Long.valueOf(j));
        builder.setLinkMicId(linkLayerListUser.linkMicId);
        builder.setAppVersion(linkLayerListUser.appVersion);
        ((ArrayList) LLJILJILJ).add(builder.build());
        u7z.LJIJJLI(LLJILJILJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LIZ(U7T linker, long j, GroupChannelAllUser groupChannelAllUser, long j2) {
        o.LJIIIZ(linker, "linker");
        if (groupChannelAllUser == null || Long.valueOf(groupChannelAllUser.groupChannelId) == null || groupChannelAllUser.groupChannelId <= 0) {
            U7Z u7z = this.LIZIZ;
            java.util.Map<Long, ? extends List<GroupChannelUser>> LJJLIL = C113554cx.LJJLIL(u7z.LJ);
            LJJLIL.remove(Long.valueOf(j));
            u7z.LJIILJJIL(LJJLIL);
            return;
        }
        LJIILL(groupChannelAllUser, j2);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJJL(U7T linker, long j, GroupChannelAllUser groupChannelAllUser, long j2) {
        o.LJIIIZ(linker, "linker");
        if (groupChannelAllUser == null || Long.valueOf(groupChannelAllUser.groupChannelId) == null || groupChannelAllUser.groupChannelId <= 0) {
            U7Z u7z = this.LIZIZ;
            java.util.Map<Long, ? extends List<GroupChannelUser>> LJJLIL = C113554cx.LJJLIL(u7z.LJ);
            LJJLIL.remove(Long.valueOf(j));
            u7z.LJIILJJIL(LJJLIL);
            return;
        }
        LJIILL(groupChannelAllUser, j2);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIZ(U7T u7t, GroupPlayer groupPlayer, long j, long j2, long j3) {
        java.util.Map<Long, ? extends List<GroupChannelUser>> LJJLIL = C113554cx.LJJLIL(this.LIZIZ.LJ);
        LJJLIL.remove(Long.valueOf(j));
        this.LIZIZ.LJIILJJIL(LJJLIL);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJLI(U7T u7t, int i, GroupPlayer groupPlayer, GroupChannelAllUser groupChannelAllUser, long j) {
        Player player;
        if (i == 1) {
            if (groupChannelAllUser != null) {
                LJIILL(groupChannelAllUser, j);
            }
        } else {
            if (groupPlayer == null || (player = groupPlayer.user) == null) {
                return;
            }
            LJIIJJI(player.uid);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJLIIL(U7T u7t, int i, GroupPlayer groupPlayer, GroupChannelAllUser groupChannelAllUser, long j) {
        Player player;
        if (i == 1) {
            if (groupChannelAllUser != null) {
                LJIILL(groupChannelAllUser, j);
            }
        } else {
            if (groupPlayer == null || (player = groupPlayer.user) == null) {
                return;
            }
            LJIIJJI(player.uid);
        }
    }
}
