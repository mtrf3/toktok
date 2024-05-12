package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.live.liveinteract.api.TopicQuitEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownRemoveEvent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostFullChannel;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TqH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75881TqH implements InterfaceC75923Tqx {
    public final /* synthetic */ MultiHostCrossAdapterImpl LIZ;

    public C75881TqH(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl) {
        this.LIZ = multiHostCrossAdapterImpl;
    }

    @Override // X.InterfaceC75923Tqx
    public final void LIZJ(long j) {
        MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = this.LIZ;
        multiHostCrossAdapterImpl.LJLJJLL.LIZLLL(j);
        C75884TqK c75884TqK = multiHostCrossAdapterImpl.LJLJJLL;
        if (j <= 0) {
            c75884TqK.getClass();
            return;
        }
        Long l = c75884TqK.LIZIZ.get(Long.valueOf(j));
        if (l == null) {
            l = 0L;
        }
        long longValue = l.longValue();
        DataChannel dataChannel = c75884TqK.LIZJ;
        if (dataChannel == null) {
            return;
        }
        dataChannel.qv0(MultiCoHostCountDownRemoveEvent.class, new C75718Tne(j, longValue, EnumC75915Tqp.REMOVE));
    }

    @Override // X.InterfaceC75923Tqx
    public final void LIZIZ(InterfaceC75441TjB session, String str, String str2) {
        boolean z;
        DataChannel dataChannel;
        o.LJIIIZ(session, "session");
        MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = this.LIZ;
        multiHostCrossAdapterImpl.getClass();
        List<LinkUser> LJFF = session.LLIIJI().LJFF();
        List<LinkUser> LJJIJIL = session.LLIIJI().LJJIJIL();
        StringBuilder LIZLLL = C1FL.LIZLLL("postUserListChangeForAudience", ", source=", str, ", linkedUsers.size=");
        LIZLLL.append(LJFF.size());
        LIZLLL.append(", linkedUsersIm.size=");
        LIZLLL.append(LJJIJIL.size());
        LIZLLL.append(", from=");
        JBR.LJIIJ(LIZLLL, str2, LIZLLL, "MultiHostCrossAdapter");
        if (!multiHostCrossAdapterImpl.LJLLI && o.LJ(str2, "im")) {
            long j = 0;
            if (C75917Tqr.LIZ(LJJIJIL)) {
                StringBuilder LIZJ = b1.LIZJ("postUserListChangeForAudience", ", 2_plus_2_change_position, linkedUsersIm.size=");
                LIZJ.append(LJJIJIL.size());
                LIZJ.append(", from=");
                LIZJ.append(str2);
                C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
                multiHostCrossAdapterImpl.LLD = true;
                long j2 = multiHostCrossAdapterImpl.LJZL;
                multiHostCrossAdapterImpl.LL = j2;
                LinkCrossRoomDataHolder linkCrossRoomDataHolder = multiHostCrossAdapterImpl.LJLJLLL;
                if (linkCrossRoomDataHolder != null) {
                    j = linkCrossRoomDataHolder.LJFF;
                }
                multiHostCrossAdapterImpl.LJZL = j;
                if (j2 != j) {
                    StringBuilder LIZJ2 = V10.LIZJ("updateTopicInfoForP2P, oldGroupChannelId = ", j2, ", newGroupChannelId = ");
                    C0RN.LJ(LIZJ2, j, LIZJ2, "MultiHostCrossAdapter");
                    if (C75633TmH.LIZ.containsKey(Long.valueOf(j)) && C75633TmH.LIZ.containsKey(Long.valueOf(j2))) {
                        C75633TmH.LIZ.remove(Long.valueOf(j2));
                    } else if (C75633TmH.LIZ.containsKey(Long.valueOf(j2))) {
                        C75633TmH.LIZ.remove(Long.valueOf(j2));
                        DataChannel dataChannel2 = multiHostCrossAdapterImpl.LJLJLJ;
                        if (dataChannel2 != null) {
                            dataChannel2.qv0(TopicQuitEvent.class, EnumC75598Tli.CROSS_ARCH_P2P);
                        }
                    }
                }
                C75642TmQ.LJ = "two_apply_two";
                z = false;
            } else {
                multiHostCrossAdapterImpl.LL = 0L;
                z = false;
                multiHostCrossAdapterImpl.LLD = false;
            }
            ArrayList arrayList = (ArrayList) C75917Tqr.LIZ;
            arrayList.clear();
            arrayList.addAll(LJJIJIL);
        } else {
            z = false;
        }
        List<C75883TqJ> LJIL = multiHostCrossAdapterImpl.LJIL();
        StringBuilder LIZJ3 = b1.LIZJ("postUserListChangeForAudience", ", newUserList.size = ");
        LIZJ3.append(LJIL.size());
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ3));
        Object obj = null;
        multiHostCrossAdapterImpl.LLJJJIL(session, new C75593Tld(LJIL, str2, null));
        DataChannel dataChannel3 = multiHostCrossAdapterImpl.LJLJLJ;
        if (dataChannel3 != null) {
            obj = dataChannel3.kv0(MultiCoHostFullChannel.class);
        }
        if (LJFF.size() == 4) {
            z = true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("postUserListChangeForAudience");
        LIZ.append(", source=");
        LIZ.append(str);
        LIZ.append(", oldFullState = ");
        LIZ.append(obj);
        LIZ.append(" newFullState = ");
        LIZ.append(z);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!o.LJ(obj, Boolean.valueOf(z)) && (dataChannel = multiHostCrossAdapterImpl.LJLJLJ) != null) {
            dataChannel.rv0(MultiCoHostFullChannel.class, Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC75923Tqx
    public final void LIZ(InterfaceC75441TjB session, BusinessContent businessContent, String str, String str2) {
        boolean z;
        boolean z2;
        DataChannel dataChannel;
        Room room;
        EnumC75672Tmu enumC75672Tmu;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder;
        ArrayList arrayList;
        Room room2;
        o.LJIIIZ(session, "session");
        MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = this.LIZ;
        Iterator LIZLLL = C47135Ieh.LIZLLL(multiHostCrossAdapterImpl.LJLLLLLL.LIZIZ, "mhUserManager.getUserMap().values");
        while (LIZLLL.hasNext()) {
            C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
            if (c75883TqJ.LIZ != C44432HcC.LJI() && !c75883TqJ.LJFF()) {
                if (c75883TqJ.LJ() && c75883TqJ.LJI > 0) {
                    StringBuilder LIZLLL2 = C1FL.LIZLLL("postUserListChangeForAnchor", ", source=", str, ", addCountDown, it.uid=");
                    LIZLLL2.append(c75883TqJ.LIZ);
                    LIZLLL2.append(", linkRemainingTime=");
                    C0RN.LJ(LIZLLL2, c75883TqJ.LJI, LIZLLL2, "MultiHostCrossAdapter");
                    multiHostCrossAdapterImpl.LJLJJLL.LIZ(c75883TqJ.LIZ, c75883TqJ.LJI / 1000, EnumC75915Tqp.USER_LIST);
                } else {
                    StringBuilder LIZLLL3 = C1FL.LIZLLL("postUserListChangeForAnchor", ", source=", str, ", removeCountDown, it.uid=");
                    LIZLLL3.append(c75883TqJ.LIZ);
                    LIZLLL3.append(", linkRemainingTime=");
                    C0RN.LJ(LIZLLL3, c75883TqJ.LJI, LIZLLL3, "MultiHostCrossAdapter");
                    multiHostCrossAdapterImpl.LJLJJLL.LIZLLL(c75883TqJ.LIZ);
                }
            }
        }
        List<C75883TqJ> LJIILJJIL = multiHostCrossAdapterImpl.LJIILJJIL();
        if (multiHostCrossAdapterImpl.LJLZ < 2 && LJIILJJIL.size() == 2) {
            z = true;
        } else {
            z = false;
        }
        List<LinkUser> LJJIIZI = session.LLIIJI().LJJIIZI();
        if (multiHostCrossAdapterImpl.LJLLI && o.LJ(str2, "im")) {
            if (C75917Tqr.LIZ(LJJIIZI)) {
                multiHostCrossAdapterImpl.LLD = true;
                multiHostCrossAdapterImpl.LL = multiHostCrossAdapterImpl.LJZL;
                multiHostCrossAdapterImpl.LJZL = multiHostCrossAdapterImpl.LJJLI();
                if (multiHostCrossAdapterImpl.LL != multiHostCrossAdapterImpl.LJJLI()) {
                    C75642TmQ c75642TmQ = C75642TmQ.LIZ;
                    C75642TmQ.LJ = "two_apply_two";
                    DataChannel dataChannel2 = multiHostCrossAdapterImpl.LJLJLJ;
                    if (dataChannel2 != null && (room2 = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                        c75642TmQ.LJJJI(room2, LJJIIZI, true);
                        C74597TPl.LIZIZ(multiHostCrossAdapterImpl.LJLLI, room2);
                    }
                    long j = multiHostCrossAdapterImpl.LL;
                    C44878HjO.LIZJ("updateTopicInfoForP2P, oldGroupChannelId = ", j, "MultiHostCrossAdapter");
                    C75633TmH.LIZ.remove(Long.valueOf(j));
                    DataChannel dataChannel3 = multiHostCrossAdapterImpl.LJLJLJ;
                    if (dataChannel3 != null) {
                        dataChannel3.qv0(TopicQuitEvent.class, EnumC75598Tli.CROSS_ARCH_P2P);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(C75917Tqr.LIZ);
                if (arrayList2.size() != 2 || LJJIIZI.size() != 4) {
                    arrayList = new ArrayList();
                } else {
                    LinkUser linkUser = (LinkUser) ListProtector.get(arrayList2, 0);
                    LinkUser linkUser2 = (LinkUser) ListProtector.get(arrayList2, 1);
                    LinkUser linkUser3 = (LinkUser) ListProtector.get(LJJIIZI, 0);
                    LinkUser linkUser4 = (LinkUser) ListProtector.get(LJJIIZI, 2);
                    if (o.LJ(linkUser.getUserId(), linkUser3.getUserId()) && o.LJ(linkUser2.getUserId(), linkUser4.getUserId())) {
                        arrayList = new ArrayList();
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (LinkUser linkUser5 : LJJIIZI) {
                            if (!o.LJ(linkUser5.getUserId(), linkUser.getUserId()) && !o.LJ(linkUser5.getUserId(), linkUser2.getUserId())) {
                                arrayList3.add(linkUser5);
                            }
                        }
                        if (arrayList3.size() != 2) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            int i = 0;
                            do {
                                arrayList.add(ListProtector.get(arrayList2, i));
                                arrayList.add(ListProtector.get(arrayList3, i));
                                i++;
                            } while (i < 2);
                            if (arrayList.size() != 4) {
                                arrayList = new ArrayList();
                            }
                        }
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("postUserListChangeForAnchor");
                LIZ.append(", 2_plus_2_change_position: beforeList=");
                LIZ.append(LJJIIZI);
                LIZ.append(", afterList=");
                LIZ.append(arrayList);
                C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
                if (arrayList.size() > 0) {
                    C15610jN.LIZIZ(new ARunnableS32S0200000_13(session, arrayList, 47));
                }
            } else {
                multiHostCrossAdapterImpl.LL = 0L;
                multiHostCrossAdapterImpl.LLD = false;
            }
            ArrayList arrayList4 = (ArrayList) C75917Tqr.LIZ;
            arrayList4.clear();
            arrayList4.addAll(LJJIIZI);
            List<LinkUser> LJJJ = session.LLIIJI().LJJJ();
            List<LinkUser> K9 = session.LLIIJI().K9();
            DataChannel dataChannel4 = multiHostCrossAdapterImpl.LJLJLJ;
            if (dataChannel4 != null) {
                room = (Room) dataChannel4.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            C75642TmQ c75642TmQ2 = C75642TmQ.LIZ;
            z2 = false;
            c75642TmQ2.LJJJI(room, LJJIIZI, false);
            c75642TmQ2.LJJJJ(room, LJJIIZI);
            c75642TmQ2.LJJIII(LJJIIZI, LJJJ, K9);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("postUserListChangeForAnchor");
            LIZ2.append(", coHostTwoUserSetUp = ");
            LIZ2.append(z);
            LIZ2.append(", oldLinkedSize=");
            LIZ2.append(multiHostCrossAdapterImpl.LJLZ);
            LIZ2.append(", newLinkedUserList.count()=");
            LIZ2.append(LJIILJJIL.size());
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
            LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = multiHostCrossAdapterImpl.LJLJLLL;
            if (linkCrossRoomDataHolder2 != null) {
                enumC75672Tmu = linkCrossRoomDataHolder2.LJJJLIIL;
            } else {
                enumC75672Tmu = null;
            }
            if (enumC75672Tmu == EnumC75672Tmu.INVITER && LJIILJJIL.size() == 2 && (linkCrossRoomDataHolder = multiHostCrossAdapterImpl.LJLJLLL) != null) {
                linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = 0L;
                linkCrossRoomDataHolder.LJJLIIJ = 0L;
            }
            LinkCrossRoomDataHolder linkCrossRoomDataHolder3 = multiHostCrossAdapterImpl.LJLJLLL;
            if (linkCrossRoomDataHolder3 != null) {
                ArrayList arrayList5 = new ArrayList(C32I.LJJL(LJJIIZI, 10));
                Iterator<LinkUser> it = LJJIIZI.iterator();
                while (it.hasNext()) {
                    arrayList5.add(it.next().getUserId());
                }
                linkCrossRoomDataHolder3.LJL = arrayList5;
            }
        } else {
            z2 = false;
        }
        Object obj = null;
        multiHostCrossAdapterImpl.LLJJJIL(session, new C75593Tld(LJIILJJIL, str2, null));
        DataChannel dataChannel5 = multiHostCrossAdapterImpl.LJLJLJ;
        if (dataChannel5 != null) {
            obj = dataChannel5.kv0(MultiCoHostFullChannel.class);
        }
        if (LJJIIZI.size() == 4) {
            z2 = true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("postUserListChangeForAnchor");
        LIZ3.append(", source=");
        LIZ3.append(str);
        LIZ3.append(", oldFullState = ");
        LIZ3.append(obj);
        LIZ3.append(" newFullState = ");
        LIZ3.append(z2);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
        if (!o.LJ(obj, Boolean.valueOf(z2)) && (dataChannel = multiHostCrossAdapterImpl.LJLJLJ) != null) {
            dataChannel.rv0(MultiCoHostFullChannel.class, Boolean.valueOf(z2));
        }
    }
}
