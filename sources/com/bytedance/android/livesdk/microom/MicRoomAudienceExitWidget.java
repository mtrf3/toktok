package com.bytedance.android.livesdk.microom;

import X.AbstractC73672Svk;
import X.B4C;
import X.B83;
import X.C28401BCr;
import X.C29374Bfu;
import X.C29623Bjv;
import X.C29624Bjw;
import X.C29625Bjx;
import X.C29626Bjy;
import X.C29927Bop;
import X.C30725C4b;
import X.C73318Sq2;
import X.C73943T0h;
import X.C73969T1h;
import X.CN1;
import X.EnumC31509CYf;
import X.ORZ;
import X.Q7L;
import X.T16;
import X.V0Q;
import Y.AfS57S0100000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MicRoomAudienceExitWidget extends LiveRecyclableWidget {
    public OfficialChannelInfo LJLJI;
    public Room LJLJJI;
    public IMicRoomService LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public final int LJLIL = 30;
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public final C29623Bjv LJLJLJ = new C29623Bjv(this);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final long LJLZ() {
        int i;
        Object obj;
        Integer num;
        OfficialChannelInfo officialChannelInfo = this.LJLJI;
        if (officialChannelInfo == null) {
            return 30L;
        }
        o.LJI(officialChannelInfo);
        if (officialChannelInfo.delayEnterTime == null) {
            return 30L;
        }
        OfficialChannelInfo officialChannelInfo2 = this.LJLJI;
        o.LJI(officialChannelInfo2);
        if (officialChannelInfo2.delayEnterTime.isEmpty()) {
            return 30L;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(C28401BCr.class)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        OfficialChannelInfo officialChannelInfo3 = this.LJLJI;
        o.LJI(officialChannelInfo3);
        Iterator it = ORZ.LLIL(ORZ.LLJI(officialChannelInfo3.delayEnterTime.keySet())).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Long it2 = (Long) obj;
                long j = i;
                o.LJIIIIZZ(it2, "it");
                if (j <= it2.longValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Long l = (Long) obj;
        if (l == null) {
            return 30L;
        }
        long longValue = l.longValue();
        OfficialChannelInfo officialChannelInfo4 = this.LJLJI;
        o.LJI(officialChannelInfo4);
        Long l2 = officialChannelInfo4.delayEnterTime.get(Long.valueOf(longValue));
        if (l2 == null) {
            return 30L;
        }
        return l2.longValue();
    }

    public final void LJZ() {
        OfficialChannelInfo officialChannelInfo = this.LJLJI;
        if (officialChannelInfo != null) {
            long LIZ = officialChannelInfo.endTimeStamp - (C30725C4b.LIZ() / 1000);
            long nextInt = V0Q.Default.nextInt(this.LJLIL, (int) (Math.max(1L, officialChannelInfo.maxNextTime) + this.LJLIL));
            if (LIZ <= nextInt) {
                LJZL();
            } else {
                this.LJLILLLLZI.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(LIZ - nextInt, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 142), C29624Bjw.LJLIL));
            }
        }
    }

    public final void LJZI() {
        long j = this.LJLJJLL;
        if (j == 0) {
            C73943T0h.LIZ().LIZIZ(new B4C());
            return;
        }
        IMicRoomService iMicRoomService = this.LJLJJL;
        if (iMicRoomService == null) {
            return;
        }
        iMicRoomService.Y30(j, this.LJLJL, true);
    }

    public final void LJZL() {
        Long l;
        boolean z;
        long j;
        long j2;
        long j3;
        User user;
        OfficialChannelInfo officialChannelInfo;
        Room room = this.LJLJJI;
        Long l2 = null;
        if (room != null && (officialChannelInfo = room.officialChannelInfo) != null) {
            l = Long.valueOf(officialChannelInfo.backupRoomId);
        } else {
            l = null;
        }
        Room room2 = this.LJLJJI;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        }
        boolean LJ = o.LJ(l, l2);
        IMicRoomService iMicRoomService = this.LJLJJL;
        boolean z2 = false;
        if (iMicRoomService != null && !iMicRoomService.Nl() && !LJ) {
            z = true;
        } else {
            z = false;
        }
        IMicRoomService iMicRoomService2 = this.LJLJJL;
        if (iMicRoomService2 != null && iMicRoomService2.Sf0(this.LJLJJI) == 2) {
            z2 = true;
        }
        long j4 = 0;
        if (z || z2) {
            Room room3 = this.LJLJJI;
            if (room3 != null) {
                j = room3.getId();
            } else {
                j = 0;
            }
            this.LJLJJLL = j;
            Room room4 = this.LJLJJI;
            if (room4 != null) {
                j2 = room4.getOwnerUserId();
            } else {
                j2 = 0;
            }
            this.LJLJL = j2;
            OfficialChannelInfo officialChannelInfo2 = this.LJLJI;
            if (officialChannelInfo2 != null) {
                j4 = officialChannelInfo2.endTimeStamp;
            }
            LL(LJLZ() + (j4 - (C30725C4b.LIZ() / 1000)));
            return;
        }
        MicRoomApi micRoomApi = (MicRoomApi) Q7L.LIZIZ(MicRoomApi.class);
        OfficialChannelInfo officialChannelInfo3 = this.LJLJI;
        if (officialChannelInfo3 != null && (user = officialChannelInfo3.channelUser) != null) {
            j3 = user.getId();
        } else {
            j3 = 0;
        }
        Room room5 = this.LJLJJI;
        if (room5 != null) {
            j4 = room5.getOwnerUserId();
        }
        this.LJLILLLLZI.LIZ(micRoomApi.getNextRoomData(j3, j4).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 143), C29625Bjx.LJLIL));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLILLLLZI.LIZLLL();
    }

    public final void LL(long j) {
        if (j <= 0) {
            LJZI();
        } else {
            this.LJLILLLLZI.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 144), C29626Bjy.LJLIL));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.dataChannel;
        OfficialChannelInfo officialChannelInfo = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJI = room;
        if (room != null) {
            officialChannelInfo = room.officialChannelInfo;
        }
        this.LJLJI = officialChannelInfo;
        this.LJLJJL = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        LJZ();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this.LJLJLJ);
        }
    }
}
