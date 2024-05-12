package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JIW {
    public static final boolean LIZJ(String str, String str2) {
        if (TextUtils.equals(str, "general_search") || (TextUtils.equals(str2, "general_search") && TextUtils.equals(str, "playlist"))) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(String str, String str2, String str3) {
        if (LIZJ(str2, str3) || TextUtils.equals(str2, "search_result")) {
            return false;
        }
        return TextUtils.equals(str, "app_outside");
    }

    public static final void LIZ(String str, M89 m89, Aweme aweme, JHL<?> jhl) {
        java.util.Map<String, String> hashMap;
        String str2;
        if (m89.getExtra() == null) {
            return;
        }
        java.util.Map<String, String> extra = m89.getExtra();
        if (aweme != null) {
            hashMap = aweme.getSearchExtraParams();
        } else {
            hashMap = new HashMap<>();
        }
        if (hashMap != null && hashMap.containsKey("token_type")) {
            str2 = hashMap.get("token_type");
        } else {
            str2 = "";
        }
        if (extra.containsKey("token_type") && (!SearchServiceImpl.LLLZI().LLLLLLL() || !o.LJ("tt_trendingcontent", extra.get("token_type")) || o.LJ("tt_trendingcontent", str2))) {
            jhl.LIZLLL("token_type", extra.get("token_type"));
        }
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            jhl.LIZLLL("aweme_id", aweme.getAid());
        }
        String previousPageWithPlaylistScene = m89.getPreviousPageWithPlaylistScene();
        if (TextUtils.isEmpty(previousPageWithPlaylistScene)) {
            previousPageWithPlaylistScene = m89.getShootEnterFrom();
        }
        jhl.LJIJJLI(Z9N.LIZIZ.LLJLLIL(str, previousPageWithPlaylistScene));
    }

    public static final void LIZIZ(Context context, Aweme aweme, JHL<?> jhl, boolean z) {
        if (aweme == null || !z) {
            return;
        }
        HashMap hashMap = new HashMap();
        java.util.Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
        if (searchExtraParams != null) {
            if (searchExtraParams.containsKey("search_result_id")) {
                hashMap.put("search_result_id", searchExtraParams.get("search_result_id"));
            }
            if (searchExtraParams.containsKey("token_type")) {
                hashMap.put("token_type", searchExtraParams.get("token_type"));
            }
            if (aweme.getSearchFeedType() != null && o.LJ("search_aggregated_video", aweme.getSearchFeedType()) && searchExtraParams.containsKey("item_rank")) {
                hashMap.put("item_rank", searchExtraParams.get("item_rank"));
            }
        }
        jhl.LIZ(hashMap);
        jhl.LIZ(Z9N.LIZIZ.LJJIFFI().LIZIZ(aweme));
        if (TextUtils.equals(jhl.LIZ, "video_play")) {
            if (C224248r6.LIZ(context)) {
                C224298rB.LJLILLLLZI = aweme.getAid();
                jhl.LIZLLL("is_inflow_filter", "1");
                return;
            } else {
                C224298rB.LJLILLLLZI = null;
                jhl.LIZLLL("is_inflow_filter", CardStruct.IStatusCode.DEFAULT);
                return;
            }
        }
        if (TextUtils.equals(C224298rB.LJLILLLLZI, aweme.getAid())) {
            jhl.LIZLLL("is_inflow_filter", "1");
        } else {
            jhl.LIZLLL("is_inflow_filter", CardStruct.IStatusCode.DEFAULT);
        }
    }
}
