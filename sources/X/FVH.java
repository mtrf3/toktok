package X;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FVH {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Fragment LIZ;
    public long LIZIZ;
    public volatile boolean LIZJ = FVW.LIZ.LIZ(FVU.FEED_REQ);

    public FVH(Fragment fragment) {
        this.LIZ = fragment;
    }

    public final void LIZJ(String requestMethod) {
        o.LJIIIZ(requestMethod, "requestMethod");
        this.LIZIZ = SystemClock.elapsedRealtime();
        long j = C78948Uye.LJLJI;
        long j2 = 0;
        C78948Uye.LJLJI = 0L;
        if (j > 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        String l = Long.toString(j2);
        C10K.LIZIZ(new FVG(this, C38987FRv.LIZJ(), C38987FRv.LIZIZ(), requestMethod, l), FMX.LIZIZ(), null);
    }

    public final void LIZIZ(int i, String requestMethod, FeedAppLogParams feedAppLogParams) {
        boolean z;
        FeedItemList feedItemList;
        o.LJIIIZ(requestMethod, "requestMethod");
        long j = this.LIZIZ;
        boolean z2 = this.LIZJ;
        Fragment fragment = this.LIZ;
        if (fragment != null && !fragment.getUserVisibleHint()) {
            z = true;
        } else {
            z = false;
        }
        C10K.LIZIZ(new FVI(FVW.LIZ.LIZ(FVU.FEED_FIRST_REQUEST_RESPONSE), i, SystemClock.elapsedRealtime() - C78948Uye.LJLJJI, feedAppLogParams, requestMethod, SystemClock.elapsedRealtime() - j), FMX.LIZIZ(), null);
        if (feedAppLogParams != null && (feedItemList = feedAppLogParams.mData) != null && feedItemList.isFromLocalCache) {
            return;
        }
        C10K.LIZIZ(new FVE(i, feedAppLogParams, z, SystemClock.elapsedRealtime() - j, z2, requestMethod, C38987FRv.LIZJ()), FMX.LIZIZ(), null);
    }

    public final void LIZ(int i, String requestMethod, FeedAppLogParams feedAppLogParams, Exception exc) {
        int i2;
        int i3;
        FeedItemList feedItemList;
        o.LJIIIZ(requestMethod, "requestMethod");
        boolean z = C48236IwS.LJIILLIIL;
        C48236IwS.LJIILLIIL = false;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis();
        String LIZJ = C38987FRv.LIZJ();
        String LIZIZ = C38987FRv.LIZIZ();
        if (z) {
            i2 = -1;
        } else if (this.LIZJ) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        String valueOf = String.valueOf(i2);
        if (feedAppLogParams != null && (feedItemList = feedAppLogParams.mLastFeedItemList) != null) {
            i3 = feedItemList.size();
        } else {
            i3 = 0;
        }
        C10K.LIZIZ(new FVD(this, i, feedAppLogParams, exc, elapsedRealtime, valueOf, requestMethod, LIZJ, LIZIZ, z, currentTimeMillis, i3), FMX.LIZIZ(), null);
        if (FW5.LIZIZ < 0) {
            FW5.LIZIZ = SystemClock.elapsedRealtime();
        }
        if (!z) {
            this.LIZJ = false;
        }
        if (i == 1) {
            C38989FRx.LIZ(true);
        }
    }
}
