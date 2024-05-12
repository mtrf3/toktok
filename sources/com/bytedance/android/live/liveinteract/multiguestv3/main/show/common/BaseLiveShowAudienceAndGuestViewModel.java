package com.bytedance.android.live.liveinteract.multiguestv3.main.show.common;

import X.AbstractC74727TUl;
import X.C29044Baa;
import X.C29108Bbc;
import X.C61878OQg;
import X.C75019TcN;
import X.C75559Tl5;
import X.TQ8;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class BaseLiveShowAudienceAndGuestViewModel extends BaseLiveShowViewModel {
    public final MutableLiveData<List<LinkPlayerInfo>> LJLL = new MutableLiveData<>(C61878OQg.INSTANCE);
    public final C75019TcN LJLLI = new C75019TcN(this);

    public final List<LinkPlayerInfo> pv0() {
        AbstractC74727TUl LIZ;
        List LJJI;
        Long l;
        Long valueOf;
        TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        ArrayList arrayList = null;
        if (tq8 != null && (LIZ = tq8.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : LJJI) {
                User user = ((LinkListUser) obj).user;
                if (user != null) {
                    l = Long.valueOf(user.getId());
                } else {
                    l = null;
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                if (room != null || (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) != null) {
                    valueOf = Long.valueOf(room.getOwnerUserId());
                } else {
                    valueOf = null;
                }
                if (!o.LJ(l, valueOf)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LinkListUser linkListUser = (LinkListUser) it.next();
                LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                linkPlayerInfo.mUser = linkListUser.user;
                linkPlayerInfo.mInteractIdStr = linkListUser.linkMicId;
                arrayList3.add(linkPlayerInfo);
            }
        }
        return arrayList3;
    }
}
