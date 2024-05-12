package X;

import com.ss.android.ugc.aweme.services.IArticleModeLoggingService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AJ2 implements IArticleModeLoggingService {
    public static final AJ2 LIZ = new AJ2();

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickCopyLink() {
        FMX.LJIIL("click_copy_link", JBR.LJIIIIZZ("link_type", "weblink", "enter_from", "article_detail").LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickMoreAction() {
        FMX.LJIIL("click_more_action", CK3.LIZ("enter_from", "article_detail").LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logArticleDetailExit(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "exitWay");
        LIZLLL.LJIIIZ("exit_way", str);
        FMX.LJIIL("article_detail_exit", LIZLLL.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logRssFeedClick(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        FMX.LJIIL("click_rss_feed", LIZLLL.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickOpenOtherBrowser(String url, String str) {
        o.LJIIIZ(url, "url");
        C188727au c188727au = new C188727au();
        c188727au.LJI("url", url);
        if (C78857UxB.LJJJIL(str)) {
            c188727au.LJI("group_id", str);
        }
        c188727au.LJI("enter_from", "article_detail");
        FMX.LJIIL("open_other_browser", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickRetry(String url, String str) {
        o.LJIIIZ(url, "url");
        C188727au c188727au = new C188727au();
        c188727au.LJI("url", url);
        if (C78857UxB.LJJJIL(str)) {
            c188727au.LJI("group_id", str);
        }
        c188727au.LJI("enter_from", "article_detail");
        FMX.LJIIL("click_retry", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logEnterArticleDetail(C188727au eventMapBuilder, Integer num) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (num != null) {
            eventMapBuilder.LIZLLL(num.intValue(), "pic_cnt");
        }
        FMX.LJIIL("enter_article_detail", eventMapBuilder.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logMultiAnchorStayTime(C188727au eventMapBuilder, long j) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (j < 0) {
            return;
        }
        eventMapBuilder.LJ(j, "duration");
        FMX.LJIIL("multi_anchor_stay_time", eventMapBuilder.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logArticleDetailStaytime(C188727au eventMapBuilder, Integer num, Long l) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (num != null) {
            eventMapBuilder.LIZLLL(num.intValue(), "pic_cnt");
        }
        if (l != null) {
            l.longValue();
            eventMapBuilder.LJ(l.longValue(), "duration");
        }
        FMX.LJIIL("article_detail_staytime", eventMapBuilder.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickReport(String str, Integer num, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(150, "aweme_type");
        c188727au.LJI("request_id", str);
        c188727au.LJI("enter_method", "click_more_button");
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "pic_cnt");
        }
        if (C78857UxB.LJJJIL(str2)) {
            c188727au.LJI("author_id", str2);
        }
        if (C78857UxB.LJJJIL(str3)) {
            c188727au.LJI("photo_content_type", str3);
        }
        c188727au.LJI("enter_from", "article_detail");
        FMX.LJIIL("click_report", c188727au.LIZ);
    }
}
