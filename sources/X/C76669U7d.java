package X;

import Y.ARunnableS32S0200000_13;
import Y.IDComparatorS343S0100000_13;
import Y.IDComparatorS41S0000000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkPosition;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U7d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76669U7d implements InterfaceC76652U6m {
    public List<LinkLayerListUser> LIZ;
    public java.util.Map<Integer, Integer> LIZIZ;
    public Room LIZLLL;
    public U7T LJ;
    public String LJI;
    public long LJII;
    public final CopyOnWriteArrayList<InterfaceC76728U9k> LIZJ = new CopyOnWriteArrayList<>();
    public final C5H3 LJFF = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 563));
    public java.util.Map<String, OnLineMicInfo> LJIIIIZZ = C113554cx.LJJJLIIL();
    public java.util.Map<String, OnLineMicInfo> LJIIIZ = C113554cx.LJJJLIIL();
    public java.util.Map<String, OnLineMicInfo> LJIIJ = C113554cx.LJJJLIIL();
    public java.util.Map<String, OnLineMicInfo> LJIIJJI = C113554cx.LJJJLIIL();
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 562));
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 561));

    @Override // X.InterfaceC76652U6m
    public final int LJIIIIZZ() {
        return this.LJIIIIZZ.size();
    }

    @Override // X.InterfaceC76652U6m
    public final boolean LJIIIZ() {
        if (this.LIZIZ == null || !(!r0.isEmpty())) {
            return false;
        }
        return true;
    }

    public final LinkLayerRTCMessage LJIIJJI() {
        boolean z;
        Integer num;
        int i;
        MicPositionInfo micPositionData;
        Integer num2;
        int i2;
        MicPositionInfo micPositionData2;
        MicPositionInfo micPositionData3;
        LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage(null, null, null, null, 0L, null, null, 127, null);
        linkLayerRTCMessage.generateId();
        linkLayerRTCMessage.setMethod("linkMicLayerFloatPosition");
        LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam(null, 0, 0, null, null, true, 31, null);
        ArrayList arrayList = new ArrayList();
        if (!this.LJIIIIZZ.isEmpty()) {
            java.util.Map<String, OnLineMicInfo> map = this.LJIIIIZZ;
            OnLineMicInfo onLineMicInfo = map.get(ORZ.LJLLILLLL(map.keySet()));
            if (onLineMicInfo != null && (micPositionData3 = onLineMicInfo.getMicPositionData()) != null && micPositionData3.getLinkedTime() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List<String> LLILII = ORZ.LLILII(new IDComparatorS343S0100000_13(this, 3), this.LJIIIIZZ.keySet());
                arrayList = new ArrayList(C32I.LJJL(LLILII, 10));
                for (String str : LLILII) {
                    OnLineMicInfo onLineMicInfo2 = this.LJIIIIZZ.get(str);
                    if (onLineMicInfo2 != null && (micPositionData2 = onLineMicInfo2.getMicPositionData()) != null) {
                        num2 = Integer.valueOf(micPositionData2.getPosition());
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else {
                        i2 = -1;
                    }
                    arrayList.add(new LinkLayerRTCMessageUser(str, i2, 0, 0, 12, null));
                }
            } else {
                List<String> LLILII2 = ORZ.LLILII(new IDComparatorS343S0100000_13(this, 4), this.LJIIIZ.keySet());
                arrayList = new ArrayList(C32I.LJJL(LLILII2, 10));
                for (String str2 : LLILII2) {
                    OnLineMicInfo onLineMicInfo3 = this.LJIIIIZZ.get(str2);
                    if (onLineMicInfo3 != null && (micPositionData = onLineMicInfo3.getMicPositionData()) != null) {
                        num = Integer.valueOf(micPositionData.getPosition());
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    arrayList.add(new LinkLayerRTCMessageUser(str2, i, 0, 0, 12, null));
                }
            }
        } else {
            String LJIIZILJ = LJIIZILJ(881);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mFixedPositionMap isNullOrEmpty: ");
            LIZ.append(this.LJIIIIZZ.isEmpty());
            C32014ChO.LIZJ(LJIIZILJ, X1D.LIZIZ(LIZ), null);
        }
        linkLayerRTCMessageParam.getUsers().addAll(arrayList);
        linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
        return linkLayerRTCMessage;
    }

    public final long LJIILLIIL() {
        return ((Number) this.LJFF.getValue()).longValue();
    }

    @Override // X.InterfaceC76652U6m
    public final int LJIJ() {
        return this.LJIIJ.size();
    }

    @Override // X.InterfaceC76652U6m
    public final void LJJJI() {
        U7T u7t = this.LJ;
        if (u7t != null) {
            U7V.LJIILJJIL(new C76676U7k(this, u7t));
        }
    }

    @Override // X.InterfaceC76652U6m
    public final void reset() {
        LJJIII(C113554cx.LJJJLIIL());
        LJJIFFI(C113554cx.LJJJLIIL());
        LJJIIJ(C113554cx.LJJJLIIL());
        LJJIIZI(C113554cx.LJJJLIIL());
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LJIILJJIL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LJJIIJZLJL() {
        return this.LJIIJJI;
    }

    public static final String LJIIZILJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_MicPositionManager_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_MicPositionManager_", i, LIZ2);
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LJIIIZ.get(linkMicId);
    }

    @Override // X.InterfaceC76652U6m
    public final void LIZJ(java.util.Map<Integer, Integer> map) {
        this.LIZIZ = map;
        LJFF(this.LJIIIIZZ);
        LJFF(this.LJIIIZ);
        LJFF(this.LJIIJ);
        LJFF(this.LJIIJJI);
    }

    @Override // X.InterfaceC76652U6m
    public final void LJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
        int i = 1;
        if (seiAppData instanceof SeiAppData) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            SeiAppData seiAppData2 = (SeiAppData) seiAppData;
            String str = seiAppData2.anchorLinkMicId;
            List<SeiRegion> list = seiAppData2.grids;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (SeiRegion seiRegion : list) {
                    SeiRegion seiRegion2 = seiRegion;
                    if ((o.LJ(seiRegion2.LIZ(), str) && seiRegion2.position == 0) || (!o.LJ(seiRegion2.LIZ(), str) && seiRegion2.position > 0)) {
                        arrayList.add(seiRegion);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SeiRegion seiRegion3 = (SeiRegion) it.next();
                    String LIZ = seiRegion3.LIZ();
                    if (LIZ != null) {
                        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                        builder.setOnLinePattern(i);
                        builder.setMicPositionData(new MicPositionInfo(0, seiRegion3.position, 0, 0L, 12, null));
                        linkedHashMap.put(LIZ, builder.build());
                        OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                        builder2.setOnLinePattern(1);
                        builder2.setMicPositionData(new MicPositionInfo(0, seiRegion3.position, 0, 0L, 12, null));
                        linkedHashMap2.put(LIZ, builder2.build());
                    }
                    i = 1;
                }
            }
            LJJIIZI(linkedHashMap);
            LJJIIJ(linkedHashMap2);
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        String LJII = seiAppData.LJII();
        java.util.Map<String, Integer> LIZIZ = seiAppData.LIZIZ();
        if (LIZIZ != null) {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry<String, Integer> entry : LIZIZ.entrySet()) {
                if ((o.LJ(entry.getKey(), LJII) && entry.getValue().intValue() == 0) || (!o.LJ(entry.getKey(), LJII) && entry.getValue().intValue() > 0)) {
                    linkedHashMap5.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                Object key = entry2.getKey();
                if (key != null) {
                    OnLineMicInfo.Builder builder3 = new OnLineMicInfo.Builder();
                    builder3.setOnLinePattern(1);
                    builder3.setMicPositionData(new MicPositionInfo(0, ((Number) entry2.getValue()).intValue(), 0, 0L, 12, null));
                    linkedHashMap3.put(key, builder3.build());
                    OnLineMicInfo.Builder builder4 = new OnLineMicInfo.Builder();
                    builder4.setOnLinePattern(1);
                    builder4.setMicPositionData(new MicPositionInfo(0, ((Number) entry2.getValue()).intValue(), 0, 0L, 12, null));
                    linkedHashMap4.put(key, builder4.build());
                }
            }
        }
        LJJIIZI(linkedHashMap3);
        LJJIIJ(linkedHashMap4);
    }

    public final void LJFF(java.util.Map<String, OnLineMicInfo> map) {
        int i;
        Integer num;
        if (this.LIZIZ != null && (!r0.isEmpty())) {
            for (Map.Entry<String, OnLineMicInfo> entry : map.entrySet()) {
                MicPositionInfo micPositionData = entry.getValue().getMicPositionData();
                if (micPositionData != null) {
                    java.util.Map<Integer, Integer> map2 = this.LIZIZ;
                    if (map2 != null) {
                        MicPositionInfo micPositionData2 = entry.getValue().getMicPositionData();
                        if (micPositionData2 != null) {
                            num = Integer.valueOf(micPositionData2.getPosition());
                        } else {
                            num = null;
                        }
                        Integer num2 = map2.get(num);
                        if (num2 != null) {
                            i = num2.intValue();
                            micPositionData.setUiPos(i);
                        }
                    }
                    i = -1;
                    micPositionData.setUiPos(i);
                }
            }
        }
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LJII(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LJIIIIZZ.get(linkMicId);
    }

    public final String LJIIL(U7A u7a) {
        RtcUserInfo rtcUserInfo = u7a.LIZ;
        if (rtcUserInfo != null && rtcUserInfo.getUserId() == LJIILLIIL()) {
            return u7a.LIZ.getLinkMicId();
        }
        C32014ChO.LIZJ(LJIIZILJ(944), "getLiveRoomOwnerLinkMicId failed current user id is not room owner id.", null);
        return null;
    }

    @Override // X.InterfaceC76652U6m
    public final int LJIILIIL(int i) {
        if (LJIIIZ()) {
            java.util.Map<Integer, Integer> map = this.LIZIZ;
            if (map != null) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().intValue() == i) {
                        return entry.getKey().intValue();
                    }
                }
            }
            return -1;
        }
        return i;
    }

    public final void LJIJJ(String str) {
        boolean containsKey = this.LJIIIIZZ.containsKey(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeUserFromFixedPositionMap linkMicId: ");
        LIZ.append(str);
        LIZ.append(", containsInCurMap: ");
        LIZ.append(containsKey);
        C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
        if (containsKey) {
            java.util.Map<String, OnLineMicInfo> LJJLIL = C113554cx.LJJLIL(this.LJIIIIZZ);
            LJJLIL.remove(str);
            LJJIFFI(LJJLIL);
        }
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LJIJJLI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LJIIJJI.get(linkMicId);
    }

    public final void LJJ(String str) {
        MicPositionInfo micPositionData;
        boolean containsKey = this.LJIIIZ.containsKey(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcUserLeft removeUserFromFloatPositionMap linkMicId: ");
        LIZ.append(str);
        LIZ.append(", containsInCurMap: ");
        LIZ.append(containsKey);
        C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
        if (containsKey) {
            List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLILII(new IDComparatorS343S0100000_13(this, 6), this.LJIIIZ.keySet()));
            if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
                ((ArrayList) LLJILJILJ).remove(str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (Object obj : LLJILJILJ) {
                int i2 = i + 1;
                if (i >= 0) {
                    OnLineMicInfo onLineMicInfo = this.LJIIIZ.get(obj);
                    if (onLineMicInfo != null && (micPositionData = onLineMicInfo.getMicPositionData()) != null) {
                        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                        builder.setOnLinePattern(onLineMicInfo.getOnLinePattern());
                        builder.setMicPositionData(new MicPositionInfo(micPositionData.getStrategy(), i, 0, 0L, 12, null));
                        linkedHashMap.put(obj, builder.build());
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            LJJIII(linkedHashMap);
        }
    }

    public final void LJJIFFI(java.util.Map<String, OnLineMicInfo> map) {
        if (LJIJI(this.LJIIIIZZ, map)) {
            C32014ChO.LIZ(LJIIZILJ(75), "fixed map equals do not need update.");
            return;
        }
        String LJIIZILJ = LJIIZILJ(78);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fixed map updated need post change listener. value=");
        LIZ.append(map);
        C32014ChO.LIZ(LJIIZILJ, X1D.LIZIZ(LIZ));
        this.LJIIIIZZ = map;
        LJFF(map);
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, map, 131));
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LJJII(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LJIIJ.get(linkMicId);
    }

    public final void LJJIII(java.util.Map<String, OnLineMicInfo> map) {
        if (LJIJI(this.LJIIIZ, map)) {
            C32014ChO.LIZ(LJIIZILJ(93), "float map equals do not need update.");
            return;
        }
        String LJIIZILJ = LJIIZILJ(96);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("float map updated need post change listener. value = ");
        LIZ.append(map);
        C32014ChO.LIZ(LJIIZILJ, X1D.LIZIZ(LIZ));
        this.LJIIIZ = map;
        LJFF(map);
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, map, 132));
    }

    public final void LJJIIJ(java.util.Map<String, OnLineMicInfo> map) {
        if (LJIJI(this.LJIIJJI, map)) {
            return;
        }
        this.LJIIJJI = map;
        LJFF(map);
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, map, 133));
    }

    @Override // X.InterfaceC76652U6m
    public final void LJJIIZ(InterfaceC76728U9k interfaceC76728U9k) {
        this.LIZJ.add(interfaceC76728U9k);
    }

    public final void LJJIIZI(java.util.Map<String, OnLineMicInfo> map) {
        if (LJIJI(this.LJIIJ, map)) {
            return;
        }
        this.LJIIJ = map;
        LJFF(map);
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, map, 134));
    }

    public final void LJJIJ(String str) {
        Long l;
        U7T u7t;
        U7T u7t2 = this.LJ;
        if (u7t2 != null) {
            l = Long.valueOf(u7t2.LLZL().getUserId());
        } else {
            l = null;
        }
        long LJIILLIIL = LJIILLIIL();
        if (l == null || l.longValue() != LJIILLIIL || (u7t = this.LJ) == null) {
            return;
        }
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, LJIIJJI());
        if (json == null) {
            return;
        }
        String LJIIZILJ = LJIIZILJ(362);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("syncPositionMsgToGuest source = ");
        LIZ.append(str);
        LIZ.append(" in position manager message: ");
        LIZ.append(json);
        C32014ChO.LIZ(LJIIZILJ, X1D.LIZIZ(LIZ));
        u7t.LJIIIZ.LJJJJZ(json);
    }

    public final void LJJIJIIJI(List<LinkLayerListUser> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (LinkLayerListUser linkLayerListUser : list) {
                String str = linkLayerListUser.linkMicId;
                OnLineMicInfo LIZJ = U7V.LIZJ(linkLayerListUser.positionData, Long.valueOf(linkLayerListUser.linkedTimeNano));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateAllFixedPositionMapByListMessage, linkMicId ");
                LIZ.append(str);
                LIZ.append(", micInfo ");
                LIZ.append(LIZJ);
                C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
                if (LIZJ != null) {
                    linkedHashMap.put(str, LIZJ);
                }
            }
        }
        String str2 = this.LJI;
        if (str2 != null && !linkedHashMap.containsKey(str2)) {
            OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
            builder.setOnLinePattern(0);
            builder.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
            OnLineMicInfo build = builder.build();
            linkedHashMap.put(str2, build);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateAllFixedPositionMapByListMessage update anchor's position, ");
            LIZ2.append(build);
            LIZ2.append(", linkMicId ");
            LIZ2.append(str2);
            C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ2));
        }
        LJJIFFI(linkedHashMap);
    }

    public final void LJJIJIIJIL(List list) {
        int i;
        int i2;
        OnLineMicInfo LIZJ;
        MicPositionInfo micPositionData;
        LinkPosition linkPosition;
        int i3;
        LinkPosition linkPosition2;
        LinkPosition linkPosition3;
        List<LinkLayerListUser> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = true;
        int i4 = 0;
        if (list2 == null || list2.isEmpty()) {
            LJJIII(linkedHashMap);
            return;
        }
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            MicPositionData micPositionData2 = ((LinkLayerListUser) it.next()).positionData;
            if (micPositionData2 != null && (linkPosition3 = micPositionData2.linkPosition) != null) {
                i = linkPosition3.position;
            } else {
                i = 0;
            }
            while (it.hasNext()) {
                MicPositionData micPositionData3 = ((LinkLayerListUser) it.next()).positionData;
                if (micPositionData3 != null && (linkPosition2 = micPositionData3.linkPosition) != null) {
                    i3 = linkPosition2.position;
                } else {
                    i3 = 0;
                }
                if (i < i3) {
                    i = i3;
                }
            }
            if (i < list2.size()) {
                z = false;
            }
            StringBuilder LJI = JBR.LJI("updateAllFloatPositionMapByListMessageNewWay isCreatePosByIndex:", z, " list:");
            C31811Ce7.LJ(LJI, ORZ.LLD(list2, null, null, null, UB3.LJLIL, 31), LJI, "MicPositionManager");
            if (z) {
                list2 = ORZ.LLILII(new IDComparatorS41S0000000_13(17), list2);
            }
            for (LinkLayerListUser linkLayerListUser : list2) {
                if (z) {
                    i2 = i4;
                    i4++;
                } else {
                    MicPositionData micPositionData4 = linkLayerListUser.positionData;
                    if (micPositionData4 != null && (linkPosition = micPositionData4.linkPosition) != null) {
                        i2 = linkPosition.position;
                    }
                }
                String str = linkLayerListUser.linkMicId;
                LIZJ = U7V.LIZJ(linkLayerListUser.positionData, 0L);
                if (LIZJ != null && !linkedHashMap.containsKey(str) && (micPositionData = LIZJ.getMicPositionData()) != null) {
                    OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                    builder.setOnLinePattern(LIZJ.getOnLinePattern());
                    builder.setMicPositionData(new MicPositionInfo(micPositionData.getStrategy(), i2, i2, micPositionData.getLinkedTime()));
                    OnLineMicInfo build = builder.build();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("updateAllFloatPositionMapByListMessageNewWay, linkMicId ");
                    LIZ.append(str);
                    LIZ.append(", micInfo ");
                    LIZ.append(LIZJ);
                    C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
                    linkedHashMap.put(str, build);
                }
            }
            LJJIII(linkedHashMap);
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // X.InterfaceC76652U6m
    public final void LJJJJI(InterfaceC76728U9k listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZJ.remove(listener);
    }

    public static final boolean LJIJI(java.util.Map<String, OnLineMicInfo> map, java.util.Map<String, OnLineMicInfo> map2) {
        Integer num;
        OnLineMicInfo onLineMicInfo;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        OnLineMicInfo onLineMicInfo2;
        Integer num6;
        Integer num7;
        Integer num8;
        MicPositionInfo micPositionData3;
        MicPositionInfo micPositionData4;
        Iterator<Map.Entry<String, OnLineMicInfo>> it = map.entrySet().iterator();
        do {
            num = null;
            if (it.hasNext()) {
                Map.Entry<String, OnLineMicInfo> next = it.next();
                String key = next.getKey();
                if (!o.LJ(next.getValue(), map2.get(key)) || (onLineMicInfo2 = map2.get(key)) == null || next.getValue().getOnLinePattern() != onLineMicInfo2.getOnLinePattern()) {
                    return false;
                }
                MicPositionInfo micPositionData5 = next.getValue().getMicPositionData();
                if (micPositionData5 != null) {
                    num6 = Integer.valueOf(micPositionData5.getStrategy());
                } else {
                    num6 = null;
                }
                OnLineMicInfo onLineMicInfo3 = map2.get(key);
                if (onLineMicInfo3 != null && (micPositionData4 = onLineMicInfo3.getMicPositionData()) != null) {
                    num7 = Integer.valueOf(micPositionData4.getStrategy());
                } else {
                    num7 = null;
                }
                if (!o.LJ(num6, num7)) {
                    return false;
                }
                MicPositionInfo micPositionData6 = next.getValue().getMicPositionData();
                if (micPositionData6 != null) {
                    num8 = Integer.valueOf(micPositionData6.getPosition());
                } else {
                    num8 = null;
                }
                OnLineMicInfo onLineMicInfo4 = map2.get(key);
                if (onLineMicInfo4 != null && (micPositionData3 = onLineMicInfo4.getMicPositionData()) != null) {
                    num = Integer.valueOf(micPositionData3.getPosition());
                }
            } else {
                for (Map.Entry<String, OnLineMicInfo> entry : map2.entrySet()) {
                    String key2 = entry.getKey();
                    if (!o.LJ(entry.getValue(), map.get(key2)) || (onLineMicInfo = map.get(key2)) == null || onLineMicInfo.getOnLinePattern() != entry.getValue().getOnLinePattern()) {
                        return false;
                    }
                    OnLineMicInfo onLineMicInfo5 = map.get(key2);
                    if (onLineMicInfo5 != null && (micPositionData2 = onLineMicInfo5.getMicPositionData()) != null) {
                        num2 = Integer.valueOf(micPositionData2.getStrategy());
                    } else {
                        num2 = null;
                    }
                    MicPositionInfo micPositionData7 = entry.getValue().getMicPositionData();
                    if (micPositionData7 != null) {
                        num3 = Integer.valueOf(micPositionData7.getStrategy());
                    } else {
                        num3 = null;
                    }
                    if (!o.LJ(num2, num3)) {
                        return false;
                    }
                    OnLineMicInfo onLineMicInfo6 = map.get(key2);
                    if (onLineMicInfo6 != null && (micPositionData = onLineMicInfo6.getMicPositionData()) != null) {
                        num4 = Integer.valueOf(micPositionData.getPosition());
                    } else {
                        num4 = null;
                    }
                    MicPositionInfo micPositionData8 = entry.getValue().getMicPositionData();
                    if (micPositionData8 != null) {
                        num5 = Integer.valueOf(micPositionData8.getPosition());
                    } else {
                        num5 = null;
                    }
                    if (!o.LJ(num4, num5)) {
                        return false;
                    }
                }
                return true;
            }
        } while (o.LJ(num8, num));
        return false;
    }

    public final void LJI(U7T u7t, java.util.Map<Long, OnLineMicInfo> map) {
        LJJIFFI(LJIILL(this.LJIIIIZZ, u7t, map));
    }

    public final void LJIIJ(U7T u7t, java.util.Map<Long, OnLineMicInfo> map) {
        String str;
        int i;
        String linkMicId;
        java.util.Map<String, OnLineMicInfo> LJJLIL = C113554cx.LJJLIL(this.LJIIIZ);
        LinkUser LJIJI = u7t.LJIIJJI.LJIJI(LJIILLIIL());
        if (LJIJI == null || (str = LJIJI.getLinkMicId()) == null) {
            str = this.LJI;
        }
        if (str == null) {
            C0NB.LIZIZ("MicPositionManager", "getNewVersionOfFloatPositionMap Not get anchor's linkmic id");
            i = 0;
        } else {
            i = -1;
            if (str != null && !LJJLIL.containsKey(str)) {
                OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                builder.setOnLinePattern(1);
                i = (-1) + 1;
                builder.setMicPositionData(new MicPositionInfo(0, i, 0, 0L, 12, null));
                OnLineMicInfo build = builder.build();
                LJJLIL.put(str, build);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getNewVersionOfFloatPositionMap update anchor's linkmic id position, ");
                LIZ.append(build);
                LIZ.append(", linkMicId ");
                LIZ.append(str);
                C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
            }
        }
        Iterator it = ((LinkedHashMap) LJJLIL).entrySet().iterator();
        while (it.hasNext()) {
            MicPositionInfo micPositionData = ((OnLineMicInfo) ((Map.Entry) it.next()).getValue()).getMicPositionData();
            if (micPositionData != null) {
                i = Math.max(i, micPositionData.getPosition());
            }
        }
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                LinkUser LJIJI2 = u7t.LJIIJJI.LJIJI(it2.next().getKey().longValue());
                if (LJIJI2 != null && (linkMicId = LJIJI2.getLinkMicId()) != null && !LJJLIL.containsKey(linkMicId)) {
                    OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                    builder2.setOnLinePattern(1);
                    i++;
                    builder2.setMicPositionData(new MicPositionInfo(0, i, 0, 0L, 12, null));
                    OnLineMicInfo build2 = builder2.build();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("getNewVersionOfFloatPositionMap, linkMicId ");
                    LIZ2.append(linkMicId);
                    LIZ2.append(", micInfo ");
                    LIZ2.append(build2);
                    C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ2));
                    LJJLIL.put(linkMicId, build2);
                }
            }
        }
        LJJIII(LJJLIL);
    }

    public final void LJIL(U7T u7t, java.util.Map<Long, OnLineMicInfo> map) {
        String linkMicId;
        java.util.Map<String, OnLineMicInfo> LJJLIL = C113554cx.LJJLIL(this.LJIIIIZZ);
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LinkUser LJIJI = u7t.LJIIJJI.LJIJI(it.next().getKey().longValue());
                if (LJIJI != null && (linkMicId = LJIJI.getLinkMicId()) != null) {
                    boolean containsKey = LJJLIL.containsKey(linkMicId);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("removeUserFromFixedPositionMap linkMicId: ");
                    LIZ.append(linkMicId);
                    LIZ.append(", containsInCurMap: ");
                    LIZ.append(containsKey);
                    C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
                    if (containsKey) {
                        LJJLIL.remove(linkMicId);
                    }
                }
            }
        }
        LJJIFFI(LJJLIL);
    }

    public final void LJJI(U7T u7t, java.util.Map<Long, OnLineMicInfo> map) {
        MicPositionInfo micPositionData;
        String linkMicId;
        List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLILII(new IDComparatorS343S0100000_13(this, 5), this.LJIIIZ.keySet()));
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LinkUser LJIJI = u7t.LJIIJJI.LJIJI(it.next().getKey().longValue());
                if (LJIJI != null && (linkMicId = LJIJI.getLinkMicId()) != null) {
                    ArrayList arrayList = (ArrayList) LLJILJILJ;
                    boolean contains = arrayList.contains(linkMicId);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("removeUserFromFloatPositionMap linkMicId: ");
                    LIZ.append(linkMicId);
                    LIZ.append(", containsInCurMap: ");
                    LIZ.append(contains);
                    C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
                    if (contains) {
                        arrayList.remove(linkMicId);
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = ((ArrayList) LLJILJILJ).iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) next;
                OnLineMicInfo onLineMicInfo = this.LJIIIZ.get(str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("removeUserFromFloatPositionMap updated linkMicId: ");
                LIZ2.append(str);
                LIZ2.append(", currentMicInfo: ");
                LIZ2.append(onLineMicInfo);
                C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ2));
                if (onLineMicInfo != null && (micPositionData = onLineMicInfo.getMicPositionData()) != null) {
                    OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                    builder.setOnLinePattern(onLineMicInfo.getOnLinePattern());
                    builder.setMicPositionData(new MicPositionInfo(micPositionData.getStrategy(), i, 0, 0L, 12, null));
                    linkedHashMap.put(str, builder.build());
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LJJIII(linkedHashMap);
    }

    public final java.util.Map<String, OnLineMicInfo> LJIILL(java.util.Map<String, OnLineMicInfo> map, U7T u7t, java.util.Map<Long, OnLineMicInfo> map2) {
        String linkMicId;
        long j;
        MicPositionInfo micPositionData;
        java.util.Map<String, OnLineMicInfo> LJJLIL = C113554cx.LJJLIL(map);
        if (map2 != null) {
            for (Map.Entry<Long, OnLineMicInfo> entry : map2.entrySet()) {
                LinkUser LJIJI = u7t.LJIIJJI.LJIJI(entry.getKey().longValue());
                if (LJIJI != null && (linkMicId = LJIJI.getLinkMicId()) != null) {
                    MicPositionInfo micPositionData2 = entry.getValue().getMicPositionData();
                    if (micPositionData2 != null) {
                        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) ((LinkedHashMap) LJJLIL).get(linkMicId);
                        if (onLineMicInfo != null && (micPositionData = onLineMicInfo.getMicPositionData()) != null) {
                            j = micPositionData.getLinkedTime();
                        } else {
                            j = 0;
                        }
                        micPositionData2.setLinkedTime(j);
                    }
                    LJJLIL.put(linkMicId, entry.getValue());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getNewVersionOfFixedPositionMap, linkMicId ");
                    LIZ.append(linkMicId);
                    LIZ.append(", mic info ");
                    LIZ.append(entry.getValue());
                    C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
                }
            }
        }
        String str = this.LJI;
        if (str != null && !LJJLIL.containsKey(str)) {
            OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
            builder.setOnLinePattern(0);
            builder.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
            OnLineMicInfo build = builder.build();
            LJJLIL.put(str, build);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getNewVersionOfFixedPositionMap update anchor's position, ");
            LIZ2.append(build);
            LIZ2.append(", linkMicId ");
            LIZ2.append(str);
            C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ2));
        }
        return LJJLIL;
    }
}
