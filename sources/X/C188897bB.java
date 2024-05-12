package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.now.NowPostAttributes;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188897bB {
    public static C197727pQ LIZ(Aweme aweme) {
        String str;
        long j;
        long j2;
        UrlModel urlModel;
        UrlModel urlModel2;
        long j3;
        NowPostAttributes attributes;
        Long lastPushedAtSec;
        o.LJIIIZ(aweme, "aweme");
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        int awemeType = aweme.getAwemeType();
        User author = aweme.getAuthor();
        UrlModel urlModel3 = null;
        if (author == null || (str = author.getNickname()) == null) {
            str = "";
        }
        AwemeStatistics statistics = aweme.getStatistics();
        long j4 = 0;
        if (statistics != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        AwemeStatistics statistics2 = aweme.getStatistics();
        if (statistics2 != null) {
            j2 = statistics2.getCommentCount();
        } else {
            j2 = 0;
        }
        NowPostInfo nowPostInfo = aweme.nowPostInfo;
        if (nowPostInfo != null) {
            urlModel = nowPostInfo.getFrontImageThumbnail();
        } else {
            urlModel = null;
        }
        NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
        if (nowPostInfo2 != null) {
            urlModel2 = nowPostInfo2.getBackImage();
        } else {
            urlModel2 = null;
        }
        Video video = aweme.getVideo();
        if (video != null) {
            urlModel3 = video.getCover();
        }
        long createTime = aweme.getCreateTime();
        NowPostInfo nowPostInfo3 = aweme.nowPostInfo;
        if (nowPostInfo3 != null && (lastPushedAtSec = nowPostInfo3.getLastPushedAtSec()) != null) {
            j3 = lastPushedAtSec.longValue();
        } else {
            j3 = 0;
        }
        NowPostInfo nowPostInfo4 = aweme.nowPostInfo;
        if (nowPostInfo4 != null && (attributes = nowPostInfo4.getAttributes()) != null) {
            j4 = attributes.getExpiredAt();
        }
        return new C197727pQ(aid, authorUid, awemeType, str, j, j2, urlModel, urlModel2, urlModel3, createTime, j3, j4);
    }
}
