package X;

import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tmc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75654Tmc<T> implements InterfaceC64592gB {
    public static final C75654Tmc<T> LJLIL = new C75654Tmc<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long j;
        Room room;
        DataChannel dataChannel = C75650TmY.LIZIZ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C75650TmY.LIZJ.LIZ(C1EW.LIZ(((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).pair(EnumC75660Tmi.ACTION_KEEPALIVE.getValue(), 0L, j, C75650TmY.LJII, C8E.LIZLLL().LLIILZL())).LJJJLIIL(C75657Tmf.LJLIL, C75641TmP.LJLIL));
    }
}
