package X;

import Y.AfS8S0100100_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class U71 implements InterfaceC76675U7j, InterfaceC76734U9q {
    public final U7T LIZ;
    public final C73318Sq2 LIZIZ;
    public final ConcurrentHashMap<Long, InterfaceC92693kP> LIZJ;
    public final ConcurrentHashMap<Long, InviteData> LIZLLL;
    public final long LJ;
    public final java.util.Set<Long> LJFF;
    public final java.util.Set<Long> LJI;

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
    public final void LJIIJ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIJJI(String str, String str2) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIL() {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIILIIL(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIILJJIL(U7T u7t) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILLIIL(String str, String str2) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJI(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJJLI(U7T u7t, List list, GroupPlayer groupPlayer) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIJ(U7T u7t, List list, GroupPlayer groupPlayer) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJIIJIL(U7T u7t, GroupChannelAllUser groupChannelAllUser) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJL(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJLIJ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIZ(U7T u7t, GroupPlayer groupPlayer, long j, long j2, long j3) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJI(U7T u7t, long j, AllListUser allListUser) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJIZL(LinkCoreError linkCoreError) {
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

    @Override // X.InterfaceC76675U7j
    public final void LJJL(U7T u7t, LinkLayerListUser linkLayerListUser, U7A u7a) {
    }

    public U71(U7T mLinker) {
        o.LJIIIZ(mLinker, "mLinker");
        this.LIZ = mLinker;
        this.LIZIZ = new C73318Sq2();
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJ = C025908h.LIZ();
        this.LJFF = new CopyOnWriteArraySet();
        this.LJI = new CopyOnWriteArraySet();
        mLinker.LJJJJL(this);
        mLinker.LJIIIZ.LJJJJIZL(this);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJI(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILL(String str) {
        for (Map.Entry<Long, InviteData> entry : this.LIZLLL.entrySet()) {
            if (o.LJ(entry.getValue().getInvitee().getLinkMicId(), str)) {
                LJJLI(entry.getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJ(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIL(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJI(LinkCoreError error) {
        o.LJIIIZ(error, "error");
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

    @Override // X.InterfaceC76734U9q
    public final void onFirstRemoteVideoFrameRender(String str) {
        for (Map.Entry<Long, InviteData> entry : this.LIZLLL.entrySet()) {
            if (o.LJ(entry.getValue().getInvitee().getLinkMicId(), str)) {
                LJJLI(entry.getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LIZJ(U7T linker, LinkLayerMessage message) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76675U7j
    public final void LIZLLL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJ(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJII(U7T linker, LinkUser inviteeUser) {
        long j;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviteeUser, "inviteeUser");
        Long userId = inviteeUser.getUserId();
        String linkMicId = inviteeUser.getLinkMicId();
        if (userId != null && linkMicId != null) {
            long longValue = userId.longValue();
            ((CopyOnWriteArraySet) this.LJI).add(Long.valueOf(longValue));
            ((CopyOnWriteArraySet) this.LJFF).add(Long.valueOf(longValue));
            ConcurrentHashMap<Long, InviteData> concurrentHashMap = this.LIZLLL;
            Long valueOf = Long.valueOf(longValue);
            LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
            Room room = this.LIZ.LJ;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            builder.setRoomId(j);
            builder.setUserId(longValue);
            builder.setLinkMicId(linkMicId);
            InviteData.Builder builder2 = new InviteData.Builder(builder.build());
            builder2.setExpireTimeInSeconds(LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue());
            concurrentHashMap.put(valueOf, builder2.build());
            LJJLIIIIJ(LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), longValue);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIIZ(U7T u7t, U7A u7a) {
        java.util.Map<Long, OnLineMicInfo> map;
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue() && (map = u7a.LIZJ) != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLI(it.next().getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIZILJ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
        this.LIZLLL.clear();
        ((CopyOnWriteArraySet) this.LJFF).clear();
        ((CopyOnWriteArraySet) this.LJI).clear();
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIJJ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJ(U7T linker, U7A data) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(data, "data");
        java.util.Map<Long, OnLineMicInfo> map = data.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLI(it.next().getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIFFI(U7T linker, LinkLayerMessage message) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJII(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIZ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIIZI(U7T u7t, C65767PrX<Long> c65767PrX) {
        Iterator<Long> it = c65767PrX.iterator();
        while (it.hasNext()) {
            Long it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            LJJLI(it2.longValue(), false);
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJIL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
        java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLI(it.next().getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIL(U7T linker, U7A data) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(data, "data");
        java.util.Map<Long, OnLineMicInfo> map = data.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLI(it.next().getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJ(U7T u7t, U7A u7a) {
        java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLI(it.next().getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJIL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJ(U7T u7t, U7A u7a) {
        java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLI(it.next().getKey().longValue(), false);
            }
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJJ(long j, String str) {
        for (Map.Entry<Long, InviteData> entry : this.LIZLLL.entrySet()) {
            if (o.LJ(entry.getValue().getInvitee().getLinkMicId(), str)) {
                LJJLI(entry.getKey().longValue(), false);
            }
        }
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

    public final void LJJLI(long j, boolean z) {
        Long l;
        InviteData remove;
        InterfaceC92693kP remove2;
        ((CopyOnWriteArraySet) this.LJI).remove(Long.valueOf(j));
        boolean containsKey = this.LIZLLL.containsKey(Long.valueOf(j));
        StringBuilder LIZLLL = C00F.LIZLLL("removeInvitedUserInfoIfHave start contains uid ", containsKey, ", should cancel ", z, "，room_id=");
        Room room = this.LIZ.LJ;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZLLL.append(l);
        U4R.LIZ("InviteManager", X1D.LIZIZ(LIZLLL));
        if (!containsKey || (remove = this.LIZLLL.remove(Long.valueOf(j))) == null) {
            return;
        }
        if (z) {
            CancelInviteData build = new CancelInviteData.Builder(remove.getInvitee(), remove.getExpireTimeInSeconds()).build();
            U7T u7t = this.LIZ;
            if (u7t != null) {
                u7t.LLLLZ(build, null);
            }
        }
        ((CopyOnWriteArraySet) this.LJFF).remove(Long.valueOf(j));
        if (j > 1000 && (remove2 = this.LIZJ.remove(Long.valueOf(j))) != null) {
            remove2.dispose();
        }
    }

    public final void LJJLIIIIJ(long j, long j2) {
        InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJLIIL(new AfS8S0100100_13(j2, this, 27), U72.LJLIL);
        this.LIZJ.put(Long.valueOf(j2), LJJJLIIL);
        C73318Sq2 compositeDisposable = this.LIZIZ;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJJLIIL);
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
    public final void LIZ(U7T linker, long j, GroupChannelAllUser groupChannelAllUser, long j2) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJJL(U7T linker, long j, GroupChannelAllUser groupChannelAllUser, long j2) {
        o.LJIIIZ(linker, "linker");
    }
}
