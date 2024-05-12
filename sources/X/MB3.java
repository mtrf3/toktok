package X;

import com.ss.android.ugc.aweme.search.TrendingEventModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MB3 {
    public static String LIZ = "";

    public static void LIZLLL() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LIZ);
        c188727au.LJIIIZ("shoot_way", "trends_publish_entry");
        c188727au.LJIIIZ("shoot_entrance", "trends_publish_entry");
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r0 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.os.Bundle r5) {
        /*
            r2 = 0
            java.lang.String r4 = "enter_from"
            if (r5 == 0) goto L60
            java.lang.String r1 = r5.getString(r4)
        L9:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L16
        L11:
            java.lang.String r0 = "trending_inflow_page"
        L13:
            X.MB3.LIZ = r0
            return
        L16:
            if (r5 == 0) goto L27
            java.lang.String r1 = r5.getString(r4)
        L1c:
            java.lang.String r0 = "trending_publisher_notification"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "trends_creator_spotlight"
            goto L13
        L27:
            r1 = r2
            goto L1c
        L29:
            if (r5 == 0) goto L31
            java.lang.String r0 = "is_from_trending_card"
            java.lang.String r2 = r5.getString(r0)
        L31:
            boolean r0 = X.C78685UuP.LJJJZ(r2)
            if (r0 == 0) goto L3a
            java.lang.String r0 = "general_search"
            goto L13
        L3a:
            r3 = 0
            java.lang.String r2 = "_trends"
            if (r5 == 0) goto L11
            java.lang.String r0 = r5.getString(r4)
            if (r0 == 0) goto L59
            boolean r1 = ujb.s.LJJJLZIJ(r0, r2, r3)
            r0 = 1
            if (r1 != r0) goto L59
            java.lang.String r1 = r5.getString(r4)
            java.lang.String r0 = ""
            if (r1 == 0) goto L13
            java.lang.String r0 = ujb.o.LJJJJZ(r1, r2, r0, r3)
            goto L13
        L59:
            java.lang.String r0 = r5.getString(r4)
            if (r0 != 0) goto L13
            goto L11
        L60:
            r1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB3.LIZ(android.os.Bundle):void");
    }

    public static void LIZIZ(String str, TrendingEventModel model) {
        o.LJIIIZ(model, "model");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LIZ);
        c188727au.LJIIIZ("trending_entrance", str);
        LJ(c188727au, str, model, null);
        FMX.LJIIL("trending_inflow_topic_show", c188727au.LIZ);
    }

    public static void LIZJ(String str, String itemText, int i, M89 param) {
        o.LJIIIZ(itemText, "itemText");
        o.LJIIIZ(param, "param");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_id", param.getSearchId());
        c188727au.LJIIIZ("search_keyword", param.getSearchKeyword());
        c188727au.LJIIIZ("search_result_id", param.getSearchResultId());
        c188727au.LJIIIZ("search_position", str);
        c188727au.LJIIIZ("words_content", itemText);
        c188727au.LJIIIZ("words_source", "trending_page_click_more");
        c188727au.LIZLLL(i, "words_position");
        if (C78685UuP.LJJJZ(param.isFromTrendingCard())) {
            c188727au.LJI("is_from_trending_card", param.isFromTrendingCard());
        }
        FMX.LJIIL("trending_words_show", c188727au.LIZ);
    }

    public static void LJ(C188727au c188727au, String str, TrendingEventModel trendingEventModel, String str2) {
        if (str != null) {
            c188727au.LJI("trending_entrance", str);
        }
        if (trendingEventModel == null) {
            return;
        }
        c188727au.LJI("trending_topic", trendingEventModel.getTrendingName());
        c188727au.LJI("trending_topic_id", trendingEventModel.getEventId());
        java.util.Map<String, String> extraMap = trendingEventModel.getExtraMap();
        c188727au.LJI("trending_topic_source", String.valueOf(extraMap.get("trending_topic_source")));
        if (!C56424MCm.LIZ()) {
            c188727au.LJI("topic_rank", String.valueOf(extraMap.get("topic_rank")));
        }
        c188727au.LJI("topic_group_rank", String.valueOf(extraMap.get("topic_group_rank")));
        c188727au.LJI("topic_group_num", String.valueOf(extraMap.get("topic_group_num")));
        if (str2 != null) {
            c188727au.LJI("from_group_id", str2);
        }
    }
}
