package X;

import Y.ARunnableS14S1100000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS25S0301000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7H implements InterfaceC75973Trl, InterfaceC76652U6m, InterfaceC76734U9q {
    public static final /* synthetic */ int LJIILL = 0;
    public C73411SrX LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public List<LinkUser> LIZ = new CopyOnWriteArrayList();
    public final List<LinkUser> LIZIZ = new CopyOnWriteArrayList();
    public List<LinkUser> LIZJ = new CopyOnWriteArrayList();
    public List<LinkUser> LIZLLL = new CopyOnWriteArrayList();
    public List<LinkUser> LJ = new CopyOnWriteArrayList();
    public List<LinkUser> LJFF = new CopyOnWriteArrayList();
    public java.util.Map<String, OnLineMicInfo> LJI = C113554cx.LJJJLIIL();
    public List<String> LJII = new ArrayList();
    public final List<U87> LJIIIIZZ = new ArrayList();
    public final List<InterfaceC76728U9k> LJIIIZ = new ArrayList();
    public String LJIIJ = "";
    public String LJIILJJIL = "";

    @Override // X.InterfaceC76652U6m
    public final void LIZJ(java.util.Map<Integer, Integer> map) {
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LJII(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return null;
    }

    @Override // X.InterfaceC76652U6m
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJIIJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIJJI(String str, String str2) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIL() {
    }

    @Override // X.InterfaceC76652U6m
    public final int LJIILIIL(int i) {
        return -1;
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILL(String str) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILLIIL(String str, String str2) {
    }

    public final void LJIIZILJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("adaptLinkedList before mLinkedList:");
        LIZ.append(this.LIZLLL);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ));
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (String str : this.LJII) {
            Iterator<LinkUser> it = this.LIZLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    LinkUser next = it.next();
                    if (o.LJ(str, next.getLinkMicId())) {
                        if (next != null) {
                            copyOnWriteArrayList.add(next);
                        }
                    }
                }
            }
        }
        this.LIZLLL = copyOnWriteArrayList;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("adaptLinkedList after mLinkedList:");
        LIZ2.append(this.LIZLLL);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ2));
        LJJLIIIIJ(null, null);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("makeSelfToFirst mSelfLinkMicId:");
        LIZ.append(this.LJIIJ);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("makeSelfToFirst before mFloatPositionArray:");
        LIZ2.append(this.LJII);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ2));
        if (this.LJII.remove(this.LJIIJ)) {
            ListProtector.add(this.LJII, 0, this.LJIIJ);
            U4R.LIZ("CoManager", "makeSelfToFirst enter");
        }
        LJIIZILJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("makeSelfToFirst after mFloatPositionArray:");
        LIZ3.append(this.LJII);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ3));
    }

    @Override // X.InterfaceC75973Trl
    public final Long LJJIJIIJI() {
        return null;
    }

    @Override // X.InterfaceC76652U6m
    public final void LJJJI() {
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJ(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJIZL(LinkCoreError linkCoreError) {
    }

    @Override // X.InterfaceC75973Trl
    public final long LJJJJJL(long j) {
        return 0L;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJLI(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76734U9q
    public final void onFirstRemoteVideoFrameRender(String str) {
    }

    @Override // X.InterfaceC75973Trl
    public final void reset() {
    }

    @Override // X.InterfaceC76652U6m
    public final int LJIIIIZZ() {
        return this.LJI.size();
    }

    @Override // X.InterfaceC76652U6m
    public final int LJIJ() {
        return this.LJI.size();
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIFFI() {
        if (this.LJIIL) {
            this.LJIIL = false;
            C15610jN.LIZIZ(new ARunnableS49S0100000_13(this, 189));
        }
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LIZ() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LIZLLL() {
        return C113554cx.LJJJLIIL();
    }

    public final void LJJL() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        MicPositionInfo micPositionData3;
        MicPositionInfo micPositionData4;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        MicPositionInfo micPositionData5;
        MicPositionInfo micPositionData6;
        MicPositionInfo micPositionData7;
        MicPositionInfo micPositionData8;
        LJJIJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        int i = 0;
        for (String str : this.LJII) {
            OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
            builder.setOnLinePattern(1);
            builder.setMicPositionData(new MicPositionInfo(0, i, 0, 0L, 12, null));
            linkedHashMap.put(str, builder.build());
            i++;
        }
        java.util.Map<String, OnLineMicInfo> map = this.LJI;
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            Integer num12 = null;
            if (it.hasNext()) {
                String next = it.next();
                if (!o.LJ(map.get(next), linkedHashMap.get(next))) {
                    break;
                }
                OnLineMicInfo onLineMicInfo = map.get(next);
                if (onLineMicInfo != null) {
                    num7 = Integer.valueOf(onLineMicInfo.getOnLinePattern());
                } else {
                    num7 = null;
                }
                OnLineMicInfo onLineMicInfo2 = (OnLineMicInfo) linkedHashMap.get(next);
                if (onLineMicInfo2 != null) {
                    num8 = Integer.valueOf(onLineMicInfo2.getOnLinePattern());
                } else {
                    num8 = null;
                }
                if (!o.LJ(num7, num8)) {
                    break;
                }
                OnLineMicInfo onLineMicInfo3 = map.get(next);
                if (onLineMicInfo3 != null && (micPositionData8 = onLineMicInfo3.getMicPositionData()) != null) {
                    num9 = Integer.valueOf(micPositionData8.getStrategy());
                } else {
                    num9 = null;
                }
                OnLineMicInfo onLineMicInfo4 = (OnLineMicInfo) linkedHashMap.get(next);
                if (onLineMicInfo4 != null && (micPositionData7 = onLineMicInfo4.getMicPositionData()) != null) {
                    num10 = Integer.valueOf(micPositionData7.getStrategy());
                } else {
                    num10 = null;
                }
                if (!o.LJ(num9, num10)) {
                    break;
                }
                OnLineMicInfo onLineMicInfo5 = map.get(next);
                if (onLineMicInfo5 != null && (micPositionData6 = onLineMicInfo5.getMicPositionData()) != null) {
                    num11 = Integer.valueOf(micPositionData6.getPosition());
                } else {
                    num11 = null;
                }
                OnLineMicInfo onLineMicInfo6 = (OnLineMicInfo) linkedHashMap.get(next);
                if (onLineMicInfo6 != null && (micPositionData5 = onLineMicInfo6.getMicPositionData()) != null) {
                    num12 = Integer.valueOf(micPositionData5.getPosition());
                }
                if (!o.LJ(num11, num12)) {
                    break;
                }
            } else {
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!o.LJ(linkedHashMap.get(next2), map.get(next2))) {
                            break;
                        }
                        OnLineMicInfo onLineMicInfo7 = map.get(next2);
                        if (onLineMicInfo7 != null) {
                            num = Integer.valueOf(onLineMicInfo7.getOnLinePattern());
                        } else {
                            num = null;
                        }
                        OnLineMicInfo onLineMicInfo8 = (OnLineMicInfo) linkedHashMap.get(next2);
                        if (onLineMicInfo8 != null) {
                            num2 = Integer.valueOf(onLineMicInfo8.getOnLinePattern());
                        } else {
                            num2 = null;
                        }
                        if (!o.LJ(num, num2)) {
                            break;
                        }
                        OnLineMicInfo onLineMicInfo9 = map.get(next2);
                        if (onLineMicInfo9 != null && (micPositionData4 = onLineMicInfo9.getMicPositionData()) != null) {
                            num3 = Integer.valueOf(micPositionData4.getStrategy());
                        } else {
                            num3 = null;
                        }
                        OnLineMicInfo onLineMicInfo10 = (OnLineMicInfo) linkedHashMap.get(next2);
                        if (onLineMicInfo10 != null && (micPositionData3 = onLineMicInfo10.getMicPositionData()) != null) {
                            num4 = Integer.valueOf(micPositionData3.getStrategy());
                        } else {
                            num4 = null;
                        }
                        if (!o.LJ(num3, num4)) {
                            break;
                        }
                        OnLineMicInfo onLineMicInfo11 = map.get(next2);
                        if (onLineMicInfo11 != null && (micPositionData2 = onLineMicInfo11.getMicPositionData()) != null) {
                            num5 = Integer.valueOf(micPositionData2.getPosition());
                        } else {
                            num5 = null;
                        }
                        OnLineMicInfo onLineMicInfo12 = (OnLineMicInfo) linkedHashMap.get(next2);
                        if (onLineMicInfo12 != null && (micPositionData = onLineMicInfo12.getMicPositionData()) != null) {
                            num6 = Integer.valueOf(micPositionData.getPosition());
                        } else {
                            num6 = null;
                        }
                        if (!o.LJ(num5, num6)) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (z) {
            U4R.LIZ("CoManager", "float map equals do not need update.");
        } else {
            U4R.LIZ("CoManager", "float map updated need post change listener.");
            this.LJI = linkedHashMap;
            C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, linkedHashMap, 102));
        }
        for (Map.Entry<String, OnLineMicInfo> entry : this.LJI.entrySet()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key:");
            LIZ.append(((OnLineMicInfo) C1FJ.LIZJ(LIZ, entry.getKey(), ", value:", entry)).getMicPositionData());
            U4R.LIZ("CoManager", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> K9() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJFF() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LJIILJJIL() {
        return this.LJI;
    }

    @Override // X.InterfaceC75973Trl
    public final String LJJIIJ() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC76652U6m
    public final java.util.Map<String, OnLineMicInfo> LJJIIJZLJL() {
        return this.LJI;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIIZI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJIIJIL() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJIL() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJLIJ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIZ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJJJZ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LJI.get(linkMicId);
    }

    @Override // X.InterfaceC76652U6m
    public final void LJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
        if (!(seiAppData instanceof SeiAppData)) {
            return;
        }
        SeiAppData seiAppData2 = (SeiAppData) seiAppData;
        List<SeiRegion> list = seiAppData2.grids;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<SeiRegion> list2 = seiAppData2.grids;
        if (list2 != null) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                for (SeiRegion seiRegion : list2) {
                    if (i == seiRegion.position) {
                        arrayList.add(seiRegion);
                    }
                }
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String LIZ = ((SeiRegion) it.next()).LIZ();
            if (LIZ != null) {
                arrayList2.add(LIZ);
                Iterator<LinkUser> it2 = this.LIZLLL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    LinkUser next = it2.next();
                    if (o.LJ(LIZ, next.getLinkMicId())) {
                        if (next != null) {
                            copyOnWriteArrayList.add(next);
                        }
                    }
                }
                Iterator<LinkUser> it3 = this.LJ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        LinkUser next2 = it3.next();
                        if (o.LJ(LIZ, next2.getLinkMicId())) {
                            if (next2 != null) {
                                copyOnWriteArrayList.add(next2);
                            }
                        }
                    }
                }
            }
        }
        if (!U7V.LIZ(this.LIZLLL, copyOnWriteArrayList)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateMicPositionInfoBySei before mLinkedList:");
            LIZ2.append(this.LIZLLL);
            U4R.LIZ("CoManager", X1D.LIZIZ(LIZ2));
            this.LIZLLL = copyOnWriteArrayList;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("updateMicPositionInfoBySei after mLinkedList:");
            LIZ3.append(this.LIZLLL);
            U4R.LIZ("CoManager", X1D.LIZIZ(LIZ3));
        }
        if (!U7V.LIZ(this.LJII, arrayList2)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("update floatPositionArray, pre:");
            LIZ4.append(this.LJII);
            LIZ4.append(", after:");
            LIZ4.append(arrayList2);
            U4R.LIZ("CoManager", X1D.LIZIZ(LIZ4));
            this.LJII = arrayList2;
            LJJL();
        }
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJI(String linkMicId) {
        LinkUser linkUser;
        LinkUser linkUser2;
        LinkUser linkUser3;
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<LinkUser> it = this.LIZLLL.iterator();
        while (true) {
            linkUser = null;
            if (it.hasNext()) {
                linkUser2 = it.next();
                if (o.LJ(linkUser2.getLinkMicId(), linkMicId)) {
                    break;
                }
            } else {
                linkUser2 = null;
                break;
            }
        }
        LinkUser linkUser4 = linkUser2;
        if (linkUser4 == null) {
            Iterator<LinkUser> it2 = this.LIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    linkUser3 = it2.next();
                    if (o.LJ(linkUser3.getLinkMicId(), linkMicId)) {
                        break;
                    }
                } else {
                    linkUser3 = null;
                    break;
                }
            }
            LinkUser linkUser5 = linkUser3;
            if (linkUser5 == null) {
                Iterator<LinkUser> it3 = this.LIZ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    LinkUser next = it3.next();
                    if (o.LJ(next.getLinkMicId(), linkMicId)) {
                        linkUser = next;
                        break;
                    }
                }
                return linkUser;
            }
            return linkUser5;
        }
        return linkUser4;
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJIJI(long j) {
        LinkUser linkUser;
        LinkUser linkUser2;
        LinkUser linkUser3;
        Iterator<LinkUser> it = this.LIZLLL.iterator();
        while (true) {
            linkUser = null;
            if (it.hasNext()) {
                linkUser2 = it.next();
                Long userId = linkUser2.getUserId();
                if (userId != null && userId.longValue() == j) {
                    break;
                }
            } else {
                linkUser2 = null;
                break;
            }
        }
        LinkUser linkUser4 = linkUser2;
        if (linkUser4 == null) {
            Iterator<LinkUser> it2 = this.LIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    linkUser3 = it2.next();
                    Long userId2 = linkUser3.getUserId();
                    if (userId2 != null && userId2.longValue() == j) {
                        break;
                    }
                } else {
                    linkUser3 = null;
                    break;
                }
            }
            LinkUser linkUser5 = linkUser3;
            if (linkUser5 != null) {
                return linkUser5;
            }
            Iterator<LinkUser> it3 = this.LIZ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                LinkUser next = it3.next();
                Long userId3 = next.getUserId();
                if (userId3 != null && userId3.longValue() == j) {
                    linkUser = next;
                    break;
                }
            }
            return linkUser;
        }
        return linkUser4;
    }

    public final void LJIJJ(LinkUser linkUser) {
        Iterator<LinkUser> it = this.LIZLLL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LinkUser next = it.next();
            if (o.LJ(next.getUserId(), linkUser.getUserId())) {
                if (next != null) {
                    return;
                }
            }
        }
        this.LIZLLL.add(linkUser);
        LJJLIIIIJ(null, null);
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LJIJJLI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LJI.get(linkMicId);
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJIL(String linkMicId) {
        LinkUser linkUser;
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<LinkUser> it = this.LIZLLL.iterator();
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
    public final LinkUser LJJ(String linkMicId) {
        LinkUser linkUser;
        LinkUser linkUser2;
        LinkUser linkUser3;
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<LinkUser> it = this.LIZLLL.iterator();
        while (true) {
            linkUser = null;
            if (it.hasNext()) {
                linkUser2 = it.next();
                if (o.LJ(linkUser2.getLinkMicId(), linkMicId)) {
                    break;
                }
            } else {
                linkUser2 = null;
                break;
            }
        }
        LinkUser linkUser4 = linkUser2;
        if (linkUser4 == null) {
            Iterator<LinkUser> it2 = this.LIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    linkUser3 = it2.next();
                    if (o.LJ(linkUser3.getLinkMicId(), linkMicId)) {
                        break;
                    }
                } else {
                    linkUser3 = null;
                    break;
                }
            }
            LinkUser linkUser5 = linkUser3;
            if (linkUser5 == null) {
                Iterator<LinkUser> it3 = this.LIZ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    LinkUser next = it3.next();
                    if (o.LJ(next.getLinkMicId(), linkMicId)) {
                        linkUser = next;
                        break;
                    }
                }
                return linkUser;
            }
            return linkUser5;
        }
        return linkUser4;
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJI(LinkCoreError error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC76652U6m
    public final OnLineMicInfo LJJII(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return new OnLineMicInfo.Builder().build();
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJIII(long j) {
        LinkUser linkUser;
        Iterator<LinkUser> it = this.LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                Long userId = linkUser.getUserId();
                if (userId != null && userId.longValue() == j) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        return linkUser;
    }

    @Override // X.InterfaceC76652U6m
    public final void LJJIIZ(InterfaceC76728U9k interfaceC76728U9k) {
        ((ArrayList) this.LJIIIZ).add(interfaceC76728U9k);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIJL(U87 listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJIIIIZZ).add(listener);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIL(U87 listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJIIIIZZ).remove(listener);
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJIL(List<LinkUser> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLocalLinkedListForAudience linkedList size:");
        LIZ.append(((ArrayList) list).size());
        U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateLocalLinkedListForAudience linkedList:");
        LIZ2.append(list);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ2));
        this.LIZLLL = list;
        LJJLIIIIJ(null, null);
    }

    @Override // X.InterfaceC76652U6m
    public final void LJJJJI(InterfaceC76728U9k listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJIIIZ).remove(listener);
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJJJL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return null;
    }

    public final void LJJJJZI(LinkUser user) {
        LinkUser linkUser;
        o.LJIIIZ(user, "user");
        Iterator<LinkUser> it = this.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                LinkUser linkUser2 = linkUser;
                if (o.LJ(linkUser2.getRoomId(), user.getRoomId()) && o.LJ(linkUser2.getUserId(), user.getUserId())) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        LinkUser linkUser3 = linkUser;
        if (linkUser3 != null) {
            Long channelId = user.getChannelId();
            if (channelId != null) {
                linkUser3.setChannelId(Long.valueOf(channelId.longValue()));
            }
            String linkMicId = user.getLinkMicId();
            if (linkMicId != null) {
                linkUser3.setLinkMicId(linkMicId);
            }
            OnLineMicInfo position = user.getPosition();
            if (position != null) {
                linkUser3.setPosition(position);
            }
            Object extra = user.getExtra();
            if (extra != null) {
                linkUser3.setExtra(extra);
                return;
            }
            return;
        }
        this.LIZ.add(user);
        C15610jN.LIZIZ(new ARunnableS14S1100000_13(this, null, 9));
    }

    public final void LJJJLIIL(LinkUser user) {
        LinkUser linkUser;
        o.LJIIIZ(user, "user");
        Iterator<LinkUser> it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                LinkUser linkUser2 = linkUser;
                if (o.LJ(linkUser2.getRoomId(), user.getRoomId()) && o.LJ(linkUser2.getUserId(), user.getUserId())) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        LinkUser linkUser3 = linkUser;
        if (linkUser3 != null) {
            Long channelId = user.getChannelId();
            if (channelId != null) {
                linkUser3.setChannelId(Long.valueOf(channelId.longValue()));
            }
            String linkMicId = user.getLinkMicId();
            if (linkMicId != null) {
                linkUser3.setLinkMicId(linkMicId);
            }
            OnLineMicInfo position = user.getPosition();
            if (position != null) {
                linkUser3.setPosition(position);
            }
            Object extra = user.getExtra();
            if (extra != null) {
                linkUser3.setExtra(extra);
                return;
            }
            return;
        }
        ((CopyOnWriteArrayList) this.LIZIZ).add(user);
    }

    public final void LJJJLL(LinkUser user) {
        LinkUser linkUser;
        o.LJIIIZ(user, "user");
        Iterator<LinkUser> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                LinkUser linkUser2 = linkUser;
                if (o.LJ(linkUser2.getRoomId(), user.getRoomId()) && o.LJ(linkUser2.getUserId(), user.getUserId())) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        LinkUser linkUser3 = linkUser;
        if (linkUser3 != null) {
            if (user.getChannelId() != null) {
                linkUser3.setChannelId(user.getChannelId());
            }
            if (user.getLinkMicId() != null) {
                linkUser3.setLinkMicId(user.getLinkMicId());
            }
            if (user.getPosition() != null) {
                linkUser3.setPosition(user.getPosition());
            }
            if (user.getExtra() != null) {
                linkUser3.setExtra(user.getExtra());
                return;
            }
            return;
        }
        this.LIZJ.add(user);
        LJJLI(null, null);
    }

    public final void LJJJLZIJ(LinkUser self) {
        o.LJIIIZ(self, "self");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addSelfToLinkedList:linkMicId:");
        LIZ.append(self.getLinkMicId());
        LIZ.append(", userId:");
        LIZ.append(self.getUserId());
        LIZ.append(", self.position:");
        LIZ.append(self.getPosition());
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ));
        String linkMicId = self.getLinkMicId();
        OnLineMicInfo position = self.getPosition();
        if (linkMicId != null && position != null) {
            this.LJIIJ = linkMicId;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("addSelfToLinkedList:mSelfLinkMicId:");
            LIZ2.append(this.LJIIJ);
            U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ2));
            LJIJJ(self);
            LJJJZ(linkMicId);
        }
    }

    public final void LJJJZ(String str) {
        if (!this.LJII.contains(str)) {
            this.LJII.add(str);
        }
        LJJL();
    }

    public final void LJJLIIIJJI(LinkUser user) {
        LinkUser linkUser;
        o.LJIIIZ(user, "user");
        Iterator<LinkUser> it = this.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                if (o.LJ(linkUser.getUserId(), user.getUserId())) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        if (C65777Prh.LIZ(this.LIZ).remove(linkUser)) {
            C15610jN.LIZIZ(new ARunnableS14S1100000_13(this, null, 9));
        }
    }

    public final void LJJLIIIJJIZ(LinkUser user) {
        o.LJIIIZ(user, "user");
        ((CopyOnWriteArrayList) this.LIZIZ).remove(user);
    }

    public final void LJJLIIIJL(LinkUser user) {
        LinkUser linkUser;
        o.LJIIIZ(user, "user");
        Iterator<LinkUser> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                linkUser = it.next();
                if (o.LJ(linkUser.getUserId(), user.getUserId())) {
                    break;
                }
            } else {
                linkUser = null;
                break;
            }
        }
        if (C65777Prh.LIZ(this.LIZJ).remove(linkUser)) {
            LJJLI(null, null);
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJJ(long j, String str) {
        UC7.LJ("removeUserFromFloatPositionMap:", str, "CoManager");
        if (this.LJII.contains(str)) {
            this.LJII.remove(str);
            LJJL();
        }
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJLL(int i, List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "linkedList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String linkMicId = ((LinkUser) it.next()).getLinkMicId();
            if (linkMicId != null) {
                LJ.add(linkMicId);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLocalLinkedList tempFloatList:");
        LIZ.append(LJ);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ));
        if (!U7V.LIZ(this.LJII, LJ)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateLocalLinkedList old linkedList:");
            LIZ2.append(this.LIZLLL);
            LIZ2.append(", new linkedList:");
            LIZ2.append(list);
            U4R.LIZ("CoManager", X1D.LIZIZ(LIZ2));
            this.LJFF = this.LIZLLL;
            this.LJIIL = true;
            Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
            while (it2.hasNext()) {
                ((U87) it2.next()).LJIIIIZZ(this.LIZLLL, list);
            }
            this.LJIIJJI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(i, TimeUnit.SECONDS).LJJJLIIL(new AfS25S0301000_13(i, this, LJ, list, 0), U9Z.LJLIL);
            return;
        }
        U4R.LIZLLL("CoManager", "updateLocalLinkedList, list is same no need to update");
    }

    public final void LJJLI(String str, LinkMessage linkMessage) {
        CustomLinkMessage customLinkMessage = null;
        if (linkMessage != null) {
            customLinkMessage = new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, null, linkMessage.expireTimestamp, linkMessage));
        }
        C15610jN.LIZIZ(new ARunnableS14S1100000_13(this, str, customLinkMessage, 7));
    }

    public final void LJJLIIIIJ(String str, LinkMessage linkMessage) {
        CustomLinkMessage customLinkMessage = null;
        if (linkMessage != null) {
            customLinkMessage = new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, null, linkMessage.expireTimestamp, linkMessage));
        }
        C15610jN.LIZIZ(new ARunnableS14S1100000_13(this, str, customLinkMessage, 8));
    }

    public final void LJJLIIIJ(U66 u66, LinkUser user) {
        o.LJIIIZ(user, "user");
        String linkMicId = user.getLinkMicId();
        OnLineMicInfo position = user.getPosition();
        if (linkMicId != null && position != null) {
            LJIJJ(user);
            LJJLIIIJJIZ(user);
            LJJJZ(linkMicId);
        }
    }

    public final void LJJLIIIJILLIZJL(U66 u66, LinkUser user) {
        o.LJIIIZ(user, "user");
        String linkMicId = user.getLinkMicId();
        OnLineMicInfo position = user.getPosition();
        if (linkMicId != null && position != null) {
            LJIJJ(user);
            LJJLIIIJL(user);
            LJJJZ(linkMicId);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        r6.add(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJLJLI(long r12, java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser> r14, com.bytedance.android.livesdk.model.message.LinkMessage r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7H.LJJLIIIJLJLI(long, java.util.List, com.bytedance.android.livesdk.model.message.LinkMessage):void");
    }
}
