package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BgR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29407BgR implements InterfaceC29409BgT {
    public final DataChannel LIZ;

    @Override // X.InterfaceC29409BgT
    public final boolean LJIIIZ() {
        Room room = (Room) this.LIZ.kv0(RoomChannel.class);
        if (room == null || room.getMosaicStatus() != 1) {
            return false;
        }
        C30868C9o.LIZJ(R.string.sve);
        return true;
    }

    public C29407BgR(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
