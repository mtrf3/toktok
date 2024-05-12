package X;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MYa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56984MYa extends AbstractC116364hU<InterfaceC57784Mm4> {
    public final List<InboxLiveNotice> LIZJ;
    public final C62822Ol8 LIZLLL;

    @Override // X.AbstractC116364hU
    public final Object LIZJ() {
        String str;
        List<InboxLiveNotice> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InboxLiveNotice inboxLiveNotice = (InboxLiveNotice) next;
            User user = inboxLiveNotice.getUser();
            if (user == null || user.roomId != 0) {
                InterfaceC116134h7 interfaceC116134h7 = this.LIZ;
                User user2 = inboxLiveNotice.getUser();
                if (user2 == null || (str = user2.getUid()) == null) {
                    str = "";
                }
                if (interfaceC116134h7.LJFF(this.LIZ.LJI(3), str)) {
                    arrayList.add(next);
                }
            }
        }
        ((IInboxLiveService) this.LIZLLL.getValue()).recordRoomInfoList(this.LIZJ);
        return this;
    }

    @Override // X.AbstractC116364hU
    public final Object LIZLLL() {
        String str;
        User user;
        List<AbstractC54715Ldf> mapLiveItems = ((IInboxLiveService) this.LIZLLL.getValue()).mapLiveItems(this.LIZJ, ((Boolean) C46604IQu.LJIIJ.getValue()).booleanValue(), C53339KwZ.LIZLLL());
        for (AbstractC54715Ldf abstractC54715Ldf : mapLiveItems) {
            ConcurrentHashMap<String, Integer> LIZ = this.LIZ.LIZ();
            InboxLiveNotice LIZ2 = abstractC54715Ldf.LIZ();
            if (LIZ2 == null || (user = LIZ2.getUser()) == null || (str = user.getUid()) == null) {
                str = "";
            }
            LIZ.put(str, new Integer(this.LIZ.LJI(3)));
            InboxLiveNotice LIZ3 = abstractC54715Ldf.LIZ();
            if (LIZ3 != null) {
                LIZ3.setPriority(this.LIZ.LJI(3));
            }
        }
        if (!mapLiveItems.isEmpty()) {
            this.LIZIZ = ORZ.LLJILJILJ(mapLiveItems);
        }
        return this;
    }

    @Override // X.AbstractC116364hU
    public final C76800UCe LIZ() {
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56984MYa(InterfaceC116134h7 ft) {
        super(ft);
        o.LJIIIZ(ft, "ft");
        this.LIZJ = new ArrayList();
        this.LIZLLL = C221108m2.LIZIZ(C56999MYp.LJLIL);
    }

    @Override // X.AbstractC116364hU
    public final Object LIZIZ(InterfaceC67352kd<? super AbstractC116364hU<InterfaceC57784Mm4>> interfaceC67352kd) {
        String str;
        long j;
        ((ArrayList) this.LIZJ).clear();
        this.LIZIZ.clear();
        List<CombineLiveNotice> liveNotices = this.LIZ.LJII().getLiveNotices();
        ArrayList arrayList = new ArrayList(C32I.LJJL(liveNotices, 10));
        for (CombineLiveNotice combineLiveNotice : liveNotices) {
            SlimRoom slimRoom = (SlimRoom) C75792yF.LIZ(String.valueOf(combineLiveNotice.getRoomInfo()), SlimRoom.class);
            LiveRoomStruct liveRoomStruct = (LiveRoomStruct) C75792yF.LIZ(String.valueOf(combineLiveNotice.getRoomInfo()), LiveRoomStruct.class);
            User user = combineLiveNotice.getUser();
            if (user != null) {
                m roomInfo = combineLiveNotice.getRoomInfo();
                if (roomInfo != null) {
                    str = roomInfo.toString();
                } else {
                    str = null;
                }
                user.roomData = str;
                if (slimRoom != null) {
                    j = slimRoom.getId();
                } else {
                    j = 0;
                }
                user.roomId = j;
            }
            arrayList.add(new InboxLiveNotice(combineLiveNotice.getUser(), combineLiveNotice.getType(), slimRoom, false, liveRoomStruct, this.LIZ.LJI(3), 8, null));
        }
        ((ArrayList) this.LIZJ).addAll(arrayList);
        return this;
    }
}
