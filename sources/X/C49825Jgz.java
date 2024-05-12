package X;

import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.FeaturedAnswer;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.RelevantClip;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TranslateSearchDesc;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Jgz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49825Jgz extends AbstractC49793JgT<SearchMixFeed, SearchMixFeedList> implements InterfaceC224118qt, JYN, InterfaceC49779JgF, InterfaceC49758Jfu, InterfaceC49889Ji1 {
    public static final /* synthetic */ int LLFII = 0;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJZI;
    public String LJZL;
    public SearchHubEntityCard LL;
    public C49707Jf5 LLD;
    public C49750Jfm LLF;
    public C49847JhL LLFF;
    public String LJLZ = "";
    public int LJZ = -1;
    public final C49827Jh1 LLFFF = new C49827Jh1();

    @Override // X.AbstractC49793JgT
    public final int LJIILL() {
        return 3;
    }

    @Override // X.AbstractC49793JgT
    public final boolean LJIIZILJ() {
        return false;
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("bundle=users");
        hashSet.add("bundle=hotspot");
    }

    public static boolean LJJIIJ() {
        InterfaceC49833Jh7 interfaceC49833Jh7;
        C50741Jvl c50741Jvl;
        InterfaceC50639Ju7 interfaceC50639Ju7;
        InterfaceC49833Jh7 data;
        try {
            interfaceC50639Ju7 = (InterfaceC50639Ju7) C50641Ju9.LIZ().get(OBS.class);
        } catch (ClassCastException unused) {
        }
        if (interfaceC50639Ju7 != null && (data = interfaceC50639Ju7.getData()) != null) {
            interfaceC49833Jh7 = (InterfaceC49833Jh7) C50741Jvl.class.cast(data);
            c50741Jvl = (C50741Jvl) interfaceC49833Jh7;
            if (c50741Jvl == null && c50741Jvl.LJLIL.size() > 0) {
                return true;
            }
            return false;
        }
        interfaceC49833Jh7 = null;
        c50741Jvl = (C50741Jvl) interfaceC49833Jh7;
        if (c50741Jvl == null) {
        }
        return false;
    }

    public final List<Aweme> LJJIFFI() {
        ActivityC45651qj activityC45651qj;
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        return JTB.LIZ(activityC45651qj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((SearchMixFeedList) t).hasMore) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49889Ji1
    public final List<SearchMixFeed> LJI() {
        return getItems();
    }

    public final void LJJIJ() {
        List<SearchMixFeed> items = getItems();
        if (items != null) {
            for (SearchMixFeed searchMixFeed : items) {
                searchMixFeed.LJLJI = false;
                searchMixFeed.LJLJJL = false;
            }
        }
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        return LJIJJLI(getItems());
    }

    @Override // X.AbstractC51036K1g
    public final void onModelBound() {
        super.onModelBound();
        List<SearchMixFeed> items = getItems();
        C49603JdP.LIZJ(Integer.valueOf(this.LJZ), this.LJZL, items);
        if (C49714JfC.LIZ() != 0 && !C49993Jjh.LIZ()) {
            this.LLD = new C49707Jf5(this, this.LJZ, this.LJZI);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        if (X.JWA.LIZJ(java.lang.Integer.valueOf(r6.getFeedType()), r6.LJI()) != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x029d A[LOOP:13: B:222:0x0297->B:224:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> LJIJJLI(java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r13) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49825Jgz.LJIJJLI(java.util.List):java.util.List");
    }

    public static SearchMixFeed LJJI(List<SearchMixFeed> list) {
        Iterator<SearchMixFeed> it = list.iterator();
        while (it.hasNext()) {
            SearchMixFeed next = it.next();
            if ((next.getFeedType() == 65514 && next.LJI() != null && JWA.LIZIZ(next.LJI().schema)) || C49111JPf.LIZJ(next)) {
                return next;
            }
        }
        return null;
    }

    public static void LJJIIJZLJL(SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list;
        Aweme aweme;
        boolean z;
        RelevantClip relevantClip;
        SearchAwemeInfo searchAwemeInfo;
        SearchAwemeInfo searchAwemeInfo2;
        Boolean bool;
        SearchSpot searchSpot;
        List<TranslateSearchDesc> list2;
        if (searchMixFeedList == null || (list = searchMixFeedList.mItems) == null) {
            return;
        }
        for (SearchMixFeed searchMixFeed : list) {
            if (searchMixFeed != null && searchMixFeed.getFeedType() == 65280 && (aweme = searchMixFeed.getAweme()) != null) {
                if (JP2.LIZ(aweme)) {
                    aweme.appendExtraParamUseInSearch("search_result_id", searchMixFeed.providerDocIdStr);
                } else {
                    aweme.appendExtraParamUseInSearch("search_result_id", aweme.getAid());
                }
                SearchSpot searchSpot2 = searchMixFeed.hotSpot;
                if (searchSpot2 != null && searchSpot2.isHotspotDegradation) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    aweme.appendExtraParamUseInSearch("token_type", "");
                }
                GlobalDoodleConfig globalDoodleConfig = searchMixFeedList.globalDoodleConfig;
                if (globalDoodleConfig != null && globalDoodleConfig.getTnsBanType() != null && searchMixFeedList.globalDoodleConfig.getTnsBanType().equals("Pass")) {
                    aweme.appendExtraParamUseInSearch("is_search_video", "1");
                }
                SearchAwemeInfo searchAwemeInfo3 = searchMixFeed.searchAwemeInfo;
                if (searchAwemeInfo3 != null && (list2 = searchAwemeInfo3.translateSearchList) != null && ListProtector.get(list2, 0) != null && ((TranslateSearchDesc) ListProtector.get(searchMixFeed.searchAwemeInfo.translateSearchList, 0)).originLanguage != null) {
                    aweme.setSearchDocOriginLanguage(((TranslateSearchDesc) ListProtector.get(searchMixFeed.searchAwemeInfo.translateSearchList, 0)).originLanguage);
                    aweme.setSearchDocTranslate(((TranslateSearchDesc) ListProtector.get(searchMixFeed.searchAwemeInfo.translateSearchList, 0)).searchDesc);
                }
                if (C49111JPf.LIZ() && (searchSpot = searchMixFeed.hotSpot) != null && searchSpot.isHotspotDegradation) {
                    searchMixFeed.getAweme().appendExtraParamUseInSearch("token_type", searchMixFeed.hotSpot.alaSrc);
                    searchMixFeed.getAweme().setSearchFeedType("search_trending_native");
                }
                if (C49906JiI.LJJIZ() && (searchAwemeInfo2 = searchMixFeed.searchAwemeInfo) != null && (bool = searchAwemeInfo2.withSearchSurvey) != null) {
                    aweme.setWithSearchSurvey(bool.booleanValue());
                }
                if (searchMixFeed.getAweme() != null && (searchAwemeInfo = searchMixFeed.searchAwemeInfo) != null && searchAwemeInfo.hasCreationIntention != null) {
                    searchMixFeed.getAweme().setHasCreationIntention(searchMixFeed.searchAwemeInfo.hasCreationIntention.booleanValue());
                }
                boolean z2 = C49099JOt.LIZIZ;
                SearchAwemeInfo searchAwemeInfo4 = searchMixFeed.searchAwemeInfo;
                if (z2 && searchAwemeInfo4 != null && (relevantClip = searchAwemeInfo4.relevantClip) != null) {
                    Boolean bool2 = relevantClip.enableSkipButton;
                    List<Float> list3 = relevantClip.relevantTimes;
                    if (bool2 != null) {
                        aweme.setVideoSkipEnableSkipButton(bool2.booleanValue());
                    }
                    if (list3 != null) {
                        aweme.setVideoSkipRelevantTime(list3);
                    }
                }
            }
        }
    }

    public static void LJJIIZ(SearchMixFeedList searchMixFeedList) {
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        String str;
        Integer num;
        List<SearchMixFeed> list2 = searchMixFeedList.mItems;
        if (C79004UzY.LJJIFFI(list2)) {
            return;
        }
        for (SearchMixFeed searchMixFeed : list2) {
            if (searchMixFeed.LJI() != null && searchMixFeed.LJI().getAwemeListRaw() != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<java.util.Map<?, ?>> it = searchMixFeed.LJI().getAwemeListRaw().iterator();
                while (it.hasNext()) {
                    arrayList.add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), it.next()), new C49826Jh0().getType()));
                }
                searchMixFeed.LJI().setAwemeList(arrayList);
            }
            if (searchMixFeed.LJI() != null && searchMixFeed.LJI().getAwemeMultiTabListRaw() != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<java.util.Map<?, ?>> it2 = searchMixFeed.LJI().getAwemeMultiTabListRaw().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), it2.next()), DynamicPatch.SearchMultiTabListData.class));
                }
                searchMixFeed.LJI().setAwemeMultiTabList(arrayList2);
            }
            if (searchMixFeed.getFeedType() == 65514 && searchMixFeed.LJI() != null && s.LJJJLZIJ(JWK.LIZ(searchMixFeed.LJI().schema), "featured-answer", false)) {
                for (Aweme aweme : searchMixFeed.LJI().getAwemeList()) {
                    aweme.setSearchFeedType("SearchFeaturedAnswer");
                    String str2 = searchMixFeed.providerDocIdStr;
                    if (str2 != null) {
                        aweme.appendExtraParamUseInSearch("search_result_id", str2);
                    }
                    FeaturedAnswer featuredAnswer = searchMixFeed.featuredAnswer;
                    if (featuredAnswer != null && (num = featuredAnswer.displayType) != null) {
                        int intValue = num.intValue();
                        if (intValue == EnumC35462Dvu.FEATURED_ANSWER.getType()) {
                            aweme.appendExtraParamUseInSearch("token_type", "tt_featured_answer");
                        }
                        if (intValue == EnumC35462Dvu.ENHANCE.getType()) {
                            aweme.appendExtraParamUseInSearch("token_type", "tt_enhance_card");
                        }
                    }
                    AwemeService.LIZ().R1(aweme);
                }
            }
            if (searchMixFeed.LJII() && (aggregatedVideo = searchMixFeed.aggregatedVideo) != null && (list = aggregatedVideo.awemes) != null) {
                int i = 0;
                for (Aweme aweme2 : list) {
                    AwemeService.LIZ().R1(aweme2);
                    aweme2.setSearchFeedType("search_aggregated_video");
                    String str3 = searchMixFeed.providerDocIdStr;
                    if (str3 != null) {
                        aweme2.appendExtraParamUseInSearch("search_result_id", str3);
                    }
                    SearchCardInfo searchCardInfo = searchMixFeed.searchCardInfo;
                    if (searchCardInfo != null && (str = searchCardInfo.alasrc) != null) {
                        aweme2.appendExtraParamUseInSearch("token_type", str);
                    }
                    aweme2.appendExtraParamUseInSearch("item_rank", String.valueOf(i));
                    i++;
                }
            }
            if (C50524JsG.LIZ() || C52411Khb.LIZ()) {
                if (searchMixFeed.getFeedType() == 65514 && searchMixFeed.LJI() != null && JWA.LIZIZ(searchMixFeed.LJI().schema)) {
                    for (Aweme aweme3 : searchMixFeed.LJI().getAwemeList()) {
                        aweme3.setSearchFeedType("SearchHotSpot");
                        if (searchMixFeed.LJI().getOriginType() == 75) {
                            aweme3.appendExtraParamUseInSearch("token_type", "tt_search_trending_automatic");
                        } else {
                            aweme3.appendExtraParamUseInSearch("token_type", "tt_trendingcontent");
                        }
                        String str4 = searchMixFeed.providerDocIdStr;
                        if (str4 != null) {
                            aweme3.appendExtraParamUseInSearch("search_result_id", str4);
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC49793JgT
    public final void LJIJJ(List<? extends SearchMixFeed> dataList) {
        Lifecycle lifecycle;
        super.LJIJJ(dataList);
        EnumC46469ILp searchCardContainerType = EnumC46469ILp.GENERAL_SEARCH;
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ == null || (lifecycle = LJ.getLifecycle()) == null || dataList == null || dataList.isEmpty()) {
            return;
        }
        SearchCardContainerSharedVM LIZ = C44734Hh4.LIZ(lifecycle, searchCardContainerType);
        o.LJIIIZ(dataList, "dataList");
        XKX.LJ(MBB.INSTANCE, new C66942jy(LIZ, null));
        if (LIZ.LJLIL.isEmpty()) {
            return;
        }
        for (SearchMixFeed searchMixFeed : dataList) {
            LIZ.LJLILLLLZI.put(Integer.valueOf(System.identityHashCode(searchMixFeed)), LIZ.gv0(searchMixFeed));
        }
    }

    public final String LJJII(String str) {
        C49707Jf5 c49707Jf5 = this.LLD;
        if (c49707Jf5 == null || str == null || str.length() == 0) {
            return null;
        }
        return (String) ((java.util.Map) c49707Jf5.LJLJLLL.getValue()).get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49793JgT, X.C8BS
    /* renamed from: LJJIII, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void handleData(SearchMixFeedList searchMixFeedList) {
        Aweme aweme;
        LogPbBean logPbBean;
        Aweme aweme2;
        List<SearchMixFeed> list;
        List<Aweme> list2;
        List<SearchMixFeed> list3;
        List<SearchMixFeed> list4;
        List<SearchUser> list5;
        ArrayList arrayList;
        SearchMixFeed searchMixFeed;
        EntityCardTitle entityCardTitle;
        String str;
        C49921JiX.LJ(this.LJLJJI).LJIILJJIL();
        C49922JiY.LIZLLL(this.LJLJJI).LJIIIZ();
        if (searchMixFeedList != 0) {
            C49951Jj1 c49951Jj1 = C49950Jj0.LJ;
            String requestId = searchMixFeedList.getRequestId();
            String str2 = "";
            if (c49951Jj1.LIZIZ == null) {
                c49951Jj1.LIZIZ = requestId;
                if (requestId == null) {
                    requestId = "";
                }
                c49951Jj1.LIZ(requestId, "log_id");
            }
            try {
                int i = searchMixFeedList.error_code;
                if (i > 0) {
                    String str3 = searchMixFeedList.message;
                    if (str3 == null) {
                        str3 = "response data error";
                    }
                    c49951Jj1.LIZIZ(5, i, str3);
                } else {
                    c49951Jj1.LJ = Integer.valueOf(searchMixFeedList.mItems.size());
                    C49953Jj3 c49953Jj3 = C49950Jj0.LJI;
                    LogPbBean logPbBean2 = searchMixFeedList.logPb;
                    if (logPbBean2 != null) {
                        str = logPbBean2.getImprId();
                    } else {
                        str = null;
                    }
                    if (c49953Jj3.LJ == null) {
                        c49953Jj3.LJ = str;
                        if (str != null) {
                            str2 = str;
                        }
                        c49953Jj3.LIZ(str2, "search_id");
                    }
                }
            } catch (Exception e) {
                C15280iq.LIZJ("SearchChainEventTrackerV2", e.toString());
            }
            C49950Jj0.LJFF.LIZJ();
            List<SearchMixFeed> list6 = searchMixFeedList.mItems;
            if (list6 != null) {
                arrayList = new ArrayList();
                searchMixFeed = null;
                for (SearchMixFeed searchMixFeed2 : list6) {
                    SearchMixFeed searchMixFeed3 = searchMixFeed2;
                    if (searchMixFeed3 != null && searchMixFeed3.getFeedType() == 200) {
                        searchMixFeed = searchMixFeed3;
                    } else {
                        arrayList.add(searchMixFeed2);
                    }
                }
            } else {
                arrayList = null;
                searchMixFeed = null;
            }
            OSZ osz = new OSZ(searchMixFeed, arrayList);
            if (osz.getFirst() != null) {
                SearchMixFeed searchMixFeed4 = (SearchMixFeed) osz.getFirst();
                SearchHubEntityCard searchHubEntityCard = searchMixFeed4.entityCard;
                this.LL = searchHubEntityCard;
                if (searchHubEntityCard != null && (entityCardTitle = searchHubEntityCard.topCardInfo) != null) {
                    entityCardTitle.LIZ = searchMixFeed4.docId;
                }
            }
            searchMixFeedList.mItems = (List) osz.getSecond();
        }
        super.handleData(searchMixFeedList);
        if (this.mListQueryType == 1) {
            this.LJLLLLLL = 0;
        }
        List<SearchMixFeed> list7 = searchMixFeedList.mItems;
        if (!C79004UzY.LJJIFFI(list7)) {
            for (SearchMixFeed searchMixFeed5 : list7) {
                if (searchMixFeed5.getFeedType() == 65280 && (aweme = searchMixFeed5.getAweme()) != null) {
                    aweme.setRank(this.LJLLLLLL);
                    this.LJLLLLLL++;
                }
            }
        }
        LJJIIZI(searchMixFeedList);
        List<SearchMixFeed> list8 = searchMixFeedList.mItems;
        if (!C79004UzY.LJJIFFI(list8) && (logPbBean = searchMixFeedList.logPb) != null) {
            for (SearchMixFeed searchMixFeed6 : list8) {
                if (searchMixFeed6.getFeedType() == 65280 && (aweme2 = searchMixFeed6.getAweme()) != null) {
                    aweme2.setLogPbBean(logPbBean);
                }
                searchMixFeed6.LJLJJLL = logPbBean;
            }
        }
        boolean LJJIFFI = C79004UzY.LJJIFFI(searchMixFeedList.mItems);
        this.mIsNewDataEmpty = LJJIFFI;
        if (!LJJIFFI) {
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    if (!searchMixFeedList.LJLJJL) {
                        LJJIIJZLJL(searchMixFeedList);
                        LJJIIZ(searchMixFeedList);
                    }
                    LinkedList linkedList = new LinkedList(searchMixFeedList.mItems);
                    if (this.LLFFF.LIZ.size() > 0) {
                        C49827Jh1 fixedPositionCards = this.LLFFF;
                        List<SearchMixFeed> currentList = getItems();
                        List<SearchMixFeed> originList = this.LLD.LJIIIIZZ();
                        o.LJIIIZ(fixedPositionCards, "fixedPositionCards");
                        o.LJIIIZ(currentList, "currentList");
                        o.LJIIIZ(originList, "originList");
                        HashSet<SearchMixFeed> hashSet = fixedPositionCards.LIZ;
                        LinkedList linkedList2 = new LinkedList();
                        HashSet<SearchMixFeed> hashSet2 = new HashSet<>();
                        LinkedList linkedList3 = new LinkedList();
                        SparseArray sparseArray = new SparseArray();
                        int size = originList.size();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            SearchMixFeed searchMixFeed7 = (SearchMixFeed) it.next();
                            if (searchMixFeed7.LJIIIIZZ()) {
                                linkedList3.add(searchMixFeed7);
                            } else {
                                sparseArray.put(size, searchMixFeed7);
                            }
                            size++;
                        }
                        Iterator<SearchMixFeed> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            SearchMixFeed next = it2.next();
                            sparseArray.put(originList.indexOf(next), next);
                        }
                        int size2 = currentList.size();
                        while (linkedList3.size() > 0) {
                            if (sparseArray.get(size2) != null) {
                                linkedList2.add(sparseArray.get(size2));
                                sparseArray.remove(size2);
                            } else {
                                linkedList2.add(linkedList3.removeFirst());
                            }
                            size2++;
                        }
                        if (sparseArray.size() > 0) {
                            int size3 = sparseArray.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                sparseArray.keyAt(i3);
                                hashSet2.add(sparseArray.valueAt(i3));
                            }
                        }
                        fixedPositionCards.LIZ = hashSet2;
                        linkedList = linkedList2;
                    }
                    C49389JZx.LIZIZ(linkedList, this.LJZ, this.LJZI, searchMixFeedList.hasMore);
                    LJIIIZ(linkedList);
                    SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) this.mData;
                    searchMixFeedList2.hasMore &= searchMixFeedList.hasMore;
                    searchMixFeedList2.mBacktrace = searchMixFeedList.mBacktrace;
                }
            } else {
                if (!searchMixFeedList.LJLJJL) {
                    LJJIIZ(searchMixFeedList);
                    LJJIIJZLJL(searchMixFeedList);
                    this.mData = searchMixFeedList;
                }
                if (!(this instanceof C49914JiQ)) {
                    if (this.LLFF == null) {
                        this.LLFF = new C49847JhL();
                    }
                    C49856JhU.LIZ(this.LLFF);
                }
                this.LLFFF.LIZ.clear();
                LJIJJ(new ArrayList(searchMixFeedList.mItems));
            }
            C49603JdP.LIZJ(Integer.valueOf(this.LJZ), this.LJZL, getItems());
            SearchMixFeedList searchMixFeedList3 = (SearchMixFeedList) this.mData;
            if (searchMixFeedList3.cursor != 0) {
                searchMixFeedList3.cursor = searchMixFeedList.cursor;
            }
            C3A5.LIZ.LJFF(searchMixFeedList.getRequestId(), searchMixFeedList.logPb);
            C49369JZd c49369JZd = C49369JZd.LIZ;
            List<SearchMixFeed> searchMixFeedList4 = ((SearchMixFeedList) this.mData).mItems;
            c49369JZd.getClass();
            o.LJIIIZ(searchMixFeedList4, "searchMixFeedList");
            int size4 = searchMixFeedList4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                SearchMixFeed searchMixFeed8 = (SearchMixFeed) ListProtector.get(searchMixFeedList4, i4);
                int feedType = searchMixFeed8.getFeedType();
                if (feedType != 65280) {
                    if (feedType == 65458 && (list5 = searchMixFeed8.users) != null) {
                        Iterator<SearchUser> it3 = list5.iterator();
                        while (it3.hasNext()) {
                            it3.next().rank = i4;
                        }
                    }
                } else if (searchMixFeed8.getAweme() != null) {
                    Aweme aweme3 = searchMixFeed8.getAweme();
                    o.LJI(aweme3);
                    aweme3.setAwemePosition(i4);
                }
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMixFeedList;
                LJIIJJI();
                T t = this.mData;
                if (t != 0) {
                    ((SearchMixFeedList) t).hasMore = false;
                }
            }
            T t2 = this.mData;
            if (t2 != 0 && this.mListQueryType != 2) {
                ((SearchMixFeedList) t2).hasMore = false;
            }
        }
        C49707Jf5 c49707Jf5 = this.LLD;
        if (c49707Jf5 != null) {
            int i5 = this.mListQueryType;
            if (i5 == 1) {
                SearchMixFeedList searchMixFeedList5 = new SearchMixFeedList();
                Collection collection = searchMixFeedList.mItems;
                if (collection == null) {
                    collection = C61878OQg.INSTANCE;
                }
                searchMixFeedList5.mItems = new ArrayList(collection);
                Object obj = C49389JZx.LIZJ().get(Integer.valueOf(c49707Jf5.LJLILLLLZI));
                if (obj != null && (list4 = searchMixFeedList5.mItems) != 0) {
                    list4.add(obj);
                }
                if (C49834Jh8.LIZ() || C49835Jh9.LIZIZ()) {
                    c49707Jf5.LJIIIIZZ().clear();
                    List<SearchMixFeed> list9 = searchMixFeedList5.mItems;
                    if (list9 != null) {
                        c49707Jf5.LJIIIIZZ().addAll(list9);
                    }
                }
                if (C49834Jh8.LIZ()) {
                    c49707Jf5.LJI().clear();
                }
                if (C49835Jh9.LIZ()) {
                    c49707Jf5.LJFF().clear();
                    c49707Jf5.LJ().clear();
                    c49707Jf5.LJLJLJ = 0;
                }
                if (C49835Jh9.LIZIZ()) {
                    ((java.util.Map) c49707Jf5.LJLJLLL.getValue()).clear();
                    ((java.util.Set) c49707Jf5.LJLL.getValue()).clear();
                    c49707Jf5.LJIIJ().clear();
                }
            } else if (i5 == 4 && ((C49834Jh8.LIZ() || C49835Jh9.LIZIZ()) && (list3 = searchMixFeedList.mItems) != null)) {
                c49707Jf5.LJIIIIZZ().addAll(list3);
                if (C49834Jh8.LIZ()) {
                    c49707Jf5.LJIIL();
                } else {
                    c49707Jf5.LJIILIIL();
                }
            }
        }
        this.mIsLoading = false;
        this.LJLJJLL = null;
        T t3 = this.mData;
        if (t3 != 0 && (list = ((SearchMixFeedList) t3).mItems) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (SearchMixFeed searchMixFeed9 : ((SearchMixFeedList) this.mData).mItems) {
                String str4 = searchMixFeed9.feedbackType;
                if (str4 != null && str4.equals("user")) {
                    for (int i6 = 0; i6 < searchMixFeed9.users.size(); i6++) {
                        if (ListProtector.get(searchMixFeed9.users, i6) != null && (list2 = ((SearchUser) ListProtector.get(searchMixFeed9.users, i6)).awemeCards) != null && !list2.isEmpty()) {
                            arrayList2.addAll(list2);
                        }
                    }
                } else if (searchMixFeed9.getAweme() != null) {
                    arrayList2.add(searchMixFeed9.getAweme());
                }
            }
            if (!arrayList2.isEmpty()) {
                C7HV.LIZIZ.LIZJ(arrayList2, C7KB.OTHERS);
            }
            C49832Jh6.LIZIZ = searchMixFeedList.cursor;
            GlobalDoodleConfig globalDoodleConfig = searchMixFeedList.globalDoodleConfig;
            if (globalDoodleConfig != null && globalDoodleConfig.getEnableImageRecord() != null) {
                C49832Jh6.LIZ = searchMixFeedList.globalDoodleConfig.getEnableImageRecord().booleanValue();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L10
            java.lang.String r0 = r2.getRequestId()
            r1.LJLLI = r0
            java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r0 = r2.mItems
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto L1b
        L10:
            r0 = 1
        L11:
            r1.mIsNewDataEmpty = r0
            if (r0 != 0) goto L1a
            X.JZd r0 = X.C49369JZd.LIZ
            r0.LIZ(r2)
        L1a:
            return
        L1b:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49825Jgz.LJJIIZI(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        int i;
        ActivityC45651qj activityC45651qj;
        if (C79004UzY.LJJIFFI(getItems())) {
            i = 0;
        } else {
            i = ((SearchMixFeedList) this.mData).cursor;
        }
        if (objArr.length == 1) {
            LJJIJIIJIL(LJIIL(objArr), this.LJLLJ, i, LJIILJJIL(), this.LJLLL);
            return;
        }
        String LJIIL = LJIIL(objArr);
        String str = this.LJLLJ;
        int intValue = ((Integer) objArr[5]).intValue();
        C50287JoR c50287JoR = (C50287JoR) objArr[6];
        String LJIILJJIL = LJIILJJIL();
        String str2 = this.LJLLL;
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
        if (weakReference == null) {
            activityC45651qj = null;
        } else {
            activityC45651qj = weakReference.get();
        }
        LJJIJIIJI(LJIIL, i, 0, str, intValue, c50287JoR, LJIILJJIL, str2, activityC45651qj);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        if (objArr.length < 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("some unexpected things happen: data in model is empty ,but request type is load more ");
            LIZ.append(new StackTraceElement[0].toString());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("qw", X1D.LIZIZ(LIZ));
            return;
        }
        ActivityC45651qj activityC45651qj = null;
        this.LL = null;
        if (objArr.length == 2) {
            LJJIJIIJIL(LJIIL(objArr), "", 0, LJIILJJIL(), this.LJLLL);
            return;
        }
        String LJIIL = LJIIL(objArr);
        int intValue = ((Integer) objArr[2]).intValue();
        int intValue2 = ((Integer) objArr[5]).intValue();
        C50287JoR c50287JoR = (C50287JoR) objArr[6];
        String LJIILJJIL = LJIILJJIL();
        String str = this.LJLLL;
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        }
        LJJIJIIJI(LJIIL, 0, intValue, "", intValue2, c50287JoR, LJIILJJIL, str, activityC45651qj);
    }

    @Override // X.InterfaceC49758Jfu
    public final List<SearchMixFeed> LIZIZ(String str, boolean z) {
        C49707Jf5 c49707Jf5 = this.LLD;
        if (c49707Jf5 == null) {
            return null;
        }
        return c49707Jf5.LIZIZ(str, z);
    }

    public static void LJJ(SearchMixFeed searchMixFeed, HashSet<String> hashSet, List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (C49111JPf.LIZJ(searchMixFeed)) {
            if (searchMixFeed != null && searchMixFeed.getAweme() != null) {
                arrayList.add(searchMixFeed.getAweme());
            }
        } else if (searchMixFeed != null && searchMixFeed.LJI() != null) {
            for (Aweme aweme : searchMixFeed.LJI().getAwemeList()) {
                if (!hashSet.contains(aweme.getAid())) {
                    hashSet.add(aweme.getAid());
                    arrayList.add(aweme);
                }
            }
        }
        ((ArrayList) list).addAll(0, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (X.C49111JPf.LIZJ(r2) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r8 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r8.hasNext() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r4.getAid() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r10.contains(r4.getAid()) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r2.LJII() != true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r2.LJLJI == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r7 = (java.util.ArrayList) r11;
        r6 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r6.hasNext() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (java.util.Objects.equals(r5.getAid(), r4.getAid()) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        r7.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        r7.add(r4);
        r1 = X.X1D.LIZ();
        r1.append("duplicated aweme exists:");
        r1.append(r4.getAid());
        X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        if (r2.LJLJI == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (X.JWA.LIZLLL(java.lang.Integer.valueOf(r2.getFeedType()), r2.LJI()) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0063, code lost:
    
        r10.add(r4.getAid());
        ((java.util.ArrayList) r11).add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(java.util.List r9, java.util.HashSet r10, java.util.List r11, com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity r12) {
        /*
            r3 = 0
            if (r9 == 0) goto Ld1
        L3:
            int r0 = r9.size()
            if (r3 >= r0) goto Ld1
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r3)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r2 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r2
            if (r2 != 0) goto L15
        L12:
            int r3 = r3 + 1
            goto L3
        L15:
            X.Ol8 r0 = X.C49243JUh.LJI
            java.lang.Object r0 = r0.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
        L21:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r4.next()
            X.JUj r0 = (X.InterfaceC49245JUj) r0
            java.util.List r1 = r0.LIZ(r3, r12, r2)
            if (r1 == 0) goto L21
        L33:
            boolean r0 = X.C49111JPf.LIZJ(r2)
            if (r0 == 0) goto L43
            goto L12
        L3a:
            X.ILp r0 = X.EnumC46469ILp.GENERAL_SEARCH
            java.util.List r1 = X.C44729Hgz.LIZJ(r2, r0)
            if (r1 == 0) goto L12
            goto L33
        L43:
            java.util.Iterator r8 = r1.iterator()
        L47:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r4 = r8.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r0 = r4.getAid()
            if (r0 == 0) goto L47
            java.lang.String r0 = r4.getAid()
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L71
            java.lang.String r0 = r4.getAid()
            r10.add(r0)
            r0 = r11
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            goto L47
        L71:
            r1 = 1
            if (r2 == 0) goto Lb9
            boolean r0 = r2.LJII()
            if (r0 != r1) goto Lb9
            boolean r0 = r2.LJLJI
            if (r0 == 0) goto Lb9
        L7e:
            r7 = r11
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r6 = r7.iterator()
        L85:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            java.lang.String r1 = r5.getAid()
            java.lang.String r0 = r4.getAid()
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L85
            r7.remove(r5)
        La2:
            r7.add(r4)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "duplicated aweme exists:"
            r1.append(r0)
            java.lang.String r0 = r4.getAid()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            goto L47
        Lb9:
            boolean r0 = r2.LJLJI
            if (r0 == 0) goto L47
        Lbe:
            int r0 = r2.getFeedType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r2.LJI()
            boolean r0 = X.JWA.LIZLLL(r1, r0)
            if (r0 == 0) goto L47
            goto L7e
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49825Jgz.LJIL(java.util.List, java.util.HashSet, java.util.List, com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity):void");
    }

    public final void LJJIJIIJIL(String str, String str2, int i, String str3, String str4) {
        ActivityC45651qj activityC45651qj;
        int i2 = this.LJLLLL;
        C50287JoR c50287JoR = this.LJLIL;
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
        if (weakReference == null) {
            activityC45651qj = null;
        } else {
            activityC45651qj = weakReference.get();
        }
        LJJIJIIJI(str, i, 0, str2, i2, c50287JoR, str3, str4, activityC45651qj);
    }

    @Override // X.InterfaceC49779JgF
    public final void LJII(String str, boolean z, Aweme aweme, List list, AbstractC65590Pog abstractC65590Pog, InterfaceC49778JgE interfaceC49778JgE) {
        C49707Jf5 c49707Jf5 = this.LLD;
        if (c49707Jf5 == null) {
            return;
        }
        c49707Jf5.LJII(str, z, aweme, list, abstractC65590Pog, interfaceC49778JgE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJIJIIJI(java.lang.String r13, int r14, int r15, java.lang.String r16, int r17, X.C50287JoR r18, java.lang.String r19, java.lang.String r20, android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49825Jgz.LJJIJIIJI(java.lang.String, int, int, java.lang.String, int, X.JoR, java.lang.String, java.lang.String, android.content.Context):void");
    }
}
