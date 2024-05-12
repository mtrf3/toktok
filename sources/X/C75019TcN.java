package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TcN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75019TcN extends TZT {
    public final /* synthetic */ BaseLiveShowAudienceAndGuestViewModel LJLIL;

    @Override // X.TZT, X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    public C75019TcN(BaseLiveShowAudienceAndGuestViewModel baseLiveShowAudienceAndGuestViewModel) {
        this.LJLIL = baseLiveShowAudienceAndGuestViewModel;
    }

    @Override // X.TZT, X.TUI
    public final void V(TZX provider) {
        Long l;
        o.LJIIIZ(provider, "provider");
        List<LinkPlayerInfo> value = this.LJLIL.LJLL.getValue();
        if (value != null && value.size() == C76917UGr.LJJIII(provider)) {
            return;
        }
        List LIZ = provider.LIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : LIZ) {
            User user = ((LinkListUser) obj).user;
            Long l2 = null;
            if (user != null) {
                l = Long.valueOf(user.getId());
            } else {
                l = null;
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room != null || (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            }
            if (!o.LJ(l, l2)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkListUser linkListUser = (LinkListUser) it.next();
            LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
            linkPlayerInfo.mUser = linkListUser.user;
            linkPlayerInfo.mInteractIdStr = linkListUser.linkMicId;
            arrayList2.add(linkPlayerInfo);
        }
        this.LJLIL.LJLL.setValue(arrayList2);
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        o.LJIIIZ(provider, "provider");
        List<LinkPlayerInfo> value = this.LJLIL.LJLL.getValue();
        if (value != null && value.size() == C76917UGr.LJJIII(provider)) {
            return;
        }
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData = this.LJLIL.LJLL;
        List<LinkPlayerInfo> LIZ = provider.LIZ();
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : LIZ) {
            LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if ((room == null && (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) == null) || linkPlayerInfo2.mUser.getId() != room.getOwnerUserId()) {
                arrayList.add(linkPlayerInfo);
            }
        }
        mutableLiveData.setValue(arrayList);
    }
}
