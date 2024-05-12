package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TUN extends AbstractC74727TUl<LinkPlayerInfo, MultiLiveGuestInfoList> {
    public ListByTypeResponse.MultiGuestBonus LJIIJ;

    @Override // X.AbstractC74727TUl, X.TZX
    public final Long LJIILIIL() {
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = this.LJIIJ;
        if (multiGuestBonus != null) {
            return Long.valueOf(multiGuestBonus.multiGuestBonusValue);
        }
        return null;
    }

    @Override // X.AbstractC74727TUl, X.TZX
    public final String LJIILL() {
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = this.LJIIJ;
        if (multiGuestBonus != null) {
            return multiGuestBonus.multiGuestBonusValueString;
        }
        return null;
    }

    @Override // X.AbstractC74727TUl, X.TZX
    public final String LJIILLIIL() {
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = this.LJIIJ;
        if (multiGuestBonus != null) {
            return multiGuestBonus.multiGuestBonusNoteString;
        }
        return null;
    }

    @Override // X.AbstractC74727TUl, X.TZX
    public final List<LinkPlayerInfo> LJIIJ() {
        return LJJIIZ(this, LJIJJLI());
    }

    @Override // X.AbstractC74727TUl, X.TZX
    public final List<LinkPlayerInfo> LJIILJJIL() {
        return LJJIIZ(this, LJIL());
    }

    @Override // X.AbstractC74727TUl, X.TZX
    public final List<LinkPlayerInfo> LJIIZILJ() {
        return LJJIIZ(this, LJJ());
    }

    @Override // X.TZX
    public final int LIZJ(long j) {
        int i;
        LinkPlayerInfo linkPlayerInfo;
        synchronized (this) {
            Iterator<LinkPlayerInfo> it = LJIJI().iterator();
            while (true) {
                i = 0;
                if (it.hasNext()) {
                    linkPlayerInfo = it.next();
                    if (linkPlayerInfo.mUser.getId() == j) {
                        break;
                    }
                } else {
                    linkPlayerInfo = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
            if (linkPlayerInfo2 != null) {
                i = linkPlayerInfo2.LIZ;
            }
        }
        return i;
    }

    @Override // X.TZX
    public final Object LIZLLL(long j) {
        LinkPlayerInfo linkPlayerInfo;
        LinkPlayerInfo linkPlayerInfo2;
        synchronized (this) {
            Iterator<LinkPlayerInfo> it = LJJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkPlayerInfo = it.next();
                    if (linkPlayerInfo.mUser.getId() == j) {
                        break;
                    }
                } else {
                    linkPlayerInfo = null;
                    break;
                }
            }
            linkPlayerInfo2 = linkPlayerInfo;
        }
        return linkPlayerInfo2;
    }

    @Override // X.TZX
    public final Object LJII(String linkMicId) {
        LinkPlayerInfo linkPlayerInfo;
        LinkPlayerInfo linkPlayerInfo2;
        o.LJIIIZ(linkMicId, "linkMicId");
        synchronized (this) {
            Iterator<LinkPlayerInfo> it = LJIJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkPlayerInfo = it.next();
                    if (TextUtils.equals(linkMicId, linkPlayerInfo.mInteractIdStr)) {
                        break;
                    }
                } else {
                    linkPlayerInfo = null;
                    break;
                }
            }
            linkPlayerInfo2 = linkPlayerInfo;
        }
        return linkPlayerInfo2;
    }

    @Override // X.TZX
    public final Object LJIIIZ(long j) {
        LinkPlayerInfo linkPlayerInfo;
        LinkPlayerInfo linkPlayerInfo2;
        synchronized (this) {
            Iterator<LinkPlayerInfo> it = LJIJJLI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkPlayerInfo = it.next();
                    if (linkPlayerInfo.mUser.getId() == j) {
                        break;
                    }
                } else {
                    linkPlayerInfo = null;
                    break;
                }
            }
            linkPlayerInfo2 = linkPlayerInfo;
        }
        return linkPlayerInfo2;
    }

    @Override // X.TZX
    public final Object LJIIJJI(String linkMicId) {
        LinkPlayerInfo linkPlayerInfo;
        LinkPlayerInfo linkPlayerInfo2;
        o.LJIIIZ(linkMicId, "linkMicId");
        synchronized (this) {
            Iterator<LinkPlayerInfo> it = LJJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkPlayerInfo = it.next();
                    if (TextUtils.equals(linkMicId, linkPlayerInfo.mInteractIdStr)) {
                        break;
                    }
                } else {
                    linkPlayerInfo = null;
                    break;
                }
            }
            linkPlayerInfo2 = linkPlayerInfo;
        }
        return linkPlayerInfo2;
    }

    @Override // X.TZX
    public final Object LJIIL(long j) {
        LinkPlayerInfo linkPlayerInfo;
        LinkPlayerInfo linkPlayerInfo2;
        synchronized (this) {
            Iterator<LinkPlayerInfo> it = LJIJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkPlayerInfo = it.next();
                    if (linkPlayerInfo.mUser.getId() == j) {
                        break;
                    }
                } else {
                    linkPlayerInfo = null;
                    break;
                }
            }
            linkPlayerInfo2 = linkPlayerInfo;
        }
        return linkPlayerInfo2;
    }

    @Override // X.AbstractC74727TUl
    public final void LJJIII(MultiLiveGuestInfoList multiLiveGuestInfoList) {
        MultiLiveGuestInfoList multiLiveGuestInfoList2 = multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList2.onLineUsers;
        if (arrayList != null) {
            Iterator<LinkPlayerInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                LinkPlayerInfo next = it.next();
                next.LIZ = 2;
                LJJI().add(next);
            }
        }
        ArrayList<LinkPlayerInfo> arrayList2 = multiLiveGuestInfoList2.waitingUsers;
        if (arrayList2 != null) {
            Iterator<LinkPlayerInfo> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                LinkPlayerInfo next2 = it2.next();
                next2.LIZ = 1;
                LJIJJLI().add(next2);
            }
        }
        List<ListByTypeResponse.GiftScoreAppliedUser> list = multiLiveGuestInfoList2.giftScoreAppliedUsers;
        if (list != null) {
            for (ListByTypeResponse.GiftScoreAppliedUser it3 : list) {
                List<ListByTypeResponse.GiftScoreAppliedUser> LJIJJ = LJIJJ();
                o.LJIIIIZZ(it3, "it");
                LJIJJ.add(it3);
            }
        }
        ArrayList<LinkPlayerInfo> arrayList3 = multiLiveGuestInfoList2.waitingUsers;
        if ((arrayList3 == null || arrayList3.isEmpty()) && LJIJJLI().isEmpty() && (!LJIJJ().isEmpty())) {
            Iterator<ListByTypeResponse.GiftScoreAppliedUser> it4 = LJIJJ().iterator();
            while (it4.hasNext()) {
                LinkPlayerInfo linkPlayerInfo = it4.next().listUser;
                if (linkPlayerInfo != null) {
                    linkPlayerInfo.LIZ = 1;
                    LJIJJLI().add(linkPlayerInfo);
                }
            }
        }
        ArrayList<LinkPlayerInfo> arrayList4 = multiLiveGuestInfoList2.viewerUsers;
        if (arrayList4 != null) {
            Iterator<LinkPlayerInfo> it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                LinkPlayerInfo next3 = it5.next();
                next3.LIZ = 0;
                LJIL().add(next3);
            }
        }
        ArrayList<LinkPlayerInfo> arrayList5 = multiLiveGuestInfoList2.connectingUsers;
        if (arrayList5 != null) {
            Iterator<LinkPlayerInfo> it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                LinkPlayerInfo next4 = it6.next();
                next4.LIZ = 4;
                LJJ().add(next4);
            }
        }
        List<ListByTypeResponse.ReservedUser> list2 = multiLiveGuestInfoList2.reservedUsers;
        if (list2 != null) {
            for (ListByTypeResponse.ReservedUser it7 : list2) {
                List list3 = (List) this.LIZJ.getValue();
                o.LJIIIIZZ(it7, "it");
                list3.add(it7);
            }
        }
        ArrayList<LinkPlayerInfo> arrayList6 = multiLiveGuestInfoList2.notViewerFriends;
        if (arrayList6 != null) {
            Iterator<LinkPlayerInfo> it8 = arrayList6.iterator();
            while (it8.hasNext()) {
                LinkPlayerInfo next5 = it8.next();
                next5.LIZ = 0;
                LJJIFFI().add(next5);
            }
        }
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = multiLiveGuestInfoList2.multiGuestBonus;
        if (multiGuestBonus != null && multiGuestBonus.isSuccess) {
            this.LJIIJ = multiGuestBonus;
        }
    }

    public static List LJJIIZ(Object obj, List list) {
        List LLJILJILJ;
        boolean z;
        synchronized (obj) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                User user = ((LinkPlayerInfo) obj2).mUser;
                if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(obj2);
                }
            }
            LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        }
        return LLJILJILJ;
    }
}
