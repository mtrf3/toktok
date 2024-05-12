package com.ss.android.ugc.aweme.result.common.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.RequestInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DynamicSearchResponseData {

    @InterfaceC65349Pkn("requestInfo")
    public final RequestInfo requestInfo;

    @InterfaceC65349Pkn("searchResponseData")
    public final m response;

    @InterfaceC65349Pkn("techLogParams")
    public SearchResultTraceTime techLogParams;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSearchResponseData)) {
            return false;
        }
        DynamicSearchResponseData dynamicSearchResponseData = (DynamicSearchResponseData) obj;
        return o.LJ(this.response, dynamicSearchResponseData.response) && o.LJ(this.requestInfo, dynamicSearchResponseData.requestInfo) && o.LJ(this.techLogParams, dynamicSearchResponseData.techLogParams);
    }

    public final int hashCode() {
        m mVar = this.response;
        int hashCode = (this.requestInfo.hashCode() + ((mVar == null ? 0 : mVar.hashCode()) * 31)) * 31;
        SearchResultTraceTime searchResultTraceTime = this.techLogParams;
        return hashCode + (searchResultTraceTime != null ? searchResultTraceTime.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSearchResponseData(response=");
        LIZ.append(this.response);
        LIZ.append(", requestInfo=");
        LIZ.append(this.requestInfo);
        LIZ.append(", techLogParams=");
        LIZ.append(this.techLogParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DynamicSearchResponseData(m mVar, RequestInfo requestInfo, SearchResultTraceTime searchResultTraceTime) {
        o.LJIIIZ(requestInfo, "requestInfo");
        this.response = mVar;
        this.requestInfo = requestInfo;
        this.techLogParams = searchResultTraceTime;
    }

    public /* synthetic */ DynamicSearchResponseData(m mVar, RequestInfo requestInfo, SearchResultTraceTime searchResultTraceTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, requestInfo, (i & 4) != 0 ? null : searchResultTraceTime);
    }
}
