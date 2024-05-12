package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Jz4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50946Jz4 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ() {
        Serializable serializable;
        Intent intent;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (intent = LJIIIIZZ.getIntent()) != null) {
            serializable = intent.getSerializableExtra("search_enter_param");
        } else {
            serializable = null;
        }
        C50948Jz6 c50948Jz6 = (C50948Jz6) serializable;
        if (c50948Jz6 == null) {
            return null;
        }
        String trafficSourceList = c50948Jz6.getTrafficSourceList();
        if (trafficSourceList == null) {
            return "[]";
        }
        return trafficSourceList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x025f, code lost:
    
        if (r4.equals("hint_imp_id") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02cc, code lost:
    
        r5 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r68, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d0, code lost:
    
        if (r5 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d2, code lost:
    
        r69.LJIIZILJ.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x027d, code lost:
    
        if (r4.equals("hint_group_id") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02c8, code lost:
    
        if (r4.equals("hint_position") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06a3, code lost:
    
        if (r3 == null) goto L372;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C50652JuK LIZ(android.net.Uri r68, X.C50947Jz5 r69) {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50946Jz4.LIZ(android.net.Uri, X.Jz5):X.JuK");
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
        int i;
        String queryParameter9;
        String queryParameter10;
        Integer LJJIL;
        String queryParameter11;
        String queryParameter12;
        String queryParameter13;
        String queryParameter14;
        String queryParameter15;
        String queryParameter16;
        String queryParameter17;
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        searchResultParam.setFilterOption(new C50287JoR());
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return;
        }
        for (String str : queryParameterNames) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1841902086:
                        if (str.equals("is_filter_search") && (queryParameter17 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.getFilterOption().setDefaultOption(o.LJ(CardStruct.IStatusCode.DEFAULT, queryParameter17));
                            break;
                        }
                        break;
                    case -1780004746:
                        if (str.equals("pre_search_id") && (queryParameter16 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setLastSearchId(queryParameter16);
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
                    case -814408215:
                        if (str.equals("keyword") && (queryParameter15 = UriProtector.getQueryParameter(uri, str)) != null) {
                            if (!queryParameterNames.contains("display_keyword")) {
                                searchResultParam.setKeyword(queryParameter15);
                                break;
                            } else {
                                String queryParameter18 = UriProtector.getQueryParameter(uri, "display_keyword");
                                if (!TextUtils.isEmpty(queryParameter18)) {
                                    queryParameter15 = queryParameter18;
                                }
                                searchResultParam.setKeyword(queryParameter15);
                                break;
                            }
                        }
                        break;
                    case -685906904:
                        if (str.equals("enter_method") && (queryParameter14 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setEnterMethod(queryParameter14);
                            break;
                        }
                        break;
                    case -539642911:
                        if (str.equals("search_from") && (queryParameter13 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setSearchFrom(queryParameter13);
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
                        if (str.equals("event_keyword") && (queryParameter12 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setEventKeyword(queryParameter12);
                            break;
                        }
                        break;
                    case -346952694:
                        if (str.equals("switch_tab") && (queryParameter11 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setSwitchTab(queryParameter11);
                            break;
                        }
                        break;
                    case -11918021:
                        if (str.equals("sort_type") && (queryParameter10 = UriProtector.getQueryParameter(uri, str)) != null && (LJJIL = C38350F3i.LJJIL(queryParameter10)) != null) {
                            searchResultParam.getFilterOption().setSortType(LJJIL.intValue());
                            break;
                        }
                        break;
                    case 3151786:
                        if (str.equals("from") && (queryParameter9 = UriProtector.getQueryParameter(uri, str)) != null && queryParameter9.hashCode() == 3452698 && queryParameter9.equals("push")) {
                            searchResultParam.setSearchFrom("push");
                            break;
                        }
                        break;
                    case 96506544:
                        if (str.equals("avoid_record_history") && (queryParameter8 = UriProtector.getQueryParameter(uri, str)) != null) {
                            Integer LJJIL2 = C38350F3i.LJJIL(queryParameter8);
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
                        if (str.equals("group_id") && (queryParameter7 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setGroupId(queryParameter7);
                            break;
                        }
                        break;
                    case 516669515:
                        if (str.equals("trending_words_id") && (queryParameter6 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setTrendingWordsId(queryParameter6);
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
                        if (str.equals("trending_event_id") && (queryParameter5 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setTrendingEventId(queryParameter5);
                            break;
                        }
                        break;
                    case 1273999649:
                        if (str.equals("capsule_word_list") && (queryParameter4 = UriProtector.getQueryParameter(uri, str)) != null) {
                            searchResultParam.setCapsuleWords(new C208398Fv(queryParameter4, null, 2, null));
                            searchResultParam.setKeyword(searchResultParam.getCapsuleWords().getKeyWord());
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
