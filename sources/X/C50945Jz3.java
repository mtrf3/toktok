package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Jz3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50945Jz3 {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZJ(String str) {
        if (!o.LJ(str, CardStruct.IStatusCode.DEFAULT) && str != null) {
            try {
                Long valueOf = Long.valueOf(CastLongProtector.parseLong(str));
                if (valueOf != null) {
                    return valueOf.longValue();
                }
            } catch (NumberFormatException unused) {
            }
        }
        Long l = C50641Ju9.LIZ;
        if (l != null && l.longValue() > 0) {
            return l.longValue();
        }
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:651:0x0703, code lost:
    
        if (r2 == null) goto L386;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C50652JuK LIZ(android.net.Uri r66, X.C50947Jz5 r67) {
        /*
            Method dump skipped, instructions count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50945Jz3.LIZ(android.net.Uri, X.Jz5):X.JuK");
    }

    public static void LIZIZ(android.net.Uri uri, SearchResultParam searchResultParam) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        int i;
        String queryParameter10;
        String queryParameter11;
        Integer LJJIL;
        String queryParameter12;
        String queryParameter13;
        String queryParameter14;
        String queryParameter15;
        String queryParameter16;
        String queryParameter17;
        String queryParameter18;
        String queryParameter19;
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        searchResultParam.setFilterOption(new C50287JoR());
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return;
        }
        for (String str : queryParameterNames) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1841902086:
                        if (str.equals("is_filter_search") && (queryParameter19 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.getFilterOption().setDefaultOption(o.LJ(CardStruct.IStatusCode.DEFAULT, queryParameter19));
                            break;
                        }
                        break;
                    case -1780004746:
                        if (str.equals("pre_search_id") && (queryParameter18 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setLastSearchId(queryParameter18);
                            break;
                        }
                        break;
                    case -1414420479:
                        if (str.equals("is_feed_liked")) {
                            searchResultParam.setFeedLiked(uri.getBooleanQueryParameter(str, false));
                            break;
                        } else {
                            break;
                        }
                    case -1300961562:
                        if (str.equals("preClickImprId") && (queryParameter17 = UriProtector.getQueryParameter(uri, str)) != null) {
                            new C50699Jv5().LJII(queryParameter17);
                            break;
                        }
                        break;
                    case -814408215:
                        if (str.equals("keyword") && (queryParameter16 = UriProtector.getQueryParameter(uri, str)) != null) {
                            if (!queryParameterNames.contains("display_keyword")) {
                                searchResultParam.setKeyword(queryParameter16);
                                break;
                            } else {
                                String queryParameter20 = UriProtector.getQueryParameter(uri, "display_keyword");
                                if (!TextUtils.isEmpty(queryParameter20)) {
                                    queryParameter16 = queryParameter20;
                                }
                                searchResultParam.setKeyword(queryParameter16);
                                break;
                            }
                        }
                        break;
                    case -685906904:
                        if (str.equals("enter_method") && (queryParameter15 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setEnterMethod(queryParameter15);
                            break;
                        }
                        break;
                    case -539642911:
                        if (str.equals("search_from") && (queryParameter14 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setSearchFrom(queryParameter14);
                            break;
                        }
                        break;
                    case -452763237:
                        if (str.equals("is_feed_comment_clicked")) {
                            searchResultParam.setFeedCommentClicked(uri.getBooleanQueryParameter(str, false));
                            break;
                        } else {
                            break;
                        }
                    case -429654716:
                        if (str.equals("event_keyword") && (queryParameter13 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setEventKeyword(queryParameter13);
                            break;
                        }
                        break;
                    case -346952694:
                        if (str.equals("switch_tab") && (queryParameter12 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setSwitchTab(queryParameter12);
                            break;
                        }
                        break;
                    case -11918021:
                        if (str.equals("sort_type") && (queryParameter11 = UriProtector.getQueryParameter(uri, str)) != null && (LJJIL = C38350F3i.LJJIL(queryParameter11)) != null) {
                            searchResultParam.getFilterOption().setSortType(LJJIL.intValue());
                            break;
                        }
                        break;
                    case 3151786:
                        if (str.equals("from") && (queryParameter10 = UriProtector.getQueryParameter(uri, str)) != null && queryParameter10.hashCode() == 3452698 && queryParameter10.equals("push")) {
                            searchResultParam.setSearchFrom("push");
                            break;
                        }
                        break;
                    case 96506544:
                        if (str.equals("avoid_record_history") && (queryParameter9 = UriProtector.getQueryParameter(uri, str)) != null) {
                            Integer LJJIL2 = C38350F3i.LJJIL(queryParameter9);
                            if (LJJIL2 != null && LJJIL2.intValue() == 1) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            searchResultParam.setShouldRecordInHistory(i);
                            break;
                        }
                        break;
                    case 506361563:
                        if (str.equals("group_id") && (queryParameter8 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setGroupId(queryParameter8);
                            break;
                        }
                        break;
                    case 516669515:
                        if (str.equals("trending_words_id") && (queryParameter7 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setTrendingWordsId(queryParameter7);
                            break;
                        }
                        break;
                    case 560021505:
                        if (str.equals("is_feed_forward_clicked")) {
                            searchResultParam.setFeedForwardClicked(uri.getBooleanQueryParameter(str, false));
                            break;
                        } else {
                            break;
                        }
                    case 614458781:
                        if (str.equals("is_feed_collected")) {
                            searchResultParam.setFeedCollected(uri.getBooleanQueryParameter(str, false));
                            break;
                        } else {
                            break;
                        }
                    case 765499066:
                        if (str.equals("trending_event_id") && (queryParameter6 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setTrendingEventId(queryParameter6);
                            break;
                        }
                        break;
                    case 1273999649:
                        if (str.equals("capsule_word_list") && (queryParameter5 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setCapsuleWords(new C208398Fv(queryParameter5, null, 2, null));
                            searchResultParam.setKeyword(searchResultParam.getCapsuleWords().getKeyWord());
                            break;
                        }
                        break;
                    case 1467317682:
                        if (str.equals("enter_from_sub") && (queryParameter4 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setEnterFromSub(queryParameter4);
                            break;
                        }
                        break;
                    case 1592562286:
                        if (str.equals("hashtag_id") && (queryParameter3 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setHashtagId(queryParameter3);
                            break;
                        }
                        break;
                    case 2001337335:
                        if (str.equals("from_search_subtab") && (queryParameter2 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setFromSearchSubtag(queryParameter2);
                            break;
                        }
                        break;
                    case 2071166924:
                        if (str.equals("utm_source") && (queryParameter = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setUtmSource(queryParameter);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
