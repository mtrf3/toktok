package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BgW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29412BgW implements TXE {
    public final DataChannel LIZ;

    @Override // X.TXE
    public final boolean LJIIIZ() {
        Room room = (Room) this.LIZ.kv0(RoomChannel.class);
        if (room == null || room.getMosaicStatus() != 1) {
            return false;
        }
        C30868C9o.LIZJ(R.string.sve);
        C74824TYe.LJJIIZ("MosaicInterceptor");
        return true;
    }

    public C29412BgW(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
