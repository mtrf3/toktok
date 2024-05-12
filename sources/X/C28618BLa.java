package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BLa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28618BLa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C28619BLb feedData) {
        List<FeedItem> list;
        o.LJIIIZ(feedData, "feedData");
        if (!C32151Nz.LJJIIJZLJL(feedData.LIZ) && feedData.LIZIZ != null && (list = feedData.LIZ) != null) {
            for (FeedItem feedItem : list) {
                FeedExtra feedExtra = feedData.LIZIZ;
                m mVar = null;
                if (feedExtra != null && feedExtra.LIZ() != null) {
                    FeedExtra feedExtra2 = feedData.LIZIZ;
                    if (feedExtra2 != null) {
                        mVar = feedExtra2.LIZ();
                    }
                    feedItem.logPb = String.valueOf(mVar);
                }
            }
        }
    }

    public static void LIZIZ(FeedItem feedItem) {
        if (feedItem != null) {
            int i = feedItem.type;
            if (i == 1 || i == 2) {
                BLG blg = feedItem.item;
                if (blg instanceof Room) {
                    o.LJII(blg, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                    Room room = (Room) blg;
                    room.setLog_pb(feedItem.logPb);
                    if (room.getOwner() != null) {
                        room.getOwner().setLogPb(feedItem.logPb);
                    }
                    room.setRequestId(feedItem.resId);
                }
            }
        }
    }

    public static void LIZJ(List list) {
        if (C32151Nz.LJJIIJZLJL(list)) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            FeedItem feedItem = (FeedItem) it.next();
            if (feedItem.item == null) {
                try {
                    feedItem.item = feedItem.getRoom();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }
}
