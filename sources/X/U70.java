package X;

import Y.AfS1S0110100_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractAudienceTimeOutSetting;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class U70 implements InterfaceC76675U7j, InterfaceC76734U9q {
    public final java.util.Map<Long, InterfaceC92693kP> LIZ = new LinkedHashMap();
    public U7T LIZIZ;

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
    public final void LJIIIZ(U7T u7t, U7A u7a) {
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
    public final void LJJIIZI(U7T u7t, C65767PrX<Long> c65767PrX) {
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
    public final void LJJIZ(U7T u7t, GroupPlayer groupPlayer, long j, long j2, long j3) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJ(U7T u7t, U7A u7a) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJI(U7T u7t, long j, AllListUser allListUser) {
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJJ(U7T u7t, U7A u7a) {
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

    @Override // X.InterfaceC76675U7j
    public final void LJI(U7T linker) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILL(String str) {
        LinkUser linkUser;
        long j;
        Long userId;
        U7Z u7z;
        U7T u7t = this.LIZIZ;
        if (u7t != null && (u7z = u7t.LJIIJJI) != null) {
            linkUser = u7z.LJJ(str);
        } else {
            linkUser = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteAudio start linkMicId=");
        LIZ.append(str);
        LIZ.append(" linkUser=");
        LIZ.append(linkUser);
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
        if (linkUser != null && (userId = linkUser.getUserId()) != null) {
            j = userId.longValue();
        } else {
            j = -1;
        }
        LJJLIIIIJ(j);
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

    public final void LJJLI(U7T linker) {
        o.LJIIIZ(linker, "linker");
        linker.LJIIIZ.LJJJJJL(this);
        linker.LJIIIIZZ.remove(this);
        this.LIZIZ = null;
        Iterator it = ((LinkedHashMap) this.LIZ).entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC92693kP) ((Map.Entry) it.next()).getValue()).dispose();
        }
    }

    public final void LJJLIIIIJ(long j) {
        Long l;
        U7Z u7z;
        LinkUser LJIJI;
        if (j > 1000) {
            InterfaceC92693kP remove = this.LIZ.remove(Long.valueOf(j));
            U7T u7t = this.LIZIZ;
            if (u7t != null && (u7z = u7t.LJIIJJI) != null && (LJIJI = u7z.LJIJI(j)) != null) {
                l = LJIJI.getRoomId();
            } else {
                l = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("disposeCountDown remove disposa ");
            LIZ.append(remove);
            LIZ.append(" room_id=");
            LIZ.append(l);
            U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
            if (remove != null) {
                remove.dispose();
            }
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void onFirstRemoteVideoFrameRender(String str) {
        LinkUser linkUser;
        long j;
        Long userId;
        U7Z u7z;
        U7T u7t = this.LIZIZ;
        if (u7t != null && (u7z = u7t.LJIIJJI) != null) {
            linkUser = u7z.LJJ(str);
        } else {
            linkUser = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameRender start linkMicId=");
        LIZ.append(str);
        LIZ.append(" linkUser=");
        LIZ.append(linkUser);
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
        if (linkUser != null && (userId = linkUser.getUserId()) != null) {
            j = userId.longValue();
        } else {
            j = -1;
        }
        LJJLIIIIJ(j);
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAnchorReceiveModeratorPermitApply linker=");
        LIZ.append(linker);
        LIZ.append(" data=");
        LIZ.append(u7a);
        LIZ.append(' ');
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
        java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLIIIJ(it.next().getKey().longValue(), true);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJII(U7T linker, LinkUser inviteeUser) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviteeUser, "inviteeUser");
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIJ(U7T u7t, U7A u7a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPermitApplySucceeded linker=");
        LIZ.append(u7t);
        LIZ.append(" data=");
        LIZ.append(u7a);
        LIZ.append(' ');
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
        java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLIIIJ(it.next().getKey().longValue(), true);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJIIZILJ(U7T linker, long j) {
        o.LJIIIZ(linker, "linker");
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
    public final void LJJIJIL(U7T linker, U7A u7a) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLeaveChannelMessage start linker=");
        LIZ.append(linker);
        LIZ.append(" data=");
        LIZ.append(u7a);
        LIZ.append(' ');
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
        java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLIIIIJ(it.next().getKey().longValue());
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIJLIJ(U7T u7t, U7A u7a) {
        long j;
        Room room = u7t.LJ;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        LJJLIIIJ(j, false);
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJIL(U7T linker, U7A data) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAgreeInviteMessageReceived start linker=");
        LIZ.append(linker);
        LIZ.append(" data=");
        LIZ.append(data);
        LIZ.append(' ');
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
        java.util.Map<Long, OnLineMicInfo> map = data.LIZJ;
        if (map != null) {
            Iterator<Map.Entry<Long, OnLineMicInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                LJJLIIIJ(it.next().getKey().longValue(), true);
            }
        }
    }

    @Override // X.InterfaceC76675U7j
    public final void LJJJIL(U7T linker, U7A u7a) {
        long j;
        o.LJIIIZ(linker, "linker");
        Room room = linker.LJ;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        LJJLIIIJ(j, false);
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJJ(long j, String str) {
        LinkUser linkUser;
        long j2;
        Long userId;
        U7Z u7z;
        U7T u7t = this.LIZIZ;
        Long l = null;
        if (u7t != null && (u7z = u7t.LJIIJJI) != null) {
            linkUser = u7z.LJJ(str);
        } else {
            linkUser = null;
        }
        StringBuilder LIZJ = C06490Nh.LIZJ("onRtcUserLeft start linkMicId=", str, " leaveReason=", j);
        LIZJ.append(" room_id=");
        if (linkUser != null) {
            l = linkUser.getRoomId();
        }
        LIZJ.append(l);
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZJ));
        if (linkUser != null && (userId = linkUser.getUserId()) != null) {
            j2 = userId.longValue();
        } else {
            j2 = -1;
        }
        LJJLIIIIJ(j2);
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

    public final void LJJLIIIJ(long j, boolean z) {
        if (((LinkedHashMap) this.LIZ).get(Long.valueOf(j)) != null) {
            return;
        }
        int value = LiveInteractAudienceTimeOutSetting.INSTANCE.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCountdown startCountdown value ");
        LIZ.append(value);
        U4R.LIZ("KickOutUserManager", X1D.LIZIZ(LIZ));
        this.LIZ.put(Long.valueOf(j), AbstractC73672Svk.LJJLIIIJLJLI(value, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJJZI(new AfS1S0110100_13(this, z, j, 2)));
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
