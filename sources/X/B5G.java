package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B5G {
    public static LinkCrossRoomDataHolder LIZIZ() {
        long j;
        if (LinkCrossRoomDataHolder.LJLILLLLZI == null) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            LinkCrossRoomDataHolder.LJLILLLLZI = new LinkCrossRoomDataHolder(j, null);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLILLLLZI;
        o.LJI(linkCrossRoomDataHolder);
        return linkCrossRoomDataHolder;
    }

    public static void LIZJ(long j, String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLILLLLZI;
        if (linkCrossRoomDataHolder != null && linkCrossRoomDataHolder.LIZ == j) {
            linkCrossRoomDataHolder.LJII(str);
            LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLILLLLZI;
            if (linkCrossRoomDataHolder2 != null) {
                linkCrossRoomDataHolder2.LIZIZ = null;
            }
            LinkCrossRoomDataHolder.LJLILLLLZI = null;
        }
    }

    public static LinkCrossRoomDataHolder LIZ(long j, DataChannel dataChannel, String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLILLLLZI;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJII(str);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLILLLLZI;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LIZIZ = null;
        }
        LinkCrossRoomDataHolder.LJLILLLLZI = null;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder3 = new LinkCrossRoomDataHolder(j, dataChannel);
        LinkCrossRoomDataHolder.LJLILLLLZI = linkCrossRoomDataHolder3;
        return linkCrossRoomDataHolder3;
    }
}
