package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TTx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74713TTx extends TU4<LinkPlayerInfo, MultiLiveGuestInfoList> {
    @Override // X.TU4
    public final void LJFF(MultiLiveGuestInfoList multiLiveGuestInfoList) {
        MultiLiveGuestInfoList multiLiveGuestInfoList2 = multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList2.onLineUsers;
        o.LJIIIIZZ(arrayList, "source.onLineUsers");
        Iterator<LinkPlayerInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo next = it.next();
            next.LIZ = 2;
            LJ().add(next);
        }
        ArrayList<LinkPlayerInfo> arrayList2 = multiLiveGuestInfoList2.waitingUsers;
        o.LJIIIIZZ(arrayList2, "source.waitingUsers");
        Iterator<LinkPlayerInfo> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            LinkPlayerInfo next2 = it2.next();
            next2.LIZ = 1;
            ((List) this.LIZLLL.getValue()).add(next2);
        }
    }
}
