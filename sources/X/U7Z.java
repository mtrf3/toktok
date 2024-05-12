package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDComparatorS343S0100000_13;
import Y.IDComparatorS41S0000000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS20S0000100_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class U7Z implements InterfaceC75973Trl {
    public static final /* synthetic */ int LJIJI = 0;
    public U7T LIZ;
    public volatile boolean LIZIZ;
    public volatile LinkUser LIZLLL;
    public volatile List<LinkUser> LJIIJJI;
    public volatile List<LinkUser> LJIIL;
    public volatile List<LinkUser> LJIILIIL;
    public volatile List<LinkUser> LJIILJJIL;
    public volatile List<LinkUser> LJIILL;
    public String LJIILLIIL;
    public final CopyOnWriteArrayList<U87> LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C73318Sq2 LIZJ = new C73318Sq2();
    public volatile java.util.Map<Long, ? extends List<GroupChannelUser>> LJ = C113554cx.LJJJLIIL();
    public final ConcurrentHashMap<Long, Long> LJFF = new ConcurrentHashMap<>();
    public volatile List<LinkUser> LJI = new ArrayList();
    public volatile List<LinkUser> LJII = new ArrayList();
    public volatile List<LinkUser> LJIIIIZZ = new ArrayList();
    public final CopyOnWriteArrayList<LinkUser> LJIIIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<LinkUser> LJIIJ = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC75973Trl
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIJ() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r8 = this;
            java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r0 = r8.LJIILJJIL
            java.util.List r1 = X.ORZ.LLJILJILJ(r0)
            java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r0 = r8.LJIILL
            java.util.List r7 = X.ORZ.LLJILJILJ(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r1.iterator()
        L15:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r4 = r5.next()
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r4 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r4
            java.util.Iterator r3 = r7.iterator()
        L25:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.String r1 = r0.getLinkMicId()
            java.lang.String r0 = r4.getLinkMicId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L25
            if (r2 == 0) goto L46
            r6.add(r2)
            goto L15
        L46:
            r6.add(r4)
            goto L15
        L4a:
            java.util.concurrent.CopyOnWriteArrayList<X.U87> r0 = r8.LJIIZILJ
            java.util.Iterator r1 = r0.iterator()
        L50:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r1.next()
            X.U87 r0 = (X.U87) r0
            r0.LJJIZ(r6)
            goto L50
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7Z.LIZIZ():void");
    }

    public final List<Long> LJ() {
        List<LinkLayerListUser> list;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIL(this.LJ)).entrySet()) {
            Iterator it = ((Iterable) entry.getValue()).iterator();
            while (it.hasNext()) {
                AllListUser allListUser = ((GroupChannelUser) it.next()).allUser;
                if (allListUser != null && (list = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Player player = it2.next().linkUser;
                        if (player != null && player.uid == C025908h.LIZ()) {
                            arrayList.add(entry.getKey());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIIZI() {
        U7T u7t;
        Room room;
        U7T u7t2 = this.LIZ;
        if ((u7t2 != null && (room = u7t2.LJ) != null && room.getOwnerUserId() == C025908h.LIZ()) || (u7t = this.LIZ) == null || u7t.LJIILJJIL.LIZ >= 3) {
            return this.LJIIIIZZ;
        }
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            return LJFF();
        }
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC75973Trl
    public final Long LJJIJIIJI() {
        List<LinkLayerListUser> list;
        List<LinkLayerListUser> list2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) C113554cx.LJJLIL(this.LJ);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            for (GroupChannelUser groupChannelUser : (Iterable) entry.getValue()) {
                AllListUser allListUser = groupChannelUser.allUser;
                if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it = list2.iterator();
                    while (it.hasNext()) {
                        Player player = it.next().linkUser;
                        if (player != null && player.uid == C025908h.LIZ() && groupChannelUser.status == 3) {
                            return (Long) entry.getKey();
                        }
                    }
                }
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Iterator it2 = ((Iterable) entry2.getValue()).iterator();
            while (it2.hasNext()) {
                AllListUser allListUser2 = ((GroupChannelUser) it2.next()).allUser;
                if (allListUser2 != null && (list = allListUser2.linkedList) != null) {
                    Iterator<LinkLayerListUser> it3 = list.iterator();
                    while (it3.hasNext()) {
                        Player player2 = it3.next().linkUser;
                        if (player2 != null && player2.uid == C025908h.LIZ()) {
                            return (Long) entry2.getKey();
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final void reset() {
        LJIJ(new ArrayList<>());
        LJIJJ(new ArrayList<>());
        ArrayList arrayList = new ArrayList();
        LinkUser linkUser = this.LIZLLL;
        if (linkUser != null) {
            arrayList.add(linkUser);
        }
        LJIJJLI(arrayList);
        List<LinkUser> list = C61878OQg.INSTANCE;
        LJIIZILJ(list);
        LJIILLIIL(list);
        LJIILL(list);
        LJIILIIL(list);
        LJIILJJIL(C113554cx.LJJJLIIL());
        this.LJFF.clear();
        LJJI(list);
        this.LIZJ.LIZLLL();
    }

    public U7Z() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJIIJJI = c61878OQg;
        this.LJIIL = c61878OQg;
        this.LJIILIIL = c61878OQg;
        this.LJIILJJIL = c61878OQg;
        this.LJIILL = c61878OQg;
        this.LJIILLIIL = "";
        this.LJIIZILJ = new CopyOnWriteArrayList<>();
        this.LJIJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 48));
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJFF() {
        Long l;
        LinkUser linkUser;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            ArrayList arrayList = new ArrayList();
            for (LinkUser linkUser2 : ORZ.LLJILJILJ(this.LJIILJJIL)) {
                Long roomId = linkUser2.getRoomId();
                Iterator<LinkUser> it = this.LJIILL.iterator();
                while (true) {
                    l = null;
                    if (it.hasNext()) {
                        linkUser = it.next();
                        if (o.LJ(linkUser.getLinkMicId(), linkUser2.getLinkMicId())) {
                            break;
                        }
                    } else {
                        linkUser = null;
                        break;
                    }
                }
                LinkUser linkUser3 = linkUser;
                if (linkUser3 != null) {
                    l = linkUser3.getUserId();
                }
                arrayList.add(new LinkUser(roomId, l, linkUser2.getChannelId(), linkUser2.getLinkMicId(), linkUser2.getPosition(), linkUser2.getExtra(), linkUser2.getAppVersion(), linkUser2.getChannelOwnerJoinTime(), linkUser2.getChannelOwnerLinkedTime(), linkUser2.getOwnerRoomId(), linkUser2.getOwnerRoomId(), linkUser2.getOwnerChannelId()));
            }
            return arrayList;
        }
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> K9() {
        return this.LJII;
    }

    @Override // X.InterfaceC75973Trl
    public final String LJJIIJ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJIIJIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJIL() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJLIJ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIZ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJJJZ() {
        return this.LJIIL;
    }

    public static final String LJIIIIZZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_UserManager_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_UserManager_", i, LIZ2);
    }

    public final void LIZ(U7A u7a) {
        Long l;
        Long l2;
        Long l3;
        String str;
        Long l4;
        Long l5;
        Long l6;
        String str2;
        OnLineMicInfo onLineMicInfo = null;
        Long l7 = null;
        OnLineMicInfo onLineMicInfo2 = null;
        Long l8 = null;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            RtcUserInfo rtcUserInfo = u7a.LIZ;
            if (rtcUserInfo != null) {
                l4 = Long.valueOf(rtcUserInfo.getRoomId());
            } else {
                l4 = null;
            }
            RtcUserInfo rtcUserInfo2 = u7a.LIZ;
            if (rtcUserInfo2 != null) {
                l5 = Long.valueOf(rtcUserInfo2.getUserId());
            } else {
                l5 = null;
            }
            RtcUserInfo rtcUserInfo3 = u7a.LIZ;
            if (rtcUserInfo3 != null) {
                l6 = Long.valueOf(rtcUserInfo3.getChannelId());
            } else {
                l6 = null;
            }
            RtcUserInfo rtcUserInfo4 = u7a.LIZ;
            if (rtcUserInfo4 != null) {
                str2 = rtcUserInfo4.getLinkMicId();
            } else {
                str2 = null;
            }
            java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
            if (map != null) {
                RtcUserInfo rtcUserInfo5 = u7a.LIZ;
                if (rtcUserInfo5 != null) {
                    l7 = Long.valueOf(rtcUserInfo5.getUserId());
                }
                onLineMicInfo2 = map.get(l7);
            }
            LinkUser linkUser = new LinkUser(l4, l5, l6, str2, onLineMicInfo2, null, null, null, null, null, null, null, 4032, null);
            List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJIIIIZZ);
            ((ArrayList) LLJILJILJ).add(linkUser);
            LJIJJLI(LLJILJILJ);
            return;
        }
        RtcUserInfo rtcUserInfo6 = u7a.LIZ;
        if (rtcUserInfo6 != null) {
            l = Long.valueOf(rtcUserInfo6.getRoomId());
        } else {
            l = null;
        }
        RtcUserInfo rtcUserInfo7 = u7a.LIZ;
        if (rtcUserInfo7 != null) {
            l2 = Long.valueOf(rtcUserInfo7.getUserId());
        } else {
            l2 = null;
        }
        RtcUserInfo rtcUserInfo8 = u7a.LIZ;
        if (rtcUserInfo8 != null) {
            l3 = Long.valueOf(rtcUserInfo8.getChannelId());
        } else {
            l3 = null;
        }
        RtcUserInfo rtcUserInfo9 = u7a.LIZ;
        if (rtcUserInfo9 != null) {
            str = rtcUserInfo9.getLinkMicId();
        } else {
            str = null;
        }
        java.util.Map<Long, OnLineMicInfo> map2 = u7a.LIZJ;
        if (map2 != null) {
            RtcUserInfo rtcUserInfo10 = u7a.LIZ;
            if (rtcUserInfo10 != null) {
                l8 = Long.valueOf(rtcUserInfo10.getUserId());
            }
            onLineMicInfo = map2.get(l8);
        }
        this.LJIIIIZZ.add(new LinkUser(l, l2, l3, str, onLineMicInfo, null, null, null, null, null, null, null, 4032, null));
        C15610jN.LIZIZ(new ARunnableS49S0100000_13(this, 7));
    }

    public final Long LIZLLL(long j) {
        List<LinkLayerListUser> list;
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJ);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
            Iterator it = ((Iterable) entry.getValue()).iterator();
            while (it.hasNext()) {
                AllListUser allListUser = ((GroupChannelUser) it.next()).allUser;
                if (allListUser != null && (list = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            LinkLayerListUser next = it2.next();
                            Player player = next.linkUser;
                            if (player != null && player.uid == j) {
                                if (next != null) {
                                    arrayList.add(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS343S0100000_13(this, 0));
        }
        return (Long) ORZ.LJLLLL(arrayList);
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJI(String str) {
        LinkUser linkUser;
        Iterator<LinkUser> it = LJFF().iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                if (o.LJ(linkUser.getLinkMicId(), str)) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        return linkUser;
    }

    public final void LJIIIZ(Long l) {
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJIIIIZZ);
        ORS.LJJLIL(new AqS179S0100000_13(l, 44), LLJILJILJ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeLinkUserByUidIfHave uid:");
        LIZ.append(l);
        LIZ.append(" after size:");
        LIZ.append(((ArrayList) LLJILJILJ).size());
        C0NB.LIZIZ("kick_out_all", X1D.LIZIZ(LIZ));
        LJIJJLI(LLJILJILJ);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJIIJ(InterfaceC75804Tp2 seiAppData) {
        List<LinkUser> arrayList;
        List<LinkUser> arrayList2;
        Long l;
        o.LJIIIZ(seiAppData, "seiAppData");
        if (seiAppData instanceof SeiAppData) {
            SeiAppData seiAppData2 = (SeiAppData) seiAppData;
            String str = seiAppData2.anchorLinkMicId;
            List<SeiRegion> list = seiAppData2.grids;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                for (SeiRegion seiRegion : list) {
                    SeiRegion seiRegion2 = seiRegion;
                    if ((o.LJ(seiRegion2.LIZ(), str) && seiRegion2.position == 0) || (!o.LJ(seiRegion2.LIZ(), str) && seiRegion2.position > 0)) {
                        arrayList3.add(seiRegion);
                    }
                }
                List<SeiRegion> LLILII = ORZ.LLILII(new IDComparatorS41S0000000_13(2), arrayList3);
                if (LLILII != null) {
                    ArrayList arrayList4 = new ArrayList(C32I.LJJL(LLILII, 10));
                    for (SeiRegion seiRegion3 : LLILII) {
                        LinkUser.Builder builder = new LinkUser.Builder();
                        builder.setRoomId(null);
                        try {
                            String str2 = ((SeiAppData) seiAppData).channelId;
                            if (str2 != null) {
                                builder.setChannelId(C38350F3i.LJJIZ(str2));
                            }
                        } catch (NumberFormatException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        builder.setLinkMicId(seiRegion3.LIZ());
                        String str3 = seiRegion3.uid;
                        if (str3 != null) {
                            l = Long.valueOf(CastLongProtector.parseLong(str3));
                        } else {
                            l = null;
                        }
                        builder.setUserId(l);
                        arrayList4.add(builder.build());
                    }
                    arrayList2 = ORZ.LLJILJILJ(arrayList4);
                    LJIIZILJ(arrayList2);
                    return;
                }
            }
            arrayList2 = new ArrayList<>();
            LJIIZILJ(arrayList2);
            return;
        }
        String LJII = seiAppData.LJII();
        java.util.Map<String, Integer> LIZIZ = seiAppData.LIZIZ();
        if (LIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Integer> entry : LIZIZ.entrySet()) {
                if ((o.LJ(entry.getKey(), LJII) && entry.getValue().intValue() == 0) || (!o.LJ(entry.getKey(), LJII) && entry.getValue().intValue() > 0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                LinkUser.Builder builder2 = new LinkUser.Builder();
                builder2.setRoomId(null);
                try {
                    String LLLLLLIL = seiAppData.LLLLLLIL();
                    if (LLLLLLIL != null) {
                        builder2.setChannelId(C38350F3i.LJJIZ(LLLLLLIL));
                    }
                } catch (NumberFormatException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                builder2.setLinkMicId((String) entry2.getKey());
                arrayList5.add(builder2.build());
            }
            arrayList = ORZ.LLJILJILJ(arrayList5);
        } else {
            arrayList = new ArrayList<>();
        }
        LJIIZILJ(arrayList);
    }

    public final void LJIIJJI(long j) {
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJIIL);
        C29306Beo.LJJIJIIJI(new AqS20S0000100_13(j, 0), LLJILJILJ);
        LJIILIIL(LLJILJILJ);
    }

    public final void LJIIL(long j) {
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJIIL);
        ORS.LJJLIL(new AqS20S0000100_13(j, 1), LLJILJILJ);
        LJIILL(LLJILJILJ);
    }

    public final void LJIILIIL(List<LinkUser> list) {
        if (U7V.LIZ(this.LJIILIIL, list)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyingList updated value = ");
        LIZ.append(list);
        U4R.LIZLLL("UserManager", X1D.LIZIZ(LIZ));
        this.LJIILIIL = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0260, code lost:
    
        if (r3 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0323, code lost:
    
        if (r3 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0355, code lost:
    
        if (r3 != null) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.util.Map<java.lang.Long, ? extends java.util.List<tikcast.linkmic.common.GroupChannelUser>> r38) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7Z.LJIILJJIL(java.util.Map):void");
    }

    public final void LJIILL(List<LinkUser> list) {
        if (U7V.LIZ(this.LJIIL, list)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invitingList updated value = ");
        LIZ.append(list);
        U4R.LIZLLL("UserManager", X1D.LIZIZ(LIZ));
        this.LJIIL = list;
    }

    public final void LJIILLIIL(List<LinkUser> list) {
        if (U7V.LIZ(this.LJIILL, list)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("liveUsersListFromGroupIM updated value = ");
        LIZ.append(list);
        U4R.LIZLLL("UserManager", X1D.LIZIZ(LIZ));
        this.LJIILL = list;
        C15610jN.LIZIZ(new ARunnableS49S0100000_13(this, 8));
    }

    public final void LJIIZILJ(List<LinkUser> list) {
        if (U7V.LIZ(this.LJIILJJIL, list)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("liveUsersListFromSei updated value = ");
        LIZ.append(list);
        U4R.LIZLLL("UserManager", X1D.LIZIZ(LIZ));
        this.LJIILJJIL = list;
        C15610jN.LIZIZ(new ARunnableS49S0100000_13(this, 9));
    }

    public final void LJIJ(List<LinkUser> list) {
        if (U7V.LIZ(this.LJI, list)) {
            return;
        }
        String LJIIIIZZ = LJIIIIZZ(51);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mApplicantList updated need post change listener. value = ");
        LIZ.append(list);
        C32014ChO.LIZ(LJIIIIZZ, X1D.LIZIZ(LIZ));
        this.LJI = list;
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, list, 5));
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJIJI(long j) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJI);
        arrayList.addAll(this.LJII);
        arrayList.addAll(this.LJIIIIZZ);
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            arrayList.addAll(this.LJIIJJI);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Long userId = ((LinkUser) obj).getUserId();
                if (userId != null && userId.longValue() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LinkUser) obj;
    }

    public final void LJIJJ(List<LinkUser> list) {
        if (U7V.LIZ(this.LJII, list)) {
            return;
        }
        String LJIIIIZZ = LJIIIIZZ(63);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mInviteeList updated need post change listener. value = ");
        LIZ.append(list);
        C32014ChO.LIZ(LJIIIIZZ, X1D.LIZIZ(LIZ));
        this.LJII = list;
        List<LinkUser> list2 = this.LJII;
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJIIL);
        for (LinkUser linkUser : list2) {
            Iterator<LinkUser> it = this.LJIIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    LinkUser next = it.next();
                    if (o.LJ(next.getUserId(), linkUser.getUserId())) {
                        if (next != null) {
                            ((ArrayList) LLJILJILJ).remove(next);
                        }
                    }
                }
            }
        }
        LJIILL(LLJILJILJ);
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, list, 6));
    }

    public final void LJIJJLI(List<LinkUser> list) {
        if (U7V.LIZ(this.LJIIIIZZ, list)) {
            return;
        }
        String LJIIIIZZ = LJIIIIZZ(75);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mLinkedList updated need post change listener. value = ");
        LIZ.append(list);
        C32014ChO.LIZ(LJIIIIZZ, X1D.LIZIZ(LIZ));
        List<LinkUser> list2 = this.LJIIIIZZ;
        this.LJIIIIZZ = list;
        for (LinkUser linkUser : list) {
            Iterator<LinkUser> it = this.LJIIIZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LinkUser next = it.next();
                if (o.LJ(next.getUserId(), linkUser.getUserId())) {
                    if (next != null) {
                        this.LJIIIZ.remove(next);
                        C29306Beo.LJJJ(new AqS160S0200000_13(this, linkUser, 5));
                    }
                }
            }
            Iterator<LinkUser> it2 = this.LJIIJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    LinkUser next2 = it2.next();
                    if (o.LJ(next2.getUserId(), linkUser.getUserId())) {
                        if (next2 != null) {
                            this.LJIIJ.remove(next2);
                        }
                    }
                }
            }
        }
        Iterator<U87> it3 = this.LJIIZILJ.iterator();
        while (it3.hasNext()) {
            it3.next().LLIIL(list2, list);
        }
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, list, 7));
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJIL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        LinkUser linkUser = null;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            Iterator<LinkUser> it = LJFF().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LinkUser next = it.next();
                if (o.LJ(next.getLinkMicId(), linkMicId)) {
                    linkUser = next;
                    break;
                }
            }
            return linkUser;
        }
        Iterator<LinkUser> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkUser next2 = it2.next();
            if (o.LJ(next2.getLinkMicId(), linkMicId)) {
                linkUser = next2;
                break;
            }
        }
        return linkUser;
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJ(String linkMicId) {
        Object obj;
        o.LJIIIZ(linkMicId, "linkMicId");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJI);
        arrayList.addAll(this.LJII);
        arrayList.addAll(this.LJIIIIZZ);
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            arrayList.addAll(this.LJIIJJI);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((LinkUser) obj).getLinkMicId(), linkMicId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LinkUser) obj;
    }

    public final void LJJI(List<LinkUser> list) {
        if (U7V.LIZ(this.LJIIJJI, list)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("willJoinLinkedList updated value = ");
        LIZ.append(list);
        U4R.LIZLLL("UserManager", X1D.LIZIZ(LIZ));
        this.LJIIJJI = list;
        List<LinkUser> list2 = this.LJIIJJI;
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJIILIIL);
        for (LinkUser linkUser : list2) {
            Iterator<LinkUser> it = this.LJIILIIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    LinkUser next = it.next();
                    if (o.LJ(next.getUserId(), linkUser.getUserId())) {
                        if (next != null) {
                            ((ArrayList) LLJILJILJ).remove(next);
                        }
                    }
                }
            }
        }
        LJIILIIL(LLJILJILJ);
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, list, 8));
    }

    public final boolean LJJII(List<LinkUser> list) {
        U7T u7t = this.LIZ;
        if (u7t == null || !u7t.LLLLLILLIL() || list.size() < 1 || !this.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJIII(long j) {
        LinkUser linkUser = null;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            Iterator<LinkUser> it = LJFF().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LinkUser next = it.next();
                Long userId = next.getUserId();
                if (userId != null && userId.longValue() == j) {
                    linkUser = next;
                    break;
                }
            }
            return linkUser;
        }
        Iterator<LinkUser> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkUser next2 = it2.next();
            Long userId2 = next2.getUserId();
            if (userId2 != null && userId2.longValue() == j) {
                linkUser = next2;
                break;
            }
        }
        return linkUser;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIJL(U87 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIZILJ.add(listener);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIL(U87 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIZILJ.remove(listener);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJIL(List<LinkUser> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLocalLinkedListForAudience linkedList:");
        LIZ.append(list);
        U4R.LIZLLL("UserManager", X1D.LIZIZ(LIZ));
        LJIILLIIL(list);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJ(LinkUser user) {
        o.LJIIIZ(user, "user");
        this.LJIIJ.add(user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x001d, code lost:
    
        continue;
     */
    @Override // X.InterfaceC75973Trl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJJJJL(long r10) {
        /*
            r9 = this;
            java.lang.Long r1 = r9.LIZLLL(r10)
            java.util.Map<java.lang.Long, ? extends java.util.List<tikcast.linkmic.common.GroupChannelUser>> r0 = r9.LJ
            java.util.Map r0 = X.C113554cx.LJJLIL(r0)
            if (r1 == 0) goto L55
            r1.longValue()
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L55
            java.util.Iterator r8 = r0.iterator()
        L1d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r7 = r8.next()
            tikcast.linkmic.common.GroupChannelUser r7 = (tikcast.linkmic.common.GroupChannelUser) r7
            com.bytedance.android.livesdk.model.message.linkcore.AllListUser r0 = r7.allUser
            if (r0 == 0) goto L1d
            java.util.List<com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser> r0 = r0.linkedList
            if (r0 == 0) goto L1d
            java.util.Iterator r6 = r0.iterator()
        L35:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser r0 = (com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser) r0
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r0.linkUser
            if (r0 == 0) goto L35
            long r3 = r0.uid
            long r1 = X.C025908h.LIZ()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            if (r5 == 0) goto L1d
            long r0 = r7.joinTime
            return r0
        L55:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7Z.LJJJJJL(long):long");
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJJJL(String linkMicId) {
        LinkUser linkUser;
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<LinkUser> it = LJJIIZI().iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                if (o.LJ(linkUser.getLinkMicId(), linkMicId)) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        return linkUser;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJLI(LinkUser user) {
        o.LJIIIZ(user, "user");
        this.LJIIIZ.add(user);
    }

    public static List LIZJ(long j, List list) {
        Long l;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LinkLayerListUser linkLayerListUser = (LinkLayerListUser) it.next();
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
                arrayList.add(builder.build());
            }
            return ORZ.LLJILJILJ(arrayList);
        }
        return new ArrayList();
    }

    public static int LJII(long j, List list) {
        List<LinkLayerListUser> list2;
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                GroupChannelUser groupChannelUser = (GroupChannelUser) it.next();
                AllListUser allListUser = groupChannelUser.allUser;
                if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Player player = it2.next().linkUser;
                        if (player != null && player.uid == j) {
                            i = groupChannelUser.status;
                        }
                    }
                }
            }
        }
        return i;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJLL(int i, List linkedList) {
        o.LJIIIZ(linkedList, "linkedList");
        List LLJILJILJ = ORZ.LLJILJILJ(this.LJIIIIZZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLocalLinkedList old linkedList:");
        LIZ.append(LLJILJILJ);
        LIZ.append(", new linkedList:");
        LIZ.append(linkedList);
        U4R.LIZLLL("UserManager", X1D.LIZIZ(LIZ));
        C29306Beo.LJJJ(new AqS102S0300000_13(this, (U7Z) LLJILJILJ, (List<LinkUser>) linkedList, (List<LinkUser>) 1));
        InterfaceC92693kP LJIIJJI = new C73440Ss0(AbstractC73672Svk.LJJLIIIJLJLI(i, TimeUnit.SECONDS).LJJL(C73969T1h.LIZIZ()).LJJJ(C73969T1h.LIZIZ()).LJIIZILJ(new U8F(this, linkedList, LLJILJILJ)).LJIJJ(C76733U9p.LJLIL)).LJIIIIZZ().LJIIJJI();
        C73318Sq2 compositeDisposable = this.LIZJ;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJIIJJI);
    }
}
