package X;

import android.app.Activity;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LWI implements X8Q {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.X8Q
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        Long valueOf = Long.valueOf(this.LIZ);
        Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - this.LIZIZ);
        String message = exception.getMessage();
        if (message == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFail ");
            LIZ.append(C65352Pkq.LIZ(exception.getClass()).LJFF());
            message = X1D.LIZIZ(LIZ);
        }
        C54492La4.LIZ(valueOf, valueOf2, false, -1, message);
    }

    @Override // X.X8Q
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse;
        boolean z;
        int i;
        String str;
        Aweme aweme;
        BaseResponse baseResponse2;
        BaseResponse baseResponse3;
        Long valueOf = Long.valueOf(this.LIZ);
        Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - this.LIZIZ);
        boolean z2 = obj instanceof FollowFeedList;
        FollowFeed followFeed = null;
        if (z2) {
            baseResponse = (BaseResponse) obj;
        } else {
            baseResponse = null;
        }
        if (baseResponse != null && baseResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && (baseResponse3 = (BaseResponse) obj) != null) {
            i = baseResponse3.status_code;
        } else {
            i = -1;
        }
        if (!z2 || (baseResponse2 = (BaseResponse) obj) == null || (str = baseResponse2.status_msg) == null) {
            str = "onSuccess";
        }
        C54492La4.LIZ(valueOf, valueOf2, z, i, str);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
            if (LWM.LIZIZ.LIZ.LJII((ActivityC45651qj) LJIIIIZZ)) {
                LW9.LIZJ("curActivity is IMainActivity && FollowFeedService.isCurrentInFollowingFeed()");
                return;
            }
        }
        if (z2) {
            FollowFeedList followFeedList = (FollowFeedList) obj;
            followFeedList.setPreloadData(1);
            List<FollowFeed> items = followFeedList.getItems();
            if (items != null) {
                Iterator<FollowFeed> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    FollowFeed next = it.next();
                    if (next.getFeedType() == 65280) {
                        followFeed = next;
                        break;
                    }
                }
                FollowFeed followFeed2 = followFeed;
                if (followFeed2 != null && (aweme = followFeed2.getAweme()) != null) {
                    C46364IHo.LIZIZ(aweme);
                    C46728IVo.LJIIL(819200, aweme);
                    return;
                }
            }
            LW9.LIZJ("preloadVideoCover logic");
        }
    }

    public LWI(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
