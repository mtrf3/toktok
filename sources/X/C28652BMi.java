package X;

import android.util.SparseLongArray;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.BMi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28652BMi {
    public static final SparseLongArray LIZ = new SparseLongArray();
    public static final SparseLongArray LIZIZ = new SparseLongArray();
    public static int LIZJ;
    public static long LIZLLL;
    public static long LJ;

    public static int LIZIZ(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null) {
                return roomAuthStatus.getGiftRankSwitchStatus();
            }
        } else {
            Long l = (Long) DataChannelGlobal.LJLJJI.mv0(C29025BaH.class);
            if (l != null) {
                return (int) l.longValue();
            }
        }
        return -1;
    }

    public static void LIZJ(int i) {
        BJL bjl;
        BM1.LIZJ = i;
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s != null && (bjl = c28246B6s.LJFF) != null) {
            bjl.LJJIIJZLJL = i;
        }
        LIZJ = i;
    }

    public static long LIZ(int i, boolean z) {
        if (!z) {
            SparseLongArray sparseLongArray = LIZ;
            if (sparseLongArray.indexOfKey(i) >= 0) {
                return sparseLongArray.get(i);
            }
        } else {
            SparseLongArray sparseLongArray2 = LIZIZ;
            if (sparseLongArray2.indexOfKey(i) >= 0) {
                return sparseLongArray2.get(i);
            }
        }
        return -1L;
    }

    public static void LIZLLL(int i, long j, boolean z) {
        if (i >= 0) {
            if (!z) {
                LIZ.put(i, j);
            } else {
                LIZIZ.put(i, j);
            }
        }
    }
}
