package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tek, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75166Tek extends TRY {
    public final /* synthetic */ LiveShowAnchorViewModel LJLIL;

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    public C75166Tek(LiveShowAnchorViewModel liveShowAnchorViewModel) {
        this.LJLIL = liveShowAnchorViewModel;
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        Integer num;
        Long l;
        Long l2;
        o.LJIIIZ(provider, "provider");
        LiveShowAnchorViewModel liveShowAnchorViewModel = this.LJLIL;
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
        liveShowAnchorViewModel.getClass();
        List<LinkPlayerInfo> value = liveShowAnchorViewModel.LJLL.getValue();
        Integer valueOf = Integer.valueOf(arrayList.size());
        if (value != null) {
            num = Integer.valueOf(value.size());
        } else {
            num = null;
        }
        if (o.LJ(valueOf, num) && value != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                LinkPlayerInfo linkPlayerInfo3 = (LinkPlayerInfo) ListProtector.get(arrayList, i2);
                LinkPlayerInfo linkPlayerInfo4 = (LinkPlayerInfo) ListProtector.get(value, i2);
                if (o.LJ(linkPlayerInfo3.mInteractIdStr, linkPlayerInfo4.mInteractIdStr)) {
                    User user = linkPlayerInfo3.mUser;
                    if (user != null) {
                        l = Long.valueOf(user.getId());
                    } else {
                        l = null;
                    }
                    User user2 = linkPlayerInfo4.mUser;
                    if (user2 != null) {
                        l2 = Long.valueOf(user2.getId());
                    } else {
                        l2 = null;
                    }
                    if (o.LJ(l, l2)) {
                    }
                }
            }
            return;
        }
        C29306Beo.LJJJIL(new AqS160S0200000_13(liveShowAnchorViewModel, (LiveShowAnchorViewModel) arrayList, (List<? extends LinkPlayerInfo>) 93));
    }
}
