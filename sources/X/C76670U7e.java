package X;

import Y.IDComparatorS41S0000000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkListChangeContent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;

/* renamed from: X.U7e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76670U7e implements InterfaceC76675U7j {
    public final /* synthetic */ C76669U7d LIZ;

    @Override // X.InterfaceC76675U7j
    public final void LIZIZ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJFF(U7T u7t) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIIIZZ(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIILIIL(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIILJJIL(U7T u7t) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJJLI(U7T u7t, List list, GroupPlayer groupPlayer) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIJ(U7T u7t, List list, GroupPlayer groupPlayer) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJIIJIL(U7T u7t, GroupChannelAllUser groupChannelAllUser) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJL(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIZ(U7T u7t, GroupPlayer groupPlayer, long j, long j2, long j3) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJI(U7T u7t, long j, AllListUser allListUser) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJL(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJLI(U7T u7t, int i, GroupPlayer groupPlayer, GroupChannelAllUser groupChannelAllUser, long j) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJZ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJZI(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJLIIL(U7T u7t, int i, GroupPlayer groupPlayer, GroupChannelAllUser groupChannelAllUser, long j) {
    }

    public C76670U7e(C76669U7d c76669U7d) {
        this.LIZ = c76669U7d;
    }

    @Override // X.InterfaceC76675U7j
    public final void LJI(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJ(U7T linker) {
        o.LJIIIZ(linker, "linker");
        this.LIZ.reset();
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
        AllListUser allListUser;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(217), "onListChangeMessageReceived in position manager");
        C76669U7d c76669U7d = this.LIZ;
        long j = c76669U7d.LJII;
        long j2 = message.baseMessage.createTime;
        Integer num = null;
        if (j >= j2) {
            C32014ChO.LIZJ(C76669U7d.LJIIZILJ(220), "onListChangeMessageReceived return as lastUserListChangeImCreateTime is larger than curMsg createTime", null);
            return;
        }
        c76669U7d.LJII = j2;
        LinkListChangeContent linkListChangeContent = message.listContent;
        if (linkListChangeContent != null && (allListUser = linkListChangeContent.userList) != null) {
            list = allListUser.linkedList;
        } else {
            list = null;
        }
        if (!o.LJ(c76669U7d.LIZ, list)) {
            this.LIZ.LJJIJIIJI(list);
            this.LIZ.LJJIJIIJIL(list);
            this.LIZ.LIZ = list;
        }
        LinkListChangeContent linkListChangeContent2 = message.listContent;
        if (linkListChangeContent2 != null) {
            num = Integer.valueOf(linkListChangeContent2.listChangeType);
        }
        if (num == null) {
            return;
        }
        if (num.intValue() != 0 && num.intValue() != 1 && num.intValue() != 4 && num.intValue() != 7) {
            return;
        }
        this.LIZ.LJJIJ("onListChangeMessageReceived");
    }

    @Override // X.InterfaceC76675U7j
    public final void LIZLLL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJ(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(156), "onAnchorReceiveModeratorPermitApply in position manager");
        this.LIZ.LJI(linker, u7a.LIZJ);
        this.LIZ.LJIIJ(linker, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJII(U7T linker, LinkUser inviteeUser) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviteeUser, "inviteeUser");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIIZ(U7T u7t, U7A u7a) {
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(293), "onKickOutMessage in position manager");
        this.LIZ.LJIL(u7t, u7a.LIZJ);
        this.LIZ.LJJI(u7t, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIJ(U7T u7t, U7A u7a) {
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(191), "onPermitApplySucceeded in position manager");
        this.LIZ.LJI(u7t, u7a.LIZJ);
        this.LIZ.LJIIJ(u7t, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIZILJ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
        this.LIZ.reset();
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJI(U7T u7t, U7A u7a) {
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(287), "onLeaveChannelSucceed in position manager");
        this.LIZ.LJIL(u7t, u7a.LIZJ);
        this.LIZ.LJJI(u7t, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJJ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJ(U7T linker, U7A data) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(data, "data");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIFFI(U7T linker, LinkLayerMessage message) {
        List<LinkLayerListUser> list;
        AllListUser allListUser;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(242), "onJoinDirectMessageReceived in position manager");
        JoinDirectContent joinDirectContent = message.joinDirectContent;
        if (joinDirectContent != null && (allListUser = joinDirectContent.allUsers) != null) {
            list = allListUser.linkedList;
        } else {
            list = null;
        }
        if (!o.LJ(this.LIZ.LIZ, list)) {
            this.LIZ.LJJIJIIJI(list);
            this.LIZ.LJJIJIIJIL(list);
            this.LIZ.LIZ = list;
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJII(U7T linker, U7A u7a) {
        boolean z;
        o.LJIIIZ(linker, "linker");
        C76669U7d c76669U7d = this.LIZ;
        c76669U7d.LJI = c76669U7d.LJIIL(u7a);
        C76669U7d c76669U7d2 = this.LIZ;
        c76669U7d2.getClass();
        RtcUserInfo rtcUserInfo = u7a.LIZ;
        if (rtcUserInfo != null && rtcUserInfo.getUserId() == c76669U7d2.LJIILLIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C32014ChO.LIZJ(C76669U7d.LJIIZILJ(453), "addAnchorInFixedPositionMap current user id is not room owner id.", null);
        } else {
            String linkMicId = u7a.LIZ.getLinkMicId();
            java.util.Map<String, OnLineMicInfo> LJJLIL = C113554cx.LJJLIL(c76669U7d2.LJIIIIZZ);
            OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
            builder.setOnLinePattern(0);
            builder.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
            OnLineMicInfo build = builder.build();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addAnchorInFixedPositionMap update anchor's position map ");
            LIZ.append(build);
            C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
            LJJLIL.put(linkMicId, build);
            c76669U7d2.LJJIFFI(LJJLIL);
        }
        C76669U7d c76669U7d3 = this.LIZ;
        c76669U7d3.getClass();
        RtcUserInfo rtcUserInfo2 = u7a.LIZ;
        if (rtcUserInfo2 != null && rtcUserInfo2.getUserId() == c76669U7d3.LJIILLIIL()) {
            java.util.Map<String, OnLineMicInfo> LJJLIL2 = C113554cx.LJJLIL(c76669U7d3.LJIIIZ);
            String linkMicId2 = u7a.LIZ.getLinkMicId();
            if (!LJJLIL2.containsKey(linkMicId2)) {
                OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                builder2.setOnLinePattern(1);
                builder2.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
                OnLineMicInfo build2 = builder2.build();
                LJJLIL2.put(linkMicId2, build2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("addAnchorInFloatPositionMap update anchor's linkmic id position, ");
                LIZ2.append(build2);
                LIZ2.append(", linkMicId ");
                LIZ2.append(linkMicId2);
                C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ2));
            }
            c76669U7d3.LJJIII(LJJLIL2);
            return;
        }
        C32014ChO.LIZJ(C76669U7d.LJIIZILJ(469), "addAnchorInFloatPositionMap current user id is not room owner id.", null);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIZ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIZI(U7T u7t, C65767PrX<Long> c65767PrX) {
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(255), "onKickOutAllSucceeded in position manager");
        this.LIZ.LJJIII(C113554cx.LJJJLIIL());
        this.LIZ.LJJIFFI(C113554cx.LJJJLIIL());
        this.LIZ.LJJIIJ(C113554cx.LJJJLIIL());
        this.LIZ.LJJIIZI(C113554cx.LJJJLIIL());
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJ(U7T u7t, U7A u7a) {
        int i;
        boolean z;
        String linkMicId;
        int position;
        int i2;
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(266), "onChangeLayoutSucceeded in position manager");
        C76669U7d c76669U7d = this.LIZ;
        c76669U7d.LJI = c76669U7d.LJIIL(u7a);
        C76669U7d c76669U7d2 = this.LIZ;
        java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
        c76669U7d2.getClass();
        c76669U7d2.LJJIFFI(c76669U7d2.LJIILL(C113554cx.LJJJLIIL(), u7t, map));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            if (it.hasNext()) {
                MicPositionInfo micPositionData = it.next().getValue().getMicPositionData();
                int i3 = 0;
                if (micPositionData != null) {
                    i = micPositionData.getPosition();
                } else {
                    i = 0;
                }
                while (it.hasNext()) {
                    MicPositionInfo micPositionData2 = it.next().getValue().getMicPositionData();
                    if (micPositionData2 != null) {
                        i2 = micPositionData2.getPosition();
                    } else {
                        i2 = 0;
                    }
                    if (i < i2) {
                        i = i2;
                    }
                }
                int i4 = 1;
                if (i >= map.size()) {
                    z = true;
                } else {
                    z = false;
                }
                List<Map.Entry> LLJI = ORZ.LLJI(map.entrySet());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getNewVersionOfFloatPositionMapV2 isCreatePosByIndex:");
                LIZ.append(z);
                LIZ.append(" list:");
                LIZ.append(linkedHashMap);
                LIZ.append('}');
                C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ));
                if (z) {
                    LLJI = ORZ.LLILII(new IDComparatorS41S0000000_13(16), LLJI);
                }
                for (Map.Entry entry : LLJI) {
                    LinkUser LJIJI = u7t.LJIIJJI.LJIJI(((Number) entry.getKey()).longValue());
                    if (LJIJI != null && (linkMicId = LJIJI.getLinkMicId()) != null) {
                        if (z) {
                            position = i3;
                            i3++;
                        } else {
                            MicPositionInfo micPositionData3 = ((OnLineMicInfo) entry.getValue()).getMicPositionData();
                            if (micPositionData3 != null) {
                                position = micPositionData3.getPosition();
                            }
                        }
                        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                        builder.setOnLinePattern(i4);
                        builder.setMicPositionData(new MicPositionInfo(0, position, position, 0L, 8, null));
                        OnLineMicInfo build = builder.build();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("getNewVersionOfFloatPositionMapV2, linkMicId ");
                        LIZ2.append(linkMicId);
                        LIZ2.append(", micInfo ");
                        LIZ2.append(build);
                        C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ2));
                        linkedHashMap.put(linkMicId, build);
                    }
                    i4 = 1;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        c76669U7d2.LJJIII(linkedHashMap);
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, this.LIZ.LJIIJJI());
        if (json != null) {
            String LJIIZILJ = C76669U7d.LJIIZILJ(271);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onChangeLayoutSucceeded in position manager message: ");
            LIZ3.append(json);
            C32014ChO.LIZ(LJIIZILJ, X1D.LIZIZ(LIZ3));
            u7t.LJIIIZ.LJJJJZ(json);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJIL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(305), "onLeaveChannelMessage in position manager");
        this.LIZ.LJIL(linker, u7a.LIZJ);
        this.LIZ.LJJI(linker, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJLIJ(U7T u7t, U7A u7a) {
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(199), "onAcceptInviteSucceeded in position manager");
        this.LIZ.LJI(u7t, u7a.LIZJ);
        this.LIZ.LJIIJ(u7t, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIL(U7T linker, U7A data) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(data, "data");
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(211), "onAgreeInviteMessageReceived in position manager");
        this.LIZ.LJI(linker, data.LIZJ);
        this.LIZ.LJIIJ(linker, data.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJIL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(205), "onPermitApplyMessageReceived in position manager");
        this.LIZ.LJI(linker, u7a.LIZJ);
        this.LIZ.LJIIJ(linker, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJ(U7T u7t, U7A u7a) {
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(299), "onKickOutSucceeded in position manager");
        this.LIZ.LJIL(u7t, u7a.LIZJ);
        this.LIZ.LJJI(u7t, u7a.LIZJ);
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
    public final void LJJIII(U7T linker, GroupChannelAllUser groupChannelAllUser, long j) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIJZLJL(U7T linker, GroupChannelAllUser groupChannelAllUser, long j) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJL(U7T u7t, LinkLayerListUser linkLayerListUser, U7A u7a) {
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(281), "onJoinChannelSucceed in position manager");
        this.LIZ.LJI(u7t, u7a.LIZJ);
        this.LIZ.LJIIJ(u7t, u7a.LIZJ);
    }

    @Override // X.InterfaceC76675U7j
    public final void LIZ(U7T linker, long j, GroupChannelAllUser groupChannelAllUser, long j2) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJJL(U7T linker, long j, GroupChannelAllUser groupChannelAllUser, long j2) {
        o.LJIIIZ(linker, "linker");
    }
}
