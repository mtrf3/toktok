package X;

import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.LVz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54383LVz {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(LW6.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(LW2.LJLIL);
    public static final XI8 LIZJ;

    public static LW0 LIZ() {
        Object obj;
        Integer num;
        FriendsFeedResponse friendsFeedResponse;
        List<FriendsFeed> list;
        try {
            String uid = ((RBX) HG3.LJIILL()).getCurUserId();
            LW5 lw5 = (LW5) LIZ.getValue();
            o.LJIIIIZZ(uid, "uid");
            obj = ORZ.LJLLLL(lw5.LIZ(uid));
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("cached friends feed size = ");
                LW0 lw0 = (LW0) obj;
                if (lw0 != null && (friendsFeedResponse = lw0.LIZIZ) != null && (list = friendsFeedResponse.friendFeedData) != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                LIZ2.append(num);
                LIZ2.append(", createdTimeMillis = ");
                LW0 lw02 = (LW0) obj;
                LIZ2.append(lw02 != null ? Long.valueOf(lw02.LIZJ) : null);
                C3C5.m7constructorimpl(Integer.valueOf(android.util.Log.d("FriendsFeedCache", X1D.LIZIZ(LIZ2))));
            } catch (Throwable th) {
                th = th;
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return (LW0) obj;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
        return (LW0) obj;
    }

    static {
        ExecutorService LIZLLL = C38995FSd.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
        LIZJ = new XI8(LIZLLL);
    }
}
