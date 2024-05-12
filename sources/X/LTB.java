package X;

import Y.ARunnableS22S0200000_3;
import android.app.Activity;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LTB implements X8Q {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C72242sW LIZIZ;
    public final /* synthetic */ C72242sW LIZJ;

    @Override // X.X8Q
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        String str = this.LIZ;
        long j = this.LIZIZ.element;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZJ.element;
        String message = exception.getMessage();
        if (message == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFail ");
            LIZ.append(C65352Pkq.LIZ(exception.getClass()).LJFF());
            message = X1D.LIZIZ(LIZ);
        }
        LX1.LIZJ(-1, j, elapsedRealtime, str, message, false);
    }

    @Override // X.X8Q
    public final void onSuccess(Object obj) {
        boolean z;
        int i;
        String str;
        Aweme aweme;
        BaseResponse baseResponse;
        BaseResponse baseResponse2;
        LTD.LJLILLLLZI = System.currentTimeMillis();
        String str2 = this.LIZ;
        long j = this.LIZIZ.element;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZJ.element;
        if (obj != null && (obj instanceof FriendsFeedResponse) && ((BaseResponse) obj).status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = obj instanceof FriendsFeedResponse;
        if (z2 && (baseResponse2 = (BaseResponse) obj) != null) {
            i = baseResponse2.status_code;
        } else {
            i = -2;
        }
        if (!z2 || (baseResponse = (BaseResponse) obj) == null || (str = baseResponse.status_msg) == null) {
            str = "onSuccess";
        }
        LX1.LIZJ(i, j, elapsedRealtime, str2, str, z);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof InterfaceC55058LjC) && C54029LIj.LIZIZ.LJJI()) {
            C54374LVq.LJ("curActivity is IMainActivity && FriendsFeedService.isCurrentInFriendsFeed()");
            return;
        }
        if (z2) {
            FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) obj;
            LTD.LJLJJL = friendsFeedResponse;
            C53414Kxm.LJLJI.storeLong("client_read_gids_report_time", System.currentTimeMillis());
            List<FriendsFeed> list = friendsFeedResponse.friendFeedData;
            if (list != null && (!list.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                for (FriendsFeed friendsFeed : list) {
                    if (friendsFeed.getFeedType() == 1) {
                        arrayList.add(friendsFeed);
                    }
                }
                FriendsFeed friendsFeed2 = (FriendsFeed) ORZ.LJLLLLLL(0, arrayList);
                if (friendsFeed2 != null && (aweme = friendsFeed2.getAweme()) != null) {
                    C38995FSd.LIZLLL().execute(new ARunnableS22S0200000_3(LJIIIIZZ, aweme, 19));
                    return;
                }
            }
            C54374LVq.LJ("preloadVideoCover logic");
        }
    }

    public LTB(String str, C72242sW c72242sW, C72242sW c72242sW2) {
        this.LIZ = str;
        this.LIZIZ = c72242sW;
        this.LIZJ = c72242sW2;
    }
}
