package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import kotlin.jvm.internal.o;

/* renamed from: X.S1n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71427S1n {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(AwemeStatisticsBackup awemeStatisticsBackup, int i) {
        if (awemeStatisticsBackup == null) {
            return;
        }
        String aid = awemeStatisticsBackup.getAid();
        Aweme i6 = AwemeService.LIZ().i6(aid);
        if (i6 == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("FeedBackupHelper find that aweme is null!");
            LIZ2.append(aid);
            C36922EeM.LIZLLL(4, "FeedBackupHelper", X1D.LIZIZ(LIZ2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("FeedBackupHelper start to update this aweme:");
        LIZ3.append(awemeStatisticsBackup);
        C36922EeM.LIZLLL(4, "FeedBackupHelper", X1D.LIZIZ(LIZ3));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else {
                if (i6.getStatistics() == null) {
                    i6.setStatistics(new AwemeStatistics());
                }
                Long commentCount = awemeStatisticsBackup.getCommentCount();
                o.LJI(commentCount);
                if (commentCount.longValue() <= 0) {
                    return;
                }
                i6.getStatistics().setAid(aid);
                AwemeStatistics statistics = i6.getStatistics();
                Long commentCount2 = awemeStatisticsBackup.getCommentCount();
                o.LJI(commentCount2);
                statistics.setCommentCount(commentCount2.longValue());
                return;
            }
        }
        if (i6.getStatistics() == null) {
            i6.setStatistics(new AwemeStatistics());
        }
        AwemeStatistics statistics2 = i6.getStatistics();
        if (statistics2 == null) {
            return;
        }
        statistics2.setAid(awemeStatisticsBackup.getAid());
        Long commentCount3 = awemeStatisticsBackup.getCommentCount();
        o.LJI(commentCount3);
        if (commentCount3.longValue() > 0) {
            Long commentCount4 = awemeStatisticsBackup.getCommentCount();
            o.LJI(commentCount4);
            statistics2.setCommentCount(commentCount4.longValue());
        }
        Long diggCount = awemeStatisticsBackup.getDiggCount();
        o.LJI(diggCount);
        if (diggCount.longValue() > 0) {
            Long diggCount2 = awemeStatisticsBackup.getDiggCount();
            o.LJI(diggCount2);
            statistics2.setDiggCount(diggCount2.longValue());
        }
        Long playCount = awemeStatisticsBackup.getPlayCount();
        o.LJI(playCount);
        if (playCount.longValue() > 0) {
            Long playCount2 = awemeStatisticsBackup.getPlayCount();
            o.LJI(playCount2);
            statistics2.setPlayCount(playCount2.longValue());
        }
        Long downloadCount = awemeStatisticsBackup.getDownloadCount();
        o.LJI(downloadCount);
        if (downloadCount.longValue() > 0) {
            Long downloadCount2 = awemeStatisticsBackup.getDownloadCount();
            o.LJI(downloadCount2);
            statistics2.setDownloadCount(downloadCount2.longValue());
        }
        Long shareCount = awemeStatisticsBackup.getShareCount();
        o.LJI(shareCount);
        if (shareCount.longValue() > 0) {
            Long shareCount2 = awemeStatisticsBackup.getShareCount();
            o.LJI(shareCount2);
            statistics2.setShareCount(shareCount2.longValue());
        }
        Long forwardCount = awemeStatisticsBackup.getForwardCount();
        o.LJI(forwardCount);
        if (forwardCount.longValue() <= 0) {
            return;
        }
        Long forwardCount2 = awemeStatisticsBackup.getForwardCount();
        o.LJI(forwardCount2);
        statistics2.setForwardCount(forwardCount2.longValue());
    }
}
