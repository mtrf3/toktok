package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchMix extends SearchApiResult {

    @InterfaceC65349Pkn("aweme_list")
    public List<Aweme> awemeList;

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("feedback_type")
    public String feedbackType;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("search_item_list")
    public List<SearchItemStruct> searchItemList;

    public final List<RelevantClip> LJ() {
        SearchAwemeInfo searchAwemeInfo;
        ArrayList arrayList = new ArrayList();
        List<SearchItemStruct> list = this.searchItemList;
        if (list != null) {
            for (SearchItemStruct searchItemStruct : list) {
                if (searchItemStruct != null && (searchAwemeInfo = searchItemStruct.searchAwemeInfo) != null) {
                    arrayList.add(searchAwemeInfo.relevantClip);
                }
            }
        }
        return arrayList;
    }

    public final List<SearchAwemeInfo> LJI() {
        ArrayList arrayList = new ArrayList();
        List<SearchItemStruct> list = this.searchItemList;
        if (list != null && list.size() != 0) {
            Iterator<SearchItemStruct> it = this.searchItemList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().searchAwemeInfo);
            }
        }
        return arrayList;
    }

    public final List<Aweme> getAwemeList() {
        Aweme aweme;
        ArrayList arrayList = new ArrayList();
        List<SearchItemStruct> list = this.searchItemList;
        if (list == null || list.size() == 0) {
            return this.awemeList;
        }
        for (SearchItemStruct searchItemStruct : this.searchItemList) {
            if (searchItemStruct != null && (aweme = searchItemStruct.aweme) != null) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }
}
