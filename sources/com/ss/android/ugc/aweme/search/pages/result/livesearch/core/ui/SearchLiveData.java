package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchLiveData {

    @InterfaceC65349Pkn("is_non_personalized_search")
    public final int isNonPersonalizedSearch;

    @InterfaceC65349Pkn("requestInfo")
    public final RequestInfo requestInfo;

    @InterfaceC65349Pkn("enterFromSub")
    public final String searchEntranceSub;

    @InterfaceC65349Pkn("searchLiveData")
    public final SearchLiveList searchLiveList;

    @InterfaceC65349Pkn("searchSessionId")
    public final long searchSessionId;

    @InterfaceC65349Pkn("sessionid")
    public final int sessionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLiveData)) {
            return false;
        }
        SearchLiveData searchLiveData = (SearchLiveData) obj;
        return o.LJ(this.searchLiveList, searchLiveData.searchLiveList) && o.LJ(this.requestInfo, searchLiveData.requestInfo) && this.sessionId == searchLiveData.sessionId && this.searchSessionId == searchLiveData.searchSessionId && o.LJ(this.searchEntranceSub, searchLiveData.searchEntranceSub) && this.isNonPersonalizedSearch == searchLiveData.isNonPersonalizedSearch;
    }

    public final int hashCode() {
        int hashCode;
        SearchLiveList searchLiveList = this.searchLiveList;
        if (searchLiveList == null) {
            hashCode = 0;
        } else {
            hashCode = searchLiveList.hashCode();
        }
        return C79062V1e.LJ(this.searchEntranceSub, JBR.LIZJ(this.searchSessionId, (((this.requestInfo.hashCode() + (hashCode * 31)) * 31) + this.sessionId) * 31, 31), 31) + this.isNonPersonalizedSearch;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchLiveData(searchLiveList=");
        LIZ.append(this.searchLiveList);
        LIZ.append(", requestInfo=");
        LIZ.append(this.requestInfo);
        LIZ.append(", sessionId=");
        LIZ.append(this.sessionId);
        LIZ.append(", searchSessionId=");
        LIZ.append(this.searchSessionId);
        LIZ.append(", searchEntranceSub=");
        LIZ.append(this.searchEntranceSub);
        LIZ.append(", isNonPersonalizedSearch=");
        return b0.LIZJ(LIZ, this.isNonPersonalizedSearch, ')', LIZ);
    }

    public SearchLiveData(SearchLiveList searchLiveList, RequestInfo requestInfo, int i, long j, String searchEntranceSub, int i2) {
        o.LJIIIZ(requestInfo, "requestInfo");
        o.LJIIIZ(searchEntranceSub, "searchEntranceSub");
        this.searchLiveList = searchLiveList;
        this.requestInfo = requestInfo;
        this.sessionId = i;
        this.searchSessionId = j;
        this.searchEntranceSub = searchEntranceSub;
        this.isNonPersonalizedSearch = i2;
    }
}
