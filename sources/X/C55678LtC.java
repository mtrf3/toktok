package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.LtC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55678LtC {
    public final C55679LtD LIZ = new C55679LtD();
    public final C36821Ecj<Long> LIZIZ;
    public volatile long LIZJ;
    public int LIZLLL;

    public final long LIZ() {
        return Math.max(0L, this.LIZJ);
    }

    public C55678LtC() {
        C36821Ecj<Long> lastFeedCount = SharePrefCache.inst().getLastFeedCount();
        this.LIZIZ = lastFeedCount;
        this.LIZJ = lastFeedCount.LIZ().longValue();
        EventBus.LIZJ().LJIILJJIL(this);
        SharePrefCache.inst().getLastFeedTime().LIZ().longValue();
    }

    public final void LIZIZ(FeedItemList feedItemList) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.LIZ.LIZ(currentTimeMillis)) {
                this.LIZJ = -1L;
                this.LIZIZ.LIZLLL(Long.valueOf(this.LIZJ));
            }
            this.LIZJ++;
            this.LIZIZ.LIZLLL(Long.valueOf(this.LIZJ));
            this.LIZ.LIZJ(currentTimeMillis);
            long j = this.LIZJ;
            if (feedItemList != null && feedItemList.getItems() != null) {
                Iterator<Aweme> it = feedItemList.getItems().iterator();
                while (it.hasNext()) {
                    it.next().setFeedCount(j);
                }
            }
            this.LIZLLL++;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @QD3(sticky = true)
    public void onQueryUserFinishedEvent(C40531FvT c40531FvT) {
        AwemeService.LIZ().h6();
        this.LIZJ = -1L;
        this.LIZIZ.LIZLLL(Long.valueOf(this.LIZJ));
    }
}
