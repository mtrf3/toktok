package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.service.FriendsTabDebugRequestParams;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.ss.android.ugc.aweme.service.Response;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.LVq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54374LVq {
    public static int LIZJ() {
        if (C35971E9v.LIZ() && o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE)) {
            return 1;
        }
        return 0;
    }

    public static void LJ(String scene) {
        o.LJIIIZ(scene, "scene");
        PowerPreloadServiceImpl.LIZIZ().LIZ("/tiktok/v1/friend/friend_feed", null);
        LTD.LJLILLLLZI = 0L;
    }

    public static void LIZ(FriendsFeedResponse friendsFeedResponse, String str) {
        int i;
        String str2;
        FriendsFeed friendsFeed;
        Aweme aweme;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            List list = (List) C75792yF.LIZIZ().LJII(str, new C54376LVs().getType());
            List<FriendsFeed> list2 = friendsFeedResponse.friendFeedData;
            if (list2 != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            if (list.size() <= i) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    for (int i3 = 0; i3 < i; i3++) {
                        List<FriendsFeed> list3 = friendsFeedResponse.friendFeedData;
                        if (list3 != null && (friendsFeed = (FriendsFeed) ORZ.LJLLLLLL(i3, list3)) != null && (aweme = friendsFeed.getAweme()) != null) {
                            str2 = aweme.getAid();
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(str2, ListProtector.get(list, i2))) {
                            if (i3 == -1) {
                                return;
                            }
                            List<FriendsFeed> list4 = friendsFeedResponse.friendFeedData;
                            if (list4 != null) {
                                FriendsFeed friendsFeed2 = (FriendsFeed) ListProtector.get(list4, i2);
                                FriendsFeed friendsFeed3 = (FriendsFeed) ListProtector.get(list4, i3);
                                List<FriendsFeed> list5 = friendsFeedResponse.friendFeedData;
                                if (list5 != null) {
                                }
                                List<FriendsFeed> list6 = friendsFeedResponse.friendFeedData;
                                if (list6 != null) {
                                }
                            }
                        }
                    }
                    return;
                }
            }
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "adjustRespOrderWithAwemeIds");
        }
    }

    public static void LIZLLL(String scene, String awemeIds) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(awemeIds, "awemeIds");
        PowerPreloadServiceImpl.LIZIZ().LIZ("/tiktok/v1/friend/friend_feed", null);
        LTD.LJLILLLLZI = 0L;
        C72242sW c72242sW = new C72242sW();
        C72242sW c72242sW2 = new C72242sW();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c72242sW.element = elapsedRealtime;
        c72242sW2.element = elapsedRealtime - C56662Kg.LIZ().LJIIJJI;
        C84340X8e c84340X8e = C84339X8d.LIZJ;
        LTC ltc = new LTC(c72242sW, scene, awemeIds, c72242sW2);
        c84340X8e.getClass();
        C84340X8e.LIZIZ(ltc);
    }

    public static void LJFF(FriendsFeedResponse friendsFeedResponse, int i, int i2, List list, List list2, String str, String str2) {
        IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        if (iFriendsTabDebugService != null) {
            iFriendsTabDebugService.LIZLLL(new FriendsTabDebugRequestParams(str2, i, i2, list, list2, str));
        }
        Context context = null;
        FriendsFeedResponse LJI = FriendsFeedResponse.LJI(friendsFeedResponse, null, 255);
        IFriendsTabDebugService iFriendsTabDebugService2 = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        if (iFriendsTabDebugService2 != null) {
            iFriendsTabDebugService2.LJI(new Response(LJI.source, LJI.hasMore, null, LJI.lastViewItemId, LJI.pageToken, LJI.preload, LJI.LJLIL));
        }
        List<FriendsFeed> list3 = LJI.friendFeedData;
        if (list3 != null) {
            ((IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class)).LJFF(list3);
        }
        IFriendsTabDebugService iFriendsTabDebugService3 = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        AwemeHostApplication LIZ = FKM.LIZ();
        if (LIZ != null) {
            context = C16880lQ.LLLLJI(LIZ);
        }
        o.LJI(context);
        iFriendsTabDebugService3.LIZIZ(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0149, code lost:
    
        LIZ(r7, r41);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[Catch: ExecutionException -> 0x0150, LOOP:0: B:13:0x005e->B:15:0x0064, LOOP_END, TryCatch #1 {ExecutionException -> 0x0150, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0020, B:8:0x002d, B:12:0x0043, B:13:0x005e, B:15:0x0064, B:17:0x0070, B:20:0x0086, B:50:0x003d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[Catch: ExecutionException -> 0x0150, TRY_LEAVE, TryCatch #1 {ExecutionException -> 0x0150, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0020, B:8:0x002d, B:12:0x0043, B:13:0x005e, B:15:0x0064, B:17:0x0070, B:20:0x0086, B:50:0x003d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df A[Catch: ExecutionException -> 0x014d, TryCatch #0 {ExecutionException -> 0x014d, blocks: (B:21:0x00c9, B:22:0x00db, B:24:0x00df, B:47:0x009a), top: B:18:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108 A[Catch: ExecutionException -> 0x0152, TryCatch #2 {ExecutionException -> 0x0152, blocks: (B:27:0x00f0, B:28:0x0100, B:30:0x0108, B:31:0x010d, B:33:0x012f, B:36:0x0136, B:38:0x0149), top: B:26:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[Catch: ExecutionException -> 0x014d, TRY_ENTER, TryCatch #0 {ExecutionException -> 0x014d, blocks: (B:21:0x00c9, B:22:0x00db, B:24:0x00df, B:47:0x009a), top: B:18:0x0084 }] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List, X.MBA, X.2kd, X.XKY] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse LIZIZ(int r39, int r40, java.lang.String r41, java.util.List r42, java.util.List r43, java.util.List r44, java.util.List r45, java.lang.String r46, java.lang.String r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54374LVq.LIZIZ(int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, boolean):com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse");
    }
}
