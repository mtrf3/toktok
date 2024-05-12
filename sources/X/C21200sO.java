package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.KaraokeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21200sO {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final KaraokeViewModel LIZJ;
    public IAudioFilterManager LIZLLL;

    public C21200sO(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        int i;
        KaraokeInfo karaokeInfo;
        LiveMode liveMode;
        PaidEvent paidEvent;
        CommerceStruct commerceStruct;
        C279917z LJJJJL;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        dataChannel.kv0(BCN.class);
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (C29306Beo.LJIIJ(dataChannel)) {
            i = 1;
        } else {
            i = 2;
        }
        KaraokeViewModel LIZJ = C21210sP.LIZJ(dataChannel);
        this.LIZJ = LIZJ;
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C55342Fe(this, null), 3);
        if (room != null) {
            karaokeInfo = room.karaokeInfo;
        } else {
            karaokeInfo = null;
        }
        new C1Z1(i, dataChannel, lifecycleOwner, LIZJ, karaokeInfo);
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.VIDEO) {
            if (i != 1) {
                if (karaokeInfo != null && karaokeInfo.displayKaraoke && karaokeInfo.karaokeStatus && (((paidEvent = room.paidEvent) == null || paidEvent.paidType != 1) && room.liveSubOnly != 1 && ((commerceStruct = room.getCommerceStruct()) == null || commerceStruct.commercePermission != 1))) {
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C55302Fa(this, null), 3);
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C55312Fb(this, karaokeInfo, null), 3);
                    KaraokeSong karaokeSong = karaokeInfo.song;
                    if (karaokeSong != null && (LJJJJL = C78926UyI.LJJJJL(karaokeSong, null)) != null) {
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C55322Fc(this, LJJJJL, null), 3);
                    }
                }
            } else if (karaokeInfo != null && karaokeInfo.karaokeStatus && BWZ.KARAOKE.canCoexist()) {
                if (karaokeInfo.song != null && C29306Beo.LJJIFFI((Boolean) dataChannel.kv0(C2E3.class))) {
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C55332Fd(this, null), 3);
                }
                if (LIZJ != null) {
                    LIZJ.Dv0(true);
                }
            } else if (LIZJ != null) {
                LIZJ.Dv0(false);
            }
        }
        DataChannelGlobal.LJLJJI.qv0(this, lifecycleOwner, LiveStreamGlobalChannel.class, new IDqS416S0100000(this, 281));
    }
}
